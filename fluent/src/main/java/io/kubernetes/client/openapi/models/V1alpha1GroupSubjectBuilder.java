package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1GroupSubjectBuilder extends io.kubernetes.client.openapi.models.V1alpha1GroupSubjectFluentImpl<io.kubernetes.client.openapi.models.V1alpha1GroupSubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1GroupSubject,io.kubernetes.client.openapi.models.V1alpha1GroupSubjectBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1GroupSubjectFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1GroupSubjectBuilder() {
        this(true);
    }

    public V1alpha1GroupSubjectBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1GroupSubject(), validationEnabled);
    }

    public V1alpha1GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1GroupSubjectFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1GroupSubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1GroupSubject(), validationEnabled);
    }

    public V1alpha1GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1GroupSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1GroupSubject instance) {
        this(fluent, instance, true);
    }

    public V1alpha1GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1GroupSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1GroupSubject instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1GroupSubject instance) {
        this(instance,true);
    }

    public V1alpha1GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1GroupSubject instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1GroupSubject build() {
        V1alpha1GroupSubject buildable = new V1alpha1GroupSubject();
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1GroupSubjectBuilder that = (V1alpha1GroupSubjectBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
