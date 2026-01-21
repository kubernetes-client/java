package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1NodeSelectorBuilder extends V1NodeSelectorFluent<V1NodeSelectorBuilder> implements VisitableBuilder<V1NodeSelector,V1NodeSelectorBuilder>{

  V1NodeSelectorFluent<?> fluent;

  public V1NodeSelectorBuilder() {
    this(new V1NodeSelector());
  }
  
  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent) {
    this(fluent, new V1NodeSelector());
  }
  
  public V1NodeSelectorBuilder(V1NodeSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent,V1NodeSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeSelector build() {
    V1NodeSelector buildable = new V1NodeSelector();
    buildable.setNodeSelectorTerms(fluent.buildNodeSelectorTerms());
    return buildable;
  }
  
}