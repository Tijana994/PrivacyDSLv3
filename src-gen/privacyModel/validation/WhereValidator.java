/**
 *
 * $Id$
 */
package privacyModel.validation;

import privacyModel.Location;

/**
 * A sample validator interface for {@link privacyModel.Where}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WhereValidator {
	boolean validate();

	boolean validateSource(Location value);

	boolean validateDestination(Location value);
}
