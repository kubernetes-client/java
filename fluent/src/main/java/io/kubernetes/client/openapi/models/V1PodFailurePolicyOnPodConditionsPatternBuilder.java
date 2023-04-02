package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodFailurePolicyOnPodConditionsPatternBuilder extends V1PodFailurePolicyOnPodConditionsPatternFluentImpl<V1PodFailurePolicyOnPodConditionsPatternBuilder> implements VisitableBuilder<V1PodFailurePolicyOnPodConditionsPattern,V1PodFailurePolicyOnPodConditionsPatternBuilder>{
  public V1PodFailurePolicyOnPodConditionsPatternBuilder() {
    this(false);
  }
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(Boolean validationEnabled) {
    this(new V1PodFailurePolicyOnPodConditionsPattern(), validationEnabled);
  }
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodFailurePolicyOnPodConditionsPattern(), validationEnabled);
  }
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent,V1PodFailurePolicyOnPodConditionsPattern instance) {
    this(fluent, instance, false);
  }
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent,V1PodFailurePolicyOnPodConditionsPattern instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPattern instance) {
    this(instance,false);
  }
  public V1PodFailurePolicyOnPodConditionsPatternBuilder(V1PodFailurePolicyOnPodConditionsPattern instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1PodFailurePolicyOnPodConditionsPatternFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodFailurePolicyOnPodConditionsPattern build() {
    V1PodFailurePolicyOnPodConditionsPattern buildable = new V1PodFailurePolicyOnPodConditionsPattern();
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}