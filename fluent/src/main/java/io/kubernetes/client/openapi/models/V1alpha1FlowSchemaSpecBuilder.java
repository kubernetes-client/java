package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1FlowSchemaSpecBuilder extends io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpecFluentImpl<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpec,io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpecBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1FlowSchemaSpecBuilder() {
        this(true);
    }

    public V1alpha1FlowSchemaSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1FlowSchemaSpec(), validationEnabled);
    }

    public V1alpha1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1FlowSchemaSpec(), validationEnabled);
    }

    public V1alpha1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpec instance) {
        this(fluent, instance, true);
    }

    public V1alpha1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDistinguisherMethod(instance.getDistinguisherMethod());
        
        fluent.withMatchingPrecedence(instance.getMatchingPrecedence());
        
        fluent.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());
        
        fluent.withRules(instance.getRules());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpec instance) {
        this(instance,true);
    }

    public V1alpha1FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDistinguisherMethod(instance.getDistinguisherMethod());
        
        this.withMatchingPrecedence(instance.getMatchingPrecedence());
        
        this.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());
        
        this.withRules(instance.getRules());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaSpec build() {
        V1alpha1FlowSchemaSpec buildable = new V1alpha1FlowSchemaSpec();
        buildable.setDistinguisherMethod(fluent.getDistinguisherMethod());
        buildable.setMatchingPrecedence(fluent.getMatchingPrecedence());
        buildable.setPriorityLevelConfiguration(fluent.getPriorityLevelConfiguration());
        buildable.setRules(fluent.getRules());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1FlowSchemaSpecBuilder that = (V1alpha1FlowSchemaSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
