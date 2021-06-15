package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2HPAScalingRulesBuilder extends io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluentImpl<io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2HPAScalingRules,io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder> {

    io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2HPAScalingRulesBuilder() {
        this(true);
    }

    public V2beta2HPAScalingRulesBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2HPAScalingRules(), validationEnabled);
    }

    public V2beta2HPAScalingRulesBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2HPAScalingRulesBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2HPAScalingRules(), validationEnabled);
    }

    public V2beta2HPAScalingRulesBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance) {
        this(fluent, instance, true);
    }

    public V2beta2HPAScalingRulesBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPolicies(instance.getPolicies());
        
        fluent.withSelectPolicy(instance.getSelectPolicy());
        
        fluent.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2HPAScalingRulesBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance) {
        this(instance,true);
    }

    public V2beta2HPAScalingRulesBuilder(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPolicies(instance.getPolicies());
        
        this.withSelectPolicy(instance.getSelectPolicy());
        
        this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules build() {
        V2beta2HPAScalingRules buildable = new V2beta2HPAScalingRules();
        buildable.setPolicies(fluent.getPolicies());
        buildable.setSelectPolicy(fluent.getSelectPolicy());
        buildable.setStabilizationWindowSeconds(fluent.getStabilizationWindowSeconds());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2HPAScalingRulesBuilder that = (V2beta2HPAScalingRulesBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
