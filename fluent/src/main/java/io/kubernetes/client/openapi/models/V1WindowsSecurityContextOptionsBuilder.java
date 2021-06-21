package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1WindowsSecurityContextOptionsBuilder extends io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluentImpl<io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions,io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder> {

    io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1WindowsSecurityContextOptionsBuilder() {
        this(true);
    }

    public V1WindowsSecurityContextOptionsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1WindowsSecurityContextOptions(), validationEnabled);
    }

    public V1WindowsSecurityContextOptionsBuilder(io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1WindowsSecurityContextOptionsBuilder(io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1WindowsSecurityContextOptions(), validationEnabled);
    }

    public V1WindowsSecurityContextOptionsBuilder(io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions instance) {
        this(fluent, instance, true);
    }

    public V1WindowsSecurityContextOptionsBuilder(io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());
        
        fluent.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());
        
        fluent.withRunAsUserName(instance.getRunAsUserName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1WindowsSecurityContextOptionsBuilder(io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions instance) {
        this(instance,true);
    }

    public V1WindowsSecurityContextOptionsBuilder(io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());
        
        this.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());
        
        this.withRunAsUserName(instance.getRunAsUserName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions build() {
        V1WindowsSecurityContextOptions buildable = new V1WindowsSecurityContextOptions();
        buildable.setGmsaCredentialSpec(fluent.getGmsaCredentialSpec());
        buildable.setGmsaCredentialSpecName(fluent.getGmsaCredentialSpecName());
        buildable.setRunAsUserName(fluent.getRunAsUserName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1WindowsSecurityContextOptionsBuilder that = (V1WindowsSecurityContextOptionsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
