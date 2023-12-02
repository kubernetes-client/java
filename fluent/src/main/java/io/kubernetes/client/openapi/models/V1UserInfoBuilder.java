package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1UserInfoBuilder extends V1UserInfoFluent<V1UserInfoBuilder> implements VisitableBuilder<V1UserInfo,V1UserInfoBuilder>{
  public V1UserInfoBuilder() {
    this(new V1UserInfo());
  }
  
  public V1UserInfoBuilder(V1UserInfoFluent<?> fluent) {
    this(fluent, new V1UserInfo());
  }
  
  public V1UserInfoBuilder(V1UserInfoFluent<?> fluent,V1UserInfo instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1UserInfoBuilder(V1UserInfo instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1UserInfoFluent<?> fluent;
  
  public V1UserInfo build() {
    V1UserInfo buildable = new V1UserInfo();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setUid(fluent.getUid());
    buildable.setUsername(fluent.getUsername());
    return buildable;
  }
  

}