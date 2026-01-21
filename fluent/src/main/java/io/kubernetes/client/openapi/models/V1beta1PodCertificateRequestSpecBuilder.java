package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1PodCertificateRequestSpecBuilder extends V1beta1PodCertificateRequestSpecFluent<V1beta1PodCertificateRequestSpecBuilder> implements VisitableBuilder<V1beta1PodCertificateRequestSpec,V1beta1PodCertificateRequestSpecBuilder>{

  V1beta1PodCertificateRequestSpecFluent<?> fluent;

  public V1beta1PodCertificateRequestSpecBuilder() {
    this(new V1beta1PodCertificateRequestSpec());
  }
  
  public V1beta1PodCertificateRequestSpecBuilder(V1beta1PodCertificateRequestSpecFluent<?> fluent) {
    this(fluent, new V1beta1PodCertificateRequestSpec());
  }
  
  public V1beta1PodCertificateRequestSpecBuilder(V1beta1PodCertificateRequestSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1PodCertificateRequestSpecBuilder(V1beta1PodCertificateRequestSpecFluent<?> fluent,V1beta1PodCertificateRequestSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1PodCertificateRequestSpec build() {
    V1beta1PodCertificateRequestSpec buildable = new V1beta1PodCertificateRequestSpec();
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
    buildable.setUnverifiedUserAnnotations(fluent.getUnverifiedUserAnnotations());
    return buildable;
  }
  
}