package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1HorizontalPodAutoscalerStatusBuilder extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1HorizontalPodAutoscalerStatusBuilder() {
        this(true);
    }

    public V2beta1HorizontalPodAutoscalerStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1HorizontalPodAutoscalerStatus(), validationEnabled);
    }

    public V2beta1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1HorizontalPodAutoscalerStatus(), validationEnabled);
    }

    public V2beta1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConditions(instance.getConditions());
        
        fluent.withCurrentMetrics(instance.getCurrentMetrics());
        
        fluent.withCurrentReplicas(instance.getCurrentReplicas());
        
        fluent.withDesiredReplicas(instance.getDesiredReplicas());
        
        fluent.withLastScaleTime(instance.getLastScaleTime());
        
        fluent.withObservedGeneration(instance.getObservedGeneration());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus instance) {
        this(instance,true);
    }

    public V2beta1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConditions(instance.getConditions());
        
        this.withCurrentMetrics(instance.getCurrentMetrics());
        
        this.withCurrentReplicas(instance.getCurrentReplicas());
        
        this.withDesiredReplicas(instance.getDesiredReplicas());
        
        this.withLastScaleTime(instance.getLastScaleTime());
        
        this.withObservedGeneration(instance.getObservedGeneration());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus build() {
        V2beta1HorizontalPodAutoscalerStatus buildable = new V2beta1HorizontalPodAutoscalerStatus();
        buildable.setConditions(fluent.getConditions());
        buildable.setCurrentMetrics(fluent.getCurrentMetrics());
        buildable.setCurrentReplicas(fluent.getCurrentReplicas());
        buildable.setDesiredReplicas(fluent.getDesiredReplicas());
        buildable.setLastScaleTime(fluent.getLastScaleTime());
        buildable.setObservedGeneration(fluent.getObservedGeneration());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1HorizontalPodAutoscalerStatusBuilder that = (V2beta1HorizontalPodAutoscalerStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
