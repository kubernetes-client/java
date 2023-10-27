package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ExpressionWarningBuilder extends V1alpha1ExpressionWarningFluent<V1alpha1ExpressionWarningBuilder> implements VisitableBuilder<V1alpha1ExpressionWarning,V1alpha1ExpressionWarningBuilder>{
  public V1alpha1ExpressionWarningBuilder() {
    this(new V1alpha1ExpressionWarning());
  }
  
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarningFluent<?> fluent) {
    this(fluent, new V1alpha1ExpressionWarning());
  }
  
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarningFluent<?> fluent,V1alpha1ExpressionWarning instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarning instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ExpressionWarningFluent<?> fluent;
  
  public V1alpha1ExpressionWarning build() {
    V1alpha1ExpressionWarning buildable = new V1alpha1ExpressionWarning();
    buildable.setFieldRef(fluent.getFieldRef());
    buildable.setWarning(fluent.getWarning());
    return buildable;
  }
  

}