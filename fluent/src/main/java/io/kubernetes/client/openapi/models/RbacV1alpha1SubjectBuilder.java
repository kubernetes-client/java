package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class RbacV1alpha1SubjectBuilder extends io.kubernetes.client.openapi.models.RbacV1alpha1SubjectFluentImpl<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.RbacV1alpha1Subject,io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder> {

    io.kubernetes.client.openapi.models.RbacV1alpha1SubjectFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public RbacV1alpha1SubjectBuilder() {
        this(true);
    }

    public RbacV1alpha1SubjectBuilder(java.lang.Boolean validationEnabled) {
        this(new RbacV1alpha1Subject(), validationEnabled);
    }

    public RbacV1alpha1SubjectBuilder(io.kubernetes.client.openapi.models.RbacV1alpha1SubjectFluent<?> fluent) {
        this(fluent, true);
    }

    public RbacV1alpha1SubjectBuilder(io.kubernetes.client.openapi.models.RbacV1alpha1SubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new RbacV1alpha1Subject(), validationEnabled);
    }

    public RbacV1alpha1SubjectBuilder(io.kubernetes.client.openapi.models.RbacV1alpha1SubjectFluent<?> fluent,io.kubernetes.client.openapi.models.RbacV1alpha1Subject instance) {
        this(fluent, instance, true);
    }

    public RbacV1alpha1SubjectBuilder(io.kubernetes.client.openapi.models.RbacV1alpha1SubjectFluent<?> fluent,io.kubernetes.client.openapi.models.RbacV1alpha1Subject instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public RbacV1alpha1SubjectBuilder(io.kubernetes.client.openapi.models.RbacV1alpha1Subject instance) {
        this(instance,true);
    }

    public RbacV1alpha1SubjectBuilder(io.kubernetes.client.openapi.models.RbacV1alpha1Subject instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.RbacV1alpha1Subject build() {
        RbacV1alpha1Subject buildable = new RbacV1alpha1Subject();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RbacV1alpha1SubjectBuilder that = (RbacV1alpha1SubjectBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
