package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1PodsMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus,io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1PodsMetricStatusBuilder() {
        this(true);
    }

    public V2beta1PodsMetricStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1PodsMetricStatus(), validationEnabled);
    }

    public V2beta1PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1PodsMetricStatus(), validationEnabled);
    }

    public V2beta1PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta1PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        fluent.withMetricName(instance.getMetricName());
        
        fluent.withSelector(instance.getSelector());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus instance) {
        this(instance,true);
    }

    public V2beta1PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        this.withMetricName(instance.getMetricName());
        
        this.withSelector(instance.getSelector());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus build() {
        V2beta1PodsMetricStatus buildable = new V2beta1PodsMetricStatus();
        buildable.setCurrentAverageValue(fluent.getCurrentAverageValue());
        buildable.setMetricName(fluent.getMetricName());
        buildable.setSelector(fluent.getSelector());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1PodsMetricStatusBuilder that = (V2beta1PodsMetricStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
