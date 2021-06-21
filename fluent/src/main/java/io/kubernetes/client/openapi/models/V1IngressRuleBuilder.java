package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1IngressRuleBuilder extends io.kubernetes.client.openapi.models.V1IngressRuleFluentImpl<io.kubernetes.client.openapi.models.V1IngressRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1IngressRule,io.kubernetes.client.openapi.models.V1IngressRuleBuilder> {

    io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1IngressRuleBuilder() {
        this(true);
    }

    public V1IngressRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1IngressRule(), validationEnabled);
    }

    public V1IngressRuleBuilder(io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1IngressRuleBuilder(io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1IngressRule(), validationEnabled);
    }

    public V1IngressRuleBuilder(io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressRule instance) {
        this(fluent, instance, true);
    }

    public V1IngressRuleBuilder(io.kubernetes.client.openapi.models.V1IngressRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withHost(instance.getHost());
        
        fluent.withHttp(instance.getHttp());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1IngressRuleBuilder(io.kubernetes.client.openapi.models.V1IngressRule instance) {
        this(instance,true);
    }

    public V1IngressRuleBuilder(io.kubernetes.client.openapi.models.V1IngressRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withHost(instance.getHost());
        
        this.withHttp(instance.getHttp());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1IngressRule build() {
        V1IngressRule buildable = new V1IngressRule();
        buildable.setHost(fluent.getHost());
        buildable.setHttp(fluent.getHttp());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1IngressRuleBuilder that = (V1IngressRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
