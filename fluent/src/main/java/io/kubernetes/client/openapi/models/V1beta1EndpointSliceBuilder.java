package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1EndpointSliceBuilder extends io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluentImpl<io.kubernetes.client.openapi.models.V1beta1EndpointSliceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1EndpointSlice,io.kubernetes.client.openapi.models.V1beta1EndpointSliceBuilder> {

    io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1EndpointSliceBuilder() {
        this(true);
    }

    public V1beta1EndpointSliceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1EndpointSlice(), validationEnabled);
    }

    public V1beta1EndpointSliceBuilder(io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1EndpointSliceBuilder(io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1EndpointSlice(), validationEnabled);
    }

    public V1beta1EndpointSliceBuilder(io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1EndpointSlice instance) {
        this(fluent, instance, true);
    }

    public V1beta1EndpointSliceBuilder(io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1EndpointSlice instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAddressType(instance.getAddressType());
        
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withEndpoints(instance.getEndpoints());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withPorts(instance.getPorts());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1EndpointSliceBuilder(io.kubernetes.client.openapi.models.V1beta1EndpointSlice instance) {
        this(instance,true);
    }

    public V1beta1EndpointSliceBuilder(io.kubernetes.client.openapi.models.V1beta1EndpointSlice instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAddressType(instance.getAddressType());
        
        this.withApiVersion(instance.getApiVersion());
        
        this.withEndpoints(instance.getEndpoints());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withPorts(instance.getPorts());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1EndpointSlice build() {
        V1beta1EndpointSlice buildable = new V1beta1EndpointSlice();
        buildable.setAddressType(fluent.getAddressType());
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setEndpoints(fluent.getEndpoints());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setPorts(fluent.getPorts());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1EndpointSliceBuilder that = (V1beta1EndpointSliceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
