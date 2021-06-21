package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1CrossVersionObjectReferenceBuilder extends io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CrossVersionObjectReference,io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder> {

    io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1CrossVersionObjectReferenceBuilder() {
        this(true);
    }

    public V1CrossVersionObjectReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1CrossVersionObjectReference(), validationEnabled);
    }

    public V1CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1CrossVersionObjectReference(), validationEnabled);
    }

    public V1CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1CrossVersionObjectReference instance) {
        this(fluent, instance, true);
    }

    public V1CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1CrossVersionObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference instance) {
        this(instance,true);
    }

    public V1CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference build() {
        V1CrossVersionObjectReference buildable = new V1CrossVersionObjectReference();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1CrossVersionObjectReferenceBuilder that = (V1CrossVersionObjectReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
