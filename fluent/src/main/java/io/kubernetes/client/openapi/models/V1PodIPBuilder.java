package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodIPBuilder extends V1PodIPFluentImpl<V1PodIPBuilder> implements VisitableBuilder<V1PodIP,V1PodIPBuilder>{
  public V1PodIPBuilder() {
    this(false);
  }
  public V1PodIPBuilder(Boolean validationEnabled) {
    this(new V1PodIP(), validationEnabled);
  }
  public V1PodIPBuilder(V1PodIPFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodIPBuilder(V1PodIPFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodIP(), validationEnabled);
  }
  public V1PodIPBuilder(V1PodIPFluent<?> fluent,V1PodIP instance) {
    this(fluent, instance, false);
  }
  public V1PodIPBuilder(V1PodIPFluent<?> fluent,V1PodIP instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withIp(instance.getIp());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1PodIPBuilder(V1PodIP instance) {
    this(instance,false);
  }
  public V1PodIPBuilder(V1PodIP instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withIp(instance.getIp());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1PodIPFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodIP build() {
    V1PodIP buildable = new V1PodIP();
    buildable.setIp(fluent.getIp());
    return buildable;
  }
  
}