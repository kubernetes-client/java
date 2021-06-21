package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1HorizontalPodAutoscalerConditionBuilder extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionFluentImpl<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionBuilder> {

    io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1HorizontalPodAutoscalerConditionBuilder() {
        this(true);
    }

    public V2beta1HorizontalPodAutoscalerConditionBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1HorizontalPodAutoscalerCondition(), validationEnabled);
    }

    public V2beta1HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1HorizontalPodAutoscalerCondition(), validationEnabled);
    }

    public V2beta1HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition instance) {
        this(fluent, instance, true);
    }

    public V2beta1HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLastTransitionTime(instance.getLastTransitionTime());
        
        fluent.withMessage(instance.getMessage());
        
        fluent.withReason(instance.getReason());
        
        fluent.withStatus(instance.getStatus());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition instance) {
        this(instance,true);
    }

    public V2beta1HorizontalPodAutoscalerConditionBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLastTransitionTime(instance.getLastTransitionTime());
        
        this.withMessage(instance.getMessage());
        
        this.withReason(instance.getReason());
        
        this.withStatus(instance.getStatus());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition build() {
        V2beta1HorizontalPodAutoscalerCondition buildable = new V2beta1HorizontalPodAutoscalerCondition();
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
        V2beta1HorizontalPodAutoscalerConditionBuilder that = (V2beta1HorizontalPodAutoscalerConditionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
