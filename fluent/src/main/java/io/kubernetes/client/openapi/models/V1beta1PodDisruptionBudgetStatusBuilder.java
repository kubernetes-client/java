package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1PodDisruptionBudgetStatusBuilder extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluentImpl<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder> {

    io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1PodDisruptionBudgetStatusBuilder() {
        this(true);
    }

    public V1beta1PodDisruptionBudgetStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1PodDisruptionBudgetStatus(), validationEnabled);
    }

    public V1beta1PodDisruptionBudgetStatusBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1PodDisruptionBudgetStatusBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1PodDisruptionBudgetStatus(), validationEnabled);
    }

    public V1beta1PodDisruptionBudgetStatusBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance) {
        this(fluent, instance, true);
    }

    public V1beta1PodDisruptionBudgetStatusBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCurrentHealthy(instance.getCurrentHealthy());
        
        fluent.withDesiredHealthy(instance.getDesiredHealthy());
        
        fluent.withDisruptedPods(instance.getDisruptedPods());
        
        fluent.withDisruptionsAllowed(instance.getDisruptionsAllowed());
        
        fluent.withExpectedPods(instance.getExpectedPods());
        
        fluent.withObservedGeneration(instance.getObservedGeneration());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1PodDisruptionBudgetStatusBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance) {
        this(instance,true);
    }

    public V1beta1PodDisruptionBudgetStatusBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCurrentHealthy(instance.getCurrentHealthy());
        
        this.withDesiredHealthy(instance.getDesiredHealthy());
        
        this.withDisruptedPods(instance.getDisruptedPods());
        
        this.withDisruptionsAllowed(instance.getDisruptionsAllowed());
        
        this.withExpectedPods(instance.getExpectedPods());
        
        this.withObservedGeneration(instance.getObservedGeneration());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus build() {
        V1beta1PodDisruptionBudgetStatus buildable = new V1beta1PodDisruptionBudgetStatus();
        buildable.setCurrentHealthy(fluent.getCurrentHealthy());
        buildable.setDesiredHealthy(fluent.getDesiredHealthy());
        buildable.setDisruptedPods(fluent.getDisruptedPods());
        buildable.setDisruptionsAllowed(fluent.getDisruptionsAllowed());
        buildable.setExpectedPods(fluent.getExpectedPods());
        buildable.setObservedGeneration(fluent.getObservedGeneration());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1PodDisruptionBudgetStatusBuilder that = (V1beta1PodDisruptionBudgetStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
