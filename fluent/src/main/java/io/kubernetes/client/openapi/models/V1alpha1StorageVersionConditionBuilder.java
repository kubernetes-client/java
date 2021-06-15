package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1StorageVersionConditionBuilder extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionFluentImpl<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition,io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1StorageVersionConditionBuilder() {
        this(true);
    }

    public V1alpha1StorageVersionConditionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1StorageVersionCondition(), validationEnabled);
    }

    public V1alpha1StorageVersionConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1StorageVersionConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1StorageVersionCondition(), validationEnabled);
    }

    public V1alpha1StorageVersionConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition instance) {
        this(fluent, instance, true);
    }

    public V1alpha1StorageVersionConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLastTransitionTime(instance.getLastTransitionTime());
        
        fluent.withMessage(instance.getMessage());
        
        fluent.withObservedGeneration(instance.getObservedGeneration());
        
        fluent.withReason(instance.getReason());
        
        fluent.withStatus(instance.getStatus());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1StorageVersionConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition instance) {
        this(instance,true);
    }

    public V1alpha1StorageVersionConditionBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLastTransitionTime(instance.getLastTransitionTime());
        
        this.withMessage(instance.getMessage());
        
        this.withObservedGeneration(instance.getObservedGeneration());
        
        this.withReason(instance.getReason());
        
        this.withStatus(instance.getStatus());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition build() {
        V1alpha1StorageVersionCondition buildable = new V1alpha1StorageVersionCondition();
        buildable.setLastTransitionTime(fluent.getLastTransitionTime());
        buildable.setMessage(fluent.getMessage());
        buildable.setObservedGeneration(fluent.getObservedGeneration());
        buildable.setReason(fluent.getReason());
        buildable.setStatus(fluent.getStatus());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1StorageVersionConditionBuilder that = (V1alpha1StorageVersionConditionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
