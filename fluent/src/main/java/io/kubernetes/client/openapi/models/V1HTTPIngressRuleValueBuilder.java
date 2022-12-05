package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1HTTPIngressRuleValueBuilder extends V1HTTPIngressRuleValueFluentImpl<V1HTTPIngressRuleValueBuilder> implements VisitableBuilder<V1HTTPIngressRuleValue,V1HTTPIngressRuleValueBuilder>{
  public V1HTTPIngressRuleValueBuilder() {
    this(false);
  }
  public V1HTTPIngressRuleValueBuilder(Boolean validationEnabled) {
    this(new V1HTTPIngressRuleValue(), validationEnabled);
  }
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1HTTPIngressRuleValue(), validationEnabled);
  }
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent,V1HTTPIngressRuleValue instance) {
    this(fluent, instance, false);
  }
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent,V1HTTPIngressRuleValue instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPaths(instance.getPaths());

    this.validationEnabled = validationEnabled; 
  }
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValue instance) {
    this(instance,false);
  }
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValue instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPaths(instance.getPaths());

    this.validationEnabled = validationEnabled; 
  }
  V1HTTPIngressRuleValueFluent<?> fluent;
  Boolean validationEnabled;
  public V1HTTPIngressRuleValue build() {
    V1HTTPIngressRuleValue buildable = new V1HTTPIngressRuleValue();
    buildable.setPaths(fluent.getPaths());
    return buildable;
  }
  
}