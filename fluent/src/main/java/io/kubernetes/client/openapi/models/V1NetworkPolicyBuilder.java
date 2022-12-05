package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NetworkPolicyBuilder extends V1NetworkPolicyFluentImpl<V1NetworkPolicyBuilder> implements VisitableBuilder<V1NetworkPolicy,V1NetworkPolicyBuilder>{
  public V1NetworkPolicyBuilder() {
    this(false);
  }
  public V1NetworkPolicyBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicy(), validationEnabled);
  }
  public V1NetworkPolicyBuilder(V1NetworkPolicyFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicyBuilder(V1NetworkPolicyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicy(), validationEnabled);
  }
  public V1NetworkPolicyBuilder(V1NetworkPolicyFluent<?> fluent,V1NetworkPolicy instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicyBuilder(V1NetworkPolicyFluent<?> fluent,V1NetworkPolicy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicyBuilder(V1NetworkPolicy instance) {
    this(instance,false);
  }
  public V1NetworkPolicyBuilder(V1NetworkPolicy instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1NetworkPolicyFluent<?> fluent;
  Boolean validationEnabled;
  public V1NetworkPolicy build() {
    V1NetworkPolicy buildable = new V1NetworkPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}