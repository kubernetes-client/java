package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceClaimListBuilder extends V1beta1ResourceClaimListFluent<V1beta1ResourceClaimListBuilder> implements VisitableBuilder<V1beta1ResourceClaimList,V1beta1ResourceClaimListBuilder>{
  public V1beta1ResourceClaimListBuilder() {
    this(new V1beta1ResourceClaimList());
  }
  
  public V1beta1ResourceClaimListBuilder(V1beta1ResourceClaimListFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaimList());
  }
  
  public V1beta1ResourceClaimListBuilder(V1beta1ResourceClaimListFluent<?> fluent,V1beta1ResourceClaimList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimListBuilder(V1beta1ResourceClaimList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceClaimListFluent<?> fluent;
  
  public V1beta1ResourceClaimList build() {
    V1beta1ResourceClaimList buildable = new V1beta1ResourceClaimList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}