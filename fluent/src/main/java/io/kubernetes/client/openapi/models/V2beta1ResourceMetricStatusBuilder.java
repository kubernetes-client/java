package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1ResourceMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus,io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1ResourceMetricStatusBuilder() {
        this(true);
    }

    public V2beta1ResourceMetricStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1ResourceMetricStatus(), validationEnabled);
    }

    public V2beta1ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1ResourceMetricStatus(), validationEnabled);
    }

    public V2beta1ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta1ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCurrentAverageUtilization(instance.getCurrentAverageUtilization());
        
        fluent.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus instance) {
        this(instance,true);
    }

    public V2beta1ResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCurrentAverageUtilization(instance.getCurrentAverageUtilization());
        
        this.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus build() {
        V2beta1ResourceMetricStatus buildable = new V2beta1ResourceMetricStatus();
        buildable.setCurrentAverageUtilization(fluent.getCurrentAverageUtilization());
        buildable.setCurrentAverageValue(fluent.getCurrentAverageValue());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1ResourceMetricStatusBuilder that = (V2beta1ResourceMetricStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
