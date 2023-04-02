package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NonResourceRuleBuilder extends V1NonResourceRuleFluentImpl<V1NonResourceRuleBuilder> implements VisitableBuilder<V1NonResourceRule,V1NonResourceRuleBuilder>{
  public V1NonResourceRuleBuilder() {
    this(false);
  }
  public V1NonResourceRuleBuilder(Boolean validationEnabled) {
    this(new V1NonResourceRule(), validationEnabled);
  }
  public V1NonResourceRuleBuilder(V1NonResourceRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NonResourceRuleBuilder(V1NonResourceRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NonResourceRule(), validationEnabled);
  }
  public V1NonResourceRuleBuilder(V1NonResourceRuleFluent<?> fluent,V1NonResourceRule instance) {
    this(fluent, instance, false);
  }
  public V1NonResourceRuleBuilder(V1NonResourceRuleFluent<?> fluent,V1NonResourceRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNonResourceURLs(instance.getNonResourceURLs());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  public V1NonResourceRuleBuilder(V1NonResourceRule instance) {
    this(instance,false);
  }
  public V1NonResourceRuleBuilder(V1NonResourceRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  V1NonResourceRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1NonResourceRule build() {
    V1NonResourceRule buildable = new V1NonResourceRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}