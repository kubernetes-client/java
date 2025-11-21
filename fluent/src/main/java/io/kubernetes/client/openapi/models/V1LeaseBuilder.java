package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1LeaseBuilder extends V1LeaseFluent<V1LeaseBuilder> implements VisitableBuilder<V1Lease,V1LeaseBuilder>{

  V1LeaseFluent<?> fluent;

  public V1LeaseBuilder() {
    this(new V1Lease());
  }
  
  public V1LeaseBuilder(V1LeaseFluent<?> fluent) {
    this(fluent, new V1Lease());
  }
  
  public V1LeaseBuilder(V1Lease instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LeaseBuilder(V1LeaseFluent<?> fluent,V1Lease instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Lease build() {
    V1Lease buildable = new V1Lease();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}