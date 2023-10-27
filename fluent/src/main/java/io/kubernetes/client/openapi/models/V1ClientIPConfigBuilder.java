package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ClientIPConfigBuilder extends V1ClientIPConfigFluent<V1ClientIPConfigBuilder> implements VisitableBuilder<V1ClientIPConfig,V1ClientIPConfigBuilder>{
  public V1ClientIPConfigBuilder() {
    this(new V1ClientIPConfig());
  }
  
  public V1ClientIPConfigBuilder(V1ClientIPConfigFluent<?> fluent) {
    this(fluent, new V1ClientIPConfig());
  }
  
  public V1ClientIPConfigBuilder(V1ClientIPConfigFluent<?> fluent,V1ClientIPConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ClientIPConfigBuilder(V1ClientIPConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ClientIPConfigFluent<?> fluent;
  
  public V1ClientIPConfig build() {
    V1ClientIPConfig buildable = new V1ClientIPConfig();
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
  

}