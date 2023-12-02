package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LabelSelectorBuilder extends V1LabelSelectorFluent<V1LabelSelectorBuilder> implements VisitableBuilder<V1LabelSelector,V1LabelSelectorBuilder>{
  public V1LabelSelectorBuilder() {
    this(new V1LabelSelector());
  }
  
  public V1LabelSelectorBuilder(V1LabelSelectorFluent<?> fluent) {
    this(fluent, new V1LabelSelector());
  }
  
  public V1LabelSelectorBuilder(V1LabelSelectorFluent<?> fluent,V1LabelSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LabelSelectorBuilder(V1LabelSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LabelSelectorFluent<?> fluent;
  
  public V1LabelSelector build() {
    V1LabelSelector buildable = new V1LabelSelector();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    buildable.setMatchLabels(fluent.getMatchLabels());
    return buildable;
  }
  

}