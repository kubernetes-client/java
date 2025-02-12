package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceAttributeBuilder extends V1beta1DeviceAttributeFluent<V1beta1DeviceAttributeBuilder> implements VisitableBuilder<V1beta1DeviceAttribute,V1beta1DeviceAttributeBuilder>{
  public V1beta1DeviceAttributeBuilder() {
    this(new V1beta1DeviceAttribute());
  }
  
  public V1beta1DeviceAttributeBuilder(V1beta1DeviceAttributeFluent<?> fluent) {
    this(fluent, new V1beta1DeviceAttribute());
  }
  
  public V1beta1DeviceAttributeBuilder(V1beta1DeviceAttributeFluent<?> fluent,V1beta1DeviceAttribute instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceAttributeBuilder(V1beta1DeviceAttribute instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceAttributeFluent<?> fluent;
  
  public V1beta1DeviceAttribute build() {
    V1beta1DeviceAttribute buildable = new V1beta1DeviceAttribute();
    buildable.setBool(fluent.getBool());
    buildable.setInt(fluent.getInt());
    buildable.setString(fluent.getString());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}