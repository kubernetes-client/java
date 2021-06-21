package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1UserSubjectBuilder extends io.kubernetes.client.openapi.models.V1beta1UserSubjectFluentImpl<io.kubernetes.client.openapi.models.V1beta1UserSubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1UserSubject,io.kubernetes.client.openapi.models.V1beta1UserSubjectBuilder> {

    io.kubernetes.client.openapi.models.V1beta1UserSubjectFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1UserSubjectBuilder() {
        this(true);
    }

    public V1beta1UserSubjectBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1UserSubject(), validationEnabled);
    }

    public V1beta1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1UserSubjectFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1UserSubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1UserSubject(), validationEnabled);
    }

    public V1beta1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1UserSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1UserSubject instance) {
        this(fluent, instance, true);
    }

    public V1beta1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1UserSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1UserSubject instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1UserSubject instance) {
        this(instance,true);
    }

    public V1beta1UserSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1UserSubject instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1UserSubject build() {
        V1beta1UserSubject buildable = new V1beta1UserSubject();
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1UserSubjectBuilder that = (V1beta1UserSubjectBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
