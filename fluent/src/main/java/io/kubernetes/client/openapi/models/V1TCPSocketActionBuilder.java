package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TCPSocketActionBuilder extends V1TCPSocketActionFluentImpl<V1TCPSocketActionBuilder> implements VisitableBuilder<V1TCPSocketAction,V1TCPSocketActionBuilder>{
  public V1TCPSocketActionBuilder() {
    this(false);
  }
  public V1TCPSocketActionBuilder(Boolean validationEnabled) {
    this(new V1TCPSocketAction(), validationEnabled);
  }
  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TCPSocketAction(), validationEnabled);
  }
  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent,V1TCPSocketAction instance) {
    this(fluent, instance, false);
  }
  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent,V1TCPSocketAction instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHost(instance.getHost());

    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled; 
  }
  public V1TCPSocketActionBuilder(V1TCPSocketAction instance) {
    this(instance,false);
  }
  public V1TCPSocketActionBuilder(V1TCPSocketAction instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHost(instance.getHost());

    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled; 
  }
  V1TCPSocketActionFluent<?> fluent;
  Boolean validationEnabled;
  public V1TCPSocketAction build() {
    V1TCPSocketAction buildable = new V1TCPSocketAction();
    buildable.setHost(fluent.getHost());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  
}