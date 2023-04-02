package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1AWSElasticBlockStoreVolumeSourceBuilder extends V1AWSElasticBlockStoreVolumeSourceFluentImpl<V1AWSElasticBlockStoreVolumeSourceBuilder> implements VisitableBuilder<V1AWSElasticBlockStoreVolumeSource,V1AWSElasticBlockStoreVolumeSourceBuilder>{
  public V1AWSElasticBlockStoreVolumeSourceBuilder() {
    this(false);
  }
  public V1AWSElasticBlockStoreVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1AWSElasticBlockStoreVolumeSource(), validationEnabled);
  }
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1AWSElasticBlockStoreVolumeSource(), validationEnabled);
  }
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,V1AWSElasticBlockStoreVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,V1AWSElasticBlockStoreVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withPartition(instance.getPartition());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSource instance) {
    this(instance,false);
  }
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withPartition(instance.getPartition());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1AWSElasticBlockStoreVolumeSource build() {
    V1AWSElasticBlockStoreVolumeSource buildable = new V1AWSElasticBlockStoreVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  
}