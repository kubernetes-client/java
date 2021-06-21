package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1EvictionBuilder extends io.kubernetes.client.openapi.models.V1beta1EvictionFluentImpl<io.kubernetes.client.openapi.models.V1beta1EvictionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1Eviction,io.kubernetes.client.openapi.models.V1beta1EvictionBuilder> {

    io.kubernetes.client.openapi.models.V1beta1EvictionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1EvictionBuilder() {
        this(true);
    }

    public V1beta1EvictionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1Eviction(), validationEnabled);
    }

    public V1beta1EvictionBuilder(io.kubernetes.client.openapi.models.V1beta1EvictionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1EvictionBuilder(io.kubernetes.client.openapi.models.V1beta1EvictionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1Eviction(), validationEnabled);
    }

    public V1beta1EvictionBuilder(io.kubernetes.client.openapi.models.V1beta1EvictionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1Eviction instance) {
        this(fluent, instance, true);
    }

    public V1beta1EvictionBuilder(io.kubernetes.client.openapi.models.V1beta1EvictionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1Eviction instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withDeleteOptions(instance.getDeleteOptions());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1EvictionBuilder(io.kubernetes.client.openapi.models.V1beta1Eviction instance) {
        this(instance,true);
    }

    public V1beta1EvictionBuilder(io.kubernetes.client.openapi.models.V1beta1Eviction instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withDeleteOptions(instance.getDeleteOptions());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1Eviction build() {
        V1beta1Eviction buildable = new V1beta1Eviction();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setDeleteOptions(fluent.getDeleteOptions());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1EvictionBuilder that = (V1beta1EvictionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
