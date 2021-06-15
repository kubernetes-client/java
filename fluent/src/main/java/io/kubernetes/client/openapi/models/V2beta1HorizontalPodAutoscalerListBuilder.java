package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1HorizontalPodAutoscalerListBuilder extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerListFluentImpl<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerList,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerListBuilder> {

    io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1HorizontalPodAutoscalerListBuilder() {
        this(true);
    }

    public V2beta1HorizontalPodAutoscalerListBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1HorizontalPodAutoscalerList(), validationEnabled);
    }

    public V2beta1HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerListFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1HorizontalPodAutoscalerList(), validationEnabled);
    }

    public V2beta1HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerListFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerList instance) {
        this(fluent, instance, true);
    }

    public V2beta1HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerListFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withItems(instance.getItems());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerList instance) {
        this(instance,true);
    }

    public V2beta1HorizontalPodAutoscalerListBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withItems(instance.getItems());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerList build() {
        V2beta1HorizontalPodAutoscalerList buildable = new V2beta1HorizontalPodAutoscalerList();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setItems(fluent.getItems());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1HorizontalPodAutoscalerListBuilder that = (V2beta1HorizontalPodAutoscalerListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
