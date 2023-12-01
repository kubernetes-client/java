package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class AdmissionregistrationV1ServiceReferenceBuilder extends AdmissionregistrationV1ServiceReferenceFluent<AdmissionregistrationV1ServiceReferenceBuilder> implements VisitableBuilder<AdmissionregistrationV1ServiceReference,AdmissionregistrationV1ServiceReferenceBuilder>{
  public AdmissionregistrationV1ServiceReferenceBuilder() {
    this(new AdmissionregistrationV1ServiceReference());
  }
  
  public AdmissionregistrationV1ServiceReferenceBuilder(AdmissionregistrationV1ServiceReferenceFluent<?> fluent) {
    this(fluent, new AdmissionregistrationV1ServiceReference());
  }
  
  public AdmissionregistrationV1ServiceReferenceBuilder(AdmissionregistrationV1ServiceReferenceFluent<?> fluent,AdmissionregistrationV1ServiceReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AdmissionregistrationV1ServiceReferenceBuilder(AdmissionregistrationV1ServiceReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AdmissionregistrationV1ServiceReferenceFluent<?> fluent;
  
  public AdmissionregistrationV1ServiceReference build() {
    AdmissionregistrationV1ServiceReference buildable = new AdmissionregistrationV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  

}