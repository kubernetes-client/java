package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2HorizontalPodAutoscalerListBuilder extends V2beta2HorizontalPodAutoscalerListFluentImpl<V2beta2HorizontalPodAutoscalerListBuilder> implements VisitableBuilder<V2beta2HorizontalPodAutoscalerList,V2beta2HorizontalPodAutoscalerListBuilder>{
  public V2beta2HorizontalPodAutoscalerListBuilder() {
    this(false);
  }
  public V2beta2HorizontalPodAutoscalerListBuilder(Boolean validationEnabled) {
    this(new V2beta2HorizontalPodAutoscalerList(), validationEnabled);
  }
  public V2beta2HorizontalPodAutoscalerListBuilder(V2beta2HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2HorizontalPodAutoscalerListBuilder(V2beta2HorizontalPodAutoscalerListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2HorizontalPodAutoscalerList(), validationEnabled);
  }
  public V2beta2HorizontalPodAutoscalerListBuilder(V2beta2HorizontalPodAutoscalerListFluent<?> fluent,V2beta2HorizontalPodAutoscalerList instance) {
    this(fluent, instance, false);
  }
  public V2beta2HorizontalPodAutoscalerListBuilder(V2beta2HorizontalPodAutoscalerListFluent<?> fluent,V2beta2HorizontalPodAutoscalerList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2HorizontalPodAutoscalerListBuilder(V2beta2HorizontalPodAutoscalerList instance) {
    this(instance,false);
  }
  public V2beta2HorizontalPodAutoscalerListBuilder(V2beta2HorizontalPodAutoscalerList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2HorizontalPodAutoscalerListFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2HorizontalPodAutoscalerList build() {
    V2beta2HorizontalPodAutoscalerList buildable = new V2beta2HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}