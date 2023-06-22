package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ExpressionWarningBuilder extends V1alpha1ExpressionWarningFluentImpl<V1alpha1ExpressionWarningBuilder> implements VisitableBuilder<V1alpha1ExpressionWarning,V1alpha1ExpressionWarningBuilder>{
  public V1alpha1ExpressionWarningBuilder() {
    this(false);
  }
  public V1alpha1ExpressionWarningBuilder(Boolean validationEnabled) {
    this(new V1alpha1ExpressionWarning(), validationEnabled);
  }
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarningFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarningFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ExpressionWarning(), validationEnabled);
  }
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarningFluent<?> fluent,V1alpha1ExpressionWarning instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarningFluent<?> fluent,V1alpha1ExpressionWarning instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withFieldRef(instance.getFieldRef());
      fluent.withWarning(instance.getWarning());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarning instance) {
    this(instance,false);
  }
  public V1alpha1ExpressionWarningBuilder(V1alpha1ExpressionWarning instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withFieldRef(instance.getFieldRef());
      this.withWarning(instance.getWarning());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ExpressionWarningFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ExpressionWarning build() {
    V1alpha1ExpressionWarning buildable = new V1alpha1ExpressionWarning();
    buildable.setFieldRef(fluent.getFieldRef());
    buildable.setWarning(fluent.getWarning());
    return buildable;
  }
  
}