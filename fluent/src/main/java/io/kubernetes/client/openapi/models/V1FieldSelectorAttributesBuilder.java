package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1FieldSelectorAttributesBuilder extends V1FieldSelectorAttributesFluent<V1FieldSelectorAttributesBuilder> implements VisitableBuilder<V1FieldSelectorAttributes,V1FieldSelectorAttributesBuilder>{

  V1FieldSelectorAttributesFluent<?> fluent;

  public V1FieldSelectorAttributesBuilder() {
    this(new V1FieldSelectorAttributes());
  }
  
  public V1FieldSelectorAttributesBuilder(V1FieldSelectorAttributesFluent<?> fluent) {
    this(fluent, new V1FieldSelectorAttributes());
  }
  
  public V1FieldSelectorAttributesBuilder(V1FieldSelectorAttributes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1FieldSelectorAttributesBuilder(V1FieldSelectorAttributesFluent<?> fluent,V1FieldSelectorAttributes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1FieldSelectorAttributes build() {
    V1FieldSelectorAttributes buildable = new V1FieldSelectorAttributes();
    buildable.setRawSelector(fluent.getRawSelector());
    buildable.setRequirements(fluent.buildRequirements());
    return buildable;
  }
  
}