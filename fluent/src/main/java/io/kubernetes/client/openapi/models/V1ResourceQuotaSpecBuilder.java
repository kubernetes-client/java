package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceQuotaSpecBuilder extends V1ResourceQuotaSpecFluent<V1ResourceQuotaSpecBuilder> implements VisitableBuilder<V1ResourceQuotaSpec,V1ResourceQuotaSpecBuilder>{
  public V1ResourceQuotaSpecBuilder() {
    this(new V1ResourceQuotaSpec());
  }
  
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpecFluent<?> fluent) {
    this(fluent, new V1ResourceQuotaSpec());
  }
  
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpecFluent<?> fluent,V1ResourceQuotaSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceQuotaSpecFluent<?> fluent;
  
  public V1ResourceQuotaSpec build() {
    V1ResourceQuotaSpec buildable = new V1ResourceQuotaSpec();
    buildable.setHard(fluent.getHard());
    buildable.setScopeSelector(fluent.buildScopeSelector());
    buildable.setScopes(fluent.getScopes());
    return buildable;
  }
  

}