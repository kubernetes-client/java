package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1SubjectAccessReviewStatusBuilder extends io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusFluentImpl<io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatus,io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusBuilder> {

    io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1SubjectAccessReviewStatusBuilder() {
        this(true);
    }

    public V1beta1SubjectAccessReviewStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1SubjectAccessReviewStatus(), validationEnabled);
    }

    public V1beta1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1SubjectAccessReviewStatus(), validationEnabled);
    }

    public V1beta1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatus instance) {
        this(fluent, instance, true);
    }

    public V1beta1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAllowed(instance.getAllowed());
        
        fluent.withDenied(instance.getDenied());
        
        fluent.withEvaluationError(instance.getEvaluationError());
        
        fluent.withReason(instance.getReason());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatus instance) {
        this(instance,true);
    }

    public V1beta1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAllowed(instance.getAllowed());
        
        this.withDenied(instance.getDenied());
        
        this.withEvaluationError(instance.getEvaluationError());
        
        this.withReason(instance.getReason());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatus build() {
        V1beta1SubjectAccessReviewStatus buildable = new V1beta1SubjectAccessReviewStatus();
        buildable.setAllowed(fluent.getAllowed());
        buildable.setDenied(fluent.getDenied());
        buildable.setEvaluationError(fluent.getEvaluationError());
        buildable.setReason(fluent.getReason());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1SubjectAccessReviewStatusBuilder that = (V1beta1SubjectAccessReviewStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
