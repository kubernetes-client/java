package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1ResourceRuleBuilder extends io.kubernetes.client.openapi.models.V1beta1ResourceRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1ResourceRule,io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder> {

    io.kubernetes.client.openapi.models.V1beta1ResourceRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1ResourceRuleBuilder() {
        this(true);
    }

    public V1beta1ResourceRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1ResourceRule(), validationEnabled);
    }

    public V1beta1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1ResourceRule(), validationEnabled);
    }

    public V1beta1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ResourceRule instance) {
        this(fluent, instance, true);
    }

    public V1beta1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ResourceRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiGroups(instance.getApiGroups());
        
        fluent.withResourceNames(instance.getResourceNames());
        
        fluent.withResources(instance.getResources());
        
        fluent.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceRule instance) {
        this(instance,true);
    }

    public V1beta1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiGroups(instance.getApiGroups());
        
        this.withResourceNames(instance.getResourceNames());
        
        this.withResources(instance.getResources());
        
        this.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1ResourceRule build() {
        V1beta1ResourceRule buildable = new V1beta1ResourceRule();
        buildable.setApiGroups(fluent.getApiGroups());
        buildable.setResourceNames(fluent.getResourceNames());
        buildable.setResources(fluent.getResources());
        buildable.setVerbs(fluent.getVerbs());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1ResourceRuleBuilder that = (V1beta1ResourceRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
