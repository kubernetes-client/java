package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodFailurePolicyOnPodConditionsPatternBuilder extends V1PodFailurePolicyOnPodConditionsPatternFluent<V1PodFailurePolicyOnPodConditionsPatternBuilder> implements VisitableBuilder<V1PodFailurePolicyOnPodConditionsPattern,V1PodFailurePolicyOnPodConditionsPatternBuilder>{
  public V1PodFailurePolicyOnPodConditionsPatternBuilder() {
    this(new V1PodFailurePolicyOnPodConditionsPattern());
  }
  
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent) {
    this(fluent, new V1PodFailurePolicyOnPodConditionsPattern());
  }
  
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent,V1PodFailurePolicyOnPodConditionsPattern instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPattern instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent;
  
  public V1PodFailurePolicyOnPodConditionsPattern build() {
    V1PodFailurePolicyOnPodConditionsPattern buildable = new V1PodFailurePolicyOnPodConditionsPattern();
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}