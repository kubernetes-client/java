package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ContainerStateBuilder extends io.kubernetes.client.openapi.models.V1ContainerStateFluentImpl<io.kubernetes.client.openapi.models.V1ContainerStateBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ContainerState,io.kubernetes.client.openapi.models.V1ContainerStateBuilder> {

    io.kubernetes.client.openapi.models.V1ContainerStateFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ContainerStateBuilder() {
        this(true);
    }

    public V1ContainerStateBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ContainerState(), validationEnabled);
    }

    public V1ContainerStateBuilder(io.kubernetes.client.openapi.models.V1ContainerStateFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ContainerStateBuilder(io.kubernetes.client.openapi.models.V1ContainerStateFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ContainerState(), validationEnabled);
    }

    public V1ContainerStateBuilder(io.kubernetes.client.openapi.models.V1ContainerStateFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerState instance) {
        this(fluent, instance, true);
    }

    public V1ContainerStateBuilder(io.kubernetes.client.openapi.models.V1ContainerStateFluent<?> fluent,io.kubernetes.client.openapi.models.V1ContainerState instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withRunning(instance.getRunning());
        
        fluent.withTerminated(instance.getTerminated());
        
        fluent.withWaiting(instance.getWaiting());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ContainerStateBuilder(io.kubernetes.client.openapi.models.V1ContainerState instance) {
        this(instance,true);
    }

    public V1ContainerStateBuilder(io.kubernetes.client.openapi.models.V1ContainerState instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withRunning(instance.getRunning());
        
        this.withTerminated(instance.getTerminated());
        
        this.withWaiting(instance.getWaiting());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ContainerState build() {
        V1ContainerState buildable = new V1ContainerState();
        buildable.setRunning(fluent.getRunning());
        buildable.setTerminated(fluent.getTerminated());
        buildable.setWaiting(fluent.getWaiting());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ContainerStateBuilder that = (V1ContainerStateBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
