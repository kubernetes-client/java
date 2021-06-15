package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1AggregationRuleBuilder extends io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta1AggregationRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1AggregationRule,io.kubernetes.client.openapi.models.V1beta1AggregationRuleBuilder> {

    io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1AggregationRuleBuilder() {
        this(true);
    }

    public V1beta1AggregationRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1AggregationRule(), validationEnabled);
    }

    public V1beta1AggregationRuleBuilder(io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1AggregationRuleBuilder(io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1AggregationRule(), validationEnabled);
    }

    public V1beta1AggregationRuleBuilder(io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1AggregationRule instance) {
        this(fluent, instance, true);
    }

    public V1beta1AggregationRuleBuilder(io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1AggregationRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withClusterRoleSelectors(instance.getClusterRoleSelectors());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1AggregationRuleBuilder(io.kubernetes.client.openapi.models.V1beta1AggregationRule instance) {
        this(instance,true);
    }

    public V1beta1AggregationRuleBuilder(io.kubernetes.client.openapi.models.V1beta1AggregationRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withClusterRoleSelectors(instance.getClusterRoleSelectors());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1AggregationRule build() {
        V1beta1AggregationRule buildable = new V1beta1AggregationRule();
        buildable.setClusterRoleSelectors(fluent.getClusterRoleSelectors());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1AggregationRuleBuilder that = (V1beta1AggregationRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
