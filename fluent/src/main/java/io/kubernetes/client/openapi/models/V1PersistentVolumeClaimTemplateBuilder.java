package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PersistentVolumeClaimTemplateBuilder extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluentImpl<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateBuilder> {

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PersistentVolumeClaimTemplateBuilder() {
        this(true);
    }

    public V1PersistentVolumeClaimTemplateBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PersistentVolumeClaimTemplate(), validationEnabled);
    }

    public V1PersistentVolumeClaimTemplateBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PersistentVolumeClaimTemplateBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PersistentVolumeClaimTemplate(), validationEnabled);
    }

    public V1PersistentVolumeClaimTemplateBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate instance) {
        this(fluent, instance, true);
    }

    public V1PersistentVolumeClaimTemplateBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PersistentVolumeClaimTemplateBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate instance) {
        this(instance,true);
    }

    public V1PersistentVolumeClaimTemplateBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate build() {
        V1PersistentVolumeClaimTemplate buildable = new V1PersistentVolumeClaimTemplate();
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PersistentVolumeClaimTemplateBuilder that = (V1PersistentVolumeClaimTemplateBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
