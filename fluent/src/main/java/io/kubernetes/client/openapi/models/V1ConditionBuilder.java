package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ConditionBuilder extends io.kubernetes.client.openapi.models.V1ConditionFluentImpl<io.kubernetes.client.openapi.models.V1ConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Condition,io.kubernetes.client.openapi.models.V1ConditionBuilder> {

    io.kubernetes.client.openapi.models.V1ConditionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ConditionBuilder() {
        this(true);
    }

    public V1ConditionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Condition(), validationEnabled);
    }

    public V1ConditionBuilder(io.kubernetes.client.openapi.models.V1ConditionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ConditionBuilder(io.kubernetes.client.openapi.models.V1ConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Condition(), validationEnabled);
    }

    public V1ConditionBuilder(io.kubernetes.client.openapi.models.V1ConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1Condition instance) {
        this(fluent, instance, true);
    }

    public V1ConditionBuilder(io.kubernetes.client.openapi.models.V1ConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1Condition instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLastTransitionTime(instance.getLastTransitionTime());
        
        fluent.withMessage(instance.getMessage());
        
        fluent.withObservedGeneration(instance.getObservedGeneration());
        
        fluent.withReason(instance.getReason());
        
        fluent.withStatus(instance.getStatus());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ConditionBuilder(io.kubernetes.client.openapi.models.V1Condition instance) {
        this(instance,true);
    }

    public V1ConditionBuilder(io.kubernetes.client.openapi.models.V1Condition instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLastTransitionTime(instance.getLastTransitionTime());
        
        this.withMessage(instance.getMessage());
        
        this.withObservedGeneration(instance.getObservedGeneration());
        
        this.withReason(instance.getReason());
        
        this.withStatus(instance.getStatus());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Condition build() {
        V1Condition buildable = new V1Condition();
        buildable.setLastTransitionTime(fluent.getLastTransitionTime());
        buildable.setMessage(fluent.getMessage());
        buildable.setObservedGeneration(fluent.getObservedGeneration());
        buildable.setReason(fluent.getReason());
        buildable.setStatus(fluent.getStatus());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ConditionBuilder that = (V1ConditionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
