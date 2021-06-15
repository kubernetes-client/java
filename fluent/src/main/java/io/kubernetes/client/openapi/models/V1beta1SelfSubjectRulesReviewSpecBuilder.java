package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1SelfSubjectRulesReviewSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpec,io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1SelfSubjectRulesReviewSpecBuilder() {
        this(true);
    }

    public V1beta1SelfSubjectRulesReviewSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1SelfSubjectRulesReviewSpec(), validationEnabled);
    }

    public V1beta1SelfSubjectRulesReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1SelfSubjectRulesReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1SelfSubjectRulesReviewSpec(), validationEnabled);
    }

    public V1beta1SelfSubjectRulesReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1SelfSubjectRulesReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1SelfSubjectRulesReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpec instance) {
        this(instance,true);
    }

    public V1beta1SelfSubjectRulesReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpec build() {
        V1beta1SelfSubjectRulesReviewSpec buildable = new V1beta1SelfSubjectRulesReviewSpec();
        buildable.setNamespace(fluent.getNamespace());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1SelfSubjectRulesReviewSpecBuilder that = (V1beta1SelfSubjectRulesReviewSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
