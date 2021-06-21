package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2HorizontalPodAutoscalerBuilder extends io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerFluentImpl<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBuilder> {

    io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2HorizontalPodAutoscalerBuilder() {
        this(true);
    }

    public V2beta2HorizontalPodAutoscalerBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2HorizontalPodAutoscaler(), validationEnabled);
    }

    public V2beta2HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2HorizontalPodAutoscaler(), validationEnabled);
    }

    public V2beta2HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler instance) {
        this(fluent, instance, true);
    }

    public V2beta2HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        fluent.withStatus(instance.getStatus());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler instance) {
        this(instance,true);
    }

    public V2beta2HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.withStatus(instance.getStatus());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler build() {
        V2beta2HorizontalPodAutoscaler buildable = new V2beta2HorizontalPodAutoscaler();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        buildable.setStatus(fluent.getStatus());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2HorizontalPodAutoscalerBuilder that = (V2beta2HorizontalPodAutoscalerBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
