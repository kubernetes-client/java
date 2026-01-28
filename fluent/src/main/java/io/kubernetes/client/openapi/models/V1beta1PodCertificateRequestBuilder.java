package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1PodCertificateRequestBuilder extends V1beta1PodCertificateRequestFluent<V1beta1PodCertificateRequestBuilder> implements VisitableBuilder<V1beta1PodCertificateRequest,V1beta1PodCertificateRequestBuilder>{

  V1beta1PodCertificateRequestFluent<?> fluent;

  public V1beta1PodCertificateRequestBuilder() {
    this(new V1beta1PodCertificateRequest());
  }
  
  public V1beta1PodCertificateRequestBuilder(V1beta1PodCertificateRequestFluent<?> fluent) {
    this(fluent, new V1beta1PodCertificateRequest());
  }
  
  public V1beta1PodCertificateRequestBuilder(V1beta1PodCertificateRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1PodCertificateRequestBuilder(V1beta1PodCertificateRequestFluent<?> fluent,V1beta1PodCertificateRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1PodCertificateRequest build() {
    V1beta1PodCertificateRequest buildable = new V1beta1PodCertificateRequest();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}