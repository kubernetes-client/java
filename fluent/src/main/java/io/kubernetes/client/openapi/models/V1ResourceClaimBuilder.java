package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceClaimBuilder extends V1ResourceClaimFluentImpl<V1ResourceClaimBuilder> implements VisitableBuilder<V1ResourceClaim,V1ResourceClaimBuilder>{
  public V1ResourceClaimBuilder() {
    this(false);
  }
  public V1ResourceClaimBuilder(Boolean validationEnabled) {
    this(new V1ResourceClaim(), validationEnabled);
  }
  public V1ResourceClaimBuilder(V1ResourceClaimFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceClaimBuilder(V1ResourceClaimFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceClaim(), validationEnabled);
  }
  public V1ResourceClaimBuilder(V1ResourceClaimFluent<?> fluent,V1ResourceClaim instance) {
    this(fluent, instance, false);
  }
  public V1ResourceClaimBuilder(V1ResourceClaimFluent<?> fluent,V1ResourceClaim instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceClaimBuilder(V1ResourceClaim instance) {
    this(instance,false);
  }
  public V1ResourceClaimBuilder(V1ResourceClaim instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1ResourceClaimFluent<?> fluent;
  Boolean validationEnabled;
  public V1ResourceClaim build() {
    V1ResourceClaim buildable = new V1ResourceClaim();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}