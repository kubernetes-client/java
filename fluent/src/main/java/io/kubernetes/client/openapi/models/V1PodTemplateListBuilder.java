package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodTemplateListBuilder extends V1PodTemplateListFluent<V1PodTemplateListBuilder> implements VisitableBuilder<V1PodTemplateList,V1PodTemplateListBuilder>{
  public V1PodTemplateListBuilder() {
    this(new V1PodTemplateList());
  }
  
  public V1PodTemplateListBuilder(V1PodTemplateListFluent<?> fluent) {
    this(fluent, new V1PodTemplateList());
  }
  
  public V1PodTemplateListBuilder(V1PodTemplateListFluent<?> fluent,V1PodTemplateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodTemplateListBuilder(V1PodTemplateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodTemplateListFluent<?> fluent;
  
  public V1PodTemplateList build() {
    V1PodTemplateList buildable = new V1PodTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}