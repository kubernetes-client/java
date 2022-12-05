package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1HorizontalPodAutoscalerListBuilder extends V1HorizontalPodAutoscalerListFluentImpl<V1HorizontalPodAutoscalerListBuilder> implements VisitableBuilder<V1HorizontalPodAutoscalerList,V1HorizontalPodAutoscalerListBuilder>{
  public V1HorizontalPodAutoscalerListBuilder() {
    this(false);
  }
  public V1HorizontalPodAutoscalerListBuilder(Boolean validationEnabled) {
    this(new V1HorizontalPodAutoscalerList(), validationEnabled);
  }
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1HorizontalPodAutoscalerList(), validationEnabled);
  }
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerListFluent<?> fluent,V1HorizontalPodAutoscalerList instance) {
    this(fluent, instance, false);
  }
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerListFluent<?> fluent,V1HorizontalPodAutoscalerList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerList instance) {
    this(instance,false);
  }
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1HorizontalPodAutoscalerListFluent<?> fluent;
  Boolean validationEnabled;
  public V1HorizontalPodAutoscalerList build() {
    V1HorizontalPodAutoscalerList buildable = new V1HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}