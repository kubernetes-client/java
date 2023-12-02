package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PriorityClassBuilder extends V1PriorityClassFluent<V1PriorityClassBuilder> implements VisitableBuilder<V1PriorityClass,V1PriorityClassBuilder>{
  public V1PriorityClassBuilder() {
    this(new V1PriorityClass());
  }
  
  public V1PriorityClassBuilder(V1PriorityClassFluent<?> fluent) {
    this(fluent, new V1PriorityClass());
  }
  
  public V1PriorityClassBuilder(V1PriorityClassFluent<?> fluent,V1PriorityClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PriorityClassBuilder(V1PriorityClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PriorityClassFluent<?> fluent;
  
  public V1PriorityClass build() {
    V1PriorityClass buildable = new V1PriorityClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDescription(fluent.getDescription());
    buildable.setGlobalDefault(fluent.getGlobalDefault());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}