# OCL rule examples

Each XMI file here is an example for one OCL rule from `model/privacyModel.ecore`.
The file name says which rule and what is expected:

```
WithdrawnConsent-valid.xmi       must not violate any rule
WithdrawnConsent-invalid.xmi     must violate exactly WithdrawnConsent
```

- More examples per rule: add anything after `valid`/`invalid`,
  e.g. `WithdrawnConsent-invalid-expired.xmi`.
- If two classes have a rule with the same name, put the class in front:
  `SharedPrivacyData.ProtectionControlShouldExistInConfiguration-invalid.xmi`.
- Start each XMI with a one-line comment that says what the example shows.

No Java code is needed: `test/ocltests/RuleExamplesTest.java` finds the files itself.
Run it in Eclipse with *Run As → JUnit Test*, or with `ci/run-tests.sh`.

A rule counts as covered (the "OCL rules" badge) when it has at least one valid
and one invalid example.
