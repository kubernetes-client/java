package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NetworkPolicyPortBuilder extends V1NetworkPolicyPortFluentImpl<V1NetworkPolicyPortBuilder> implements VisitableBuilder<V1NetworkPolicyPort,V1NetworkPolicyPortBuilder>{
  public V1NetworkPolicyPortBuilder() {
    this(false);
  }
  public V1NetworkPolicyPortBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicyPort(), validationEnabled);
  }
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPortFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPortFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyPort(), validationEnabled);
  }
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPortFluent<?> fluent,V1NetworkPolicyPort instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPortFluent<?> fluent,V1NetworkPolicyPort instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withEndPort(instance.getEndPort());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPort instance) {
    this(instance,false);
  }
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPort instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withEndPort(instance.getEndPort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  V1NetworkPolicyPortFluent<?> fluent;
  Boolean validationEnabled;
  public V1NetworkPolicyPort build() {
    V1NetworkPolicyPort buildable = new V1NetworkPolicyPort();
    buildable.setEndPort(fluent.getEndPort());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  
}