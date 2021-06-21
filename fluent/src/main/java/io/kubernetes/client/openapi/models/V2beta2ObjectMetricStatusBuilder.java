package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2ObjectMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus,io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2ObjectMetricStatusBuilder() {
        this(true);
    }

    public V2beta2ObjectMetricStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2ObjectMetricStatus(), validationEnabled);
    }

    public V2beta2ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2ObjectMetricStatus(), validationEnabled);
    }

    public V2beta2ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta2ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCurrent(instance.getCurrent());
        
        fluent.withDescribedObject(instance.getDescribedObject());
        
        fluent.withMetric(instance.getMetric());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus instance) {
        this(instance,true);
    }

    public V2beta2ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCurrent(instance.getCurrent());
        
        this.withDescribedObject(instance.getDescribedObject());
        
        this.withMetric(instance.getMetric());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus build() {
        V2beta2ObjectMetricStatus buildable = new V2beta2ObjectMetricStatus();
        buildable.setCurrent(fluent.getCurrent());
        buildable.setDescribedObject(fluent.getDescribedObject());
        buildable.setMetric(fluent.getMetric());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2ObjectMetricStatusBuilder that = (V2beta2ObjectMetricStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
