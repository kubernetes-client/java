package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PodAntiAffinityBuilder extends io.kubernetes.client.openapi.models.V1PodAntiAffinityFluentImpl<io.kubernetes.client.openapi.models.V1PodAntiAffinityBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodAntiAffinity,io.kubernetes.client.openapi.models.V1PodAntiAffinityBuilder> {

    io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PodAntiAffinityBuilder() {
        this(true);
    }

    public V1PodAntiAffinityBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PodAntiAffinity(), validationEnabled);
    }

    public V1PodAntiAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PodAntiAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PodAntiAffinity(), validationEnabled);
    }

    public V1PodAntiAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodAntiAffinity instance) {
        this(fluent, instance, true);
    }

    public V1PodAntiAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodAntiAffinity instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());
        
        fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PodAntiAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAntiAffinity instance) {
        this(instance,true);
    }

    public V1PodAntiAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAntiAffinity instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());
        
        this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PodAntiAffinity build() {
        V1PodAntiAffinity buildable = new V1PodAntiAffinity();
        buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.getPreferredDuringSchedulingIgnoredDuringExecution());
        buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PodAntiAffinityBuilder that = (V1PodAntiAffinityBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
