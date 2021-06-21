package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1LocalObjectReferenceBuilder extends io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LocalObjectReference,io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder> {

    io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1LocalObjectReferenceBuilder() {
        this(true);
    }

    public V1LocalObjectReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1LocalObjectReference(), validationEnabled);
    }

    public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1LocalObjectReference(), validationEnabled);
    }

    public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1LocalObjectReference instance) {
        this(fluent, instance, true);
    }

    public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1LocalObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReference instance) {
        this(instance,true);
    }

    public V1LocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1LocalObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1LocalObjectReference build() {
        V1LocalObjectReference buildable = new V1LocalObjectReference();
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1LocalObjectReferenceBuilder that = (V1LocalObjectReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
