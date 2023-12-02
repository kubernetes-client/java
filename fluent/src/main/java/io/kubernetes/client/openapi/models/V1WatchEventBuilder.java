package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1WatchEventBuilder extends V1WatchEventFluent<V1WatchEventBuilder> implements VisitableBuilder<V1WatchEvent,V1WatchEventBuilder>{
  public V1WatchEventBuilder() {
    this(new V1WatchEvent());
  }
  
  public V1WatchEventBuilder(V1WatchEventFluent<?> fluent) {
    this(fluent, new V1WatchEvent());
  }
  
  public V1WatchEventBuilder(V1WatchEventFluent<?> fluent,V1WatchEvent instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1WatchEventBuilder(V1WatchEvent instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1WatchEventFluent<?> fluent;
  
  public V1WatchEvent build() {
    V1WatchEvent buildable = new V1WatchEvent();
    buildable.setObject(fluent.getObject());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}