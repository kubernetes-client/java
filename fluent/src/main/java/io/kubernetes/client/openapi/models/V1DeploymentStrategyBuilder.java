package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1DeploymentStrategyBuilder extends io.kubernetes.client.openapi.models.V1DeploymentStrategyFluentImpl<io.kubernetes.client.openapi.models.V1DeploymentStrategyBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1DeploymentStrategy,io.kubernetes.client.openapi.models.V1DeploymentStrategyBuilder> {

    io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1DeploymentStrategyBuilder() {
        this(true);
    }

    public V1DeploymentStrategyBuilder(java.lang.Boolean validationEnabled) {
        this(new V1DeploymentStrategy(), validationEnabled);
    }

    public V1DeploymentStrategyBuilder(io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<?> fluent) {
        this(fluent, true);
    }

    public V1DeploymentStrategyBuilder(io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1DeploymentStrategy(), validationEnabled);
    }

    public V1DeploymentStrategyBuilder(io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<?> fluent,io.kubernetes.client.openapi.models.V1DeploymentStrategy instance) {
        this(fluent, instance, true);
    }

    public V1DeploymentStrategyBuilder(io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<?> fluent,io.kubernetes.client.openapi.models.V1DeploymentStrategy instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withRollingUpdate(instance.getRollingUpdate());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1DeploymentStrategyBuilder(io.kubernetes.client.openapi.models.V1DeploymentStrategy instance) {
        this(instance,true);
    }

    public V1DeploymentStrategyBuilder(io.kubernetes.client.openapi.models.V1DeploymentStrategy instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withRollingUpdate(instance.getRollingUpdate());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1DeploymentStrategy build() {
        V1DeploymentStrategy buildable = new V1DeploymentStrategy();
        buildable.setRollingUpdate(fluent.getRollingUpdate());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1DeploymentStrategyBuilder that = (V1DeploymentStrategyBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
