package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1PodCertificateRequestListBuilder extends V1alpha1PodCertificateRequestListFluent<V1alpha1PodCertificateRequestListBuilder> implements VisitableBuilder<V1alpha1PodCertificateRequestList,V1alpha1PodCertificateRequestListBuilder>{

  V1alpha1PodCertificateRequestListFluent<?> fluent;

  public V1alpha1PodCertificateRequestListBuilder() {
    this(new V1alpha1PodCertificateRequestList());
  }
  
  public V1alpha1PodCertificateRequestListBuilder(V1alpha1PodCertificateRequestListFluent<?> fluent) {
    this(fluent, new V1alpha1PodCertificateRequestList());
  }
  
  public V1alpha1PodCertificateRequestListBuilder(V1alpha1PodCertificateRequestList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1PodCertificateRequestListBuilder(V1alpha1PodCertificateRequestListFluent<?> fluent,V1alpha1PodCertificateRequestList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1PodCertificateRequestList build() {
    V1alpha1PodCertificateRequestList buildable = new V1alpha1PodCertificateRequestList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}