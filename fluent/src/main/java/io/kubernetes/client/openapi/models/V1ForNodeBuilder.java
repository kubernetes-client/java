package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ForNodeBuilder extends V1ForNodeFluent<V1ForNodeBuilder> implements VisitableBuilder<V1ForNode,V1ForNodeBuilder>{

  V1ForNodeFluent<?> fluent;

  public V1ForNodeBuilder() {
    this(new V1ForNode());
  }
  
  public V1ForNodeBuilder(V1ForNodeFluent<?> fluent) {
    this(fluent, new V1ForNode());
  }
  
  public V1ForNodeBuilder(V1ForNode instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ForNodeBuilder(V1ForNodeFluent<?> fluent,V1ForNode instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ForNode build() {
    V1ForNode buildable = new V1ForNode();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}