package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LifecycleBuilder extends V1LifecycleFluentImpl<V1LifecycleBuilder> implements VisitableBuilder<V1Lifecycle,V1LifecycleBuilder>{
  public V1LifecycleBuilder() {
    this(false);
  }
  public V1LifecycleBuilder(Boolean validationEnabled) {
    this(new V1Lifecycle(), validationEnabled);
  }
  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Lifecycle(), validationEnabled);
  }
  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent,V1Lifecycle instance) {
    this(fluent, instance, false);
  }
  public V1LifecycleBuilder(V1LifecycleFluent<?> fluent,V1Lifecycle instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPostStart(instance.getPostStart());

    fluent.withPreStop(instance.getPreStop());

    this.validationEnabled = validationEnabled; 
  }
  public V1LifecycleBuilder(V1Lifecycle instance) {
    this(instance,false);
  }
  public V1LifecycleBuilder(V1Lifecycle instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPostStart(instance.getPostStart());

    this.withPreStop(instance.getPreStop());

    this.validationEnabled = validationEnabled; 
  }
  V1LifecycleFluent<?> fluent;
  Boolean validationEnabled;
  public V1Lifecycle build() {
    V1Lifecycle buildable = new V1Lifecycle();
    buildable.setPostStart(fluent.getPostStart());
    buildable.setPreStop(fluent.getPreStop());
    return buildable;
  }
  
}