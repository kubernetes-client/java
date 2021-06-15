package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class AdmissionregistrationV1ServiceReferenceBuilder extends io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceFluentImpl<io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference,io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceBuilder> {

    io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public AdmissionregistrationV1ServiceReferenceBuilder() {
        this(true);
    }

    public AdmissionregistrationV1ServiceReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new AdmissionregistrationV1ServiceReference(), validationEnabled);
    }

    public AdmissionregistrationV1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public AdmissionregistrationV1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new AdmissionregistrationV1ServiceReference(), validationEnabled);
    }

    public AdmissionregistrationV1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference instance) {
        this(fluent, instance, true);
    }

    public AdmissionregistrationV1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        fluent.withPath(instance.getPath());
        
        fluent.withPort(instance.getPort());
        
        this.validationEnabled = validationEnabled; 
    }

    public AdmissionregistrationV1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference instance) {
        this(instance,true);
    }

    public AdmissionregistrationV1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.withPath(instance.getPath());
        
        this.withPort(instance.getPort());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference build() {
        AdmissionregistrationV1ServiceReference buildable = new AdmissionregistrationV1ServiceReference();
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        buildable.setPath(fluent.getPath());
        buildable.setPort(fluent.getPort());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdmissionregistrationV1ServiceReferenceBuilder that = (AdmissionregistrationV1ServiceReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
