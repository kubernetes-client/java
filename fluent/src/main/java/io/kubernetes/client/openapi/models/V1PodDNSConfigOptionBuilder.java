package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodDNSConfigOptionBuilder extends V1PodDNSConfigOptionFluent<V1PodDNSConfigOptionBuilder> implements VisitableBuilder<V1PodDNSConfigOption,V1PodDNSConfigOptionBuilder>{
  public V1PodDNSConfigOptionBuilder() {
    this(new V1PodDNSConfigOption());
  }
  
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOptionFluent<?> fluent) {
    this(fluent, new V1PodDNSConfigOption());
  }
  
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOptionFluent<?> fluent,V1PodDNSConfigOption instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOption instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodDNSConfigOptionFluent<?> fluent;
  
  public V1PodDNSConfigOption build() {
    V1PodDNSConfigOption buildable = new V1PodDNSConfigOption();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}