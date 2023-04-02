package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NetworkPolicyStatusBuilder extends V1NetworkPolicyStatusFluentImpl<V1NetworkPolicyStatusBuilder> implements VisitableBuilder<V1NetworkPolicyStatus,V1NetworkPolicyStatusBuilder>{
  public V1NetworkPolicyStatusBuilder() {
    this(false);
  }
  public V1NetworkPolicyStatusBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicyStatus(), validationEnabled);
  }
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyStatus(), validationEnabled);
  }
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatusFluent<?> fluent,V1NetworkPolicyStatus instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatusFluent<?> fluent,V1NetworkPolicyStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatus instance) {
    this(instance,false);
  }
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  V1NetworkPolicyStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1NetworkPolicyStatus build() {
    V1NetworkPolicyStatus buildable = new V1NetworkPolicyStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}