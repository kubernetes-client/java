package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ResourceRequirementsBuilder extends io.kubernetes.client.openapi.models.V1ResourceRequirementsFluentImpl<io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ResourceRequirements,io.kubernetes.client.openapi.models.V1ResourceRequirementsBuilder> {

    io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ResourceRequirementsBuilder() {
        this(true);
    }

    public V1ResourceRequirementsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ResourceRequirements(), validationEnabled);
    }

    public V1ResourceRequirementsBuilder(io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ResourceRequirementsBuilder(io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ResourceRequirements(), validationEnabled);
    }

    public V1ResourceRequirementsBuilder(io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<?> fluent,io.kubernetes.client.openapi.models.V1ResourceRequirements instance) {
        this(fluent, instance, true);
    }

    public V1ResourceRequirementsBuilder(io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<?> fluent,io.kubernetes.client.openapi.models.V1ResourceRequirements instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLimits(instance.getLimits());
        
        fluent.withRequests(instance.getRequests());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ResourceRequirementsBuilder(io.kubernetes.client.openapi.models.V1ResourceRequirements instance) {
        this(instance,true);
    }

    public V1ResourceRequirementsBuilder(io.kubernetes.client.openapi.models.V1ResourceRequirements instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLimits(instance.getLimits());
        
        this.withRequests(instance.getRequests());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ResourceRequirements build() {
        V1ResourceRequirements buildable = new V1ResourceRequirements();
        buildable.setLimits(fluent.getLimits());
        buildable.setRequests(fluent.getRequests());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ResourceRequirementsBuilder that = (V1ResourceRequirementsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
