package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2PodsMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus,io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2PodsMetricStatusBuilder() {
        this(true);
    }

    public V2beta2PodsMetricStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2PodsMetricStatus(), validationEnabled);
    }

    public V2beta2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2PodsMetricStatus(), validationEnabled);
    }

    public V2beta2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCurrent(instance.getCurrent());
        
        fluent.withMetric(instance.getMetric());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance) {
        this(instance,true);
    }

    public V2beta2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCurrent(instance.getCurrent());
        
        this.withMetric(instance.getMetric());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus build() {
        V2beta2PodsMetricStatus buildable = new V2beta2PodsMetricStatus();
        buildable.setCurrent(fluent.getCurrent());
        buildable.setMetric(fluent.getMetric());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2PodsMetricStatusBuilder that = (V2beta2PodsMetricStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
