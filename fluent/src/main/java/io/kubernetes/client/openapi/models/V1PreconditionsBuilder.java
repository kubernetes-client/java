package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PreconditionsBuilder extends V1PreconditionsFluent<V1PreconditionsBuilder> implements VisitableBuilder<V1Preconditions,V1PreconditionsBuilder>{
  public V1PreconditionsBuilder() {
    this(new V1Preconditions());
  }
  
  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent) {
    this(fluent, new V1Preconditions());
  }
  
  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent,V1Preconditions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PreconditionsBuilder(V1Preconditions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PreconditionsFluent<?> fluent;
  
  public V1Preconditions build() {
    V1Preconditions buildable = new V1Preconditions();
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}