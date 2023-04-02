package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NamespaceStatusBuilder extends V1NamespaceStatusFluentImpl<V1NamespaceStatusBuilder> implements VisitableBuilder<V1NamespaceStatus,V1NamespaceStatusBuilder>{
  public V1NamespaceStatusBuilder() {
    this(false);
  }
  public V1NamespaceStatusBuilder(Boolean validationEnabled) {
    this(new V1NamespaceStatus(), validationEnabled);
  }
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NamespaceStatus(), validationEnabled);
  }
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent,V1NamespaceStatus instance) {
    this(fluent, instance, false);
  }
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent,V1NamespaceStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    fluent.withPhase(instance.getPhase());

    this.validationEnabled = validationEnabled; 
  }
  public V1NamespaceStatusBuilder(V1NamespaceStatus instance) {
    this(instance,false);
  }
  public V1NamespaceStatusBuilder(V1NamespaceStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.withPhase(instance.getPhase());

    this.validationEnabled = validationEnabled; 
  }
  V1NamespaceStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1NamespaceStatus build() {
    V1NamespaceStatus buildable = new V1NamespaceStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setPhase(fluent.getPhase());
    return buildable;
  }
  
}