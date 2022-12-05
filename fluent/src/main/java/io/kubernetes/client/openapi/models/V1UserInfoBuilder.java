package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1UserInfoBuilder extends V1UserInfoFluentImpl<V1UserInfoBuilder> implements VisitableBuilder<V1UserInfo,V1UserInfoBuilder>{
  public V1UserInfoBuilder() {
    this(false);
  }
  public V1UserInfoBuilder(Boolean validationEnabled) {
    this(new V1UserInfo(), validationEnabled);
  }
  public V1UserInfoBuilder(V1UserInfoFluent<?> fluent) {
    this(fluent, false);
  }
  public V1UserInfoBuilder(V1UserInfoFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1UserInfo(), validationEnabled);
  }
  public V1UserInfoBuilder(V1UserInfoFluent<?> fluent,V1UserInfo instance) {
    this(fluent, instance, false);
  }
  public V1UserInfoBuilder(V1UserInfoFluent<?> fluent,V1UserInfo instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withExtra(instance.getExtra());

    fluent.withGroups(instance.getGroups());

    fluent.withUid(instance.getUid());

    fluent.withUsername(instance.getUsername());

    this.validationEnabled = validationEnabled; 
  }
  public V1UserInfoBuilder(V1UserInfo instance) {
    this(instance,false);
  }
  public V1UserInfoBuilder(V1UserInfo instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withUid(instance.getUid());

    this.withUsername(instance.getUsername());

    this.validationEnabled = validationEnabled; 
  }
  V1UserInfoFluent<?> fluent;
  Boolean validationEnabled;
  public V1UserInfo build() {
    V1UserInfo buildable = new V1UserInfo();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setUid(fluent.getUid());
    buildable.setUsername(fluent.getUsername());
    return buildable;
  }
  
}