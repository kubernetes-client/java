package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1ExternalMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus,io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1ExternalMetricStatusBuilder() {
        this(true);
    }

    public V2beta1ExternalMetricStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1ExternalMetricStatus(), validationEnabled);
    }

    public V2beta1ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1ExternalMetricStatus(), validationEnabled);
    }

    public V2beta1ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta1ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        fluent.withCurrentValue(instance.getCurrentValue());
        
        fluent.withMetricName(instance.getMetricName());
        
        fluent.withMetricSelector(instance.getMetricSelector());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance) {
        this(instance,true);
    }

    public V2beta1ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        this.withCurrentValue(instance.getCurrentValue());
        
        this.withMetricName(instance.getMetricName());
        
        this.withMetricSelector(instance.getMetricSelector());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus build() {
        V2beta1ExternalMetricStatus buildable = new V2beta1ExternalMetricStatus();
        buildable.setCurrentAverageValue(fluent.getCurrentAverageValue());
        buildable.setCurrentValue(fluent.getCurrentValue());
        buildable.setMetricName(fluent.getMetricName());
        buildable.setMetricSelector(fluent.getMetricSelector());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1ExternalMetricStatusBuilder that = (V2beta1ExternalMetricStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
