package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodTemplateBuilder extends V1PodTemplateFluentImpl<V1PodTemplateBuilder> implements VisitableBuilder<V1PodTemplate,V1PodTemplateBuilder>{
  public V1PodTemplateBuilder() {
    this(false);
  }
  public V1PodTemplateBuilder(Boolean validationEnabled) {
    this(new V1PodTemplate(), validationEnabled);
  }
  public V1PodTemplateBuilder(V1PodTemplateFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodTemplateBuilder(V1PodTemplateFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodTemplate(), validationEnabled);
  }
  public V1PodTemplateBuilder(V1PodTemplateFluent<?> fluent,V1PodTemplate instance) {
    this(fluent, instance, false);
  }
  public V1PodTemplateBuilder(V1PodTemplateFluent<?> fluent,V1PodTemplate instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodTemplateBuilder(V1PodTemplate instance) {
    this(instance,false);
  }
  public V1PodTemplateBuilder(V1PodTemplate instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled; 
  }
  V1PodTemplateFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodTemplate build() {
    V1PodTemplate buildable = new V1PodTemplate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setTemplate(fluent.getTemplate());
    return buildable;
  }
  
}