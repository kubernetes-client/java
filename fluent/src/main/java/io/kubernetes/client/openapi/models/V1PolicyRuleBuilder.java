package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PolicyRuleBuilder extends V1PolicyRuleFluentImpl<V1PolicyRuleBuilder> implements VisitableBuilder<V1PolicyRule,V1PolicyRuleBuilder>{
  public V1PolicyRuleBuilder() {
    this(false);
  }
  public V1PolicyRuleBuilder(Boolean validationEnabled) {
    this(new V1PolicyRule(), validationEnabled);
  }
  public V1PolicyRuleBuilder(V1PolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PolicyRuleBuilder(V1PolicyRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PolicyRule(), validationEnabled);
  }
  public V1PolicyRuleBuilder(V1PolicyRuleFluent<?> fluent,V1PolicyRule instance) {
    this(fluent, instance, false);
  }
  public V1PolicyRuleBuilder(V1PolicyRuleFluent<?> fluent,V1PolicyRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withNonResourceURLs(instance.getNonResourceURLs());

    fluent.withResourceNames(instance.getResourceNames());

    fluent.withResources(instance.getResources());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  public V1PolicyRuleBuilder(V1PolicyRule instance) {
    this(instance,false);
  }
  public V1PolicyRuleBuilder(V1PolicyRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroups(instance.getApiGroups());

    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withResourceNames(instance.getResourceNames());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  V1PolicyRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1PolicyRule build() {
    V1PolicyRule buildable = new V1PolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}