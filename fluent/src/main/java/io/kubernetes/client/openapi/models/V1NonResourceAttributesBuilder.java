package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NonResourceAttributesBuilder extends V1NonResourceAttributesFluent<V1NonResourceAttributesBuilder> implements VisitableBuilder<V1NonResourceAttributes,V1NonResourceAttributesBuilder>{
  public V1NonResourceAttributesBuilder() {
    this(new V1NonResourceAttributes());
  }
  
  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent) {
    this(fluent, new V1NonResourceAttributes());
  }
  
  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent,V1NonResourceAttributes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NonResourceAttributesBuilder(V1NonResourceAttributes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NonResourceAttributesFluent<?> fluent;
  
  public V1NonResourceAttributes build() {
    V1NonResourceAttributes buildable = new V1NonResourceAttributes();
    buildable.setPath(fluent.getPath());
    buildable.setVerb(fluent.getVerb());
    return buildable;
  }
  

}