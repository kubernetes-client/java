package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2PodsMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2PodsMetricSource,io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceBuilder> {

    io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2PodsMetricSourceBuilder() {
        this(true);
    }

    public V2beta2PodsMetricSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2PodsMetricSource(), validationEnabled);
    }

    public V2beta2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2PodsMetricSource(), validationEnabled);
    }

    public V2beta2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2PodsMetricSource instance) {
        this(fluent, instance, true);
    }

    public V2beta2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2PodsMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMetric(instance.getMetric());
        
        fluent.withTarget(instance.getTarget());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricSource instance) {
        this(instance,true);
    }

    public V2beta2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta2PodsMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMetric(instance.getMetric());
        
        this.withTarget(instance.getTarget());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2PodsMetricSource build() {
        V2beta2PodsMetricSource buildable = new V2beta2PodsMetricSource();
        buildable.setMetric(fluent.getMetric());
        buildable.setTarget(fluent.getTarget());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2PodsMetricSourceBuilder that = (V2beta2PodsMetricSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
