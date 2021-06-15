package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1RuleWithOperationsBuilder extends io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsFluentImpl<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1RuleWithOperations,io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder> {

    io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1RuleWithOperationsBuilder() {
        this(true);
    }

    public V1beta1RuleWithOperationsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1RuleWithOperations(), validationEnabled);
    }

    public V1beta1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1RuleWithOperations(), validationEnabled);
    }

    public V1beta1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1RuleWithOperations instance) {
        this(fluent, instance, true);
    }

    public V1beta1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1RuleWithOperations instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiGroups(instance.getApiGroups());
        
        fluent.withApiVersions(instance.getApiVersions());
        
        fluent.withOperations(instance.getOperations());
        
        fluent.withResources(instance.getResources());
        
        fluent.withScope(instance.getScope());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1beta1RuleWithOperations instance) {
        this(instance,true);
    }

    public V1beta1RuleWithOperationsBuilder(io.kubernetes.client.openapi.models.V1beta1RuleWithOperations instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiGroups(instance.getApiGroups());
        
        this.withApiVersions(instance.getApiVersions());
        
        this.withOperations(instance.getOperations());
        
        this.withResources(instance.getResources());
        
        this.withScope(instance.getScope());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1RuleWithOperations build() {
        V1beta1RuleWithOperations buildable = new V1beta1RuleWithOperations();
        buildable.setApiGroups(fluent.getApiGroups());
        buildable.setApiVersions(fluent.getApiVersions());
        buildable.setOperations(fluent.getOperations());
        buildable.setResources(fluent.getResources());
        buildable.setScope(fluent.getScope());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1RuleWithOperationsBuilder that = (V1beta1RuleWithOperationsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
