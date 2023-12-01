package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1AuditAnnotationBuilder extends V1alpha1AuditAnnotationFluent<V1alpha1AuditAnnotationBuilder> implements VisitableBuilder<V1alpha1AuditAnnotation,V1alpha1AuditAnnotationBuilder>{
  public V1alpha1AuditAnnotationBuilder() {
    this(new V1alpha1AuditAnnotation());
  }
  
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotationFluent<?> fluent) {
    this(fluent, new V1alpha1AuditAnnotation());
  }
  
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotationFluent<?> fluent,V1alpha1AuditAnnotation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1AuditAnnotationBuilder(V1alpha1AuditAnnotation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1AuditAnnotationFluent<?> fluent;
  
  public V1alpha1AuditAnnotation build() {
    V1alpha1AuditAnnotation buildable = new V1alpha1AuditAnnotation();
    buildable.setKey(fluent.getKey());
    buildable.setValueExpression(fluent.getValueExpression());
    return buildable;
  }
  

}