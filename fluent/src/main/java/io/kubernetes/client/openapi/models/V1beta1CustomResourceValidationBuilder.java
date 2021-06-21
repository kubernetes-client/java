package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceValidationBuilder extends io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation,io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CustomResourceValidationBuilder() {
        this(true);
    }

    public V1beta1CustomResourceValidationBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CustomResourceValidation(), validationEnabled);
    }

    public V1beta1CustomResourceValidationBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CustomResourceValidationBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CustomResourceValidation(), validationEnabled);
    }

    public V1beta1CustomResourceValidationBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation instance) {
        this(fluent, instance, true);
    }

    public V1beta1CustomResourceValidationBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CustomResourceValidationBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation instance) {
        this(instance,true);
    }

    public V1beta1CustomResourceValidationBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation build() {
        V1beta1CustomResourceValidation buildable = new V1beta1CustomResourceValidation();
        buildable.setOpenAPIV3Schema(fluent.getOpenAPIV3Schema());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CustomResourceValidationBuilder that = (V1beta1CustomResourceValidationBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
