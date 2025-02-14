package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceClaimTemplateListBuilder extends V1beta1ResourceClaimTemplateListFluent<V1beta1ResourceClaimTemplateListBuilder> implements VisitableBuilder<V1beta1ResourceClaimTemplateList,V1beta1ResourceClaimTemplateListBuilder>{
  public V1beta1ResourceClaimTemplateListBuilder() {
    this(new V1beta1ResourceClaimTemplateList());
  }
  
  public V1beta1ResourceClaimTemplateListBuilder(V1beta1ResourceClaimTemplateListFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaimTemplateList());
  }
  
  public V1beta1ResourceClaimTemplateListBuilder(V1beta1ResourceClaimTemplateListFluent<?> fluent,V1beta1ResourceClaimTemplateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimTemplateListBuilder(V1beta1ResourceClaimTemplateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceClaimTemplateListFluent<?> fluent;
  
  public V1beta1ResourceClaimTemplateList build() {
    V1beta1ResourceClaimTemplateList buildable = new V1beta1ResourceClaimTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}