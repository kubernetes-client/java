package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceDefinitionListBuilder extends V1CustomResourceDefinitionListFluent<V1CustomResourceDefinitionListBuilder> implements VisitableBuilder<V1CustomResourceDefinitionList,V1CustomResourceDefinitionListBuilder>{
  public V1CustomResourceDefinitionListBuilder() {
    this(new V1CustomResourceDefinitionList());
  }
  
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionListFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionList());
  }
  
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionListFluent<?> fluent,V1CustomResourceDefinitionList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceDefinitionListFluent<?> fluent;
  
  public V1CustomResourceDefinitionList build() {
    V1CustomResourceDefinitionList buildable = new V1CustomResourceDefinitionList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}