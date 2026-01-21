package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha3DeviceTaintRuleBuilder extends V1alpha3DeviceTaintRuleFluent<V1alpha3DeviceTaintRuleBuilder> implements VisitableBuilder<V1alpha3DeviceTaintRule,V1alpha3DeviceTaintRuleBuilder>{

  V1alpha3DeviceTaintRuleFluent<?> fluent;

  public V1alpha3DeviceTaintRuleBuilder() {
    this(new V1alpha3DeviceTaintRule());
  }
  
  public V1alpha3DeviceTaintRuleBuilder(V1alpha3DeviceTaintRuleFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaintRule());
  }
  
  public V1alpha3DeviceTaintRuleBuilder(V1alpha3DeviceTaintRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintRuleBuilder(V1alpha3DeviceTaintRuleFluent<?> fluent,V1alpha3DeviceTaintRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3DeviceTaintRule build() {
    V1alpha3DeviceTaintRule buildable = new V1alpha3DeviceTaintRule();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}