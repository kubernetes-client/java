package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PodReadinessGateBuilder extends io.kubernetes.client.openapi.models.V1PodReadinessGateFluentImpl<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodReadinessGate,io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder> {

    io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PodReadinessGateBuilder() {
        this(true);
    }

    public V1PodReadinessGateBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PodReadinessGate(), validationEnabled);
    }

    public V1PodReadinessGateBuilder(io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PodReadinessGateBuilder(io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PodReadinessGate(), validationEnabled);
    }

    public V1PodReadinessGateBuilder(io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodReadinessGate instance) {
        this(fluent, instance, true);
    }

    public V1PodReadinessGateBuilder(io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodReadinessGate instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConditionType(instance.getConditionType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PodReadinessGateBuilder(io.kubernetes.client.openapi.models.V1PodReadinessGate instance) {
        this(instance,true);
    }

    public V1PodReadinessGateBuilder(io.kubernetes.client.openapi.models.V1PodReadinessGate instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConditionType(instance.getConditionType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PodReadinessGate build() {
        V1PodReadinessGate buildable = new V1PodReadinessGate();
        buildable.setConditionType(fluent.getConditionType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PodReadinessGateBuilder that = (V1PodReadinessGateBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
