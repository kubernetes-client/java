package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LabelSelectorBuilder extends V1LabelSelectorFluentImpl<V1LabelSelectorBuilder> implements VisitableBuilder<V1LabelSelector,V1LabelSelectorBuilder>{
  public V1LabelSelectorBuilder() {
    this(false);
  }
  public V1LabelSelectorBuilder(Boolean validationEnabled) {
    this(new V1LabelSelector(), validationEnabled);
  }
  public V1LabelSelectorBuilder(V1LabelSelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LabelSelectorBuilder(V1LabelSelectorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LabelSelector(), validationEnabled);
  }
  public V1LabelSelectorBuilder(V1LabelSelectorFluent<?> fluent,V1LabelSelector instance) {
    this(fluent, instance, false);
  }
  public V1LabelSelectorBuilder(V1LabelSelectorFluent<?> fluent,V1LabelSelector instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMatchExpressions(instance.getMatchExpressions());

    fluent.withMatchLabels(instance.getMatchLabels());

    this.validationEnabled = validationEnabled; 
  }
  public V1LabelSelectorBuilder(V1LabelSelector instance) {
    this(instance,false);
  }
  public V1LabelSelectorBuilder(V1LabelSelector instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMatchExpressions(instance.getMatchExpressions());

    this.withMatchLabels(instance.getMatchLabels());

    this.validationEnabled = validationEnabled; 
  }
  V1LabelSelectorFluent<?> fluent;
  Boolean validationEnabled;
  public V1LabelSelector build() {
    V1LabelSelector buildable = new V1LabelSelector();
    buildable.setMatchExpressions(fluent.getMatchExpressions());
    buildable.setMatchLabels(fluent.getMatchLabels());
    return buildable;
  }
  
}