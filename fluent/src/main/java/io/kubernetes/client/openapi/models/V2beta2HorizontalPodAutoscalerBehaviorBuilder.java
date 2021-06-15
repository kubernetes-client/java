package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2HorizontalPodAutoscalerBehaviorBuilder extends io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluentImpl<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorBuilder> {

    io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2HorizontalPodAutoscalerBehaviorBuilder() {
        this(true);
    }

    public V2beta2HorizontalPodAutoscalerBehaviorBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2HorizontalPodAutoscalerBehavior(), validationEnabled);
    }

    public V2beta2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2HorizontalPodAutoscalerBehavior(), validationEnabled);
    }

    public V2beta2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance) {
        this(fluent, instance, true);
    }

    public V2beta2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withScaleDown(instance.getScaleDown());
        
        fluent.withScaleUp(instance.getScaleUp());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance) {
        this(instance,true);
    }

    public V2beta2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withScaleDown(instance.getScaleDown());
        
        this.withScaleUp(instance.getScaleUp());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior build() {
        V2beta2HorizontalPodAutoscalerBehavior buildable = new V2beta2HorizontalPodAutoscalerBehavior();
        buildable.setScaleDown(fluent.getScaleDown());
        buildable.setScaleUp(fluent.getScaleUp());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2HorizontalPodAutoscalerBehaviorBuilder that = (V2beta2HorizontalPodAutoscalerBehaviorBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
