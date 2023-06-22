package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ClusterTrustBundleListBuilder extends V1alpha1ClusterTrustBundleListFluentImpl<V1alpha1ClusterTrustBundleListBuilder> implements VisitableBuilder<V1alpha1ClusterTrustBundleList,V1alpha1ClusterTrustBundleListBuilder>{
  public V1alpha1ClusterTrustBundleListBuilder() {
    this(false);
  }
  public V1alpha1ClusterTrustBundleListBuilder(Boolean validationEnabled) {
    this(new V1alpha1ClusterTrustBundleList(), validationEnabled);
  }
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ClusterTrustBundleList(), validationEnabled);
  }
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleListFluent<?> fluent,V1alpha1ClusterTrustBundleList instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleListFluent<?> fluent,V1alpha1ClusterTrustBundleList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleList instance) {
    this(instance,false);
  }
  public V1alpha1ClusterTrustBundleListBuilder(V1alpha1ClusterTrustBundleList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ClusterTrustBundleListFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ClusterTrustBundleList build() {
    V1alpha1ClusterTrustBundleList buildable = new V1alpha1ClusterTrustBundleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}