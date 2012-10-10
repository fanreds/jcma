package jcma.web;

import org.jboss.seam.international.status.builder.BundleKey;

public interface BundleKeys {
// ------------------------------ FIELDS ------------------------------

    BundleKey AUTHORIZATION_EXCEPTION = new BundleKey(BundleNames.view.name(), "view.denied.authorizationException");
    BundleKey DATA_CANNOT_BE_SAVED = new BundleKey(BundleNames.business.name(), "business.dataCannotBeSaved");
    BundleKey DATA_SAVED_SUCCSSFULLY = new BundleKey(BundleNames.business.name(), "business.dataSavedSuccessfully");
    BundleKey ENTITY_NOT_FOUND = new BundleKey(BundleNames.business.name(), "business.entityNotFound");
    BundleKey NO_ELEMENT_SELECTED_WARNING = new BundleKey(BundleNames.business.name(), "business.noElementSelectedWarning");
    BundleKey SELECTED_ELEMENTES_REMOVED_SUCCESSFULLY = new BundleKey(BundleNames.business.name(), "business.selectedElementsRemovedSuccessfully");
    BundleKey SESSION_TIMEOUT = new BundleKey(BundleNames.business.name(), "business.sessionTimeout");
    BundleKey TECHNICAL_ERROR = new BundleKey(BundleNames.business.name(), "business.technicalError");
}
