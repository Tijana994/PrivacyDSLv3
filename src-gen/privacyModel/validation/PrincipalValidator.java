/**
 *
 * $Id$
 */
package privacyModel.validation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import privacyModel.Location;
import privacyModel.Principal;
import privacyModel.PrincipalScope;
import privacyModel.PrincipalType;

/**
 * A sample validator interface for {@link privacyModel.Principal}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PrincipalValidator {
	boolean validate();

	boolean validateSubPrincipals(EList<Principal> value);

	boolean validateType(PrincipalType value);

	boolean validateScope(PrincipalScope value);

	boolean validateResponsiblePersons(EList<Principal> value);

	boolean validateInhabits(Location value);

	boolean validateBirthdate(Date value);

	boolean validateAge(int value);
}