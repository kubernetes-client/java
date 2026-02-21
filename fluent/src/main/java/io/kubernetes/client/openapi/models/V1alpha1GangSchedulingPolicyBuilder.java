package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1GangSchedulingPolicyBuilder extends V1alpha1GangSchedulingPolicyFluent<V1alpha1GangSchedulingPolicyBuilder> implements VisitableBuilder<V1alpha1GangSchedulingPolicy,V1alpha1GangSchedulingPolicyBuilder>{

  V1alpha1GangSchedulingPolicyFluent<?> fluent;

  public V1alpha1GangSchedulingPolicyBuilder() {
    this(new V1alpha1GangSchedulingPolicy());
  }
  
  public V1alpha1GangSchedulingPolicyBuilder(V1alpha1GangSchedulingPolicyFluent<?> fluent) {
    this(fluent, new V1alpha1GangSchedulingPolicy());
  }
  
  public V1alpha1GangSchedulingPolicyBuilder(V1alpha1GangSchedulingPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1GangSchedulingPolicyBuilder(V1alpha1GangSchedulingPolicyFluent<?> fluent,V1alpha1GangSchedulingPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1GangSchedulingPolicy build() {
    V1alpha1GangSchedulingPolicy buildable = new V1alpha1GangSchedulingPolicy();
    buildable.setMinCount(fluent.getMinCount());
    return buildable;
  }
  
}