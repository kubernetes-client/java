package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1APIVersionsBuilder extends io.kubernetes.client.openapi.models.V1APIVersionsFluentImpl<io.kubernetes.client.openapi.models.V1APIVersionsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1APIVersions,io.kubernetes.client.openapi.models.V1APIVersionsBuilder> {

    io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1APIVersionsBuilder() {
        this(true);
    }

    public V1APIVersionsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1APIVersions(), validationEnabled);
    }

    public V1APIVersionsBuilder(io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1APIVersionsBuilder(io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1APIVersions(), validationEnabled);
    }

    public V1APIVersionsBuilder(io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIVersions instance) {
        this(fluent, instance, true);
    }

    public V1APIVersionsBuilder(io.kubernetes.client.openapi.models.V1APIVersionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIVersions instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());
        
        fluent.withVersions(instance.getVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1APIVersionsBuilder(io.kubernetes.client.openapi.models.V1APIVersions instance) {
        this(instance,true);
    }

    public V1APIVersionsBuilder(io.kubernetes.client.openapi.models.V1APIVersions instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());
        
        this.withVersions(instance.getVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1APIVersions build() {
        V1APIVersions buildable = new V1APIVersions();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setServerAddressByClientCIDRs(fluent.getServerAddressByClientCIDRs());
        buildable.setVersions(fluent.getVersions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1APIVersionsBuilder that = (V1APIVersionsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
