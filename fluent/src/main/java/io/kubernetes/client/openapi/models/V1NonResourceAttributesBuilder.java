package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NonResourceAttributesBuilder extends V1NonResourceAttributesFluentImpl<V1NonResourceAttributesBuilder> implements VisitableBuilder<V1NonResourceAttributes,V1NonResourceAttributesBuilder>{
  public V1NonResourceAttributesBuilder() {
    this(false);
  }
  public V1NonResourceAttributesBuilder(Boolean validationEnabled) {
    this(new V1NonResourceAttributes(), validationEnabled);
  }
  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NonResourceAttributes(), validationEnabled);
  }
  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent,V1NonResourceAttributes instance) {
    this(fluent, instance, false);
  }
  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent,V1NonResourceAttributes instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPath(instance.getPath());

    fluent.withVerb(instance.getVerb());

    this.validationEnabled = validationEnabled; 
  }
  public V1NonResourceAttributesBuilder(V1NonResourceAttributes instance) {
    this(instance,false);
  }
  public V1NonResourceAttributesBuilder(V1NonResourceAttributes instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPath(instance.getPath());

    this.withVerb(instance.getVerb());

    this.validationEnabled = validationEnabled; 
  }
  V1NonResourceAttributesFluent<?> fluent;
  Boolean validationEnabled;
  public V1NonResourceAttributes build() {
    V1NonResourceAttributes buildable = new V1NonResourceAttributes();
    buildable.setPath(fluent.getPath());
    buildable.setVerb(fluent.getVerb());
    return buildable;
  }
  
}