package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2ContainerResourceMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource,io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceBuilder> {

    io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2ContainerResourceMetricSourceBuilder() {
        this(true);
    }

    public V2beta2ContainerResourceMetricSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2ContainerResourceMetricSource(), validationEnabled);
    }

    public V2beta2ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2ContainerResourceMetricSource(), validationEnabled);
    }

    public V2beta2ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource instance) {
        this(fluent, instance, true);
    }

    public V2beta2ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withContainer(instance.getContainer());
        
        fluent.withName(instance.getName());
        
        fluent.withTarget(instance.getTarget());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource instance) {
        this(instance,true);
    }

    public V2beta2ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withContainer(instance.getContainer());
        
        this.withName(instance.getName());
        
        this.withTarget(instance.getTarget());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource build() {
        V2beta2ContainerResourceMetricSource buildable = new V2beta2ContainerResourceMetricSource();
        buildable.setContainer(fluent.getContainer());
        buildable.setName(fluent.getName());
        buildable.setTarget(fluent.getTarget());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2ContainerResourceMetricSourceBuilder that = (V2beta2ContainerResourceMetricSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
