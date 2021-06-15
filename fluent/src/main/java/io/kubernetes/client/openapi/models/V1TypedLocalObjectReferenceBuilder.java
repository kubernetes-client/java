package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1TypedLocalObjectReferenceBuilder extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1TypedLocalObjectReference,io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder> {

    io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1TypedLocalObjectReferenceBuilder() {
        this(true);
    }

    public V1TypedLocalObjectReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1TypedLocalObjectReference(), validationEnabled);
    }

    public V1TypedLocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1TypedLocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1TypedLocalObjectReference(), validationEnabled);
    }

    public V1TypedLocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance) {
        this(fluent, instance, true);
    }

    public V1TypedLocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiGroup(instance.getApiGroup());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1TypedLocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance) {
        this(instance,true);
    }

    public V1TypedLocalObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiGroup(instance.getApiGroup());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference build() {
        V1TypedLocalObjectReference buildable = new V1TypedLocalObjectReference();
        buildable.setApiGroup(fluent.getApiGroup());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1TypedLocalObjectReferenceBuilder that = (V1TypedLocalObjectReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
