package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1SchedulingBuilder extends io.kubernetes.client.openapi.models.V1alpha1SchedulingFluentImpl<io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1Scheduling,io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1SchedulingBuilder() {
        this(true);
    }

    public V1alpha1SchedulingBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1Scheduling(), validationEnabled);
    }

    public V1alpha1SchedulingBuilder(io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1SchedulingBuilder(io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1Scheduling(), validationEnabled);
    }

    public V1alpha1SchedulingBuilder(io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1Scheduling instance) {
        this(fluent, instance, true);
    }

    public V1alpha1SchedulingBuilder(io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1Scheduling instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withNodeSelector(instance.getNodeSelector());
        
        fluent.withTolerations(instance.getTolerations());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1SchedulingBuilder(io.kubernetes.client.openapi.models.V1alpha1Scheduling instance) {
        this(instance,true);
    }

    public V1alpha1SchedulingBuilder(io.kubernetes.client.openapi.models.V1alpha1Scheduling instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withNodeSelector(instance.getNodeSelector());
        
        this.withTolerations(instance.getTolerations());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1Scheduling build() {
        V1alpha1Scheduling buildable = new V1alpha1Scheduling();
        buildable.setNodeSelector(fluent.getNodeSelector());
        buildable.setTolerations(fluent.getTolerations());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1SchedulingBuilder that = (V1alpha1SchedulingBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
