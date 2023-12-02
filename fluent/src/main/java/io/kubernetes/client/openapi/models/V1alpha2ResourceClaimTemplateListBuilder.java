package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimTemplateListBuilder extends V1alpha2ResourceClaimTemplateListFluent<V1alpha2ResourceClaimTemplateListBuilder> implements VisitableBuilder<V1alpha2ResourceClaimTemplateList,V1alpha2ResourceClaimTemplateListBuilder>{
  public V1alpha2ResourceClaimTemplateListBuilder() {
    this(new V1alpha2ResourceClaimTemplateList());
  }
  
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateListFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimTemplateList());
  }
  
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateListFluent<?> fluent,V1alpha2ResourceClaimTemplateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimTemplateListFluent<?> fluent;
  
  public V1alpha2ResourceClaimTemplateList build() {
    V1alpha2ResourceClaimTemplateList buildable = new V1alpha2ResourceClaimTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}