package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ExtensionsV1beta1IngressRuleBuilder extends io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRuleFluentImpl<io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRule,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRuleBuilder> {

    io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public ExtensionsV1beta1IngressRuleBuilder() {
        this(true);
    }

    public ExtensionsV1beta1IngressRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new ExtensionsV1beta1IngressRule(), validationEnabled);
    }

    public ExtensionsV1beta1IngressRuleBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public ExtensionsV1beta1IngressRuleBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new ExtensionsV1beta1IngressRule(), validationEnabled);
    }

    public ExtensionsV1beta1IngressRuleBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRuleFluent<?> fluent,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRule instance) {
        this(fluent, instance, true);
    }

    public ExtensionsV1beta1IngressRuleBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRuleFluent<?> fluent,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withHost(instance.getHost());
        
        fluent.withHttp(instance.getHttp());
        
        this.validationEnabled = validationEnabled; 
    }

    public ExtensionsV1beta1IngressRuleBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRule instance) {
        this(instance,true);
    }

    public ExtensionsV1beta1IngressRuleBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withHost(instance.getHost());
        
        this.withHttp(instance.getHttp());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressRule build() {
        ExtensionsV1beta1IngressRule buildable = new ExtensionsV1beta1IngressRule();
        buildable.setHost(fluent.getHost());
        buildable.setHttp(fluent.getHttp());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExtensionsV1beta1IngressRuleBuilder that = (ExtensionsV1beta1IngressRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
