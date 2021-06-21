package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1DeploymentConditionBuilder extends io.kubernetes.client.openapi.models.V1DeploymentConditionFluentImpl<io.kubernetes.client.openapi.models.V1DeploymentConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1DeploymentCondition,io.kubernetes.client.openapi.models.V1DeploymentConditionBuilder> {

    io.kubernetes.client.openapi.models.V1DeploymentConditionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1DeploymentConditionBuilder() {
        this(true);
    }

    public V1DeploymentConditionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1DeploymentCondition(), validationEnabled);
    }

    public V1DeploymentConditionBuilder(io.kubernetes.client.openapi.models.V1DeploymentConditionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1DeploymentConditionBuilder(io.kubernetes.client.openapi.models.V1DeploymentConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1DeploymentCondition(), validationEnabled);
    }

    public V1DeploymentConditionBuilder(io.kubernetes.client.openapi.models.V1DeploymentConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1DeploymentCondition instance) {
        this(fluent, instance, true);
    }

    public V1DeploymentConditionBuilder(io.kubernetes.client.openapi.models.V1DeploymentConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1DeploymentCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLastTransitionTime(instance.getLastTransitionTime());
        
        fluent.withLastUpdateTime(instance.getLastUpdateTime());
        
        fluent.withMessage(instance.getMessage());
        
        fluent.withReason(instance.getReason());
        
        fluent.withStatus(instance.getStatus());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1DeploymentConditionBuilder(io.kubernetes.client.openapi.models.V1DeploymentCondition instance) {
        this(instance,true);
    }

    public V1DeploymentConditionBuilder(io.kubernetes.client.openapi.models.V1DeploymentCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLastTransitionTime(instance.getLastTransitionTime());
        
        this.withLastUpdateTime(instance.getLastUpdateTime());
        
        this.withMessage(instance.getMessage());
        
        this.withReason(instance.getReason());
        
        this.withStatus(instance.getStatus());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1DeploymentCondition build() {
        V1DeploymentCondition buildable = new V1DeploymentCondition();
        buildable.setLastTransitionTime(fluent.getLastTransitionTime());
        buildable.setLastUpdateTime(fluent.getLastUpdateTime());
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
        V1DeploymentConditionBuilder that = (V1DeploymentConditionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
