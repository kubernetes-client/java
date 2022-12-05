package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeSelectorBuilder extends V1NodeSelectorFluentImpl<V1NodeSelectorBuilder> implements VisitableBuilder<V1NodeSelector,V1NodeSelectorBuilder>{
  public V1NodeSelectorBuilder() {
    this(false);
  }
  public V1NodeSelectorBuilder(Boolean validationEnabled) {
    this(new V1NodeSelector(), validationEnabled);
  }
  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeSelector(), validationEnabled);
  }
  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent,V1NodeSelector instance) {
    this(fluent, instance, false);
  }
  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent,V1NodeSelector instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNodeSelectorTerms(instance.getNodeSelectorTerms());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeSelectorBuilder(V1NodeSelector instance) {
    this(instance,false);
  }
  public V1NodeSelectorBuilder(V1NodeSelector instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNodeSelectorTerms(instance.getNodeSelectorTerms());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeSelectorFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeSelector build() {
    V1NodeSelector buildable = new V1NodeSelector();
    buildable.setNodeSelectorTerms(fluent.getNodeSelectorTerms());
    return buildable;
  }
  
}