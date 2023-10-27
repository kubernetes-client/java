package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LeaseSpecBuilder extends V1LeaseSpecFluent<V1LeaseSpecBuilder> implements VisitableBuilder<V1LeaseSpec,V1LeaseSpecBuilder>{
  public V1LeaseSpecBuilder() {
    this(new V1LeaseSpec());
  }
  
  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent) {
    this(fluent, new V1LeaseSpec());
  }
  
  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent,V1LeaseSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LeaseSpecBuilder(V1LeaseSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LeaseSpecFluent<?> fluent;
  
  public V1LeaseSpec build() {
    V1LeaseSpec buildable = new V1LeaseSpec();
    buildable.setAcquireTime(fluent.getAcquireTime());
    buildable.setHolderIdentity(fluent.getHolderIdentity());
    buildable.setLeaseDurationSeconds(fluent.getLeaseDurationSeconds());
    buildable.setLeaseTransitions(fluent.getLeaseTransitions());
    buildable.setRenewTime(fluent.getRenewTime());
    return buildable;
  }
  

}