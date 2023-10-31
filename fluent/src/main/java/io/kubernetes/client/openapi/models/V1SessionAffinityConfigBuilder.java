package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SessionAffinityConfigBuilder extends V1SessionAffinityConfigFluent<V1SessionAffinityConfigBuilder> implements VisitableBuilder<V1SessionAffinityConfig,V1SessionAffinityConfigBuilder>{
  public V1SessionAffinityConfigBuilder() {
    this(new V1SessionAffinityConfig());
  }
  
  public V1SessionAffinityConfigBuilder(V1SessionAffinityConfigFluent<?> fluent) {
    this(fluent, new V1SessionAffinityConfig());
  }
  
  public V1SessionAffinityConfigBuilder(V1SessionAffinityConfigFluent<?> fluent,V1SessionAffinityConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SessionAffinityConfigBuilder(V1SessionAffinityConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SessionAffinityConfigFluent<?> fluent;
  
  public V1SessionAffinityConfig build() {
    V1SessionAffinityConfig buildable = new V1SessionAffinityConfig();
    buildable.setClientIP(fluent.buildClientIP());
    return buildable;
  }
  

}