package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1SecretReferenceBuilder extends io.kubernetes.client.openapi.models.V1SecretReferenceFluentImpl<io.kubernetes.client.openapi.models.V1SecretReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SecretReference,io.kubernetes.client.openapi.models.V1SecretReferenceBuilder> {

    io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1SecretReferenceBuilder() {
        this(true);
    }

    public V1SecretReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1SecretReference(), validationEnabled);
    }

    public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1SecretReference(), validationEnabled);
    }

    public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretReference instance) {
        this(fluent, instance, true);
    }

    public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReference instance) {
        this(instance,true);
    }

    public V1SecretReferenceBuilder(io.kubernetes.client.openapi.models.V1SecretReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1SecretReference build() {
        V1SecretReference buildable = new V1SecretReference();
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1SecretReferenceBuilder that = (V1SecretReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
