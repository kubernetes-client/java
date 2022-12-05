package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSINodeBuilder extends V1CSINodeFluentImpl<V1CSINodeBuilder> implements VisitableBuilder<V1CSINode,V1CSINodeBuilder>{
  public V1CSINodeBuilder() {
    this(false);
  }
  public V1CSINodeBuilder(Boolean validationEnabled) {
    this(new V1CSINode(), validationEnabled);
  }
  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSINode(), validationEnabled);
  }
  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent,V1CSINode instance) {
    this(fluent, instance, false);
  }
  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent,V1CSINode instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSINodeBuilder(V1CSINode instance) {
    this(instance,false);
  }
  public V1CSINodeBuilder(V1CSINode instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  V1CSINodeFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSINode build() {
    V1CSINode buildable = new V1CSINode();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}