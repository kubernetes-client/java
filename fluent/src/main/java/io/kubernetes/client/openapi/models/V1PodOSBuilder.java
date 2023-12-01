package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodOSBuilder extends V1PodOSFluent<V1PodOSBuilder> implements VisitableBuilder<V1PodOS,V1PodOSBuilder>{
  public V1PodOSBuilder() {
    this(new V1PodOS());
  }
  
  public V1PodOSBuilder(V1PodOSFluent<?> fluent) {
    this(fluent, new V1PodOS());
  }
  
  public V1PodOSBuilder(V1PodOSFluent<?> fluent,V1PodOS instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodOSBuilder(V1PodOS instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodOSFluent<?> fluent;
  
  public V1PodOS build() {
    V1PodOS buildable = new V1PodOS();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}