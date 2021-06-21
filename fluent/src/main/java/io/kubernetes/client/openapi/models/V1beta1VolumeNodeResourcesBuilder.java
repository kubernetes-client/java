package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1VolumeNodeResourcesBuilder extends io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesFluentImpl<io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources,io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesBuilder> {

    io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1VolumeNodeResourcesBuilder() {
        this(true);
    }

    public V1beta1VolumeNodeResourcesBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1VolumeNodeResources(), validationEnabled);
    }

    public V1beta1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1VolumeNodeResources(), validationEnabled);
    }

    public V1beta1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources instance) {
        this(fluent, instance, true);
    }

    public V1beta1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCount(instance.getCount());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources instance) {
        this(instance,true);
    }

    public V1beta1VolumeNodeResourcesBuilder(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCount(instance.getCount());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources build() {
        V1beta1VolumeNodeResources buildable = new V1beta1VolumeNodeResources();
        buildable.setCount(fluent.getCount());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1VolumeNodeResourcesBuilder that = (V1beta1VolumeNodeResourcesBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
