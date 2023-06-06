package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimBuilder extends V1alpha2ResourceClaimFluentImpl<V1alpha2ResourceClaimBuilder> implements VisitableBuilder<V1alpha2ResourceClaim,V1alpha2ResourceClaimBuilder>{
  public V1alpha2ResourceClaimBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaim(), validationEnabled);
  }
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaimFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaimFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaim(), validationEnabled);
  }
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaimFluent<?> fluent,V1alpha2ResourceClaim instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaimFluent<?> fluent,V1alpha2ResourceClaim instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
      fluent.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaim instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaim instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaim build() {
    V1alpha2ResourceClaim buildable = new V1alpha2ResourceClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}