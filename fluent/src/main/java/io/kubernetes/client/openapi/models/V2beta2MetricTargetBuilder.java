package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2MetricTargetBuilder extends io.kubernetes.client.openapi.models.V2beta2MetricTargetFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2MetricTarget,io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder> {

    io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2MetricTargetBuilder() {
        this(true);
    }

    public V2beta2MetricTargetBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2MetricTarget(), validationEnabled);
    }

    public V2beta2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2MetricTarget(), validationEnabled);
    }

    public V2beta2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2MetricTarget instance) {
        this(fluent, instance, true);
    }

    public V2beta2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2MetricTarget instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAverageUtilization(instance.getAverageUtilization());
        
        fluent.withAverageValue(instance.getAverageValue());
        
        fluent.withType(instance.getType());
        
        fluent.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2beta2MetricTarget instance) {
        this(instance,true);
    }

    public V2beta2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2beta2MetricTarget instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAverageUtilization(instance.getAverageUtilization());
        
        this.withAverageValue(instance.getAverageValue());
        
        this.withType(instance.getType());
        
        this.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricTarget build() {
        V2beta2MetricTarget buildable = new V2beta2MetricTarget();
        buildable.setAverageUtilization(fluent.getAverageUtilization());
        buildable.setAverageValue(fluent.getAverageValue());
        buildable.setType(fluent.getType());
        buildable.setValue(fluent.getValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2MetricTargetBuilder that = (V2beta2MetricTargetBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
