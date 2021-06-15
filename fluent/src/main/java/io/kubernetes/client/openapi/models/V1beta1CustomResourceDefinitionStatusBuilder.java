package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceDefinitionStatusBuilder extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatus,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CustomResourceDefinitionStatusBuilder() {
        this(true);
    }

    public V1beta1CustomResourceDefinitionStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CustomResourceDefinitionStatus(), validationEnabled);
    }

    public V1beta1CustomResourceDefinitionStatusBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CustomResourceDefinitionStatusBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CustomResourceDefinitionStatus(), validationEnabled);
    }

    public V1beta1CustomResourceDefinitionStatusBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatus instance) {
        this(fluent, instance, true);
    }

    public V1beta1CustomResourceDefinitionStatusBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAcceptedNames(instance.getAcceptedNames());
        
        fluent.withConditions(instance.getConditions());
        
        fluent.withStoredVersions(instance.getStoredVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CustomResourceDefinitionStatusBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatus instance) {
        this(instance,true);
    }

    public V1beta1CustomResourceDefinitionStatusBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAcceptedNames(instance.getAcceptedNames());
        
        this.withConditions(instance.getConditions());
        
        this.withStoredVersions(instance.getStoredVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatus build() {
        V1beta1CustomResourceDefinitionStatus buildable = new V1beta1CustomResourceDefinitionStatus();
        buildable.setAcceptedNames(fluent.getAcceptedNames());
        buildable.setConditions(fluent.getConditions());
        buildable.setStoredVersions(fluent.getStoredVersions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CustomResourceDefinitionStatusBuilder that = (V1beta1CustomResourceDefinitionStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
