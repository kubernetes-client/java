package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceQuotaStatusBuilder extends V1ResourceQuotaStatusFluent<V1ResourceQuotaStatusBuilder> implements VisitableBuilder<V1ResourceQuotaStatus,V1ResourceQuotaStatusBuilder>{
  public V1ResourceQuotaStatusBuilder() {
    this(new V1ResourceQuotaStatus());
  }
  
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatusFluent<?> fluent) {
    this(fluent, new V1ResourceQuotaStatus());
  }
  
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatusFluent<?> fluent,V1ResourceQuotaStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceQuotaStatusFluent<?> fluent;
  
  public V1ResourceQuotaStatus build() {
    V1ResourceQuotaStatus buildable = new V1ResourceQuotaStatus();
    buildable.setHard(fluent.getHard());
    buildable.setUsed(fluent.getUsed());
    return buildable;
  }
  

}