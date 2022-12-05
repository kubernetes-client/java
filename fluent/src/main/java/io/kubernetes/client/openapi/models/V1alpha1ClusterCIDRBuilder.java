package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ClusterCIDRBuilder extends V1alpha1ClusterCIDRFluentImpl<V1alpha1ClusterCIDRBuilder> implements VisitableBuilder<V1alpha1ClusterCIDR,V1alpha1ClusterCIDRBuilder>{
  public V1alpha1ClusterCIDRBuilder() {
    this(false);
  }
  public V1alpha1ClusterCIDRBuilder(Boolean validationEnabled) {
    this(new V1alpha1ClusterCIDR(), validationEnabled);
  }
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDRFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDRFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ClusterCIDR(), validationEnabled);
  }
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDRFluent<?> fluent,V1alpha1ClusterCIDR instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDRFluent<?> fluent,V1alpha1ClusterCIDR instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDR instance) {
    this(instance,false);
  }
  public V1alpha1ClusterCIDRBuilder(V1alpha1ClusterCIDR instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ClusterCIDRFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ClusterCIDR build() {
    V1alpha1ClusterCIDR buildable = new V1alpha1ClusterCIDR();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}