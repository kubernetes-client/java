package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2HorizontalPodAutoscalerListBuilder extends V2HorizontalPodAutoscalerListFluentImpl<V2HorizontalPodAutoscalerListBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerList,V2HorizontalPodAutoscalerListBuilder>{
  public V2HorizontalPodAutoscalerListBuilder() {
    this(false);
  }
  public V2HorizontalPodAutoscalerListBuilder(Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerList(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerList(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent,V2HorizontalPodAutoscalerList instance) {
    this(fluent, instance, false);
  }
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent,V2HorizontalPodAutoscalerList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerList instance) {
    this(instance,false);
  }
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V2HorizontalPodAutoscalerListFluent<?> fluent;
  Boolean validationEnabled;
  public V2HorizontalPodAutoscalerList build() {
    V2HorizontalPodAutoscalerList buildable = new V2HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}