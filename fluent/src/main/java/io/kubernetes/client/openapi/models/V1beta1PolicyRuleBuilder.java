package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1PolicyRuleBuilder extends io.kubernetes.client.openapi.models.V1beta1PolicyRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1PolicyRule,io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> {

    io.kubernetes.client.openapi.models.V1beta1PolicyRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1PolicyRuleBuilder() {
        this(true);
    }

    public V1beta1PolicyRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1PolicyRule(), validationEnabled);
    }

    public V1beta1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta1PolicyRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta1PolicyRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1PolicyRule(), validationEnabled);
    }

    public V1beta1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta1PolicyRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PolicyRule instance) {
        this(fluent, instance, true);
    }

    public V1beta1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta1PolicyRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PolicyRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiGroups(instance.getApiGroups());
        
        fluent.withNonResourceURLs(instance.getNonResourceURLs());
        
        fluent.withResourceNames(instance.getResourceNames());
        
        fluent.withResources(instance.getResources());
        
        fluent.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta1PolicyRule instance) {
        this(instance,true);
    }

    public V1beta1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta1PolicyRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiGroups(instance.getApiGroups());
        
        this.withNonResourceURLs(instance.getNonResourceURLs());
        
        this.withResourceNames(instance.getResourceNames());
        
        this.withResources(instance.getResources());
        
        this.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1PolicyRule build() {
        V1beta1PolicyRule buildable = new V1beta1PolicyRule();
        buildable.setApiGroups(fluent.getApiGroups());
        buildable.setNonResourceURLs(fluent.getNonResourceURLs());
        buildable.setResourceNames(fluent.getResourceNames());
        buildable.setResources(fluent.getResources());
        buildable.setVerbs(fluent.getVerbs());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1PolicyRuleBuilder that = (V1beta1PolicyRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
