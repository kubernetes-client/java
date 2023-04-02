package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1WatchEventBuilder extends V1WatchEventFluentImpl<V1WatchEventBuilder> implements VisitableBuilder<V1WatchEvent,V1WatchEventBuilder>{
  public V1WatchEventBuilder() {
    this(false);
  }
  public V1WatchEventBuilder(Boolean validationEnabled) {
    this(new V1WatchEvent(), validationEnabled);
  }
  public V1WatchEventBuilder(V1WatchEventFluent<?> fluent) {
    this(fluent, false);
  }
  public V1WatchEventBuilder(V1WatchEventFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1WatchEvent(), validationEnabled);
  }
  public V1WatchEventBuilder(V1WatchEventFluent<?> fluent,V1WatchEvent instance) {
    this(fluent, instance, false);
  }
  public V1WatchEventBuilder(V1WatchEventFluent<?> fluent,V1WatchEvent instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withObject(instance.getObject());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1WatchEventBuilder(V1WatchEvent instance) {
    this(instance,false);
  }
  public V1WatchEventBuilder(V1WatchEvent instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withObject(instance.getObject());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1WatchEventFluent<?> fluent;
  Boolean validationEnabled;
  public V1WatchEvent build() {
    V1WatchEvent buildable = new V1WatchEvent();
    buildable.setObject(fluent.getObject());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}