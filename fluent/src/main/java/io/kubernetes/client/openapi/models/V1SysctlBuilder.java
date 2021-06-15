package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1SysctlBuilder extends io.kubernetes.client.openapi.models.V1SysctlFluentImpl<io.kubernetes.client.openapi.models.V1SysctlBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Sysctl,io.kubernetes.client.openapi.models.V1SysctlBuilder> {

    io.kubernetes.client.openapi.models.V1SysctlFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1SysctlBuilder() {
        this(true);
    }

    public V1SysctlBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Sysctl(), validationEnabled);
    }

    public V1SysctlBuilder(io.kubernetes.client.openapi.models.V1SysctlFluent<?> fluent) {
        this(fluent, true);
    }

    public V1SysctlBuilder(io.kubernetes.client.openapi.models.V1SysctlFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Sysctl(), validationEnabled);
    }

    public V1SysctlBuilder(io.kubernetes.client.openapi.models.V1SysctlFluent<?> fluent,io.kubernetes.client.openapi.models.V1Sysctl instance) {
        this(fluent, instance, true);
    }

    public V1SysctlBuilder(io.kubernetes.client.openapi.models.V1SysctlFluent<?> fluent,io.kubernetes.client.openapi.models.V1Sysctl instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1SysctlBuilder(io.kubernetes.client.openapi.models.V1Sysctl instance) {
        this(instance,true);
    }

    public V1SysctlBuilder(io.kubernetes.client.openapi.models.V1Sysctl instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Sysctl build() {
        V1Sysctl buildable = new V1Sysctl();
        buildable.setName(fluent.getName());
        buildable.setValue(fluent.getValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1SysctlBuilder that = (V1SysctlBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
