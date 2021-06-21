package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1HorizontalPodAutoscalerSpecBuilder extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluentImpl<io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec,io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecBuilder> {

    io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1HorizontalPodAutoscalerSpecBuilder() {
        this(true);
    }

    public V1HorizontalPodAutoscalerSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1HorizontalPodAutoscalerSpec(), validationEnabled);
    }

    public V1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1HorizontalPodAutoscalerSpec(), validationEnabled);
    }

    public V1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance) {
        this(fluent, instance, true);
    }

    public V1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMaxReplicas(instance.getMaxReplicas());
        
        fluent.withMinReplicas(instance.getMinReplicas());
        
        fluent.withScaleTargetRef(instance.getScaleTargetRef());
        
        fluent.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance) {
        this(instance,true);
    }

    public V1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMaxReplicas(instance.getMaxReplicas());
        
        this.withMinReplicas(instance.getMinReplicas());
        
        this.withScaleTargetRef(instance.getScaleTargetRef());
        
        this.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec build() {
        V1HorizontalPodAutoscalerSpec buildable = new V1HorizontalPodAutoscalerSpec();
        buildable.setMaxReplicas(fluent.getMaxReplicas());
        buildable.setMinReplicas(fluent.getMinReplicas());
        buildable.setScaleTargetRef(fluent.getScaleTargetRef());
        buildable.setTargetCPUUtilizationPercentage(fluent.getTargetCPUUtilizationPercentage());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1HorizontalPodAutoscalerSpecBuilder that = (V1HorizontalPodAutoscalerSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
