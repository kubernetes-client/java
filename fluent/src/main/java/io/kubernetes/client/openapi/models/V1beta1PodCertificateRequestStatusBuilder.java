package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1PodCertificateRequestStatusBuilder extends V1beta1PodCertificateRequestStatusFluent<V1beta1PodCertificateRequestStatusBuilder> implements VisitableBuilder<V1beta1PodCertificateRequestStatus,V1beta1PodCertificateRequestStatusBuilder>{

  V1beta1PodCertificateRequestStatusFluent<?> fluent;

  public V1beta1PodCertificateRequestStatusBuilder() {
    this(new V1beta1PodCertificateRequestStatus());
  }
  
  public V1beta1PodCertificateRequestStatusBuilder(V1beta1PodCertificateRequestStatusFluent<?> fluent) {
    this(fluent, new V1beta1PodCertificateRequestStatus());
  }
  
  public V1beta1PodCertificateRequestStatusBuilder(V1beta1PodCertificateRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1PodCertificateRequestStatusBuilder(V1beta1PodCertificateRequestStatusFluent<?> fluent,V1beta1PodCertificateRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1PodCertificateRequestStatus build() {
    V1beta1PodCertificateRequestStatus buildable = new V1beta1PodCertificateRequestStatus();
    buildable.setBeginRefreshAt(fluent.getBeginRefreshAt());
    buildable.setCertificateChain(fluent.getCertificateChain());
    buildable.setConditions(fluent.buildConditions());
    buildable.setNotAfter(fluent.getNotAfter());
    buildable.setNotBefore(fluent.getNotBefore());
    return buildable;
  }
  
}