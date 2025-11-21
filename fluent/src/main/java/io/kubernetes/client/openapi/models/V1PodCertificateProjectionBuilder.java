package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1PodCertificateProjectionBuilder extends V1PodCertificateProjectionFluent<V1PodCertificateProjectionBuilder> implements VisitableBuilder<V1PodCertificateProjection,V1PodCertificateProjectionBuilder>{

  V1PodCertificateProjectionFluent<?> fluent;

  public V1PodCertificateProjectionBuilder() {
    this(new V1PodCertificateProjection());
  }
  
  public V1PodCertificateProjectionBuilder(V1PodCertificateProjectionFluent<?> fluent) {
    this(fluent, new V1PodCertificateProjection());
  }
  
  public V1PodCertificateProjectionBuilder(V1PodCertificateProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodCertificateProjectionBuilder(V1PodCertificateProjectionFluent<?> fluent,V1PodCertificateProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodCertificateProjection build() {
    V1PodCertificateProjection buildable = new V1PodCertificateProjection();
    buildable.setCertificateChainPath(fluent.getCertificateChainPath());
    buildable.setCredentialBundlePath(fluent.getCredentialBundlePath());
    buildable.setKeyPath(fluent.getKeyPath());
    buildable.setKeyType(fluent.getKeyType());
    buildable.setMaxExpirationSeconds(fluent.getMaxExpirationSeconds());
    buildable.setSignerName(fluent.getSignerName());
    return buildable;
  }
  
}