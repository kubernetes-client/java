package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodTemplateBuilder extends V1PodTemplateFluent<V1PodTemplateBuilder> implements VisitableBuilder<V1PodTemplate,V1PodTemplateBuilder>{
  public V1PodTemplateBuilder() {
    this(new V1PodTemplate());
  }
  
  public V1PodTemplateBuilder(V1PodTemplateFluent<?> fluent) {
    this(fluent, new V1PodTemplate());
  }
  
  public V1PodTemplateBuilder(V1PodTemplateFluent<?> fluent,V1PodTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodTemplateBuilder(V1PodTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodTemplateFluent<?> fluent;
  
  public V1PodTemplate build() {
    V1PodTemplate buildable = new V1PodTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setTemplate(fluent.buildTemplate());
    return buildable;
  }
  

}