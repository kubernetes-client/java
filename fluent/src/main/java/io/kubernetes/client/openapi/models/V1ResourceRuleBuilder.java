package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ResourceRuleBuilder extends io.kubernetes.client.openapi.models.V1ResourceRuleFluentImpl<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ResourceRule,io.kubernetes.client.openapi.models.V1ResourceRuleBuilder> {

    io.kubernetes.client.openapi.models.V1ResourceRuleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ResourceRuleBuilder() {
        this(true);
    }

    public V1ResourceRuleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ResourceRule(), validationEnabled);
    }

    public V1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1ResourceRuleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1ResourceRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ResourceRule(), validationEnabled);
    }

    public V1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1ResourceRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1ResourceRule instance) {
        this(fluent, instance, true);
    }

    public V1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1ResourceRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1ResourceRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiGroups(instance.getApiGroups());
        
        fluent.withResourceNames(instance.getResourceNames());
        
        fluent.withResources(instance.getResources());
        
        fluent.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1ResourceRule instance) {
        this(instance,true);
    }

    public V1ResourceRuleBuilder(io.kubernetes.client.openapi.models.V1ResourceRule instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiGroups(instance.getApiGroups());
        
        this.withResourceNames(instance.getResourceNames());
        
        this.withResources(instance.getResources());
        
        this.withVerbs(instance.getVerbs());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ResourceRule build() {
        V1ResourceRule buildable = new V1ResourceRule();
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
        V1ResourceRuleBuilder that = (V1ResourceRuleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
