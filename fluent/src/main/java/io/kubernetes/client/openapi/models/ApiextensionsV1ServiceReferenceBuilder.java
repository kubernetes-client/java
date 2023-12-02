package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class ApiextensionsV1ServiceReferenceBuilder extends ApiextensionsV1ServiceReferenceFluent<ApiextensionsV1ServiceReferenceBuilder> implements VisitableBuilder<ApiextensionsV1ServiceReference,ApiextensionsV1ServiceReferenceBuilder>{
  public ApiextensionsV1ServiceReferenceBuilder() {
    this(new ApiextensionsV1ServiceReference());
  }
  
  public ApiextensionsV1ServiceReferenceBuilder(ApiextensionsV1ServiceReferenceFluent<?> fluent) {
    this(fluent, new ApiextensionsV1ServiceReference());
  }
  
  public ApiextensionsV1ServiceReferenceBuilder(ApiextensionsV1ServiceReferenceFluent<?> fluent,ApiextensionsV1ServiceReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ApiextensionsV1ServiceReferenceBuilder(ApiextensionsV1ServiceReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ApiextensionsV1ServiceReferenceFluent<?> fluent;
  
  public ApiextensionsV1ServiceReference build() {
    ApiextensionsV1ServiceReference buildable = new ApiextensionsV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  

}