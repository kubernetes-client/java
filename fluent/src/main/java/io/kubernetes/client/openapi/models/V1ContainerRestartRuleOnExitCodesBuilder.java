package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ContainerRestartRuleOnExitCodesBuilder extends V1ContainerRestartRuleOnExitCodesFluent<V1ContainerRestartRuleOnExitCodesBuilder> implements VisitableBuilder<V1ContainerRestartRuleOnExitCodes,V1ContainerRestartRuleOnExitCodesBuilder>{
  public V1ContainerRestartRuleOnExitCodesBuilder() {
    this(new V1ContainerRestartRuleOnExitCodes());
  }
  
  public V1ContainerRestartRuleOnExitCodesBuilder(V1ContainerRestartRuleOnExitCodesFluent<?> fluent) {
    this(fluent, new V1ContainerRestartRuleOnExitCodes());
  }
  
  public V1ContainerRestartRuleOnExitCodesBuilder(V1ContainerRestartRuleOnExitCodesFluent<?> fluent,V1ContainerRestartRuleOnExitCodes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerRestartRuleOnExitCodesBuilder(V1ContainerRestartRuleOnExitCodes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerRestartRuleOnExitCodesFluent<?> fluent;
  
  public V1ContainerRestartRuleOnExitCodes build() {
    V1ContainerRestartRuleOnExitCodes buildable = new V1ContainerRestartRuleOnExitCodes();
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  

}