package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ExpressionWarningBuilder extends V1ExpressionWarningFluent<V1ExpressionWarningBuilder> implements VisitableBuilder<V1ExpressionWarning,V1ExpressionWarningBuilder>{
  public V1ExpressionWarningBuilder() {
    this(new V1ExpressionWarning());
  }
  
  public V1ExpressionWarningBuilder(V1ExpressionWarningFluent<?> fluent) {
    this(fluent, new V1ExpressionWarning());
  }
  
  public V1ExpressionWarningBuilder(V1ExpressionWarningFluent<?> fluent,V1ExpressionWarning instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ExpressionWarningBuilder(V1ExpressionWarning instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ExpressionWarningFluent<?> fluent;
  
  public V1ExpressionWarning build() {
    V1ExpressionWarning buildable = new V1ExpressionWarning();
    buildable.setFieldRef(fluent.getFieldRef());
    buildable.setWarning(fluent.getWarning());
    return buildable;
  }
  

}