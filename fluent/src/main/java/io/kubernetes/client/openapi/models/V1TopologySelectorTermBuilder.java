package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TopologySelectorTermBuilder extends V1TopologySelectorTermFluent<V1TopologySelectorTermBuilder> implements VisitableBuilder<V1TopologySelectorTerm,V1TopologySelectorTermBuilder>{
  public V1TopologySelectorTermBuilder() {
    this(new V1TopologySelectorTerm());
  }
  
  public V1TopologySelectorTermBuilder(V1TopologySelectorTermFluent<?> fluent) {
    this(fluent, new V1TopologySelectorTerm());
  }
  
  public V1TopologySelectorTermBuilder(V1TopologySelectorTermFluent<?> fluent,V1TopologySelectorTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TopologySelectorTermBuilder(V1TopologySelectorTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TopologySelectorTermFluent<?> fluent;
  
  public V1TopologySelectorTerm build() {
    V1TopologySelectorTerm buildable = new V1TopologySelectorTerm();
    buildable.setMatchLabelExpressions(fluent.buildMatchLabelExpressions());
    return buildable;
  }
  

}