package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeBuilder extends V1NodeFluent<V1NodeBuilder> implements VisitableBuilder<V1Node,V1NodeBuilder>{
  public V1NodeBuilder() {
    this(new V1Node());
  }
  
  public V1NodeBuilder(V1NodeFluent<?> fluent) {
    this(fluent, new V1Node());
  }
  
  public V1NodeBuilder(V1NodeFluent<?> fluent,V1Node instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeBuilder(V1Node instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeFluent<?> fluent;
  
  public V1Node build() {
    V1Node buildable = new V1Node();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}