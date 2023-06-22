package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2PodSchedulingContextListBuilder extends V1alpha2PodSchedulingContextListFluentImpl<V1alpha2PodSchedulingContextListBuilder> implements VisitableBuilder<V1alpha2PodSchedulingContextList,V1alpha2PodSchedulingContextListBuilder>{
  public V1alpha2PodSchedulingContextListBuilder() {
    this(false);
  }
  public V1alpha2PodSchedulingContextListBuilder(Boolean validationEnabled) {
    this(new V1alpha2PodSchedulingContextList(), validationEnabled);
  }
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2PodSchedulingContextList(), validationEnabled);
  }
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextListFluent<?> fluent,V1alpha2PodSchedulingContextList instance) {
    this(fluent, instance, false);
  }
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextListFluent<?> fluent,V1alpha2PodSchedulingContextList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextList instance) {
    this(instance,false);
  }
  public V1alpha2PodSchedulingContextListBuilder(V1alpha2PodSchedulingContextList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2PodSchedulingContextListFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2PodSchedulingContextList build() {
    V1alpha2PodSchedulingContextList buildable = new V1alpha2PodSchedulingContextList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}