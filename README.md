# TeMDA

TeMDA (Themis - Greek goddess of justice, MDA - Model Driven Approach) presents a meta-model of a DSL. The meta-model is based on Ecore and developed using the Eclipse Modeling Framework. Automatic verification of business processes' GDPR compliance is implemented using Object Constraint Language (OCL).

## Environment

*Java(TM) SE Development Kit 15.0.1  *Luna Eclipse with packages:  
- Ecore Diagram Editor
- Ecore Tools Utilities
- EMF - Eclipse Modeling Framework Base RunTime
- EMF - Eclipse Modeling Framework SDK
- EMF - Eclipse Modeling Framework Xcore Runtime
- EMF - Eclipse Modeling Framework Xcore SDK
- EMF - Eclipse Modeling Framework Xcore UI
- EMF Forms SDK
- EMF Model Query SDK
- EMF Model Transaction SDK
- EMF ODA Driver
- EMF Parley SDK Developer Resources
- EMF Validation Framework SDK
- EMF/XSD All-In-One-SDK
- Model comparison (EMF Compare) - Core - SDK
- Model comparison (EMF Compare) - EGit support
- Model comparison (EMF Compare) - SDK
- Model comparison (EMF Compare) - Sirius support
- OCL All-In-One SDK
- OCL Classic for Ecore and UML Developer
- SimpleOCL

## Video tutorials

### Introduction to TeMDA

[![Introduction to
TeMDA](https://img.youtube.com/vi/rE7cVhbUNkM/0.jpg)](https://www.youtube.com/watch?v=rE7cVhbUNkM)

## OCL rules based on the GDPR articles

### PrivacyPolicy class
```
		invariant OwnerShouldHaveDefinedInhabits('Based on Art 3'): 
			(not(self.owner = null) and not(self.owner.inhabits = null));
```

### PolicyStatement class
```
		invariant CourtApprovalIsNeedForPublicInterestPurpose('Based on Art9'): 
			documentIsNeededForPurpose(DocumentType::CourtApproval,ProcessingReason::PublicInterest);
		invariant ControllerApprovalIsNeedForLegitimateInterestsPurpose('Based on Art9'): 
			documentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::LegitimateInterests);
		invariant ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose('Based on Art9'): 
			documentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject);
					invariant MissingConsentForCollecting('Based on Art6'): 
			if(self.whose = null or not(self.what.actions->exists(action| action = Action::Collecting)) or 
				(what.datas->exists(data| data.colllectedFromSubject = false) and self.what.actions->exists(action| action = Action::Collecting))
			) then
				true
			else if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then
				not(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person)
			else 
				not(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person))
			endif
			endif;
		invariant UndefinedPurposeForAction('Based on Art6'): 
			if(self.whose = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing)) then
				true
			else
			let privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in
				self.what.datas->forAll(data|
					let statements = privacyPolicy.policyStatements->select(st| 
						not(st.whose = null) and st.whose = self.whose  
						and st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))
						in 
						if(statements->isEmpty()) then 
							true
						else
							statements -> forAll(st|
								if(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then
									if(self.why = null) then
										false
									else
										(self.who.equals(st.who) or privacyPolicy.owner.subPrincipals->exists(subprincipal| subprincipal=self.who))
										and (st.why.isValid(self.why) 
										or 
										let reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in
											reasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose))
										)
									endif
								else
									false
								endif
							)
						endif
				)
			endif;
		invariant ExpiredConsent('Based on Art6'): 
			if(self.whose = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing)) then
				true
			else
			let privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in
				self.what.datas->forAll(data |
					let statements = privacyPolicy.policyStatements->select(st| 
						not(st.whose = null) and st.whose = self.whose and self.who.equals(st.who) and st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))
						in 
						if(statements->isEmpty()) then 
							true
						else
							statements -> exists(st|
								if(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then
									if(self.why = null 
										or 
										let reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in
											reasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)
									)) then
										true
									else
										not(privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, st.how.consent.startDate)) and
										(st.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.how.consent.terminationDate)))
									endif
								else
									false
								endif
							)
						endif
				)
			endif;
		invariant ExpiredConsentForCollecting('Based on Art6'): 
			if(self.whose = null or not(self.what.actions->exists(act| act = Action::Collecting)) or self.how = null or self.how.consent = null) then
				true
			else
			let privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in
				if(self.why = null 
					or 
					let reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in
						reasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)
				)) then
					true
				else
					privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, self.how.consent.startDate) and
					(self.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.terminationDate)))
				endif
			endif;
		invariant WithdrawedConsent('Based on Art7'): 
			if(self.whose = null or self.what.actions->exists(act| act = Action::Collecting)) then
				true
			else
			let privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in
				self.what.datas->forAll(data|
					let statements = privacyPolicy.policyStatements->select(st: PolicyStatement| 
						not(st.whose = null) and st.whose = self.whose and self.who.equals(st.who) and st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))
						in 
						if(statements->isEmpty()) then 
							true
						else
							statements -> forAll(st|
								if(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then
									if(self.why = null 
										or 
										let reasons  = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in
											reasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)
									)) then
										true
									else
										not(privacyPolicy.allComplaints->exists(complaint| complaint.action.oclIsTypeOf(Withdraw) and 
											let withdrawal: Withdraw = complaint.action.oclAsType(Withdraw) in
												withdrawal.subject = st.how.consent
												and (privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) 
												or privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when))
											and not(privacyPolicy.policyStatements->exists(stopStatement| 
												stopStatement.what.actions->exists(act| act = Action::StopProcessing) and 
												stopStatement.what.datas->exists(d| d = data) and not(stopStatement.causedBy = null) and 
												stopStatement.causedBy.action= withdrawal))
										))
									endif
								else
									false
								endif
							)
						endif
				)
			endif;
		invariant JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson('Based on Art8'): 
			if(self.whose = null or not(self.what.actions->exists(action| action = Action::Collecting))) then
				true
			else if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then
				if(self.how = null or self.whose.responsiblePersons->isEmpty() or self.how.documents->isEmpty() or 
					not(self.how.documents->exists(document| document.documentType = DocumentType::ChildCustody and self.whose.responsiblePersons->exists(p|p=document.providedBy)))
				) then 
					false
				else
					true
				endif
			else
				true
			endif
			endif;
		invariant ProcessingOfSpecialCategories('Based on Art9'): 
			if(self.what.actions->exists(action | action = Action::StopProcessing)) then
				true
			else
			self.what.datas->forAll(data| 
				let dataTypes  = Sequence{DataType::Biometric, DataType::Genetic, DataType::PoliticalOpinion, 
					DataType::RacialOrEthnicOrigin, DataType::SexLife, DataType::Religic, DataType::Judical
				} in
				if(dataTypes->includes(data.privacydata.type)) then
					((not(self.how = null) and not(self.how.consent = null))
						or
					(not(self.why = null) and
					let reasons  = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,
						ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::Research, ProcessingReason::PublicHealth
					} in
						reasons->includes(self.why.processingReason) or (not(self.why.subPurposes = null) and self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)
					))))
				else
					true
				endif
			)
			endif;
		invariant SubjectShouldBeNotifiedAboutCollecting('Based on Art14'): 
			if(self.what.actions->exists(action| action = Action::Collecting) and self.what.datas->exists(data| data.colllectedFromSubject = false)) then
				if(not(self.why = null) and 
				(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::None}) or
					self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Research,Sequence{ProcessingReasonSubtype::Statistical, 
						ProcessingReasonSubtype::Historical,ProcessingReasonSubtype::Scientific}))
				)then
					true
				else
					PrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::DataCollecting 
						and notification.causedBy = self
					)
				endif
				else
					true
			endif;
		invariant SubjectShouldBeNotifiedAboutTransferToThirdCountry('Based on Art15'): 
			if(self.what.actions->exists(action| action = Action::Transfer) and not(self.where.destination = null) and self.where.destination.isEUMember = false) then
					PrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::ThirdPartyTransfer 
						and notification.causedBy = self
					)
				else
					true
			endif;
		invariant CausedByShouldBeDefinedForRectificationAction('Based on Art16'): 
			causedByShouldBeDefinedForType(Action::Rectification);
		invariant CausedByShouldBeDefinedForErasureAction('Based on Art17'): 
			causedByShouldBeDefinedForType(Action::Erasure);
		invariant SubjectShouldBeNotifiedAboutExecutedErasure('Based on Art19'): 
			if(what.actions->exists(action| action = Action::Erasure)) then
					PrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and
						notification.type = NotificationType::ExecutedErasure
					)
				else
					true
			endif;
		invariant SubjectShouldBeNotifiedAboutExecutedRectification('Based on Art19'): 
			if(what.actions->exists(action| action = Action::Rectification)) then
					PrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and
						notification.type = NotificationType::ExecutedRectification
					)
				else
					true
			endif;
		invariant WhomShouldBeDefinedForTransfer('Based on Art20'): 
			if(what.actions->exists(action| action = Action::Transfer)) then
					not(self.whom = null)
				else
					true
			endif;
		invariant MissingConsentForTransfer('Based on Art20'): 
			if(self.whose = null or not(self.what.actions->exists(action| action = Action::Transfer)) or self.where = null or self.where.destination = null or self.where.destination.isEUMember = false) then
				true
			else if(self.whose.type= PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then
				not(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons->exists(person| self.how.consent.providedBy)
			else 
				not(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons->exists(person| self.how.consent.providedBy))
			endif
			endif;
		invariant SubjectShouldBeNotifiedAboutStopProcessing('Based on Art21'): 
			if(what.actions->exists(action| action = Action::StopProcessing)) then
					PrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::StopProcessing and 
						notification.causedBy = self
					)
				else
					true
			endif;
		invariant CausedByShouldBeDefinedForStopProcessingAction('Based on Art21'): 
			causedByShouldBeDefinedForType(Action::StopProcessing);
		invariant MissingConsentOrTransferCertificate('Based on Arts 44-50'): 
			if(not(self.what.actions->exists(action| action = Action::Transfer))or self.where = null or self.where.destination = null or self.where.destination.isEUMember = true) then
				true
			else
				if((not(self.where.destination = null)) and self.where.destination.isEUMember = false) then
					(not(self.how = null) and (self.how.documents->exists(doc| doc.documentType = DocumentType::TransferCertificate) or (not(self.how = null) and not(self.how.consent = null)))) or
					(not(self.why = null) and 
					(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,
					ProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}) or
						self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,Sequence{ProcessingReasonSubtype::PhisicallyIncapable, 
							ProcessingReasonSubtype::Other,ProcessingReasonSubtype::None})))
				else
					true
				endif
			endif;
```
