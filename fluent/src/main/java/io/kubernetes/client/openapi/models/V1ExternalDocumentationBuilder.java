package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ExternalDocumentationBuilder extends V1ExternalDocumentationFluent<V1ExternalDocumentationBuilder> implements VisitableBuilder<V1ExternalDocumentation,V1ExternalDocumentationBuilder>{
  public V1ExternalDocumentationBuilder() {
    this(new V1ExternalDocumentation());
  }
  
  public V1ExternalDocumentationBuilder(V1ExternalDocumentationFluent<?> fluent) {
    this(fluent, new V1ExternalDocumentation());
  }
  
  public V1ExternalDocumentationBuilder(V1ExternalDocumentationFluent<?> fluent,V1ExternalDocumentation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ExternalDocumentationBuilder(V1ExternalDocumentation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ExternalDocumentationFluent<?> fluent;
  
  public V1ExternalDocumentation build() {
    V1ExternalDocumentation buildable = new V1ExternalDocumentation();
    buildable.setDescription(fluent.getDescription());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
  

}