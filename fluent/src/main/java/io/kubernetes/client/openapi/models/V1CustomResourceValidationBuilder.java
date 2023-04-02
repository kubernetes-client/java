package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceValidationBuilder extends V1CustomResourceValidationFluentImpl<V1CustomResourceValidationBuilder> implements VisitableBuilder<V1CustomResourceValidation,V1CustomResourceValidationBuilder>{
  public V1CustomResourceValidationBuilder() {
    this(false);
  }
  public V1CustomResourceValidationBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceValidation(), validationEnabled);
  }
  public V1CustomResourceValidationBuilder(V1CustomResourceValidationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceValidationBuilder(V1CustomResourceValidationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceValidation(), validationEnabled);
  }
  public V1CustomResourceValidationBuilder(V1CustomResourceValidationFluent<?> fluent,V1CustomResourceValidation instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceValidationBuilder(V1CustomResourceValidationFluent<?> fluent,V1CustomResourceValidation instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceValidationBuilder(V1CustomResourceValidation instance) {
    this(instance,false);
  }
  public V1CustomResourceValidationBuilder(V1CustomResourceValidation instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceValidationFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceValidation build() {
    V1CustomResourceValidation buildable = new V1CustomResourceValidation();
    buildable.setOpenAPIV3Schema(fluent.getOpenAPIV3Schema());
    return buildable;
  }
  
}