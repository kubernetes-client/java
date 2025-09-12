package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1PodCertificateRequestBuilder extends V1alpha1PodCertificateRequestFluent<V1alpha1PodCertificateRequestBuilder> implements VisitableBuilder<V1alpha1PodCertificateRequest,V1alpha1PodCertificateRequestBuilder>{
  public V1alpha1PodCertificateRequestBuilder() {
    this(new V1alpha1PodCertificateRequest());
  }
  
  public V1alpha1PodCertificateRequestBuilder(V1alpha1PodCertificateRequestFluent<?> fluent) {
    this(fluent, new V1alpha1PodCertificateRequest());
  }
  
  public V1alpha1PodCertificateRequestBuilder(V1alpha1PodCertificateRequestFluent<?> fluent,V1alpha1PodCertificateRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1PodCertificateRequestBuilder(V1alpha1PodCertificateRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1PodCertificateRequestFluent<?> fluent;
  
  public V1alpha1PodCertificateRequest build() {
    V1alpha1PodCertificateRequest buildable = new V1alpha1PodCertificateRequest();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}