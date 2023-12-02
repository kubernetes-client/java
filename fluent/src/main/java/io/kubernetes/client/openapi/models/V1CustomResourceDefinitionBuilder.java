package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceDefinitionBuilder extends V1CustomResourceDefinitionFluent<V1CustomResourceDefinitionBuilder> implements VisitableBuilder<V1CustomResourceDefinition,V1CustomResourceDefinitionBuilder>{
  public V1CustomResourceDefinitionBuilder() {
    this(new V1CustomResourceDefinition());
  }
  
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinitionFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinition());
  }
  
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinitionFluent<?> fluent,V1CustomResourceDefinition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceDefinitionFluent<?> fluent;
  
  public V1CustomResourceDefinition build() {
    V1CustomResourceDefinition buildable = new V1CustomResourceDefinition();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}