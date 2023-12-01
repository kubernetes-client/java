package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSINodeBuilder extends V1CSINodeFluent<V1CSINodeBuilder> implements VisitableBuilder<V1CSINode,V1CSINodeBuilder>{
  public V1CSINodeBuilder() {
    this(new V1CSINode());
  }
  
  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent) {
    this(fluent, new V1CSINode());
  }
  
  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent,V1CSINode instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSINodeBuilder(V1CSINode instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSINodeFluent<?> fluent;
  
  public V1CSINode build() {
    V1CSINode buildable = new V1CSINode();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}