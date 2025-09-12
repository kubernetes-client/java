package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceClaimTemplateListBuilder extends V1ResourceClaimTemplateListFluent<V1ResourceClaimTemplateListBuilder> implements VisitableBuilder<V1ResourceClaimTemplateList,V1ResourceClaimTemplateListBuilder>{
  public V1ResourceClaimTemplateListBuilder() {
    this(new V1ResourceClaimTemplateList());
  }
  
  public V1ResourceClaimTemplateListBuilder(V1ResourceClaimTemplateListFluent<?> fluent) {
    this(fluent, new V1ResourceClaimTemplateList());
  }
  
  public V1ResourceClaimTemplateListBuilder(V1ResourceClaimTemplateListFluent<?> fluent,V1ResourceClaimTemplateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceClaimTemplateListBuilder(V1ResourceClaimTemplateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceClaimTemplateListFluent<?> fluent;
  
  public V1ResourceClaimTemplateList build() {
    V1ResourceClaimTemplateList buildable = new V1ResourceClaimTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}