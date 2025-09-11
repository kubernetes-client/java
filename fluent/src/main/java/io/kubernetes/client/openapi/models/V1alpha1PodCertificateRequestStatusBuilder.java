package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1PodCertificateRequestStatusBuilder extends V1alpha1PodCertificateRequestStatusFluent<V1alpha1PodCertificateRequestStatusBuilder> implements VisitableBuilder<V1alpha1PodCertificateRequestStatus,V1alpha1PodCertificateRequestStatusBuilder>{
  public V1alpha1PodCertificateRequestStatusBuilder() {
    this(new V1alpha1PodCertificateRequestStatus());
  }
  
  public V1alpha1PodCertificateRequestStatusBuilder(V1alpha1PodCertificateRequestStatusFluent<?> fluent) {
    this(fluent, new V1alpha1PodCertificateRequestStatus());
  }
  
  public V1alpha1PodCertificateRequestStatusBuilder(V1alpha1PodCertificateRequestStatusFluent<?> fluent,V1alpha1PodCertificateRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1PodCertificateRequestStatusBuilder(V1alpha1PodCertificateRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1PodCertificateRequestStatusFluent<?> fluent;
  
  public V1alpha1PodCertificateRequestStatus build() {
    V1alpha1PodCertificateRequestStatus buildable = new V1alpha1PodCertificateRequestStatus();
    buildable.setBeginRefreshAt(fluent.getBeginRefreshAt());
    buildable.setCertificateChain(fluent.getCertificateChain());
    buildable.setConditions(fluent.buildConditions());
    buildable.setNotAfter(fluent.getNotAfter());
    buildable.setNotBefore(fluent.getNotBefore());
    return buildable;
  }
  

}