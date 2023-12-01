package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1KeyToPathBuilder extends V1KeyToPathFluent<V1KeyToPathBuilder> implements VisitableBuilder<V1KeyToPath,V1KeyToPathBuilder>{
  public V1KeyToPathBuilder() {
    this(new V1KeyToPath());
  }
  
  public V1KeyToPathBuilder(V1KeyToPathFluent<?> fluent) {
    this(fluent, new V1KeyToPath());
  }
  
  public V1KeyToPathBuilder(V1KeyToPathFluent<?> fluent,V1KeyToPath instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1KeyToPathBuilder(V1KeyToPath instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1KeyToPathFluent<?> fluent;
  
  public V1KeyToPath build() {
    V1KeyToPath buildable = new V1KeyToPath();
    buildable.setKey(fluent.getKey());
    buildable.setMode(fluent.getMode());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  

}