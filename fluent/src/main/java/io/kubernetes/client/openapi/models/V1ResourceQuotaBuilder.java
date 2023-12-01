package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceQuotaBuilder extends V1ResourceQuotaFluent<V1ResourceQuotaBuilder> implements VisitableBuilder<V1ResourceQuota,V1ResourceQuotaBuilder>{
  public V1ResourceQuotaBuilder() {
    this(new V1ResourceQuota());
  }
  
  public V1ResourceQuotaBuilder(V1ResourceQuotaFluent<?> fluent) {
    this(fluent, new V1ResourceQuota());
  }
  
  public V1ResourceQuotaBuilder(V1ResourceQuotaFluent<?> fluent,V1ResourceQuota instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceQuotaBuilder(V1ResourceQuota instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceQuotaFluent<?> fluent;
  
  public V1ResourceQuota build() {
    V1ResourceQuota buildable = new V1ResourceQuota();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}