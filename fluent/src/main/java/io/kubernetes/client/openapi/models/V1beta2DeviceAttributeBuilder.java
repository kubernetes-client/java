package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2DeviceAttributeBuilder extends V1beta2DeviceAttributeFluent<V1beta2DeviceAttributeBuilder> implements VisitableBuilder<V1beta2DeviceAttribute,V1beta2DeviceAttributeBuilder>{
  public V1beta2DeviceAttributeBuilder() {
    this(new V1beta2DeviceAttribute());
  }
  
  public V1beta2DeviceAttributeBuilder(V1beta2DeviceAttributeFluent<?> fluent) {
    this(fluent, new V1beta2DeviceAttribute());
  }
  
  public V1beta2DeviceAttributeBuilder(V1beta2DeviceAttributeFluent<?> fluent,V1beta2DeviceAttribute instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceAttributeBuilder(V1beta2DeviceAttribute instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceAttributeFluent<?> fluent;
  
  public V1beta2DeviceAttribute build() {
    V1beta2DeviceAttribute buildable = new V1beta2DeviceAttribute();
    buildable.setBool(fluent.getBool());
    buildable.setInt(fluent.getInt());
    buildable.setString(fluent.getString());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}