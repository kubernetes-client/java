package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LimitRangeBuilder extends V1LimitRangeFluent<V1LimitRangeBuilder> implements VisitableBuilder<V1LimitRange,V1LimitRangeBuilder>{
  public V1LimitRangeBuilder() {
    this(new V1LimitRange());
  }
  
  public V1LimitRangeBuilder(V1LimitRangeFluent<?> fluent) {
    this(fluent, new V1LimitRange());
  }
  
  public V1LimitRangeBuilder(V1LimitRangeFluent<?> fluent,V1LimitRange instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LimitRangeBuilder(V1LimitRange instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LimitRangeFluent<?> fluent;
  
  public V1LimitRange build() {
    V1LimitRange buildable = new V1LimitRange();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}