package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeSelectorTermBuilder extends V1NodeSelectorTermFluent<V1NodeSelectorTermBuilder> implements VisitableBuilder<V1NodeSelectorTerm,V1NodeSelectorTermBuilder>{
  public V1NodeSelectorTermBuilder() {
    this(new V1NodeSelectorTerm());
  }
  
  public V1NodeSelectorTermBuilder(V1NodeSelectorTermFluent<?> fluent) {
    this(fluent, new V1NodeSelectorTerm());
  }
  
  public V1NodeSelectorTermBuilder(V1NodeSelectorTermFluent<?> fluent,V1NodeSelectorTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeSelectorTermBuilder(V1NodeSelectorTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeSelectorTermFluent<?> fluent;
  
  public V1NodeSelectorTerm build() {
    V1NodeSelectorTerm buildable = new V1NodeSelectorTerm();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    buildable.setMatchFields(fluent.buildMatchFields());
    return buildable;
  }
  

}