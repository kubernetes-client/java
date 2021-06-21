package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1UserSubjectBuilder extends io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluentImpl<io.kubernetes.client.openapi.models.V1alpha1UserSubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1UserSubject,io.kubernetes.client.openapi.models.V1alpha1UserSubjectBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1UserSubjectBuilder() {
        this(true);
    }

    public V1alpha1UserSubjectBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1UserSubject(), validationEnabled);
    }

    public V1alpha1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1UserSubject(), validationEnabled);
    }

    public V1alpha1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1UserSubject instance) {
        this(fluent, instance, true);
    }

    public V1alpha1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1UserSubject instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1UserSubject instance) {
        this(instance,true);
    }

    public V1alpha1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1alpha1UserSubject instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1UserSubject build() {
        V1alpha1UserSubject buildable = new V1alpha1UserSubject();
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1UserSubjectBuilder that = (V1alpha1UserSubjectBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
