package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceTaintRuleSpecBuilder extends V1alpha3DeviceTaintRuleSpecFluent<V1alpha3DeviceTaintRuleSpecBuilder> implements VisitableBuilder<V1alpha3DeviceTaintRuleSpec,V1alpha3DeviceTaintRuleSpecBuilder>{
  public V1alpha3DeviceTaintRuleSpecBuilder() {
    this(new V1alpha3DeviceTaintRuleSpec());
  }
  
  public V1alpha3DeviceTaintRuleSpecBuilder(V1alpha3DeviceTaintRuleSpecFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaintRuleSpec());
  }
  
  public V1alpha3DeviceTaintRuleSpecBuilder(V1alpha3DeviceTaintRuleSpecFluent<?> fluent,V1alpha3DeviceTaintRuleSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintRuleSpecBuilder(V1alpha3DeviceTaintRuleSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceTaintRuleSpecFluent<?> fluent;
  
  public V1alpha3DeviceTaintRuleSpec build() {
    V1alpha3DeviceTaintRuleSpec buildable = new V1alpha3DeviceTaintRuleSpec();
    buildable.setDeviceSelector(fluent.buildDeviceSelector());
    buildable.setTaint(fluent.buildTaint());
    return buildable;
  }
  

}