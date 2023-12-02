package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LifecycleBuilder extends V1LifecycleFluent<V1LifecycleBuilder> implements VisitableBuilder<V1Lifecycle,V1LifecycleBuilder>{
  public V1LifecycleBuilder() {
    this(new V1Lifecycle());
  }
  
  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent) {
    this(fluent, new V1Lifecycle());
  }
  
  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent,V1Lifecycle instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LifecycleBuilder(V1Lifecycle instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LifecycleFluent<?> fluent;
  
  public V1Lifecycle build() {
    V1Lifecycle buildable = new V1Lifecycle();
    buildable.setPostStart(fluent.buildPostStart());
    buildable.setPreStop(fluent.buildPreStop());
    return buildable;
  }
  

}