package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class ApiregistrationV1ServiceReferenceBuilder extends ApiregistrationV1ServiceReferenceFluentImpl<ApiregistrationV1ServiceReferenceBuilder> implements VisitableBuilder<ApiregistrationV1ServiceReference,ApiregistrationV1ServiceReferenceBuilder>{
  public ApiregistrationV1ServiceReferenceBuilder() {
    this(false);
  }
  public ApiregistrationV1ServiceReferenceBuilder(Boolean validationEnabled) {
    this(new ApiregistrationV1ServiceReference(), validationEnabled);
  }
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new ApiregistrationV1ServiceReference(), validationEnabled);
  }
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReferenceFluent<?> fluent,ApiregistrationV1ServiceReference instance) {
    this(fluent, instance, false);
  }
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReferenceFluent<?> fluent,ApiregistrationV1ServiceReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled; 
  }
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReference instance) {
    this(instance,false);
  }
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled; 
  }
  ApiregistrationV1ServiceReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public ApiregistrationV1ServiceReference build() {
    ApiregistrationV1ServiceReference buildable = new ApiregistrationV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  
}