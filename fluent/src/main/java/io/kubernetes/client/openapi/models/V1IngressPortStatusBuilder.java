package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressPortStatusBuilder extends V1IngressPortStatusFluentImpl<V1IngressPortStatusBuilder> implements VisitableBuilder<V1IngressPortStatus,V1IngressPortStatusBuilder>{
  public V1IngressPortStatusBuilder() {
    this(false);
  }
  public V1IngressPortStatusBuilder(Boolean validationEnabled) {
    this(new V1IngressPortStatus(), validationEnabled);
  }
  public V1IngressPortStatusBuilder(V1IngressPortStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressPortStatusBuilder(V1IngressPortStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressPortStatus(), validationEnabled);
  }
  public V1IngressPortStatusBuilder(V1IngressPortStatusFluent<?> fluent,V1IngressPortStatus instance) {
    this(fluent, instance, false);
  }
  public V1IngressPortStatusBuilder(V1IngressPortStatusFluent<?> fluent,V1IngressPortStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withError(instance.getError());
      fluent.withPort(instance.getPort());
      fluent.withProtocol(instance.getProtocol());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1IngressPortStatusBuilder(V1IngressPortStatus instance) {
    this(instance,false);
  }
  public V1IngressPortStatusBuilder(V1IngressPortStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withError(instance.getError());
      this.withPort(instance.getPort());
      this.withProtocol(instance.getProtocol());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1IngressPortStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressPortStatus build() {
    V1IngressPortStatus buildable = new V1IngressPortStatus();
    buildable.setError(fluent.getError());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  
}