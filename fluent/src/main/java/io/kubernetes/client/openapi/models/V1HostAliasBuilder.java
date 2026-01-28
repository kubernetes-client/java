package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1HostAliasBuilder extends V1HostAliasFluent<V1HostAliasBuilder> implements VisitableBuilder<V1HostAlias,V1HostAliasBuilder>{

  V1HostAliasFluent<?> fluent;

  public V1HostAliasBuilder() {
    this(new V1HostAlias());
  }
  
  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent) {
    this(fluent, new V1HostAlias());
  }
  
  public V1HostAliasBuilder(V1HostAlias instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent,V1HostAlias instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1HostAlias build() {
    V1HostAlias buildable = new V1HostAlias();
    buildable.setHostnames(fluent.getHostnames());
    buildable.setIp(fluent.getIp());
    return buildable;
  }
  
}