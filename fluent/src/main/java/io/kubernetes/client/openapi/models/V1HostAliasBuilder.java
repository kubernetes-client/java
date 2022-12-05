package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1HostAliasBuilder extends V1HostAliasFluentImpl<V1HostAliasBuilder> implements VisitableBuilder<V1HostAlias,V1HostAliasBuilder>{
  public V1HostAliasBuilder() {
    this(false);
  }
  public V1HostAliasBuilder(Boolean validationEnabled) {
    this(new V1HostAlias(), validationEnabled);
  }
  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1HostAlias(), validationEnabled);
  }
  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent,V1HostAlias instance) {
    this(fluent, instance, false);
  }
  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent,V1HostAlias instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHostnames(instance.getHostnames());

    fluent.withIp(instance.getIp());

    this.validationEnabled = validationEnabled; 
  }
  public V1HostAliasBuilder(V1HostAlias instance) {
    this(instance,false);
  }
  public V1HostAliasBuilder(V1HostAlias instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHostnames(instance.getHostnames());

    this.withIp(instance.getIp());

    this.validationEnabled = validationEnabled; 
  }
  V1HostAliasFluent<?> fluent;
  Boolean validationEnabled;
  public V1HostAlias build() {
    V1HostAlias buildable = new V1HostAlias();
    buildable.setHostnames(fluent.getHostnames());
    buildable.setIp(fluent.getIp());
    return buildable;
  }
  
}