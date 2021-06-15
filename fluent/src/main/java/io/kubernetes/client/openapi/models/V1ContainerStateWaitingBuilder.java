package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ContainerStateWaitingBuilder extends io.kubernetes.client.openapi.models.V1ContainerStateWaitingFluentImpl<io.kubernetes.client.openapi.models.V1ContainerStateWaitingBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ContainerStateWaiting,io.kubernetes.client.openapi.models.V1ContainerStateWaitingBuilder> {

    io.kubernetes.client.openapi.models.V1ContainerStateWaitingFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ContainerStateWaitingBuilder() {
        this(true);
    }

    public V1ContainerStateWaitingBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ContainerStateWaiting(), validationEnabled);
    }

    public V1ContainerStateWaitingBuilder(io.kubernetes.client.openapi.models.V1ContainerStateWaitingFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ContainerStateWaitingBuilder(io.kubernetes.client.openapi.models.V1ContainerStateWaitingFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ContainerStateWaiting(), validationEnabled);
    }

    public V1ContainerStateWaitingBuilder(io.kubernetes.client.openapi.models.V1ContainerStateWaitingFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerStateWaiting instance) {
        this(fluent, instance, true);
    }

    public V1ContainerStateWaitingBuilder(io.kubernetes.client.openapi.models.V1ContainerStateWaitingFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerStateWaiting instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMessage(instance.getMessage());
        
        fluent.withReason(instance.getReason());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ContainerStateWaitingBuilder(io.kubernetes.client.openapi.models.V1ContainerStateWaiting instance) {
        this(instance,true);
    }

    public V1ContainerStateWaitingBuilder(io.kubernetes.client.openapi.models.V1ContainerStateWaiting instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMessage(instance.getMessage());
        
        this.withReason(instance.getReason());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ContainerStateWaiting build() {
        V1ContainerStateWaiting buildable = new V1ContainerStateWaiting();
        buildable.setMessage(fluent.getMessage());
        buildable.setReason(fluent.getReason());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ContainerStateWaitingBuilder that = (V1ContainerStateWaitingBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
