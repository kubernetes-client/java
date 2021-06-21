package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1ObjectMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource,io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder> {

    io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1ObjectMetricSourceBuilder() {
        this(true);
    }

    public V2beta1ObjectMetricSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1ObjectMetricSource(), validationEnabled);
    }

    public V2beta1ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1ObjectMetricSource(), validationEnabled);
    }

    public V2beta1ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance) {
        this(fluent, instance, true);
    }

    public V2beta1ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAverageValue(instance.getAverageValue());
        
        fluent.withMetricName(instance.getMetricName());
        
        fluent.withSelector(instance.getSelector());
        
        fluent.withTarget(instance.getTarget());
        
        fluent.withTargetValue(instance.getTargetValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance) {
        this(instance,true);
    }

    public V2beta1ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAverageValue(instance.getAverageValue());
        
        this.withMetricName(instance.getMetricName());
        
        this.withSelector(instance.getSelector());
        
        this.withTarget(instance.getTarget());
        
        this.withTargetValue(instance.getTargetValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource build() {
        V2beta1ObjectMetricSource buildable = new V2beta1ObjectMetricSource();
        buildable.setAverageValue(fluent.getAverageValue());
        buildable.setMetricName(fluent.getMetricName());
        buildable.setSelector(fluent.getSelector());
        buildable.setTarget(fluent.getTarget());
        buildable.setTargetValue(fluent.getTargetValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1ObjectMetricSourceBuilder that = (V2beta1ObjectMetricSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
