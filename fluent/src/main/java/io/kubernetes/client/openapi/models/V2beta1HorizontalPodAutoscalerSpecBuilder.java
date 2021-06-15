package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1HorizontalPodAutoscalerSpecBuilder extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluentImpl<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecBuilder> {

    io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1HorizontalPodAutoscalerSpecBuilder() {
        this(true);
    }

    public V2beta1HorizontalPodAutoscalerSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1HorizontalPodAutoscalerSpec(), validationEnabled);
    }

    public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1HorizontalPodAutoscalerSpec(), validationEnabled);
    }

    public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance) {
        this(fluent, instance, true);
    }

    public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMaxReplicas(instance.getMaxReplicas());
        
        fluent.withMetrics(instance.getMetrics());
        
        fluent.withMinReplicas(instance.getMinReplicas());
        
        fluent.withScaleTargetRef(instance.getScaleTargetRef());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance) {
        this(instance,true);
    }

    public V2beta1HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMaxReplicas(instance.getMaxReplicas());
        
        this.withMetrics(instance.getMetrics());
        
        this.withMinReplicas(instance.getMinReplicas());
        
        this.withScaleTargetRef(instance.getScaleTargetRef());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec build() {
        V2beta1HorizontalPodAutoscalerSpec buildable = new V2beta1HorizontalPodAutoscalerSpec();
        buildable.setMaxReplicas(fluent.getMaxReplicas());
        buildable.setMetrics(fluent.getMetrics());
        buildable.setMinReplicas(fluent.getMinReplicas());
        buildable.setScaleTargetRef(fluent.getScaleTargetRef());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1HorizontalPodAutoscalerSpecBuilder that = (V2beta1HorizontalPodAutoscalerSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
