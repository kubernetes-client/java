package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PersistentVolumeClaimStatusBuilder extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluentImpl<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusBuilder> {

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PersistentVolumeClaimStatusBuilder() {
        this(true);
    }

    public V1PersistentVolumeClaimStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PersistentVolumeClaimStatus(), validationEnabled);
    }

    public V1PersistentVolumeClaimStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PersistentVolumeClaimStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PersistentVolumeClaimStatus(), validationEnabled);
    }

    public V1PersistentVolumeClaimStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance) {
        this(fluent, instance, true);
    }

    public V1PersistentVolumeClaimStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAccessModes(instance.getAccessModes());
        
        fluent.withCapacity(instance.getCapacity());
        
        fluent.withConditions(instance.getConditions());
        
        fluent.withPhase(instance.getPhase());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PersistentVolumeClaimStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance) {
        this(instance,true);
    }

    public V1PersistentVolumeClaimStatusBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAccessModes(instance.getAccessModes());
        
        this.withCapacity(instance.getCapacity());
        
        this.withConditions(instance.getConditions());
        
        this.withPhase(instance.getPhase());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus build() {
        V1PersistentVolumeClaimStatus buildable = new V1PersistentVolumeClaimStatus();
        buildable.setAccessModes(fluent.getAccessModes());
        buildable.setCapacity(fluent.getCapacity());
        buildable.setConditions(fluent.getConditions());
        buildable.setPhase(fluent.getPhase());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PersistentVolumeClaimStatusBuilder that = (V1PersistentVolumeClaimStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
