package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1ContainerResourceMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource,io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceBuilder> {

    io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1ContainerResourceMetricSourceBuilder() {
        this(true);
    }

    public V2beta1ContainerResourceMetricSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1ContainerResourceMetricSource(), validationEnabled);
    }

    public V2beta1ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1ContainerResourceMetricSource(), validationEnabled);
    }

    public V2beta1ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance) {
        this(fluent, instance, true);
    }

    public V2beta1ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withContainer(instance.getContainer());
        
        fluent.withName(instance.getName());
        
        fluent.withTargetAverageUtilization(instance.getTargetAverageUtilization());
        
        fluent.withTargetAverageValue(instance.getTargetAverageValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance) {
        this(instance,true);
    }

    public V2beta1ContainerResourceMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withContainer(instance.getContainer());
        
        this.withName(instance.getName());
        
        this.withTargetAverageUtilization(instance.getTargetAverageUtilization());
        
        this.withTargetAverageValue(instance.getTargetAverageValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource build() {
        V2beta1ContainerResourceMetricSource buildable = new V2beta1ContainerResourceMetricSource();
        buildable.setContainer(fluent.getContainer());
        buildable.setName(fluent.getName());
        buildable.setTargetAverageUtilization(fluent.getTargetAverageUtilization());
        buildable.setTargetAverageValue(fluent.getTargetAverageValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1ContainerResourceMetricSourceBuilder that = (V2beta1ContainerResourceMetricSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
