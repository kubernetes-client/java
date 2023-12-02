package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ScaleSpecBuilder extends V1ScaleSpecFluent<V1ScaleSpecBuilder> implements VisitableBuilder<V1ScaleSpec,V1ScaleSpecBuilder>{
  public V1ScaleSpecBuilder() {
    this(new V1ScaleSpec());
  }
  
  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent) {
    this(fluent, new V1ScaleSpec());
  }
  
  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent,V1ScaleSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ScaleSpecBuilder(V1ScaleSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ScaleSpecFluent<?> fluent;
  
  public V1ScaleSpec build() {
    V1ScaleSpec buildable = new V1ScaleSpec();
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }
  

}