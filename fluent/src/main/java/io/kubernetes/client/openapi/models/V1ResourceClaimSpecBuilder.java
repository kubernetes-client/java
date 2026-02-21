package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceClaimSpecBuilder extends V1ResourceClaimSpecFluent<V1ResourceClaimSpecBuilder> implements VisitableBuilder<V1ResourceClaimSpec,V1ResourceClaimSpecBuilder>{

  V1ResourceClaimSpecFluent<?> fluent;

  public V1ResourceClaimSpecBuilder() {
    this(new V1ResourceClaimSpec());
  }
  
  public V1ResourceClaimSpecBuilder(V1ResourceClaimSpecFluent<?> fluent) {
    this(fluent, new V1ResourceClaimSpec());
  }
  
  public V1ResourceClaimSpecBuilder(V1ResourceClaimSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceClaimSpecBuilder(V1ResourceClaimSpecFluent<?> fluent,V1ResourceClaimSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceClaimSpec build() {
    V1ResourceClaimSpec buildable = new V1ResourceClaimSpec();
    buildable.setDevices(fluent.buildDevices());
    return buildable;
  }
  
}