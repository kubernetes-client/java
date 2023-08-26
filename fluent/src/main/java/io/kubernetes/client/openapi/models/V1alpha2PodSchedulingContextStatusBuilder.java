package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2PodSchedulingContextStatusBuilder extends V1alpha2PodSchedulingContextStatusFluentImpl<V1alpha2PodSchedulingContextStatusBuilder> implements VisitableBuilder<V1alpha2PodSchedulingContextStatus,V1alpha2PodSchedulingContextStatusBuilder>{
  public V1alpha2PodSchedulingContextStatusBuilder() {
    this(false);
  }
  public V1alpha2PodSchedulingContextStatusBuilder(Boolean validationEnabled) {
    this(new V1alpha2PodSchedulingContextStatus(), validationEnabled);
  }
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2PodSchedulingContextStatus(), validationEnabled);
  }
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatusFluent<?> fluent,V1alpha2PodSchedulingContextStatus instance) {
    this(fluent, instance, false);
  }
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatusFluent<?> fluent,V1alpha2PodSchedulingContextStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withResourceClaims(instance.getResourceClaims());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatus instance) {
    this(instance,false);
  }
  public V1alpha2PodSchedulingContextStatusBuilder(V1alpha2PodSchedulingContextStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withResourceClaims(instance.getResourceClaims());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2PodSchedulingContextStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2PodSchedulingContextStatus build() {
    V1alpha2PodSchedulingContextStatus buildable = new V1alpha2PodSchedulingContextStatus();
    buildable.setResourceClaims(fluent.getResourceClaims());
    return buildable;
  }
  
}