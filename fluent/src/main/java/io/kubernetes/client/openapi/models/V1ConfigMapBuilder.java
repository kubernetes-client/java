package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ConfigMapBuilder extends io.kubernetes.client.openapi.models.V1ConfigMapFluentImpl<io.kubernetes.client.openapi.models.V1ConfigMapBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ConfigMap,io.kubernetes.client.openapi.models.V1ConfigMapBuilder> {

    io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ConfigMapBuilder() {
        this(true);
    }

    public V1ConfigMapBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ConfigMap(), validationEnabled);
    }

    public V1ConfigMapBuilder(io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ConfigMapBuilder(io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ConfigMap(), validationEnabled);
    }

    public V1ConfigMapBuilder(io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent,io.kubernetes.client.openapi.models.V1ConfigMap instance) {
        this(fluent, instance, true);
    }

    public V1ConfigMapBuilder(io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent,io.kubernetes.client.openapi.models.V1ConfigMap instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withBinaryData(instance.getBinaryData());
        
        fluent.withData(instance.getData());
        
        fluent.withImmutable(instance.getImmutable());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ConfigMapBuilder(io.kubernetes.client.openapi.models.V1ConfigMap instance) {
        this(instance,true);
    }

    public V1ConfigMapBuilder(io.kubernetes.client.openapi.models.V1ConfigMap instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withBinaryData(instance.getBinaryData());
        
        this.withData(instance.getData());
        
        this.withImmutable(instance.getImmutable());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ConfigMap build() {
        V1ConfigMap buildable = new V1ConfigMap();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setBinaryData(fluent.getBinaryData());
        buildable.setData(fluent.getData());
        buildable.setImmutable(fluent.getImmutable());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ConfigMapBuilder that = (V1ConfigMapBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
