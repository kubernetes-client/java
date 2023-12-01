package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LimitRangeSpecBuilder extends V1LimitRangeSpecFluent<V1LimitRangeSpecBuilder> implements VisitableBuilder<V1LimitRangeSpec,V1LimitRangeSpecBuilder>{
  public V1LimitRangeSpecBuilder() {
    this(new V1LimitRangeSpec());
  }
  
  public V1LimitRangeSpecBuilder(V1LimitRangeSpecFluent<?> fluent) {
    this(fluent, new V1LimitRangeSpec());
  }
  
  public V1LimitRangeSpecBuilder(V1LimitRangeSpecFluent<?> fluent,V1LimitRangeSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LimitRangeSpecBuilder(V1LimitRangeSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LimitRangeSpecFluent<?> fluent;
  
  public V1LimitRangeSpec build() {
    V1LimitRangeSpec buildable = new V1LimitRangeSpec();
    buildable.setLimits(fluent.buildLimits());
    return buildable;
  }
  

}