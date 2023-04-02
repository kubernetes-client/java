package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServiceAccountTokenProjectionBuilder extends V1ServiceAccountTokenProjectionFluentImpl<V1ServiceAccountTokenProjectionBuilder> implements VisitableBuilder<V1ServiceAccountTokenProjection,V1ServiceAccountTokenProjectionBuilder>{
  public V1ServiceAccountTokenProjectionBuilder() {
    this(false);
  }
  public V1ServiceAccountTokenProjectionBuilder(Boolean validationEnabled) {
    this(new V1ServiceAccountTokenProjection(), validationEnabled);
  }
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServiceAccountTokenProjection(), validationEnabled);
  }
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent,V1ServiceAccountTokenProjection instance) {
    this(fluent, instance, false);
  }
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjectionFluent<?> fluent,V1ServiceAccountTokenProjection instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAudience(instance.getAudience());

    fluent.withExpirationSeconds(instance.getExpirationSeconds());

    fluent.withPath(instance.getPath());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjection instance) {
    this(instance,false);
  }
  public V1ServiceAccountTokenProjectionBuilder(V1ServiceAccountTokenProjection instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAudience(instance.getAudience());

    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.withPath(instance.getPath());

    this.validationEnabled = validationEnabled; 
  }
  V1ServiceAccountTokenProjectionFluent<?> fluent;
  Boolean validationEnabled;
  public V1ServiceAccountTokenProjection build() {
    V1ServiceAccountTokenProjection buildable = new V1ServiceAccountTokenProjection();
    buildable.setAudience(fluent.getAudience());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  
}