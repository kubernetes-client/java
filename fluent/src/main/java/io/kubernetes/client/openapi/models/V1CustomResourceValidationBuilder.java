package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceValidationBuilder extends V1CustomResourceValidationFluent<V1CustomResourceValidationBuilder> implements VisitableBuilder<V1CustomResourceValidation,V1CustomResourceValidationBuilder>{
  public V1CustomResourceValidationBuilder() {
    this(new V1CustomResourceValidation());
  }
  
  public V1CustomResourceValidationBuilder(V1CustomResourceValidationFluent<?> fluent) {
    this(fluent, new V1CustomResourceValidation());
  }
  
  public V1CustomResourceValidationBuilder(V1CustomResourceValidationFluent<?> fluent,V1CustomResourceValidation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceValidationBuilder(V1CustomResourceValidation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceValidationFluent<?> fluent;
  
  public V1CustomResourceValidation build() {
    V1CustomResourceValidation buildable = new V1CustomResourceValidation();
    buildable.setOpenAPIV3Schema(fluent.buildOpenAPIV3Schema());
    return buildable;
  }
  

}