package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimListBuilder extends V1alpha3ResourceClaimListFluent<V1alpha3ResourceClaimListBuilder> implements VisitableBuilder<V1alpha3ResourceClaimList,V1alpha3ResourceClaimListBuilder>{
  public V1alpha3ResourceClaimListBuilder() {
    this(new V1alpha3ResourceClaimList());
  }
  
  public V1alpha3ResourceClaimListBuilder(V1alpha3ResourceClaimListFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaimList());
  }
  
  public V1alpha3ResourceClaimListBuilder(V1alpha3ResourceClaimListFluent<?> fluent,V1alpha3ResourceClaimList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimListBuilder(V1alpha3ResourceClaimList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimListFluent<?> fluent;
  
  public V1alpha3ResourceClaimList build() {
    V1alpha3ResourceClaimList buildable = new V1alpha3ResourceClaimList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}