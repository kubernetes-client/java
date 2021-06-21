package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1DaemonSetUpdateStrategyBuilder extends io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluentImpl<io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy,io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder> {

    io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1DaemonSetUpdateStrategyBuilder() {
        this(true);
    }

    public V1DaemonSetUpdateStrategyBuilder(java.lang.Boolean validationEnabled) {
        this(new V1DaemonSetUpdateStrategy(), validationEnabled);
    }

    public V1DaemonSetUpdateStrategyBuilder(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent) {
        this(fluent, true);
    }

    public V1DaemonSetUpdateStrategyBuilder(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1DaemonSetUpdateStrategy(), validationEnabled);
    }

    public V1DaemonSetUpdateStrategyBuilder(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent,io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance) {
        this(fluent, instance, true);
    }

    public V1DaemonSetUpdateStrategyBuilder(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent,io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withRollingUpdate(instance.getRollingUpdate());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1DaemonSetUpdateStrategyBuilder(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance) {
        this(instance,true);
    }

    public V1DaemonSetUpdateStrategyBuilder(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withRollingUpdate(instance.getRollingUpdate());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy build() {
        V1DaemonSetUpdateStrategy buildable = new V1DaemonSetUpdateStrategy();
        buildable.setRollingUpdate(fluent.getRollingUpdate());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1DaemonSetUpdateStrategyBuilder that = (V1DaemonSetUpdateStrategyBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
