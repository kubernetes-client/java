package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2HorizontalPodAutoscalerConditionBuilder extends io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionFluentImpl<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionBuilder> {

    io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2HorizontalPodAutoscalerConditionBuilder() {
        this(true);
    }

    public V2beta2HorizontalPodAutoscalerConditionBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2HorizontalPodAutoscalerCondition(), validationEnabled);
    }

    public V2beta2HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2HorizontalPodAutoscalerCondition(), validationEnabled);
    }

    public V2beta2HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition instance) {
        this(fluent, instance, true);
    }

    public V2beta2HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLastTransitionTime(instance.getLastTransitionTime());
        
        fluent.withMessage(instance.getMessage());
        
        fluent.withReason(instance.getReason());
        
        fluent.withStatus(instance.getStatus());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition instance) {
        this(instance,true);
    }

    public V2beta2HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLastTransitionTime(instance.getLastTransitionTime());
        
        this.withMessage(instance.getMessage());
        
        this.withReason(instance.getReason());
        
        this.withStatus(instance.getStatus());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerCondition build() {
        V2beta2HorizontalPodAutoscalerCondition buildable = new V2beta2HorizontalPodAutoscalerCondition();
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
        V2beta2HorizontalPodAutoscalerConditionBuilder that = (V2beta2HorizontalPodAutoscalerConditionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
