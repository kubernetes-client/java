package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1NonResourceRuleBuilder extends io.kubernetes.client.openapi.models.V1beta1NonResourceRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1NonResourceRule,io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder> {

    io.kubernetes.client.openapi.models.V1beta1NonResourceRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1NonResourceRuleBuilder() {
        this(true);
    }

    public V1beta1NonResourceRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1NonResourceRule(), validationEnabled);
    }

    public V1beta1NonResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1NonResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1NonResourceRule(), validationEnabled);
    }

    public V1beta1NonResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1NonResourceRule instance) {
        this(fluent, instance, true);
    }

    public V1beta1NonResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1NonResourceRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withNonResourceURLs(instance.getNonResourceURLs());
        
        fluent.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1NonResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceRule instance) {
        this(instance,true);
    }

    public V1beta1NonResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withNonResourceURLs(instance.getNonResourceURLs());
        
        this.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1NonResourceRule build() {
        V1beta1NonResourceRule buildable = new V1beta1NonResourceRule();
        buildable.setNonResourceURLs(fluent.getNonResourceURLs());
        buildable.setVerbs(fluent.getVerbs());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1NonResourceRuleBuilder that = (V1beta1NonResourceRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
