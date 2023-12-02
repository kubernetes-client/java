package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ExpressionWarningBuilder extends V1beta1ExpressionWarningFluent<V1beta1ExpressionWarningBuilder> implements VisitableBuilder<V1beta1ExpressionWarning,V1beta1ExpressionWarningBuilder>{
  public V1beta1ExpressionWarningBuilder() {
    this(new V1beta1ExpressionWarning());
  }
  
  public V1beta1ExpressionWarningBuilder(V1beta1ExpressionWarningFluent<?> fluent) {
    this(fluent, new V1beta1ExpressionWarning());
  }
  
  public V1beta1ExpressionWarningBuilder(V1beta1ExpressionWarningFluent<?> fluent,V1beta1ExpressionWarning instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ExpressionWarningBuilder(V1beta1ExpressionWarning instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ExpressionWarningFluent<?> fluent;
  
  public V1beta1ExpressionWarning build() {
    V1beta1ExpressionWarning buildable = new V1beta1ExpressionWarning();
    buildable.setFieldRef(fluent.getFieldRef());
    buildable.setWarning(fluent.getWarning());
    return buildable;
  }
  

}