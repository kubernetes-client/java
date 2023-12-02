package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodDNSConfigBuilder extends V1PodDNSConfigFluent<V1PodDNSConfigBuilder> implements VisitableBuilder<V1PodDNSConfig,V1PodDNSConfigBuilder>{
  public V1PodDNSConfigBuilder() {
    this(new V1PodDNSConfig());
  }
  
  public V1PodDNSConfigBuilder(V1PodDNSConfigFluent<?> fluent) {
    this(fluent, new V1PodDNSConfig());
  }
  
  public V1PodDNSConfigBuilder(V1PodDNSConfigFluent<?> fluent,V1PodDNSConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodDNSConfigBuilder(V1PodDNSConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodDNSConfigFluent<?> fluent;
  
  public V1PodDNSConfig build() {
    V1PodDNSConfig buildable = new V1PodDNSConfig();
    buildable.setNameservers(fluent.getNameservers());
    buildable.setOptions(fluent.buildOptions());
    buildable.setSearches(fluent.getSearches());
    return buildable;
  }
  

}