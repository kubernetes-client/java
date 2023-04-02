package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DownwardAPIProjectionBuilder extends V1DownwardAPIProjectionFluentImpl<V1DownwardAPIProjectionBuilder> implements VisitableBuilder<V1DownwardAPIProjection,V1DownwardAPIProjectionBuilder>{
  public V1DownwardAPIProjectionBuilder() {
    this(false);
  }
  public V1DownwardAPIProjectionBuilder(Boolean validationEnabled) {
    this(new V1DownwardAPIProjection(), validationEnabled);
  }
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjectionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjectionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DownwardAPIProjection(), validationEnabled);
  }
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjectionFluent<?> fluent,V1DownwardAPIProjection instance) {
    this(fluent, instance, false);
  }
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjectionFluent<?> fluent,V1DownwardAPIProjection instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withItems(instance.getItems());

    this.validationEnabled = validationEnabled; 
  }
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjection instance) {
    this(instance,false);
  }
  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjection instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withItems(instance.getItems());

    this.validationEnabled = validationEnabled; 
  }
  V1DownwardAPIProjectionFluent<?> fluent;
  Boolean validationEnabled;
  public V1DownwardAPIProjection build() {
    V1DownwardAPIProjection buildable = new V1DownwardAPIProjection();
    buildable.setItems(fluent.getItems());
    return buildable;
  }
  
}