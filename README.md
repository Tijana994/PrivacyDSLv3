# PrivacyDSLv3

This project represents meta-model of TeMDA - DSL based on aspect oriented language.

# TeMDA

TeMDA (Themis - Greek goddess of justice, MDA - Model Driven Approach) presents a meta-model of a DSL. The meta-model is based on Ecore and developed using the Eclipse Modeling Framework. Automatic verification of business processes' GDPR compliance is implemented using Object Constraint Language (OCL).

## Environment

Java(TM) SE Development Kit 21<br/>Luna Eclipse with packages:<br/>
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

## License

MIT

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
### Principal class

```
		invariant JuvenileShouldHaveResponsiblePerson('Based on Art8'): 
		if(self.type = PrincipalType::NaturalPerson and self.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then
				not(self.responsiblePersons->isEmpty())
			else
				true
		endif;
```

### Complaint class

```
		invariant UserDoesntHavePermissionToWithdrawConsent('Based on Art7'): 
			if(not(self.action.oclIsKindOf(Withdraw))) then
					true
			else
				let withdraw : Withdraw = self.action.oclAsType(Withdraw) in
					self.who = withdraw.subject.providedBy or  withdraw.subject.providedBy.responsiblePersons->exists(rp| rp = self.who)
			endif;
		invariant SubjectShouldBeNotifiedAboutWithdraw('Based on Art19'): 
			if(self.action.oclIsKindOf(Withdraw)) then
					PrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and 
						notification.type = NotificationType::Withdraw
					)
				else
					true
			endif;
		invariant SubjectShouldBeNotifiedAboutExistingComplaintForRectification('Based on Art19'): 
			if(self.action.oclIsKindOf(ComplaintBasedOnData)) then
				let basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in
					if(basedOnData.type = ComplaintBasedOnDataType::Rectification)then
						PrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and
							notification.type = NotificationType::Rectification
						)
					else
						true
					endif
				else
					true
			endif;
		invariant SubjectShouldBeNotifiedAboutExistingComplaintForErasure('Based on Art19'): 
			if(self.action.oclIsKindOf(ComplaintBasedOnData)) then
				let basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in
					if(basedOnData.type = ComplaintBasedOnDataType::Erasure)then
						PrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and
							notification.type = NotificationType::Erasure
						)
					else
						true
					endif
				else
					true
			endif;
		invariant CannotIdentifyDataFromComplaint('Based on Art11'): 
			let privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in
			if(not(self.action.oclIsKindOf(ComplaintBasedOnData))) then
				true
			else
			let basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in
					basedOnData.subject->forAll(data: PrivacyData|
					privacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::Collecting) and 
						not(stmt.whose = null) and (stmt.whose = self.who or stmt.whose.responsiblePersons->exists(rp| rp = self.who))
						and privacyPolicy.privacyPolicyHelper.isDateAfterInterval(stmt.when, self.when) 
						and stmt.what.datas->exists(selectedData| selectedData.privacydata = data)
					)
				)
		  endif;
		invariant RectificationShouldBeExecutedAsSoonAsPossible('Based on Art16'): 
			doesPolicyStatementExists(Action::Rectification,ComplaintBasedOnDataType::Rectification);
		invariant ErasureShouldBeExecutedAsSoonAsPossible('Based on Art17'): 
			doesPolicyStatementExists(Action::Erasure,ComplaintBasedOnDataType::Erasure);
		invariant InvalidTypeOfPurposeForAnObject('Based on Art21'): 
			if(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then
					true
			else
				let basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in
				if(basedOnAction.statement.why = null or not(basedOnAction.denialReason = null)) then
						true
				else
					(not(basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,
					Sequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,
					ProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}))) 
					and
					(basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Marketing,Sequence{ProcessingReasonSubtype::None})
					or
					basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Profiling,Sequence{ProcessingReasonSubtype::None}))
				endif
			endif;
		invariant UserDoesntHavePermissionToComplaint('Based on Art21'): 
			if(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then
					true
			else
				let basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in
					not(basedOnAction.statement.whose = null) 
					and 
					(basedOnAction.statement.whose = self.who or basedOnAction.statement.whose.responsiblePersons->exists(rp| rp = self.who))
			endif;
		invariant StopProcessingShouldBeExecutedAsSoonAsPossible('Based on Art21'): 
			let privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in
				if(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then
					true
				else
				let basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in
					if(not(basedOnAction.denialReason = null)) then
						true
					else
						privacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::StopProcessing) and 
							not(stmt.causedBy = null) and stmt.causedBy = self)
					endif
			  endif;
```
## OCL rules for model validation

### PrivacyPolicy class
```
		invariant UniquePolicyStatementName('PolicyStatement name is unique'): 
			self.policyStatements->forAll(st1:PolicyStatement,st2:PolicyStatement| st1.name = st2.name implies st1 = st2);
		invariant UniquePrincipalNamePerType('Principal name per type is unique'): 
		self.allPrincipals->forAll(pr1:Principal,pr2:Principal| 
			if(pr1.type = pr2.type) then 
			pr1.name = pr2.name implies pr1 = pr2
			else
				true
			endif
		);
		invariant UniquePrivacyDataName('PrivacyData name is unique'): 
		self.allDatas->forAll(data1:PrivacyData,data2:PrivacyData| data1.name = data2.name implies data1 = data2);
		invariant UniqueServiceName('Service name is unique'): 
		self.allServices->forAll(service1:Service,service2:Service| service1.name = service2.name implies service1 = service2);
		invariant UniqueProviderName('Provider name is unique'): 
		self.allProviders->forAll(provider1:Provider,provider2:Provider| provider1.name = provider2.name implies provider1 = provider2);
		invariant UniqueDocumentName('Document name is unique'): 
		self.allDocuments->forAll(document1:Document,document2:Document| document1.name = document2.name implies document1 = document2);
		invariant UniqueConsentName('Consent name is unique'): 
		self.allConsents->forAll(consent1:Consent,consent2:Consent| consent1.name = consent2.name implies consent1 = consent2);
		invariant UniqueComplaintName('Complaint name is unique'): 
		self.allComplaints->forAll(complaint1:Complaint,complaint2:Complaint| complaint1.name = complaint2.name implies complaint1 = complaint2);
		invariant UniqueLocationPerType('Location name per type is unique'): 
		self.locations->forAll(loc1:Location,loc2:Location| 
			if(loc1.type = loc2.type) then 
				loc1.name = loc2.name implies loc1 = loc2
			else
				true
			endif
		);
		invariant ProtectionControlShouldExistsInConfiguration('Protection controls should be defined in configuration.'): 
			self.defaultProtectionControls->forAll(protectionControl:String|
				self.privacyPolicyHelper.isPolicyControlValid(protectionControl)
			);
```

### PolicyStatement class
```
		invariant DateShoudBeDefinedForAccessAction('Date shoud be defined'): 
			dateShouldBeDefinedForType(Action::Access);
		invariant DateShoudBeDefinedForStoreAction('Date shoud be defined'): 
			dateShouldBeDefinedForType(Action::Store);
					invariant StopProcessingPurposeForActionStopProcessing: 
			if(not(self.what.actions->exists(act| act = Action::StopProcessing))) then
				true
			else
				self.why.processingReason = ProcessingReason::StopProcessing
			endif;
		invariant ExpiredDocument: 
			if(self.how = null or not(self.how.documents->notEmpty())) then
				true
			else
			let privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in
				self.how.documents->forAll(document|
					(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, document.startDate) or 
					privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.startDate))
					and
					(document.terminationDate = null or (not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.terminationDate))))
				)
			endif;
```

### Principal class

```
		invariant NaturalPersonCanNotConatainsSubPrincipals: 
			if(self.type = PrincipalType::NaturalPerson) then
				self.subPrincipals->isEmpty()
			else
				true
			endif;
```

### TimeInterval class

```
		invariant OnlyAfterOrAfterWithBefore('After interval should be defined alone or with before interval'): 
			self.isTypeDefinedWithOtherType(TimePreposition::after, TimePreposition::before);
		invariant OnlyFromOrFromWithTo('From interval should be defined alone or with to interval'): 
			self.isTypeDefinedWithOtherType(TimePreposition::from, TimePreposition::to);
		invariant AtTypeShouldBeDefinedAlone('At statement should be defined alone'): 
			self.isTypeForbidden(TimePreposition::at);
		invariant UntilTypeShouldBeDefinedAlone('Until statement should be defined alone'): 
			self.isTypeForbidden(TimePreposition::until);
		invariant AfterStatementBeforeBeforeStatement('After interval should be defined before before interval'): 
			self.isValid(TimePreposition::after, TimePreposition::before);
		invariant FromStatementBeforeToStatement('From interval should be defined before to interval'): 
			self.isValid(TimePreposition::from, TimePreposition::to);
```
### Purpose class

```
		invariant ResearchCannotContainsThisSubReason: 
				isSubPurposeValid(ProcessingReason::Research, 
				Sequence{ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::Scientific, ProcessingReasonSubtype::Historical,
					ProcessingReasonSubtype::Statistical
				});
		invariant PublicHealthShouldNotContainSubReason: 
				isSubPurposeValid(ProcessingReason::PublicHealth, 
				Sequence{ProcessingReasonSubtype::None});
		invariant OutOfScopeCannotContainsThisSubReason: 
			isSubPurposeValid(ProcessingReason::OutOfScope, 
				Sequence{ProcessingReasonSubtype::OutOfEU,
					ProcessingReasonSubtype::PersonalActivity, ProcessingReasonSubtype::SpecialScopeOfActivity, ProcessingReasonSubtype::None,
					ProcessingReasonSubtype::Other
				});
		invariant PublicInterestCannotContainsThisSubReason: 
				isSubPurposeValid(ProcessingReason::PublicInterest, 
				Sequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,
					ProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other});
		invariant StatisticalPurposesShouldNotContainSubReason: 
				isSubPurposeValid(ProcessingReason::StatisticalPurposes, 
				Sequence{ProcessingReasonSubtype::None});
		invariant ExercisingSpecificRightsPurposesCannotContainsThisSubReason: 
				isSubPurposeValid(ProcessingReason::ExercisingSpecificRights, 
				Sequence{ProcessingReasonSubtype::Employment, ProcessingReasonSubtype::SocialSecurity,ProcessingReasonSubtype::SocialProtection, 
				ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other});
		invariant MarketingShouldNotContainSubReason: 
				isSubPurposeValid(ProcessingReason::Marketing, 
				Sequence{ProcessingReasonSubtype::None});
		invariant TestingShouldNotContainSubReason: 
				isSubPurposeValid(ProcessingReason::Testing, 
				Sequence{ProcessingReasonSubtype::None});
		invariant ProfilingShouldNotContainSubReason: 
				isSubPurposeValid(ProcessingReason::Profiling, 
				Sequence{ProcessingReasonSubtype::None});
		invariant ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason: 
			isSubPurposeValid(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, 
				Sequence{ProcessingReasonSubtype::PhisicallyIncapable,ProcessingReasonSubtype::LegallyIncapable, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::None});
		invariant LegitimateInterestsNotContainSubReason: 
			isSubPurposeValid(ProcessingReason::LegitimateInterests, 
				Sequence{ProcessingReasonSubtype::None});
		invariant StopProcessingInterestShouldNotContainSubReason: 
				isSubPurposeValid(ProcessingReason::StopProcessing, 
				Sequence{ProcessingReasonSubtype::None});
```

### AbstractPaper class

```
		invariant StartDateShouldBeBeforeTerminationDate('Terminationdate is after startdate!'): 
			self.terminationDate = null or (not(self.startDate > self.terminationDate));
```

### SharedPrivacyData class

```
		invariant ProtectionControlShouldExistsInConfiguration('Protection controls should be defined in configuration.'): 
			self.additionalProtectionControls->forAll(protectionControl:String|
				PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.isPolicyControlValid(protectionControl)
			);
		invariant DataSourceShouldExistsInConfiguration('Data source should be defined in configuration.'): 
			self.dataSource = null or PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.isDataSourceValid(self.dataSource);
```

### Notification class

```
		invariant ShouldDefineCausedByAsWithdraw('NotifyAboutWithdraw should contain causedBy with complaint Withraw'): 
			if(type = NotificationType::Withdraw) then
				if(causedBy.oclIsKindOf(Complaint)) then
					let complaint : Complaint = causedBy.oclAsType(Complaint) in
					complaint.action.oclIsKindOf(Withdraw)
				else
					false
				endif
			else
				true
			endif;
		invariant ShouldDefineCausedByAsErasure('NotifyAboutErasure should contain causedBy with complaint Erasure'): 
			if(type = NotificationType::Erasure) then
				if(causedBy.oclIsKindOf(Complaint)) then
					let complaint : Complaint = causedBy.oclAsType(Complaint) in
					if(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then
						let basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in
						basedOnData.type = ComplaintBasedOnDataType::Erasure
					else
						false
					endif
				else
					false
				endif
			else
				true
			endif;
		invariant
		ShouldDefineCausedByAsRectification('NotifyAboutRectification should contain causedBy with complaint Rectification'): 
			if(type = NotificationType::Rectification) then
				if(causedBy.oclIsKindOf(Complaint)) then
					let complaint : Complaint = causedBy.oclAsType(Complaint) in
					if(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then
						let basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in
						basedOnData.type = ComplaintBasedOnDataType::Rectification
					else
						false
					endif
				else
					false
				endif
			else
				true
			endif;
		invariant
		ShouldDefineCausedByAsPrivacyPolicy('NotifyAboutCollecting or StopProcessing should contain causedBy with policy statement'): 
			if(type = NotificationType::DataCollecting or type = NotificationType::StopProcessing 
				or type = NotificationType::ExecutedRectification or type = NotificationType::ExecutedErasure
			) then
				causedBy.oclIsKindOf(PolicyStatement)
			else
				true
			endif;
```
