package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1PodExtendedResourceClaimStatusBuilder extends V1PodExtendedResourceClaimStatusFluent<V1PodExtendedResourceClaimStatusBuilder> implements VisitableBuilder<V1PodExtendedResourceClaimStatus,V1PodExtendedResourceClaimStatusBuilder>{

  V1PodExtendedResourceClaimStatusFluent<?> fluent;

  public V1PodExtendedResourceClaimStatusBuilder() {
    this(new V1PodExtendedResourceClaimStatus());
  }
  
  public V1PodExtendedResourceClaimStatusBuilder(V1PodExtendedResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1PodExtendedResourceClaimStatus());
  }
  
  public V1PodExtendedResourceClaimStatusBuilder(V1PodExtendedResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodExtendedResourceClaimStatusBuilder(V1PodExtendedResourceClaimStatusFluent<?> fluent,V1PodExtendedResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodExtendedResourceClaimStatus build() {
    V1PodExtendedResourceClaimStatus buildable = new V1PodExtendedResourceClaimStatus();
    buildable.setRequestMappings(fluent.buildRequestMappings());
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    return buildable;
  }
  
}