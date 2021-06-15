package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1PodsMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1PodsMetricSource,io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceBuilder> {

    io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1PodsMetricSourceBuilder() {
        this(true);
    }

    public V2beta1PodsMetricSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1PodsMetricSource(), validationEnabled);
    }

    public V2beta1PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1PodsMetricSource(), validationEnabled);
    }

    public V2beta1PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1PodsMetricSource instance) {
        this(fluent, instance, true);
    }

    public V2beta1PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1PodsMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMetricName(instance.getMetricName());
        
        fluent.withSelector(instance.getSelector());
        
        fluent.withTargetAverageValue(instance.getTargetAverageValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource instance) {
        this(instance,true);
    }

    public V2beta1PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMetricName(instance.getMetricName());
        
        this.withSelector(instance.getSelector());
        
        this.withTargetAverageValue(instance.getTargetAverageValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1PodsMetricSource build() {
        V2beta1PodsMetricSource buildable = new V2beta1PodsMetricSource();
        buildable.setMetricName(fluent.getMetricName());
        buildable.setSelector(fluent.getSelector());
        buildable.setTargetAverageValue(fluent.getTargetAverageValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1PodsMetricSourceBuilder that = (V2beta1PodsMetricSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
