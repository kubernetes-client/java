package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1ObjectMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus,io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1ObjectMetricStatusBuilder() {
        this(true);
    }

    public V2beta1ObjectMetricStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1ObjectMetricStatus(), validationEnabled);
    }

    public V2beta1ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1ObjectMetricStatus(), validationEnabled);
    }

    public V2beta1ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta1ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAverageValue(instance.getAverageValue());
        
        fluent.withCurrentValue(instance.getCurrentValue());
        
        fluent.withMetricName(instance.getMetricName());
        
        fluent.withSelector(instance.getSelector());
        
        fluent.withTarget(instance.getTarget());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus instance) {
        this(instance,true);
    }

    public V2beta1ObjectMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAverageValue(instance.getAverageValue());
        
        this.withCurrentValue(instance.getCurrentValue());
        
        this.withMetricName(instance.getMetricName());
        
        this.withSelector(instance.getSelector());
        
        this.withTarget(instance.getTarget());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus build() {
        V2beta1ObjectMetricStatus buildable = new V2beta1ObjectMetricStatus();
        buildable.setAverageValue(fluent.getAverageValue());
        buildable.setCurrentValue(fluent.getCurrentValue());
        buildable.setMetricName(fluent.getMetricName());
        buildable.setSelector(fluent.getSelector());
        buildable.setTarget(fluent.getTarget());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1ObjectMetricStatusBuilder that = (V2beta1ObjectMetricStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
