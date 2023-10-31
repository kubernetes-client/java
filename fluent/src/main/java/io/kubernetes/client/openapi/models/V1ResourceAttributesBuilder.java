package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceAttributesBuilder extends V1ResourceAttributesFluent<V1ResourceAttributesBuilder> implements VisitableBuilder<V1ResourceAttributes,V1ResourceAttributesBuilder>{
  public V1ResourceAttributesBuilder() {
    this(new V1ResourceAttributes());
  }
  
  public V1ResourceAttributesBuilder(V1ResourceAttributesFluent<?> fluent) {
    this(fluent, new V1ResourceAttributes());
  }
  
  public V1ResourceAttributesBuilder(V1ResourceAttributesFluent<?> fluent,V1ResourceAttributes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceAttributesBuilder(V1ResourceAttributes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceAttributesFluent<?> fluent;
  
  public V1ResourceAttributes build() {
    V1ResourceAttributes buildable = new V1ResourceAttributes();
    buildable.setGroup(fluent.getGroup());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResource(fluent.getResource());
    buildable.setSubresource(fluent.getSubresource());
    buildable.setVerb(fluent.getVerb());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}