package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2PodSchedulingContextBuilder extends V1alpha2PodSchedulingContextFluentImpl<V1alpha2PodSchedulingContextBuilder> implements VisitableBuilder<V1alpha2PodSchedulingContext,V1alpha2PodSchedulingContextBuilder>{
  public V1alpha2PodSchedulingContextBuilder() {
    this(false);
  }
  public V1alpha2PodSchedulingContextBuilder(Boolean validationEnabled) {
    this(new V1alpha2PodSchedulingContext(), validationEnabled);
  }
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContextFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContextFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2PodSchedulingContext(), validationEnabled);
  }
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContextFluent<?> fluent,V1alpha2PodSchedulingContext instance) {
    this(fluent, instance, false);
  }
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContextFluent<?> fluent,V1alpha2PodSchedulingContext instance,Boolean validationEnabled) {
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
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContext instance) {
    this(instance,false);
  }
  public V1alpha2PodSchedulingContextBuilder(V1alpha2PodSchedulingContext instance,Boolean validationEnabled) {
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
  V1alpha2PodSchedulingContextFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2PodSchedulingContext build() {
    V1alpha2PodSchedulingContext buildable = new V1alpha2PodSchedulingContext();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}