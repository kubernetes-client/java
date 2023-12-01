package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DaemonSetSpecBuilder extends V1DaemonSetSpecFluent<V1DaemonSetSpecBuilder> implements VisitableBuilder<V1DaemonSetSpec,V1DaemonSetSpecBuilder>{
  public V1DaemonSetSpecBuilder() {
    this(new V1DaemonSetSpec());
  }
  
  public V1DaemonSetSpecBuilder(V1DaemonSetSpecFluent<?> fluent) {
    this(fluent, new V1DaemonSetSpec());
  }
  
  public V1DaemonSetSpecBuilder(V1DaemonSetSpecFluent<?> fluent,V1DaemonSetSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DaemonSetSpecBuilder(V1DaemonSetSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DaemonSetSpecFluent<?> fluent;
  
  public V1DaemonSetSpec build() {
    V1DaemonSetSpec buildable = new V1DaemonSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.buildSelector());
    buildable.setTemplate(fluent.buildTemplate());
    buildable.setUpdateStrategy(fluent.buildUpdateStrategy());
    return buildable;
  }
  

}