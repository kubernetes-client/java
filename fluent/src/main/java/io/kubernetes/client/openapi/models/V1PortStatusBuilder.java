package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PortStatusBuilder extends V1PortStatusFluentImpl<V1PortStatusBuilder> implements VisitableBuilder<V1PortStatus,V1PortStatusBuilder>{
  public V1PortStatusBuilder() {
    this(false);
  }
  public V1PortStatusBuilder(Boolean validationEnabled) {
    this(new V1PortStatus(), validationEnabled);
  }
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PortStatus(), validationEnabled);
  }
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent,V1PortStatus instance) {
    this(fluent, instance, false);
  }
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent,V1PortStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withError(instance.getError());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public V1PortStatusBuilder(V1PortStatus instance) {
    this(instance,false);
  }
  public V1PortStatusBuilder(V1PortStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withError(instance.getError());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  V1PortStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1PortStatus build() {
    V1PortStatus buildable = new V1PortStatus();
    buildable.setError(fluent.getError());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  
}