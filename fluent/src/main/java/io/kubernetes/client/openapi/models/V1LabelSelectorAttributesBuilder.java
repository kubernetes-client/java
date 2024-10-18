package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LabelSelectorAttributesBuilder extends V1LabelSelectorAttributesFluent<V1LabelSelectorAttributesBuilder> implements VisitableBuilder<V1LabelSelectorAttributes,V1LabelSelectorAttributesBuilder>{
  public V1LabelSelectorAttributesBuilder() {
    this(new V1LabelSelectorAttributes());
  }
  
  public V1LabelSelectorAttributesBuilder(V1LabelSelectorAttributesFluent<?> fluent) {
    this(fluent, new V1LabelSelectorAttributes());
  }
  
  public V1LabelSelectorAttributesBuilder(V1LabelSelectorAttributesFluent<?> fluent,V1LabelSelectorAttributes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LabelSelectorAttributesBuilder(V1LabelSelectorAttributes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LabelSelectorAttributesFluent<?> fluent;
  
  public V1LabelSelectorAttributes build() {
    V1LabelSelectorAttributes buildable = new V1LabelSelectorAttributes();
    buildable.setRawSelector(fluent.getRawSelector());
    buildable.setRequirements(fluent.buildRequirements());
    return buildable;
  }
  

}