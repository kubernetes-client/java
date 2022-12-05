package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LeaseBuilder extends V1LeaseFluentImpl<V1LeaseBuilder> implements VisitableBuilder<V1Lease,V1LeaseBuilder>{
  public V1LeaseBuilder() {
    this(false);
  }
  public V1LeaseBuilder(Boolean validationEnabled) {
    this(new V1Lease(), validationEnabled);
  }
  public V1LeaseBuilder(V1LeaseFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LeaseBuilder(V1LeaseFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Lease(), validationEnabled);
  }
  public V1LeaseBuilder(V1LeaseFluent<?> fluent,V1Lease instance) {
    this(fluent, instance, false);
  }
  public V1LeaseBuilder(V1LeaseFluent<?> fluent,V1Lease instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1LeaseBuilder(V1Lease instance) {
    this(instance,false);
  }
  public V1LeaseBuilder(V1Lease instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  V1LeaseFluent<?> fluent;
  Boolean validationEnabled;
  public V1Lease build() {
    V1Lease buildable = new V1Lease();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}