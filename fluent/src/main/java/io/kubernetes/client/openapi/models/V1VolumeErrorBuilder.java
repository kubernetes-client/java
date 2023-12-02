package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeErrorBuilder extends V1VolumeErrorFluent<V1VolumeErrorBuilder> implements VisitableBuilder<V1VolumeError,V1VolumeErrorBuilder>{
  public V1VolumeErrorBuilder() {
    this(new V1VolumeError());
  }
  
  public V1VolumeErrorBuilder(V1VolumeErrorFluent<?> fluent) {
    this(fluent, new V1VolumeError());
  }
  
  public V1VolumeErrorBuilder(V1VolumeErrorFluent<?> fluent,V1VolumeError instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeErrorBuilder(V1VolumeError instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeErrorFluent<?> fluent;
  
  public V1VolumeError build() {
    V1VolumeError buildable = new V1VolumeError();
    buildable.setMessage(fluent.getMessage());
    buildable.setTime(fluent.getTime());
    return buildable;
  }
  

}