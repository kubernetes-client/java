package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ContainerStateRunningBuilder extends io.kubernetes.client.openapi.models.V1ContainerStateRunningFluentImpl<io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ContainerStateRunning,io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder> {

    io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ContainerStateRunningBuilder() {
        this(true);
    }

    public V1ContainerStateRunningBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ContainerStateRunning(), validationEnabled);
    }

    public V1ContainerStateRunningBuilder(io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ContainerStateRunningBuilder(io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ContainerStateRunning(), validationEnabled);
    }

    public V1ContainerStateRunningBuilder(io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerStateRunning instance) {
        this(fluent, instance, true);
    }

    public V1ContainerStateRunningBuilder(io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerStateRunning instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withStartedAt(instance.getStartedAt());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ContainerStateRunningBuilder(io.kubernetes.client.openapi.models.V1ContainerStateRunning instance) {
        this(instance,true);
    }

    public V1ContainerStateRunningBuilder(io.kubernetes.client.openapi.models.V1ContainerStateRunning instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withStartedAt(instance.getStartedAt());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ContainerStateRunning build() {
        V1ContainerStateRunning buildable = new V1ContainerStateRunning();
        buildable.setStartedAt(fluent.getStartedAt());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ContainerStateRunningBuilder that = (V1ContainerStateRunningBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
