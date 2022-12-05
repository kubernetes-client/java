package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1GroupVersionForDiscoveryBuilder extends V1GroupVersionForDiscoveryFluentImpl<V1GroupVersionForDiscoveryBuilder> implements VisitableBuilder<V1GroupVersionForDiscovery,V1GroupVersionForDiscoveryBuilder>{
  public V1GroupVersionForDiscoveryBuilder() {
    this(false);
  }
  public V1GroupVersionForDiscoveryBuilder(Boolean validationEnabled) {
    this(new V1GroupVersionForDiscovery(), validationEnabled);
  }
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscoveryFluent<?> fluent) {
    this(fluent, false);
  }
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscoveryFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1GroupVersionForDiscovery(), validationEnabled);
  }
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscoveryFluent<?> fluent,V1GroupVersionForDiscovery instance) {
    this(fluent, instance, false);
  }
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscoveryFluent<?> fluent,V1GroupVersionForDiscovery instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withGroupVersion(instance.getGroupVersion());

    fluent.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled; 
  }
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscovery instance) {
    this(instance,false);
  }
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscovery instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withGroupVersion(instance.getGroupVersion());

    this.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled; 
  }
  V1GroupVersionForDiscoveryFluent<?> fluent;
  Boolean validationEnabled;
  public V1GroupVersionForDiscovery build() {
    V1GroupVersionForDiscovery buildable = new V1GroupVersionForDiscovery();
    buildable.setGroupVersion(fluent.getGroupVersion());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  
}