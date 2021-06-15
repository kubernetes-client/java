package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1PolicyRulesWithSubjectsBuilder extends io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjects,io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1PolicyRulesWithSubjectsBuilder() {
        this(true);
    }

    public V1alpha1PolicyRulesWithSubjectsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1PolicyRulesWithSubjects(), validationEnabled);
    }

    public V1alpha1PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1PolicyRulesWithSubjects(), validationEnabled);
    }

    public V1alpha1PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjects instance) {
        this(fluent, instance, true);
    }

    public V1alpha1PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjects instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withNonResourceRules(instance.getNonResourceRules());
        
        fluent.withResourceRules(instance.getResourceRules());
        
        fluent.withSubjects(instance.getSubjects());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjects instance) {
        this(instance,true);
    }

    public V1alpha1PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjects instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withNonResourceRules(instance.getNonResourceRules());
        
        this.withResourceRules(instance.getResourceRules());
        
        this.withSubjects(instance.getSubjects());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjects build() {
        V1alpha1PolicyRulesWithSubjects buildable = new V1alpha1PolicyRulesWithSubjects();
        buildable.setNonResourceRules(fluent.getNonResourceRules());
        buildable.setResourceRules(fluent.getResourceRules());
        buildable.setSubjects(fluent.getSubjects());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1PolicyRulesWithSubjectsBuilder that = (V1alpha1PolicyRulesWithSubjectsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
