package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1PodCertificateRequestSpecBuilder extends V1alpha1PodCertificateRequestSpecFluent<V1alpha1PodCertificateRequestSpecBuilder> implements VisitableBuilder<V1alpha1PodCertificateRequestSpec,V1alpha1PodCertificateRequestSpecBuilder>{

  V1alpha1PodCertificateRequestSpecFluent<?> fluent;

  public V1alpha1PodCertificateRequestSpecBuilder() {
    this(new V1alpha1PodCertificateRequestSpec());
  }
  
  public V1alpha1PodCertificateRequestSpecBuilder(V1alpha1PodCertificateRequestSpecFluent<?> fluent) {
    this(fluent, new V1alpha1PodCertificateRequestSpec());
  }
  
  public V1alpha1PodCertificateRequestSpecBuilder(V1alpha1PodCertificateRequestSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1PodCertificateRequestSpecBuilder(V1alpha1PodCertificateRequestSpecFluent<?> fluent,V1alpha1PodCertificateRequestSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1PodCertificateRequestSpec build() {
    V1alpha1PodCertificateRequestSpec buildable = new V1alpha1PodCertificateRequestSpec();
    buildable.setMaxExpirationSeconds(fluent.getMaxExpirationSeconds());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeUID(fluent.getNodeUID());
    buildable.setPkixPublicKey(fluent.getPkixPublicKey());
    buildable.setPodName(fluent.getPodName());
    buildable.setPodUID(fluent.getPodUID());
    buildable.setProofOfPossession(fluent.getProofOfPossession());
    buildable.setServiceAccountName(fluent.getServiceAccountName());
    buildable.setServiceAccountUID(fluent.getServiceAccountUID());
    buildable.setSignerName(fluent.getSignerName());
    return buildable;
  }
  
}