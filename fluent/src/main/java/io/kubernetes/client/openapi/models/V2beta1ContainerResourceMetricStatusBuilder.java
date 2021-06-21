package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1ContainerResourceMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus,io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1ContainerResourceMetricStatusBuilder() {
        this(true);
    }

    public V2beta1ContainerResourceMetricStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1ContainerResourceMetricStatus(), validationEnabled);
    }

    public V2beta1ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1ContainerResourceMetricStatus(), validationEnabled);
    }

    public V2beta1ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta1ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withContainer(instance.getContainer());
        
        fluent.withCurrentAverageUtilization(instance.getCurrentAverageUtilization());
        
        fluent.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus instance) {
        this(instance,true);
    }

    public V2beta1ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withContainer(instance.getContainer());
        
        this.withCurrentAverageUtilization(instance.getCurrentAverageUtilization());
        
        this.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus build() {
        V2beta1ContainerResourceMetricStatus buildable = new V2beta1ContainerResourceMetricStatus();
        buildable.setContainer(fluent.getContainer());
        buildable.setCurrentAverageUtilization(fluent.getCurrentAverageUtilization());
        buildable.setCurrentAverageValue(fluent.getCurrentAverageValue());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1ContainerResourceMetricStatusBuilder that = (V2beta1ContainerResourceMetricStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
