package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceRuleBuilder extends V1ResourceRuleFluentImpl<V1ResourceRuleBuilder> implements VisitableBuilder<V1ResourceRule,V1ResourceRuleBuilder>{
  public V1ResourceRuleBuilder() {
    this(false);
  }
  public V1ResourceRuleBuilder(Boolean validationEnabled) {
    this(new V1ResourceRule(), validationEnabled);
  }
  public V1ResourceRuleBuilder(V1ResourceRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceRuleBuilder(V1ResourceRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceRule(), validationEnabled);
  }
  public V1ResourceRuleBuilder(V1ResourceRuleFluent<?> fluent,V1ResourceRule instance) {
    this(fluent, instance, false);
  }
  public V1ResourceRuleBuilder(V1ResourceRuleFluent<?> fluent,V1ResourceRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withResourceNames(instance.getResourceNames());

    fluent.withResources(instance.getResources());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceRuleBuilder(V1ResourceRule instance) {
    this(instance,false);
  }
  public V1ResourceRuleBuilder(V1ResourceRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroups(instance.getApiGroups());

    this.withResourceNames(instance.getResourceNames());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  V1ResourceRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1ResourceRule build() {
    V1ResourceRule buildable = new V1ResourceRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}