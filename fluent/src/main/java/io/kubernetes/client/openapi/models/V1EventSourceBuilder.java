package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EventSourceBuilder extends V1EventSourceFluentImpl<V1EventSourceBuilder> implements VisitableBuilder<V1EventSource,V1EventSourceBuilder>{
  public V1EventSourceBuilder() {
    this(false);
  }
  public V1EventSourceBuilder(Boolean validationEnabled) {
    this(new V1EventSource(), validationEnabled);
  }
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EventSource(), validationEnabled);
  }
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent,V1EventSource instance) {
    this(fluent, instance, false);
  }
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent,V1EventSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withComponent(instance.getComponent());

    fluent.withHost(instance.getHost());

    this.validationEnabled = validationEnabled; 
  }
  public V1EventSourceBuilder(V1EventSource instance) {
    this(instance,false);
  }
  public V1EventSourceBuilder(V1EventSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withComponent(instance.getComponent());

    this.withHost(instance.getHost());

    this.validationEnabled = validationEnabled; 
  }
  V1EventSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1EventSource build() {
    V1EventSource buildable = new V1EventSource();
    buildable.setComponent(fluent.getComponent());
    buildable.setHost(fluent.getHost());
    return buildable;
  }
  
}