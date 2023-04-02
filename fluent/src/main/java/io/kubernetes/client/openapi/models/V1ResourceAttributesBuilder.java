package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceAttributesBuilder extends V1ResourceAttributesFluentImpl<V1ResourceAttributesBuilder> implements VisitableBuilder<V1ResourceAttributes,V1ResourceAttributesBuilder>{
  public V1ResourceAttributesBuilder() {
    this(false);
  }
  public V1ResourceAttributesBuilder(Boolean validationEnabled) {
    this(new V1ResourceAttributes(), validationEnabled);
  }
  public V1ResourceAttributesBuilder(V1ResourceAttributesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceAttributesBuilder(V1ResourceAttributesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceAttributes(), validationEnabled);
  }
  public V1ResourceAttributesBuilder(V1ResourceAttributesFluent<?> fluent,V1ResourceAttributes instance) {
    this(fluent, instance, false);
  }
  public V1ResourceAttributesBuilder(V1ResourceAttributesFluent<?> fluent,V1ResourceAttributes instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withGroup(instance.getGroup());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withResource(instance.getResource());

    fluent.withSubresource(instance.getSubresource());

    fluent.withVerb(instance.getVerb());

    fluent.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceAttributesBuilder(V1ResourceAttributes instance) {
    this(instance,false);
  }
  public V1ResourceAttributesBuilder(V1ResourceAttributes instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withGroup(instance.getGroup());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResource(instance.getResource());

    this.withSubresource(instance.getSubresource());

    this.withVerb(instance.getVerb());

    this.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled; 
  }
  V1ResourceAttributesFluent<?> fluent;
  Boolean validationEnabled;
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