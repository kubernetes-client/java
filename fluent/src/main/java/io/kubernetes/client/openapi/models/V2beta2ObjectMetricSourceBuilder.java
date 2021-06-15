package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2ObjectMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource,io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceBuilder> {

    io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2ObjectMetricSourceBuilder() {
        this(true);
    }

    public V2beta2ObjectMetricSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2ObjectMetricSource(), validationEnabled);
    }

    public V2beta2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2ObjectMetricSource(), validationEnabled);
    }

    public V2beta2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource instance) {
        this(fluent, instance, true);
    }

    public V2beta2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDescribedObject(instance.getDescribedObject());
        
        fluent.withMetric(instance.getMetric());
        
        fluent.withTarget(instance.getTarget());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource instance) {
        this(instance,true);
    }

    public V2beta2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDescribedObject(instance.getDescribedObject());
        
        this.withMetric(instance.getMetric());
        
        this.withTarget(instance.getTarget());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource build() {
        V2beta2ObjectMetricSource buildable = new V2beta2ObjectMetricSource();
        buildable.setDescribedObject(fluent.getDescribedObject());
        buildable.setMetric(fluent.getMetric());
        buildable.setTarget(fluent.getTarget());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2ObjectMetricSourceBuilder that = (V2beta2ObjectMetricSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
