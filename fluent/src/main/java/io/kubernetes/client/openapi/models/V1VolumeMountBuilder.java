package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1VolumeMountBuilder extends io.kubernetes.client.openapi.models.V1VolumeMountFluentImpl<io.kubernetes.client.openapi.models.V1VolumeMountBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1VolumeMount,io.kubernetes.client.openapi.models.V1VolumeMountBuilder> {

    io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1VolumeMountBuilder() {
        this(true);
    }

    public V1VolumeMountBuilder(java.lang.Boolean validationEnabled) {
        this(new V1VolumeMount(), validationEnabled);
    }

    public V1VolumeMountBuilder(io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent) {
        this(fluent, true);
    }

    public V1VolumeMountBuilder(io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1VolumeMount(), validationEnabled);
    }

    public V1VolumeMountBuilder(io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeMount instance) {
        this(fluent, instance, true);
    }

    public V1VolumeMountBuilder(io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeMount instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMountPath(instance.getMountPath());
        
        fluent.withMountPropagation(instance.getMountPropagation());
        
        fluent.withName(instance.getName());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withSubPath(instance.getSubPath());
        
        fluent.withSubPathExpr(instance.getSubPathExpr());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1VolumeMountBuilder(io.kubernetes.client.openapi.models.V1VolumeMount instance) {
        this(instance,true);
    }

    public V1VolumeMountBuilder(io.kubernetes.client.openapi.models.V1VolumeMount instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMountPath(instance.getMountPath());
        
        this.withMountPropagation(instance.getMountPropagation());
        
        this.withName(instance.getName());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withSubPath(instance.getSubPath());
        
        this.withSubPathExpr(instance.getSubPathExpr());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1VolumeMount build() {
        V1VolumeMount buildable = new V1VolumeMount();
        buildable.setMountPath(fluent.getMountPath());
        buildable.setMountPropagation(fluent.getMountPropagation());
        buildable.setName(fluent.getName());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setSubPath(fluent.getSubPath());
        buildable.setSubPathExpr(fluent.getSubPathExpr());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1VolumeMountBuilder that = (V1VolumeMountBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
