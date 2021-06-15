package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1PriorityLevelConfigurationStatusBuilder extends io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatusFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatus,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatusBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1PriorityLevelConfigurationStatusBuilder() {
        this(true);
    }

    public V1alpha1PriorityLevelConfigurationStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1PriorityLevelConfigurationStatus(), validationEnabled);
    }

    public V1alpha1PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1PriorityLevelConfigurationStatus(), validationEnabled);
    }

    public V1alpha1PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatus instance) {
        this(fluent, instance, true);
    }

    public V1alpha1PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatus instance) {
        this(instance,true);
    }

    public V1alpha1PriorityLevelConfigurationStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationStatus build() {
        V1alpha1PriorityLevelConfigurationStatus buildable = new V1alpha1PriorityLevelConfigurationStatus();
        buildable.setConditions(fluent.getConditions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1PriorityLevelConfigurationStatusBuilder that = (V1alpha1PriorityLevelConfigurationStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
