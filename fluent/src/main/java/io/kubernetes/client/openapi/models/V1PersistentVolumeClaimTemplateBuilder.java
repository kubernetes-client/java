package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeClaimTemplateBuilder extends V1PersistentVolumeClaimTemplateFluent<V1PersistentVolumeClaimTemplateBuilder> implements VisitableBuilder<V1PersistentVolumeClaimTemplate,V1PersistentVolumeClaimTemplateBuilder>{
  public V1PersistentVolumeClaimTemplateBuilder() {
    this(new V1PersistentVolumeClaimTemplate());
  }
  
  public V1PersistentVolumeClaimTemplateBuilder(V1PersistentVolumeClaimTemplateFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimTemplate());
  }
  
  public V1PersistentVolumeClaimTemplateBuilder(V1PersistentVolumeClaimTemplateFluent<?> fluent,V1PersistentVolumeClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimTemplateBuilder(V1PersistentVolumeClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeClaimTemplateFluent<?> fluent;
  
  public V1PersistentVolumeClaimTemplate build() {
    V1PersistentVolumeClaimTemplate buildable = new V1PersistentVolumeClaimTemplate();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}