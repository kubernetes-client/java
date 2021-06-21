package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NetworkPolicyEgressRuleBuilder extends io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluentImpl<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule,io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder> {

    io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NetworkPolicyEgressRuleBuilder() {
        this(true);
    }

    public V1NetworkPolicyEgressRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NetworkPolicyEgressRule(), validationEnabled);
    }

    public V1NetworkPolicyEgressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NetworkPolicyEgressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NetworkPolicyEgressRule(), validationEnabled);
    }

    public V1NetworkPolicyEgressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance) {
        this(fluent, instance, true);
    }

    public V1NetworkPolicyEgressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPorts(instance.getPorts());
        
        fluent.withTo(instance.getTo());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NetworkPolicyEgressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance) {
        this(instance,true);
    }

    public V1NetworkPolicyEgressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPorts(instance.getPorts());
        
        this.withTo(instance.getTo());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule build() {
        V1NetworkPolicyEgressRule buildable = new V1NetworkPolicyEgressRule();
        buildable.setPorts(fluent.getPorts());
        buildable.setTo(fluent.getTo());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NetworkPolicyEgressRuleBuilder that = (V1NetworkPolicyEgressRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
