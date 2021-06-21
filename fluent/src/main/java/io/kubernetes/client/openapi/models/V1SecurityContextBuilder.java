package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1SecurityContextBuilder extends io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl<io.kubernetes.client.openapi.models.V1SecurityContextBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SecurityContext,io.kubernetes.client.openapi.models.V1SecurityContextBuilder> {

    io.kubernetes.client.openapi.models.V1SecurityContextFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1SecurityContextBuilder() {
        this(true);
    }

    public V1SecurityContextBuilder(java.lang.Boolean validationEnabled) {
        this(new V1SecurityContext(), validationEnabled);
    }

    public V1SecurityContextBuilder(io.kubernetes.client.openapi.models.V1SecurityContextFluent<?> fluent) {
        this(fluent, true);
    }

    public V1SecurityContextBuilder(io.kubernetes.client.openapi.models.V1SecurityContextFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1SecurityContext(), validationEnabled);
    }

    public V1SecurityContextBuilder(io.kubernetes.client.openapi.models.V1SecurityContextFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecurityContext instance) {
        this(fluent, instance, true);
    }

    public V1SecurityContextBuilder(io.kubernetes.client.openapi.models.V1SecurityContextFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecurityContext instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());
        
        fluent.withCapabilities(instance.getCapabilities());
        
        fluent.withPrivileged(instance.getPrivileged());
        
        fluent.withProcMount(instance.getProcMount());
        
        fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());
        
        fluent.withRunAsGroup(instance.getRunAsGroup());
        
        fluent.withRunAsNonRoot(instance.getRunAsNonRoot());
        
        fluent.withRunAsUser(instance.getRunAsUser());
        
        fluent.withSeLinuxOptions(instance.getSeLinuxOptions());
        
        fluent.withSeccompProfile(instance.getSeccompProfile());
        
        fluent.withWindowsOptions(instance.getWindowsOptions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1SecurityContextBuilder(io.kubernetes.client.openapi.models.V1SecurityContext instance) {
        this(instance,true);
    }

    public V1SecurityContextBuilder(io.kubernetes.client.openapi.models.V1SecurityContext instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());
        
        this.withCapabilities(instance.getCapabilities());
        
        this.withPrivileged(instance.getPrivileged());
        
        this.withProcMount(instance.getProcMount());
        
        this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());
        
        this.withRunAsGroup(instance.getRunAsGroup());
        
        this.withRunAsNonRoot(instance.getRunAsNonRoot());
        
        this.withRunAsUser(instance.getRunAsUser());
        
        this.withSeLinuxOptions(instance.getSeLinuxOptions());
        
        this.withSeccompProfile(instance.getSeccompProfile());
        
        this.withWindowsOptions(instance.getWindowsOptions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1SecurityContext build() {
        V1SecurityContext buildable = new V1SecurityContext();
        buildable.setAllowPrivilegeEscalation(fluent.getAllowPrivilegeEscalation());
        buildable.setCapabilities(fluent.getCapabilities());
        buildable.setPrivileged(fluent.getPrivileged());
        buildable.setProcMount(fluent.getProcMount());
        buildable.setReadOnlyRootFilesystem(fluent.getReadOnlyRootFilesystem());
        buildable.setRunAsGroup(fluent.getRunAsGroup());
        buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
        buildable.setRunAsUser(fluent.getRunAsUser());
        buildable.setSeLinuxOptions(fluent.getSeLinuxOptions());
        buildable.setSeccompProfile(fluent.getSeccompProfile());
        buildable.setWindowsOptions(fluent.getWindowsOptions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1SecurityContextBuilder that = (V1SecurityContextBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
