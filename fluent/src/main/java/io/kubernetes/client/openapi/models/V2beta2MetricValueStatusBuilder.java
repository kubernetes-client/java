package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2MetricValueStatusBuilder extends io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2MetricValueStatus,io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2MetricValueStatusBuilder() {
        this(true);
    }

    public V2beta2MetricValueStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2MetricValueStatus(), validationEnabled);
    }

    public V2beta2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2MetricValueStatus(), validationEnabled);
    }

    public V2beta2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAverageUtilization(instance.getAverageUtilization());
        
        fluent.withAverageValue(instance.getAverageValue());
        
        fluent.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance) {
        this(instance,true);
    }

    public V2beta2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAverageUtilization(instance.getAverageUtilization());
        
        this.withAverageValue(instance.getAverageValue());
        
        this.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus build() {
        V2beta2MetricValueStatus buildable = new V2beta2MetricValueStatus();
        buildable.setAverageUtilization(fluent.getAverageUtilization());
        buildable.setAverageValue(fluent.getAverageValue());
        buildable.setValue(fluent.getValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2MetricValueStatusBuilder that = (V2beta2MetricValueStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
