package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceHealthBuilder extends V1ResourceHealthFluent<V1ResourceHealthBuilder> implements VisitableBuilder<V1ResourceHealth,V1ResourceHealthBuilder>{
  public V1ResourceHealthBuilder() {
    this(new V1ResourceHealth());
  }
  
  public V1ResourceHealthBuilder(V1ResourceHealthFluent<?> fluent) {
    this(fluent, new V1ResourceHealth());
  }
  
  public V1ResourceHealthBuilder(V1ResourceHealthFluent<?> fluent,V1ResourceHealth instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceHealthBuilder(V1ResourceHealth instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceHealthFluent<?> fluent;
  
  public V1ResourceHealth build() {
    V1ResourceHealth buildable = new V1ResourceHealth();
    buildable.setHealth(fluent.getHealth());
    buildable.setResourceID(fluent.getResourceID());
    return buildable;
  }
  

}