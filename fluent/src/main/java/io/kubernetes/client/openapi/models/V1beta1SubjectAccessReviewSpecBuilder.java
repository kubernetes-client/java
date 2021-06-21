package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1SubjectAccessReviewSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpec,io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1SubjectAccessReviewSpecBuilder() {
        this(true);
    }

    public V1beta1SubjectAccessReviewSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1SubjectAccessReviewSpec(), validationEnabled);
    }

    public V1beta1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1SubjectAccessReviewSpec(), validationEnabled);
    }

    public V1beta1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withExtra(instance.getExtra());
        
        fluent.withGroup(instance.getGroup());
        
        fluent.withNonResourceAttributes(instance.getNonResourceAttributes());
        
        fluent.withResourceAttributes(instance.getResourceAttributes());
        
        fluent.withUid(instance.getUid());
        
        fluent.withUser(instance.getUser());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpec instance) {
        this(instance,true);
    }

    public V1beta1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withExtra(instance.getExtra());
        
        this.withGroup(instance.getGroup());
        
        this.withNonResourceAttributes(instance.getNonResourceAttributes());
        
        this.withResourceAttributes(instance.getResourceAttributes());
        
        this.withUid(instance.getUid());
        
        this.withUser(instance.getUser());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpec build() {
        V1beta1SubjectAccessReviewSpec buildable = new V1beta1SubjectAccessReviewSpec();
        buildable.setExtra(fluent.getExtra());
        buildable.setGroup(fluent.getGroup());
        buildable.setNonResourceAttributes(fluent.getNonResourceAttributes());
        buildable.setResourceAttributes(fluent.getResourceAttributes());
        buildable.setUid(fluent.getUid());
        buildable.setUser(fluent.getUser());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1SubjectAccessReviewSpecBuilder that = (V1beta1SubjectAccessReviewSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
