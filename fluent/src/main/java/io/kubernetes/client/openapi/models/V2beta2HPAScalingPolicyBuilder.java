package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2HPAScalingPolicyBuilder extends io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluentImpl<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy,io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder> {

    io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2HPAScalingPolicyBuilder() {
        this(true);
    }

    public V2beta2HPAScalingPolicyBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2HPAScalingPolicy(), validationEnabled);
    }

    public V2beta2HPAScalingPolicyBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2HPAScalingPolicyBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2HPAScalingPolicy(), validationEnabled);
    }

    public V2beta2HPAScalingPolicyBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy instance) {
        this(fluent, instance, true);
    }

    public V2beta2HPAScalingPolicyBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPeriodSeconds(instance.getPeriodSeconds());
        
        fluent.withType(instance.getType());
        
        fluent.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2HPAScalingPolicyBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy instance) {
        this(instance,true);
    }

    public V2beta2HPAScalingPolicyBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPeriodSeconds(instance.getPeriodSeconds());
        
        this.withType(instance.getType());
        
        this.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy build() {
        V2beta2HPAScalingPolicy buildable = new V2beta2HPAScalingPolicy();
        buildable.setPeriodSeconds(fluent.getPeriodSeconds());
        buildable.setType(fluent.getType());
        buildable.setValue(fluent.getValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2HPAScalingPolicyBuilder that = (V2beta2HPAScalingPolicyBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
