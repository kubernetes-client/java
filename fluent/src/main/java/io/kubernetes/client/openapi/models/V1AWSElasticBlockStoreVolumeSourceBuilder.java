package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1AWSElasticBlockStoreVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource,io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1AWSElasticBlockStoreVolumeSourceBuilder() {
        this(true);
    }

    public V1AWSElasticBlockStoreVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1AWSElasticBlockStoreVolumeSource(), validationEnabled);
    }

    public V1AWSElasticBlockStoreVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1AWSElasticBlockStoreVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1AWSElasticBlockStoreVolumeSource(), validationEnabled);
    }

    public V1AWSElasticBlockStoreVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1AWSElasticBlockStoreVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withPartition(instance.getPartition());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withVolumeID(instance.getVolumeID());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1AWSElasticBlockStoreVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance) {
        this(instance,true);
    }

    public V1AWSElasticBlockStoreVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withPartition(instance.getPartition());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withVolumeID(instance.getVolumeID());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource build() {
        V1AWSElasticBlockStoreVolumeSource buildable = new V1AWSElasticBlockStoreVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setPartition(fluent.getPartition());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setVolumeID(fluent.getVolumeID());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1AWSElasticBlockStoreVolumeSourceBuilder that = (V1AWSElasticBlockStoreVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
