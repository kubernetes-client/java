package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceClaimListBuilder extends V1ResourceClaimListFluent<V1ResourceClaimListBuilder> implements VisitableBuilder<V1ResourceClaimList,V1ResourceClaimListBuilder>{

  V1ResourceClaimListFluent<?> fluent;

  public V1ResourceClaimListBuilder() {
    this(new V1ResourceClaimList());
  }
  
  public V1ResourceClaimListBuilder(V1ResourceClaimListFluent<?> fluent) {
    this(fluent, new V1ResourceClaimList());
  }
  
  public V1ResourceClaimListBuilder(V1ResourceClaimList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceClaimListBuilder(V1ResourceClaimListFluent<?> fluent,V1ResourceClaimList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceClaimList build() {
    V1ResourceClaimList buildable = new V1ResourceClaimList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}