package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceAttributeBuilder extends V1alpha3DeviceAttributeFluent<V1alpha3DeviceAttributeBuilder> implements VisitableBuilder<V1alpha3DeviceAttribute,V1alpha3DeviceAttributeBuilder>{
  public V1alpha3DeviceAttributeBuilder() {
    this(new V1alpha3DeviceAttribute());
  }
  
  public V1alpha3DeviceAttributeBuilder(V1alpha3DeviceAttributeFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceAttribute());
  }
  
  public V1alpha3DeviceAttributeBuilder(V1alpha3DeviceAttributeFluent<?> fluent,V1alpha3DeviceAttribute instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceAttributeBuilder(V1alpha3DeviceAttribute instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceAttributeFluent<?> fluent;
  
  public V1alpha3DeviceAttribute build() {
    V1alpha3DeviceAttribute buildable = new V1alpha3DeviceAttribute();
    buildable.setBool(fluent.getBool());
    buildable.setInt(fluent.getInt());
    buildable.setString(fluent.getString());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}