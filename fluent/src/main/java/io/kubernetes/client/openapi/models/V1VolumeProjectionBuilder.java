package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeProjectionBuilder extends V1VolumeProjectionFluentImpl<V1VolumeProjectionBuilder> implements VisitableBuilder<V1VolumeProjection,V1VolumeProjectionBuilder>{
  public V1VolumeProjectionBuilder() {
    this(false);
  }
  public V1VolumeProjectionBuilder(Boolean validationEnabled) {
    this(new V1VolumeProjection(), validationEnabled);
  }
  public V1VolumeProjectionBuilder(V1VolumeProjectionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeProjectionBuilder(V1VolumeProjectionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeProjection(), validationEnabled);
  }
  public V1VolumeProjectionBuilder(V1VolumeProjectionFluent<?> fluent,V1VolumeProjection instance) {
    this(fluent, instance, false);
  }
  public V1VolumeProjectionBuilder(V1VolumeProjectionFluent<?> fluent,V1VolumeProjection instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConfigMap(instance.getConfigMap());

    fluent.withDownwardAPI(instance.getDownwardAPI());

    fluent.withSecret(instance.getSecret());

    fluent.withServiceAccountToken(instance.getServiceAccountToken());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeProjectionBuilder(V1VolumeProjection instance) {
    this(instance,false);
  }
  public V1VolumeProjectionBuilder(V1VolumeProjection instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConfigMap(instance.getConfigMap());

    this.withDownwardAPI(instance.getDownwardAPI());

    this.withSecret(instance.getSecret());

    this.withServiceAccountToken(instance.getServiceAccountToken());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeProjectionFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeProjection build() {
    V1VolumeProjection buildable = new V1VolumeProjection();
    buildable.setConfigMap(fluent.getConfigMap());
    buildable.setDownwardAPI(fluent.getDownwardAPI());
    buildable.setSecret(fluent.getSecret());
    buildable.setServiceAccountToken(fluent.getServiceAccountToken());
    return buildable;
  }
  
}