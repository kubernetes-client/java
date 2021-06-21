package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1LeaseBuilder extends io.kubernetes.client.openapi.models.V1beta1LeaseFluentImpl<io.kubernetes.client.openapi.models.V1beta1LeaseBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1Lease,io.kubernetes.client.openapi.models.V1beta1LeaseBuilder> {

    io.kubernetes.client.openapi.models.V1beta1LeaseFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1LeaseBuilder() {
        this(true);
    }

    public V1beta1LeaseBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1Lease(), validationEnabled);
    }

    public V1beta1LeaseBuilder(io.kubernetes.client.openapi.models.V1beta1LeaseFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1LeaseBuilder(io.kubernetes.client.openapi.models.V1beta1LeaseFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1Lease(), validationEnabled);
    }

    public V1beta1LeaseBuilder(io.kubernetes.client.openapi.models.V1beta1LeaseFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1Lease instance) {
        this(fluent, instance, true);
    }

    public V1beta1LeaseBuilder(io.kubernetes.client.openapi.models.V1beta1LeaseFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1Lease instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1LeaseBuilder(io.kubernetes.client.openapi.models.V1beta1Lease instance) {
        this(instance,true);
    }

    public V1beta1LeaseBuilder(io.kubernetes.client.openapi.models.V1beta1Lease instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1Lease build() {
        V1beta1Lease buildable = new V1beta1Lease();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1LeaseBuilder that = (V1beta1LeaseBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
