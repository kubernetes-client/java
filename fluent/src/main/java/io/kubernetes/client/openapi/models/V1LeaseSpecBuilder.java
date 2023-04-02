package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LeaseSpecBuilder extends V1LeaseSpecFluentImpl<V1LeaseSpecBuilder> implements VisitableBuilder<V1LeaseSpec,V1LeaseSpecBuilder>{
  public V1LeaseSpecBuilder() {
    this(false);
  }
  public V1LeaseSpecBuilder(Boolean validationEnabled) {
    this(new V1LeaseSpec(), validationEnabled);
  }
  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LeaseSpec(), validationEnabled);
  }
  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent,V1LeaseSpec instance) {
    this(fluent, instance, false);
  }
  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent,V1LeaseSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAcquireTime(instance.getAcquireTime());

    fluent.withHolderIdentity(instance.getHolderIdentity());

    fluent.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());

    fluent.withLeaseTransitions(instance.getLeaseTransitions());

    fluent.withRenewTime(instance.getRenewTime());

    this.validationEnabled = validationEnabled; 
  }
  public V1LeaseSpecBuilder(V1LeaseSpec instance) {
    this(instance,false);
  }
  public V1LeaseSpecBuilder(V1LeaseSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAcquireTime(instance.getAcquireTime());

    this.withHolderIdentity(instance.getHolderIdentity());

    this.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());

    this.withLeaseTransitions(instance.getLeaseTransitions());

    this.withRenewTime(instance.getRenewTime());

    this.validationEnabled = validationEnabled; 
  }
  V1LeaseSpecFluent<?> fluent;
  Boolean validationEnabled;
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