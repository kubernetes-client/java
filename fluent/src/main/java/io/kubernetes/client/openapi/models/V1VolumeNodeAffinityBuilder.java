package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1VolumeNodeAffinityBuilder extends io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluentImpl<io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1VolumeNodeAffinity,io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder> {

    io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1VolumeNodeAffinityBuilder() {
        this(true);
    }

    public V1VolumeNodeAffinityBuilder(java.lang.Boolean validationEnabled) {
        this(new V1VolumeNodeAffinity(), validationEnabled);
    }

    public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent) {
        this(fluent, true);
    }

    public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1VolumeNodeAffinity(), validationEnabled);
    }

    public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance) {
        this(fluent, instance, true);
    }

    public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withRequired(instance.getRequired());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance) {
        this(instance,true);
    }

    public V1VolumeNodeAffinityBuilder(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withRequired(instance.getRequired());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinity build() {
        V1VolumeNodeAffinity buildable = new V1VolumeNodeAffinity();
        buildable.setRequired(fluent.getRequired());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1VolumeNodeAffinityBuilder that = (V1VolumeNodeAffinityBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
