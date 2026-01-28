package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2ResourceClaimTemplateListBuilder extends V1beta2ResourceClaimTemplateListFluent<V1beta2ResourceClaimTemplateListBuilder> implements VisitableBuilder<V1beta2ResourceClaimTemplateList,V1beta2ResourceClaimTemplateListBuilder>{

  V1beta2ResourceClaimTemplateListFluent<?> fluent;

  public V1beta2ResourceClaimTemplateListBuilder() {
    this(new V1beta2ResourceClaimTemplateList());
  }
  
  public V1beta2ResourceClaimTemplateListBuilder(V1beta2ResourceClaimTemplateListFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimTemplateList());
  }
  
  public V1beta2ResourceClaimTemplateListBuilder(V1beta2ResourceClaimTemplateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimTemplateListBuilder(V1beta2ResourceClaimTemplateListFluent<?> fluent,V1beta2ResourceClaimTemplateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2ResourceClaimTemplateList build() {
    V1beta2ResourceClaimTemplateList buildable = new V1beta2ResourceClaimTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}