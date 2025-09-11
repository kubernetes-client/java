package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceAttributeBuilder extends V1DeviceAttributeFluent<V1DeviceAttributeBuilder> implements VisitableBuilder<V1DeviceAttribute,V1DeviceAttributeBuilder>{
  public V1DeviceAttributeBuilder() {
    this(new V1DeviceAttribute());
  }
  
  public V1DeviceAttributeBuilder(V1DeviceAttributeFluent<?> fluent) {
    this(fluent, new V1DeviceAttribute());
  }
  
  public V1DeviceAttributeBuilder(V1DeviceAttributeFluent<?> fluent,V1DeviceAttribute instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceAttributeBuilder(V1DeviceAttribute instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceAttributeFluent<?> fluent;
  
  public V1DeviceAttribute build() {
    V1DeviceAttribute buildable = new V1DeviceAttribute();
    buildable.setBool(fluent.getBool());
    buildable.setInt(fluent.getInt());
    buildable.setString(fluent.getString());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}