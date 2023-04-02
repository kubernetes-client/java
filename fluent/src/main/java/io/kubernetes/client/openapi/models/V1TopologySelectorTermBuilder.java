package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TopologySelectorTermBuilder extends V1TopologySelectorTermFluentImpl<V1TopologySelectorTermBuilder> implements VisitableBuilder<V1TopologySelectorTerm,V1TopologySelectorTermBuilder>{
  public V1TopologySelectorTermBuilder() {
    this(false);
  }
  public V1TopologySelectorTermBuilder(Boolean validationEnabled) {
    this(new V1TopologySelectorTerm(), validationEnabled);
  }
  public V1TopologySelectorTermBuilder(V1TopologySelectorTermFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TopologySelectorTermBuilder(V1TopologySelectorTermFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TopologySelectorTerm(), validationEnabled);
  }
  public V1TopologySelectorTermBuilder(V1TopologySelectorTermFluent<?> fluent,V1TopologySelectorTerm instance) {
    this(fluent, instance, false);
  }
  public V1TopologySelectorTermBuilder(V1TopologySelectorTermFluent<?> fluent,V1TopologySelectorTerm instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMatchLabelExpressions(instance.getMatchLabelExpressions());

    this.validationEnabled = validationEnabled; 
  }
  public V1TopologySelectorTermBuilder(V1TopologySelectorTerm instance) {
    this(instance,false);
  }
  public V1TopologySelectorTermBuilder(V1TopologySelectorTerm instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMatchLabelExpressions(instance.getMatchLabelExpressions());

    this.validationEnabled = validationEnabled; 
  }
  V1TopologySelectorTermFluent<?> fluent;
  Boolean validationEnabled;
  public V1TopologySelectorTerm build() {
    V1TopologySelectorTerm buildable = new V1TopologySelectorTerm();
    buildable.setMatchLabelExpressions(fluent.getMatchLabelExpressions());
    return buildable;
  }
  
}