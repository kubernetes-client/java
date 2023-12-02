package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1AuditAnnotationBuilder extends V1beta1AuditAnnotationFluent<V1beta1AuditAnnotationBuilder> implements VisitableBuilder<V1beta1AuditAnnotation,V1beta1AuditAnnotationBuilder>{
  public V1beta1AuditAnnotationBuilder() {
    this(new V1beta1AuditAnnotation());
  }
  
  public V1beta1AuditAnnotationBuilder(V1beta1AuditAnnotationFluent<?> fluent) {
    this(fluent, new V1beta1AuditAnnotation());
  }
  
  public V1beta1AuditAnnotationBuilder(V1beta1AuditAnnotationFluent<?> fluent,V1beta1AuditAnnotation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1AuditAnnotationBuilder(V1beta1AuditAnnotation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1AuditAnnotationFluent<?> fluent;
  
  public V1beta1AuditAnnotation build() {
    V1beta1AuditAnnotation buildable = new V1beta1AuditAnnotation();
    buildable.setKey(fluent.getKey());
    buildable.setValueExpression(fluent.getValueExpression());
    return buildable;
  }
  

}