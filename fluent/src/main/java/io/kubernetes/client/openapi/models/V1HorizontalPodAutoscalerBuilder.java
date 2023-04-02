package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1HorizontalPodAutoscalerBuilder extends V1HorizontalPodAutoscalerFluentImpl<V1HorizontalPodAutoscalerBuilder> implements VisitableBuilder<V1HorizontalPodAutoscaler,V1HorizontalPodAutoscalerBuilder>{
  public V1HorizontalPodAutoscalerBuilder() {
    this(false);
  }
  public V1HorizontalPodAutoscalerBuilder(Boolean validationEnabled) {
    this(new V1HorizontalPodAutoscaler(), validationEnabled);
  }
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscalerFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscalerFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1HorizontalPodAutoscaler(), validationEnabled);
  }
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscalerFluent<?> fluent,V1HorizontalPodAutoscaler instance) {
    this(fluent, instance, false);
  }
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscalerFluent<?> fluent,V1HorizontalPodAutoscaler instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscaler instance) {
    this(instance,false);
  }
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscaler instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1HorizontalPodAutoscalerFluent<?> fluent;
  Boolean validationEnabled;
  public V1HorizontalPodAutoscaler build() {
    V1HorizontalPodAutoscaler buildable = new V1HorizontalPodAutoscaler();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}