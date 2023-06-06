package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ClusterTrustBundleBuilder extends V1alpha1ClusterTrustBundleFluentImpl<V1alpha1ClusterTrustBundleBuilder> implements VisitableBuilder<V1alpha1ClusterTrustBundle,V1alpha1ClusterTrustBundleBuilder>{
  public V1alpha1ClusterTrustBundleBuilder() {
    this(false);
  }
  public V1alpha1ClusterTrustBundleBuilder(Boolean validationEnabled) {
    this(new V1alpha1ClusterTrustBundle(), validationEnabled);
  }
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ClusterTrustBundle(), validationEnabled);
  }
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundleFluent<?> fluent,V1alpha1ClusterTrustBundle instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundleFluent<?> fluent,V1alpha1ClusterTrustBundle instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundle instance) {
    this(instance,false);
  }
  public V1alpha1ClusterTrustBundleBuilder(V1alpha1ClusterTrustBundle instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ClusterTrustBundleFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ClusterTrustBundle build() {
    V1alpha1ClusterTrustBundle buildable = new V1alpha1ClusterTrustBundle();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}