package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodIPBuilder extends V1PodIPFluent<V1PodIPBuilder> implements VisitableBuilder<V1PodIP,V1PodIPBuilder>{
  public V1PodIPBuilder() {
    this(new V1PodIP());
  }
  
  public V1PodIPBuilder(V1PodIPFluent<?> fluent) {
    this(fluent, new V1PodIP());
  }
  
  public V1PodIPBuilder(V1PodIPFluent<?> fluent,V1PodIP instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodIPBuilder(V1PodIP instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodIPFluent<?> fluent;
  
  public V1PodIP build() {
    V1PodIP buildable = new V1PodIP();
    buildable.setIp(fluent.getIp());
    return buildable;
  }
  

}