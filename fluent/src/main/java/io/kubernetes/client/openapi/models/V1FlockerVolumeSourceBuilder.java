package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1FlockerVolumeSourceBuilder extends V1FlockerVolumeSourceFluentImpl<V1FlockerVolumeSourceBuilder> implements VisitableBuilder<V1FlockerVolumeSource,V1FlockerVolumeSourceBuilder>{
  public V1FlockerVolumeSourceBuilder() {
    this(false);
  }
  public V1FlockerVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FlockerVolumeSource(), validationEnabled);
  }
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1FlockerVolumeSource(), validationEnabled);
  }
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent,V1FlockerVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent,V1FlockerVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDatasetName(instance.getDatasetName());

    fluent.withDatasetUUID(instance.getDatasetUUID());

    this.validationEnabled = validationEnabled; 
  }
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSource instance) {
    this(instance,false);
  }
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDatasetName(instance.getDatasetName());

    this.withDatasetUUID(instance.getDatasetUUID());

    this.validationEnabled = validationEnabled; 
  }
  V1FlockerVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1FlockerVolumeSource build() {
    V1FlockerVolumeSource buildable = new V1FlockerVolumeSource();
    buildable.setDatasetName(fluent.getDatasetName());
    buildable.setDatasetUUID(fluent.getDatasetUUID());
    return buildable;
  }
  
}