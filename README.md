# PrivacyDSLv3

[![Tests](https://github.com/Tijana994/PrivacyDSLv3/actions/workflows/tests.yml/badge.svg)](https://github.com/Tijana994/PrivacyDSLv3/actions/workflows/tests.yml) ![OCL rules](.github/badges/ocl-rules.svg) [![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE.txt)

**PrivacyDSLv3** is the meta-model of **TeMDA** (*Themis*, the Greek goddess of justice + *MDA*, Model
Driven Approach), a framework for automatic validation of GDPR compliance in Java applications.

The meta-model describes how an application processes personal data: who processes which data, why,
when, where and on what legal basis (consents, contracts, documents), together with data subjects'
complaints, denials, withdrawals and notifications. It is based on Ecore and developed with the
Eclipse Modeling Framework (EMF). The GDPR rules are written in the Object Constraint Language (OCL)
directly in the meta-model, so every model can be checked for GDPR compliance automatically.

The annotations and the runtime part of the framework, which build a model from a running Java
application, are in the [TeMDA](https://github.com/Tijana994/TeMDA) project.

## Publications

If you use TeMDA in your research, please cite:

- T. Rajačić, M. Zarić, G. Sladić, G. Milosavljević,
  **TeMDA – A model-driven framework for automatic validation of GDPR compliance**,
  *Journal of Computer Languages*, vol. 87, 101387, 2026.
  [doi:10.1016/j.cola.2026.101387](https://doi.org/10.1016/j.cola.2026.101387)

- T. Rajačić, D. Boberić-Krstićev, D. Tešendić, G. Milosavljević,
  **Validation of GDPR Compliance in a Library Management System: A BISIS and TeMDA Case Study**,
  *Information Technology and Libraries*, vol. 44, no. 4, pp. 1–20, 2025.
  [doi:10.5860/ital.v44i4.17407](https://doi.org/10.5860/ital.v44i4.17407)
  · case study listings: [Mendeley Data, doi:10.17632/5ncspt2rg9.1](https://doi.org/10.17632/5ncspt2rg9.1)

<details>
<summary>BibTeX</summary>

```bibtex
@article{rajacic2026temda,
  title   = {TeMDA -- A model-driven framework for automatic validation of GDPR compliance},
  author  = {Raja{\v{c}}i{\'c}, Tijana and Zari{\'c}, Miroslav and Sladi{\'c}, Goran and Milosavljevi{\'c}, Gordana},
  journal = {Journal of Computer Languages},
  volume  = {87},
  pages   = {101387},
  year    = {2026},
  doi     = {10.1016/j.cola.2026.101387}
}

@article{rajacic2025bisis,
  title   = {Validation of GDPR Compliance in a Library Management System: A BISIS and TeMDA Case Study},
  author  = {Raja{\v{c}}i{\'c}, Tijana and Boberi{\'c}-Krsti{\'c}ev, Danijela and Te{\v{s}}endi{\'c}, Danijela and Milosavljevi{\'c}, Gordana},
  journal = {Information Technology and Libraries},
  volume  = {44},
  number  = {4},
  pages   = {1--20},
  year    = {2025},
  doi     = {10.5860/ital.v44i4.17407}
}
```

</details>

## Video tutorials

### Introduction to TeMDA

[![Introduction to TeMDA](https://img.youtube.com/vi/rE7cVhbUNkM/0.jpg)](https://www.youtube.com/watch?v=rE7cVhbUNkM)

## OCL rules

The meta-model contains 99 OCL rules. They are defined in [`model/privacyModel.ecore`](model/privacyModel.ecore)
and fall into two groups:

- **GDPR rules**, each based on a GDPR article, on policy statements (lawful basis, consents,
  contracts, documents, data transfers, special categories of data, ...), complaints and notifications;
- **model validation rules** that keep a model consistent: unique names, allowed sub-reasons of
  processing purposes, valid time intervals, protection controls and data sources defined in the
  configuration.

## Project structure

| Path | Contents |
|---|---|
| `model/privacyModel.ecore` | The meta-model with the OCL rules |
| `model/privacyModel.genmodel`, `model/privacyModel.aird` | EMF generator model and Sirius diagram |
| `model/bank.xmi`, `model/hospital.xmi` | Example models of complete privacy policies |
| `src-gen` | Java code generated from the meta-model, and validation utilities |
| `test`, `test-models` | Tests of the OCL rules |
| `ci` | Builds and tests the project without Eclipse (used by GitHub Actions) |

## Tests

Every OCL rule can have example models in [`test-models`](test-models), named after the rule:

```
WithdrawnConsent-valid.xmi       must not violate any rule
WithdrawnConsent-invalid.xmi     must violate exactly WithdrawnConsent
```

Adding a test means only adding an XMI file; see [`test-models/README.md`](test-models/README.md).
In addition, `CombinationsTest` checks every combination of processing reason and sub-reason, and of
time prepositions in a time interval. The *OCL rules* badge shows how many rules have both a valid
and an invalid example.

**In Eclipse:** right-click the `test` folder → *Run As* → *JUnit Test*.

**From the command line** (e.g. Git Bash):

```bash
bash ci/run-tests.sh
```

## Environment

Java SE Development Kit 21 and Eclipse with these packages:

- Ecore Diagram Editor, Ecore Tools Utilities
- EMF – Eclipse Modeling Framework: Base Runtime, SDK, Xcore Runtime/SDK/UI
- EMF Forms SDK, EMF Model Query SDK, EMF Model Transaction SDK, EMF ODA Driver
- EMF Parley SDK Developer Resources, EMF Validation Framework SDK, EMF/XSD All-In-One SDK
- Model comparison (EMF Compare): Core SDK, EGit support, SDK, Sirius support
- OCL All-In-One SDK, OCL Classic for Ecore and UML Developer, SimpleOCL

## License

[MIT](LICENSE.txt)
