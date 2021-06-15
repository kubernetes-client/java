package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ExtensionsV1beta1HTTPIngressRuleValueBuilder extends io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluentImpl<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValue,io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueBuilder> {

    io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public ExtensionsV1beta1HTTPIngressRuleValueBuilder() {
        this(true);
    }

    public ExtensionsV1beta1HTTPIngressRuleValueBuilder(java.lang.Boolean validationEnabled) {
        this(new ExtensionsV1beta1HTTPIngressRuleValue(), validationEnabled);
    }

    public ExtensionsV1beta1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent<?> fluent) {
        this(fluent, true);
    }

    public ExtensionsV1beta1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new ExtensionsV1beta1HTTPIngressRuleValue(), validationEnabled);
    }

    public ExtensionsV1beta1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent<?> fluent,io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValue instance) {
        this(fluent, instance, true);
    }

    public ExtensionsV1beta1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent<?> fluent,io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValue instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPaths(instance.getPaths());
        
        this.validationEnabled = validationEnabled; 
    }

    public ExtensionsV1beta1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValue instance) {
        this(instance,true);
    }

    public ExtensionsV1beta1HTTPIngressRuleValueBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValue instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPaths(instance.getPaths());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValue build() {
        ExtensionsV1beta1HTTPIngressRuleValue buildable = new ExtensionsV1beta1HTTPIngressRuleValue();
        buildable.setPaths(fluent.getPaths());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExtensionsV1beta1HTTPIngressRuleValueBuilder that = (ExtensionsV1beta1HTTPIngressRuleValueBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
