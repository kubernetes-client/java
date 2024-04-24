package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1AuditAnnotationBuilder extends V1AuditAnnotationFluent<V1AuditAnnotationBuilder> implements VisitableBuilder<V1AuditAnnotation,V1AuditAnnotationBuilder>{
  public V1AuditAnnotationBuilder() {
    this(new V1AuditAnnotation());
  }
  
  public V1AuditAnnotationBuilder(V1AuditAnnotationFluent<?> fluent) {
    this(fluent, new V1AuditAnnotation());
  }
  
  public V1AuditAnnotationBuilder(V1AuditAnnotationFluent<?> fluent,V1AuditAnnotation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AuditAnnotationBuilder(V1AuditAnnotation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AuditAnnotationFluent<?> fluent;
  
  public V1AuditAnnotation build() {
    V1AuditAnnotation buildable = new V1AuditAnnotation();
    buildable.setKey(fluent.getKey());
    buildable.setValueExpression(fluent.getValueExpression());
    return buildable;
  }
  

}