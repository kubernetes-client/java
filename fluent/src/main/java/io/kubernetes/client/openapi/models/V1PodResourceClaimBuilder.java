package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodResourceClaimBuilder extends V1PodResourceClaimFluentImpl<V1PodResourceClaimBuilder> implements VisitableBuilder<V1PodResourceClaim,V1PodResourceClaimBuilder>{
  public V1PodResourceClaimBuilder() {
    this(false);
  }
  public V1PodResourceClaimBuilder(Boolean validationEnabled) {
    this(new V1PodResourceClaim(), validationEnabled);
  }
  public V1PodResourceClaimBuilder(V1PodResourceClaimFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodResourceClaimBuilder(V1PodResourceClaimFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodResourceClaim(), validationEnabled);
  }
  public V1PodResourceClaimBuilder(V1PodResourceClaimFluent<?> fluent,V1PodResourceClaim instance) {
    this(fluent, instance, false);
  }
  public V1PodResourceClaimBuilder(V1PodResourceClaimFluent<?> fluent,V1PodResourceClaim instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
      fluent.withSource(instance.getSource());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1PodResourceClaimBuilder(V1PodResourceClaim instance) {
    this(instance,false);
  }
  public V1PodResourceClaimBuilder(V1PodResourceClaim instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
      this.withSource(instance.getSource());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1PodResourceClaimFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodResourceClaim build() {
    V1PodResourceClaim buildable = new V1PodResourceClaim();
    buildable.setName(fluent.getName());
    buildable.setSource(fluent.getSource());
    return buildable;
  }
  
}