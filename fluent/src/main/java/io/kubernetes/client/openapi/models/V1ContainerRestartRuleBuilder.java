package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ContainerRestartRuleBuilder extends V1ContainerRestartRuleFluent<V1ContainerRestartRuleBuilder> implements VisitableBuilder<V1ContainerRestartRule,V1ContainerRestartRuleBuilder>{
  public V1ContainerRestartRuleBuilder() {
    this(new V1ContainerRestartRule());
  }
  
  public V1ContainerRestartRuleBuilder(V1ContainerRestartRuleFluent<?> fluent) {
    this(fluent, new V1ContainerRestartRule());
  }
  
  public V1ContainerRestartRuleBuilder(V1ContainerRestartRuleFluent<?> fluent,V1ContainerRestartRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerRestartRuleBuilder(V1ContainerRestartRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerRestartRuleFluent<?> fluent;
  
  public V1ContainerRestartRule build() {
    V1ContainerRestartRule buildable = new V1ContainerRestartRule();
    buildable.setAction(fluent.getAction());
    buildable.setExitCodes(fluent.buildExitCodes());
    return buildable;
  }
  

}