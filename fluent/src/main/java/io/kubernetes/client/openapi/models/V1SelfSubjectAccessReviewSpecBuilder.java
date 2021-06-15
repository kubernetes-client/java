package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1SelfSubjectAccessReviewSpecBuilder extends io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluentImpl<io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec,io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder> {

    io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1SelfSubjectAccessReviewSpecBuilder() {
        this(true);
    }

    public V1SelfSubjectAccessReviewSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1SelfSubjectAccessReviewSpec(), validationEnabled);
    }

    public V1SelfSubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1SelfSubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1SelfSubjectAccessReviewSpec(), validationEnabled);
    }

    public V1SelfSubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance) {
        this(fluent, instance, true);
    }

    public V1SelfSubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withNonResourceAttributes(instance.getNonResourceAttributes());
        
        fluent.withResourceAttributes(instance.getResourceAttributes());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1SelfSubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance) {
        this(instance,true);
    }

    public V1SelfSubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withNonResourceAttributes(instance.getNonResourceAttributes());
        
        this.withResourceAttributes(instance.getResourceAttributes());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec build() {
        V1SelfSubjectAccessReviewSpec buildable = new V1SelfSubjectAccessReviewSpec();
        buildable.setNonResourceAttributes(fluent.getNonResourceAttributes());
        buildable.setResourceAttributes(fluent.getResourceAttributes());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1SelfSubjectAccessReviewSpecBuilder that = (V1SelfSubjectAccessReviewSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
