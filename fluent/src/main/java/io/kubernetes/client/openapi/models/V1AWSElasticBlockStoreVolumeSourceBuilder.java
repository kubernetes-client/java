package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1AWSElasticBlockStoreVolumeSourceBuilder extends V1AWSElasticBlockStoreVolumeSourceFluent<V1AWSElasticBlockStoreVolumeSourceBuilder> implements VisitableBuilder<V1AWSElasticBlockStoreVolumeSource,V1AWSElasticBlockStoreVolumeSourceBuilder>{
  public V1AWSElasticBlockStoreVolumeSourceBuilder() {
    this(new V1AWSElasticBlockStoreVolumeSource());
  }
  
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent) {
    this(fluent, new V1AWSElasticBlockStoreVolumeSource());
  }
  
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,V1AWSElasticBlockStoreVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent;
  
  public V1AWSElasticBlockStoreVolumeSource build() {
    V1AWSElasticBlockStoreVolumeSource buildable = new V1AWSElasticBlockStoreVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  

}