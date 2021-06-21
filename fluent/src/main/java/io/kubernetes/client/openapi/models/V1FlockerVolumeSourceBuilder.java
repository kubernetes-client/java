package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1FlockerVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1FlockerVolumeSource,io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1FlockerVolumeSourceBuilder() {
        this(true);
    }

    public V1FlockerVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1FlockerVolumeSource(), validationEnabled);
    }

    public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1FlockerVolumeSource(), validationEnabled);
    }

    public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDatasetName(instance.getDatasetName());
        
        fluent.withDatasetUUID(instance.getDatasetUUID());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance) {
        this(instance,true);
    }

    public V1FlockerVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDatasetName(instance.getDatasetName());
        
        this.withDatasetUUID(instance.getDatasetUUID());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1FlockerVolumeSource build() {
        V1FlockerVolumeSource buildable = new V1FlockerVolumeSource();
        buildable.setDatasetName(fluent.getDatasetName());
        buildable.setDatasetUUID(fluent.getDatasetUUID());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1FlockerVolumeSourceBuilder that = (V1FlockerVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
