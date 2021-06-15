package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ApiregistrationV1beta1ServiceReferenceBuilder extends io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluentImpl<io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference,io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceBuilder> {

    io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public ApiregistrationV1beta1ServiceReferenceBuilder() {
        this(true);
    }

    public ApiregistrationV1beta1ServiceReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new ApiregistrationV1beta1ServiceReference(), validationEnabled);
    }

    public ApiregistrationV1beta1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public ApiregistrationV1beta1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new ApiregistrationV1beta1ServiceReference(), validationEnabled);
    }

    public ApiregistrationV1beta1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference instance) {
        this(fluent, instance, true);
    }

    public ApiregistrationV1beta1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        fluent.withPort(instance.getPort());
        
        this.validationEnabled = validationEnabled; 
    }

    public ApiregistrationV1beta1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference instance) {
        this(instance,true);
    }

    public ApiregistrationV1beta1ServiceReferenceBuilder(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.withPort(instance.getPort());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference build() {
        ApiregistrationV1beta1ServiceReference buildable = new ApiregistrationV1beta1ServiceReference();
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        buildable.setPort(fluent.getPort());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ApiregistrationV1beta1ServiceReferenceBuilder that = (ApiregistrationV1beta1ServiceReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
