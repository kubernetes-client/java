package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1StorageVersionStatusBuilder extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl<io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus,io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1StorageVersionStatusBuilder() {
        this(true);
    }

    public V1alpha1StorageVersionStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1StorageVersionStatus(), validationEnabled);
    }

    public V1alpha1StorageVersionStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1StorageVersionStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1StorageVersionStatus(), validationEnabled);
    }

    public V1alpha1StorageVersionStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance) {
        this(fluent, instance, true);
    }

    public V1alpha1StorageVersionStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCommonEncodingVersion(instance.getCommonEncodingVersion());
        
        fluent.withConditions(instance.getConditions());
        
        fluent.withStorageVersions(instance.getStorageVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1StorageVersionStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance) {
        this(instance,true);
    }

    public V1alpha1StorageVersionStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCommonEncodingVersion(instance.getCommonEncodingVersion());
        
        this.withConditions(instance.getConditions());
        
        this.withStorageVersions(instance.getStorageVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus build() {
        V1alpha1StorageVersionStatus buildable = new V1alpha1StorageVersionStatus();
        buildable.setCommonEncodingVersion(fluent.getCommonEncodingVersion());
        buildable.setConditions(fluent.getConditions());
        buildable.setStorageVersions(fluent.getStorageVersions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1StorageVersionStatusBuilder that = (V1alpha1StorageVersionStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
