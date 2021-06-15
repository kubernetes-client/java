package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2CrossVersionObjectReferenceBuilder extends io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference,io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceBuilder> {

    io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2CrossVersionObjectReferenceBuilder() {
        this(true);
    }

    public V2beta2CrossVersionObjectReferenceBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2CrossVersionObjectReference(), validationEnabled);
    }

    public V2beta2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2CrossVersionObjectReference(), validationEnabled);
    }

    public V2beta2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference instance) {
        this(fluent, instance, true);
    }

    public V2beta2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference instance) {
        this(instance,true);
    }

    public V2beta2CrossVersionObjectReferenceBuilder(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference build() {
        V2beta2CrossVersionObjectReference buildable = new V2beta2CrossVersionObjectReference();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2CrossVersionObjectReferenceBuilder that = (V2beta2CrossVersionObjectReferenceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
