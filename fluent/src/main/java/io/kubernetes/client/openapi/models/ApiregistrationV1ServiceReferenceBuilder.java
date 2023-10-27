package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class ApiregistrationV1ServiceReferenceBuilder extends ApiregistrationV1ServiceReferenceFluent<ApiregistrationV1ServiceReferenceBuilder> implements VisitableBuilder<ApiregistrationV1ServiceReference,ApiregistrationV1ServiceReferenceBuilder>{
  public ApiregistrationV1ServiceReferenceBuilder() {
    this(new ApiregistrationV1ServiceReference());
  }
  
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReferenceFluent<?> fluent) {
    this(fluent, new ApiregistrationV1ServiceReference());
  }
  
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReferenceFluent<?> fluent,ApiregistrationV1ServiceReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ApiregistrationV1ServiceReferenceFluent<?> fluent;
  
  public ApiregistrationV1ServiceReference build() {
    ApiregistrationV1ServiceReference buildable = new ApiregistrationV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  

}