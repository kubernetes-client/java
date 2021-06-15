package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ObjectReferenceBuilder extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ObjectReference,io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> {

    io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ObjectReferenceBuilder() {
        this(true);
    }

    public V1ObjectReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ObjectReference(), validationEnabled);
    }

    public V1ObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ObjectReference(), validationEnabled);
    }

    public V1ObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ObjectReference instance) {
        this(fluent, instance, true);
    }

    public V1ObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withFieldPath(instance.getFieldPath());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        fluent.withResourceVersion(instance.getResourceVersion());
        
        fluent.withUid(instance.getUid());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1ObjectReference instance) {
        this(instance,true);
    }

    public V1ObjectReferenceBuilder(io.kubernetes.client.openapi.models.V1ObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withFieldPath(instance.getFieldPath());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.withResourceVersion(instance.getResourceVersion());
        
        this.withUid(instance.getUid());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ObjectReference build() {
        V1ObjectReference buildable = new V1ObjectReference();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setFieldPath(fluent.getFieldPath());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        buildable.setResourceVersion(fluent.getResourceVersion());
        buildable.setUid(fluent.getUid());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ObjectReferenceBuilder that = (V1ObjectReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
