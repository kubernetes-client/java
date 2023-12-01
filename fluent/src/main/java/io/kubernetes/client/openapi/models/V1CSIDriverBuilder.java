package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSIDriverBuilder extends V1CSIDriverFluent<V1CSIDriverBuilder> implements VisitableBuilder<V1CSIDriver,V1CSIDriverBuilder>{
  public V1CSIDriverBuilder() {
    this(new V1CSIDriver());
  }
  
  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent) {
    this(fluent, new V1CSIDriver());
  }
  
  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent,V1CSIDriver instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSIDriverBuilder(V1CSIDriver instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSIDriverFluent<?> fluent;
  
  public V1CSIDriver build() {
    V1CSIDriver buildable = new V1CSIDriver();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}