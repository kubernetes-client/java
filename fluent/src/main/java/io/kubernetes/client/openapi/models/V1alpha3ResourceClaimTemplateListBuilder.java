package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimTemplateListBuilder extends V1alpha3ResourceClaimTemplateListFluent<V1alpha3ResourceClaimTemplateListBuilder> implements VisitableBuilder<V1alpha3ResourceClaimTemplateList,V1alpha3ResourceClaimTemplateListBuilder>{
  public V1alpha3ResourceClaimTemplateListBuilder() {
    this(new V1alpha3ResourceClaimTemplateList());
  }
  
  public V1alpha3ResourceClaimTemplateListBuilder(V1alpha3ResourceClaimTemplateListFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaimTemplateList());
  }
  
  public V1alpha3ResourceClaimTemplateListBuilder(V1alpha3ResourceClaimTemplateListFluent<?> fluent,V1alpha3ResourceClaimTemplateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimTemplateListBuilder(V1alpha3ResourceClaimTemplateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimTemplateListFluent<?> fluent;
  
  public V1alpha3ResourceClaimTemplateList build() {
    V1alpha3ResourceClaimTemplateList buildable = new V1alpha3ResourceClaimTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}