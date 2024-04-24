package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1AppArmorProfileBuilder extends V1AppArmorProfileFluent<V1AppArmorProfileBuilder> implements VisitableBuilder<V1AppArmorProfile,V1AppArmorProfileBuilder>{
  public V1AppArmorProfileBuilder() {
    this(new V1AppArmorProfile());
  }
  
  public V1AppArmorProfileBuilder(V1AppArmorProfileFluent<?> fluent) {
    this(fluent, new V1AppArmorProfile());
  }
  
  public V1AppArmorProfileBuilder(V1AppArmorProfileFluent<?> fluent,V1AppArmorProfile instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AppArmorProfileBuilder(V1AppArmorProfile instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AppArmorProfileFluent<?> fluent;
  
  public V1AppArmorProfile build() {
    V1AppArmorProfile buildable = new V1AppArmorProfile();
    buildable.setLocalhostProfile(fluent.getLocalhostProfile());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}