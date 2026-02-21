package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1PodCertificateRequestListBuilder extends V1beta1PodCertificateRequestListFluent<V1beta1PodCertificateRequestListBuilder> implements VisitableBuilder<V1beta1PodCertificateRequestList,V1beta1PodCertificateRequestListBuilder>{

  V1beta1PodCertificateRequestListFluent<?> fluent;

  public V1beta1PodCertificateRequestListBuilder() {
    this(new V1beta1PodCertificateRequestList());
  }
  
  public V1beta1PodCertificateRequestListBuilder(V1beta1PodCertificateRequestListFluent<?> fluent) {
    this(fluent, new V1beta1PodCertificateRequestList());
  }
  
  public V1beta1PodCertificateRequestListBuilder(V1beta1PodCertificateRequestList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1PodCertificateRequestListBuilder(V1beta1PodCertificateRequestListFluent<?> fluent,V1beta1PodCertificateRequestList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1PodCertificateRequestList build() {
    V1beta1PodCertificateRequestList buildable = new V1beta1PodCertificateRequestList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}