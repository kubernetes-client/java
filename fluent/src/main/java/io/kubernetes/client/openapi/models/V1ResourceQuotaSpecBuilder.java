package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceQuotaSpecBuilder extends V1ResourceQuotaSpecFluentImpl<V1ResourceQuotaSpecBuilder> implements VisitableBuilder<V1ResourceQuotaSpec,V1ResourceQuotaSpecBuilder>{
  public V1ResourceQuotaSpecBuilder() {
    this(false);
  }
  public V1ResourceQuotaSpecBuilder(Boolean validationEnabled) {
    this(new V1ResourceQuotaSpec(), validationEnabled);
  }
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceQuotaSpec(), validationEnabled);
  }
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpecFluent<?> fluent,V1ResourceQuotaSpec instance) {
    this(fluent, instance, false);
  }
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpecFluent<?> fluent,V1ResourceQuotaSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHard(instance.getHard());

    fluent.withScopeSelector(instance.getScopeSelector());

    fluent.withScopes(instance.getScopes());

    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpec instance) {
    this(instance,false);
  }
  public V1ResourceQuotaSpecBuilder(V1ResourceQuotaSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHard(instance.getHard());

    this.withScopeSelector(instance.getScopeSelector());

    this.withScopes(instance.getScopes());

    this.validationEnabled = validationEnabled; 
  }
  V1ResourceQuotaSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1ResourceQuotaSpec build() {
    V1ResourceQuotaSpec buildable = new V1ResourceQuotaSpec();
    buildable.setHard(fluent.getHard());
    buildable.setScopeSelector(fluent.getScopeSelector());
    buildable.setScopes(fluent.getScopes());
    return buildable;
  }
  
}