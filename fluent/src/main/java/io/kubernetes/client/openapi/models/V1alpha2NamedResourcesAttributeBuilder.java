package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2NamedResourcesAttributeBuilder extends V1alpha2NamedResourcesAttributeFluent<V1alpha2NamedResourcesAttributeBuilder> implements VisitableBuilder<V1alpha2NamedResourcesAttribute,V1alpha2NamedResourcesAttributeBuilder>{
  public V1alpha2NamedResourcesAttributeBuilder() {
    this(new V1alpha2NamedResourcesAttribute());
  }
  
  public V1alpha2NamedResourcesAttributeBuilder(V1alpha2NamedResourcesAttributeFluent<?> fluent) {
    this(fluent, new V1alpha2NamedResourcesAttribute());
  }
  
  public V1alpha2NamedResourcesAttributeBuilder(V1alpha2NamedResourcesAttributeFluent<?> fluent,V1alpha2NamedResourcesAttribute instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2NamedResourcesAttributeBuilder(V1alpha2NamedResourcesAttribute instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2NamedResourcesAttributeFluent<?> fluent;
  
  public V1alpha2NamedResourcesAttribute build() {
    V1alpha2NamedResourcesAttribute buildable = new V1alpha2NamedResourcesAttribute();
    buildable.setBool(fluent.getBool());
    buildable.setInt(fluent.getInt());
    buildable.setIntSlice(fluent.buildIntSlice());
    buildable.setName(fluent.getName());
    buildable.setQuantity(fluent.getQuantity());
    buildable.setString(fluent.getString());
    buildable.setStringSlice(fluent.buildStringSlice());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}