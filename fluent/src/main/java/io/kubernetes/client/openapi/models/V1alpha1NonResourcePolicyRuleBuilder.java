package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1NonResourcePolicyRuleBuilder extends io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleFluentImpl<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1NonResourcePolicyRuleBuilder() {
        this(true);
    }

    public V1alpha1NonResourcePolicyRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1NonResourcePolicyRule(), validationEnabled);
    }

    public V1alpha1NonResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1NonResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1NonResourcePolicyRule(), validationEnabled);
    }

    public V1alpha1NonResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule instance) {
        this(fluent, instance, true);
    }

    public V1alpha1NonResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withNonResourceURLs(instance.getNonResourceURLs());
        
        fluent.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1NonResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule instance) {
        this(instance,true);
    }

    public V1alpha1NonResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withNonResourceURLs(instance.getNonResourceURLs());
        
        this.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule build() {
        V1alpha1NonResourcePolicyRule buildable = new V1alpha1NonResourcePolicyRule();
        buildable.setNonResourceURLs(fluent.getNonResourceURLs());
        buildable.setVerbs(fluent.getVerbs());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1NonResourcePolicyRuleBuilder that = (V1alpha1NonResourcePolicyRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
