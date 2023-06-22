package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ClusterTrustBundleSpecBuilder extends V1alpha1ClusterTrustBundleSpecFluentImpl<V1alpha1ClusterTrustBundleSpecBuilder> implements VisitableBuilder<V1alpha1ClusterTrustBundleSpec,V1alpha1ClusterTrustBundleSpecBuilder>{
  public V1alpha1ClusterTrustBundleSpecBuilder() {
    this(false);
  }
  public V1alpha1ClusterTrustBundleSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha1ClusterTrustBundleSpec(), validationEnabled);
  }
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ClusterTrustBundleSpec(), validationEnabled);
  }
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpecFluent<?> fluent,V1alpha1ClusterTrustBundleSpec instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpecFluent<?> fluent,V1alpha1ClusterTrustBundleSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withSignerName(instance.getSignerName());
      fluent.withTrustBundle(instance.getTrustBundle());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpec instance) {
    this(instance,false);
  }
  public V1alpha1ClusterTrustBundleSpecBuilder(V1alpha1ClusterTrustBundleSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withSignerName(instance.getSignerName());
      this.withTrustBundle(instance.getTrustBundle());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ClusterTrustBundleSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ClusterTrustBundleSpec build() {
    V1alpha1ClusterTrustBundleSpec buildable = new V1alpha1ClusterTrustBundleSpec();
    buildable.setSignerName(fluent.getSignerName());
    buildable.setTrustBundle(fluent.getTrustBundle());
    return buildable;
  }
  
}