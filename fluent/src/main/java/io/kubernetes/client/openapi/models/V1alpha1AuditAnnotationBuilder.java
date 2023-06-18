package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1AuditAnnotationBuilder extends V1alpha1AuditAnnotationFluentImpl<V1alpha1AuditAnnotationBuilder> implements VisitableBuilder<V1alpha1AuditAnnotation,V1alpha1AuditAnnotationBuilder>{
  public V1alpha1AuditAnnotationBuilder() {
    this(false);
  }
  public V1alpha1AuditAnnotationBuilder(Boolean validationEnabled) {
    this(new V1alpha1AuditAnnotation(), validationEnabled);
  }
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1AuditAnnotation(), validationEnabled);
  }
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotationFluent<?> fluent,V1alpha1AuditAnnotation instance) {
    this(fluent, instance, false);
  }
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotationFluent<?> fluent,V1alpha1AuditAnnotation instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withKey(instance.getKey());
      fluent.withValueExpression(instance.getValueExpression());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotation instance) {
    this(instance,false);
  }
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotation instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withKey(instance.getKey());
      this.withValueExpression(instance.getValueExpression());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1AuditAnnotationFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1AuditAnnotation build() {
    V1alpha1AuditAnnotation buildable = new V1alpha1AuditAnnotation();
    buildable.setKey(fluent.getKey());
    buildable.setValueExpression(fluent.getValueExpression());
    return buildable;
  }
  
}