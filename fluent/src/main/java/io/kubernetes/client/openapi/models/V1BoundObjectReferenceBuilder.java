package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1BoundObjectReferenceBuilder extends io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1BoundObjectReference,io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder> {

    io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1BoundObjectReferenceBuilder() {
        this(true);
    }

    public V1BoundObjectReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1BoundObjectReference(), validationEnabled);
    }

    public V1BoundObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1BoundObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1BoundObjectReference(), validationEnabled);
    }

    public V1BoundObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1BoundObjectReference instance) {
        this(fluent, instance, true);
    }

    public V1BoundObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1BoundObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        fluent.withUid(instance.getUid());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1BoundObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1BoundObjectReference instance) {
        this(instance,true);
    }

    public V1BoundObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1BoundObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.withUid(instance.getUid());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1BoundObjectReference build() {
        V1BoundObjectReference buildable = new V1BoundObjectReference();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        buildable.setUid(fluent.getUid());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1BoundObjectReferenceBuilder that = (V1BoundObjectReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
