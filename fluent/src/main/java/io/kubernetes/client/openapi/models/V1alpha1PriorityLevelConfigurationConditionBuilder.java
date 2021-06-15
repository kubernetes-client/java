package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1PriorityLevelConfigurationConditionBuilder extends io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationConditionFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationCondition,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationConditionBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationConditionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1PriorityLevelConfigurationConditionBuilder() {
        this(true);
    }

    public V1alpha1PriorityLevelConfigurationConditionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1PriorityLevelConfigurationCondition(), validationEnabled);
    }

    public V1alpha1PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationConditionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1PriorityLevelConfigurationCondition(), validationEnabled);
    }

    public V1alpha1PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationCondition instance) {
        this(fluent, instance, true);
    }

    public V1alpha1PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLastTransitionTime(instance.getLastTransitionTime());
        
        fluent.withMessage(instance.getMessage());
        
        fluent.withReason(instance.getReason());
        
        fluent.withStatus(instance.getStatus());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationCondition instance) {
        this(instance,true);
    }

    public V1alpha1PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLastTransitionTime(instance.getLastTransitionTime());
        
        this.withMessage(instance.getMessage());
        
        this.withReason(instance.getReason());
        
        this.withStatus(instance.getStatus());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationCondition build() {
        V1alpha1PriorityLevelConfigurationCondition buildable = new V1alpha1PriorityLevelConfigurationCondition();
        buildable.setLastTransitionTime(fluent.getLastTransitionTime());
        buildable.setMessage(fluent.getMessage());
        buildable.setReason(fluent.getReason());
        buildable.setStatus(fluent.getStatus());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1PriorityLevelConfigurationConditionBuilder that = (V1alpha1PriorityLevelConfigurationConditionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
