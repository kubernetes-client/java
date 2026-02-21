package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha3DeviceTaintRuleStatusBuilder extends V1alpha3DeviceTaintRuleStatusFluent<V1alpha3DeviceTaintRuleStatusBuilder> implements VisitableBuilder<V1alpha3DeviceTaintRuleStatus,V1alpha3DeviceTaintRuleStatusBuilder>{

  V1alpha3DeviceTaintRuleStatusFluent<?> fluent;

  public V1alpha3DeviceTaintRuleStatusBuilder() {
    this(new V1alpha3DeviceTaintRuleStatus());
  }
  
  public V1alpha3DeviceTaintRuleStatusBuilder(V1alpha3DeviceTaintRuleStatusFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaintRuleStatus());
  }
  
  public V1alpha3DeviceTaintRuleStatusBuilder(V1alpha3DeviceTaintRuleStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintRuleStatusBuilder(V1alpha3DeviceTaintRuleStatusFluent<?> fluent,V1alpha3DeviceTaintRuleStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3DeviceTaintRuleStatus build() {
    V1alpha3DeviceTaintRuleStatus buildable = new V1alpha3DeviceTaintRuleStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  
}