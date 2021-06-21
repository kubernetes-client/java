package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1RollingUpdateDeploymentBuilder extends io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluentImpl<io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1RollingUpdateDeployment,io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentBuilder> {

    io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1RollingUpdateDeploymentBuilder() {
        this(true);
    }

    public V1RollingUpdateDeploymentBuilder(java.lang.Boolean validationEnabled) {
        this(new V1RollingUpdateDeployment(), validationEnabled);
    }

    public V1RollingUpdateDeploymentBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<?> fluent) {
        this(fluent, true);
    }

    public V1RollingUpdateDeploymentBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1RollingUpdateDeployment(), validationEnabled);
    }

    public V1RollingUpdateDeploymentBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<?> fluent,io.kubernetes.client.openapi.models.V1RollingUpdateDeployment instance) {
        this(fluent, instance, true);
    }

    public V1RollingUpdateDeploymentBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<?> fluent,io.kubernetes.client.openapi.models.V1RollingUpdateDeployment instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMaxSurge(instance.getMaxSurge());
        
        fluent.withMaxUnavailable(instance.getMaxUnavailable());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1RollingUpdateDeploymentBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment instance) {
        this(instance,true);
    }

    public V1RollingUpdateDeploymentBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMaxSurge(instance.getMaxSurge());
        
        this.withMaxUnavailable(instance.getMaxUnavailable());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment build() {
        V1RollingUpdateDeployment buildable = new V1RollingUpdateDeployment();
        buildable.setMaxSurge(fluent.getMaxSurge());
        buildable.setMaxUnavailable(fluent.getMaxUnavailable());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1RollingUpdateDeploymentBuilder that = (V1RollingUpdateDeploymentBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
