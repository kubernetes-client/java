package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1IngressBackendBuilder extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder> {

    io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public NetworkingV1beta1IngressBackendBuilder() {
        this(true);
    }

    public NetworkingV1beta1IngressBackendBuilder(java.lang.Boolean validationEnabled) {
        this(new NetworkingV1beta1IngressBackend(), validationEnabled);
    }

    public NetworkingV1beta1IngressBackendBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent<?> fluent) {
        this(fluent, true);
    }

    public NetworkingV1beta1IngressBackendBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new NetworkingV1beta1IngressBackend(), validationEnabled);
    }

    public NetworkingV1beta1IngressBackendBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend instance) {
        this(fluent, instance, true);
    }

    public NetworkingV1beta1IngressBackendBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withResource(instance.getResource());
        
        fluent.withServiceName(instance.getServiceName());
        
        fluent.withServicePort(instance.getServicePort());
        
        this.validationEnabled = validationEnabled; 
    }

    public NetworkingV1beta1IngressBackendBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend instance) {
        this(instance,true);
    }

    public NetworkingV1beta1IngressBackendBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withResource(instance.getResource());
        
        this.withServiceName(instance.getServiceName());
        
        this.withServicePort(instance.getServicePort());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend build() {
        NetworkingV1beta1IngressBackend buildable = new NetworkingV1beta1IngressBackend();
        buildable.setResource(fluent.getResource());
        buildable.setServiceName(fluent.getServiceName());
        buildable.setServicePort(fluent.getServicePort());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NetworkingV1beta1IngressBackendBuilder that = (NetworkingV1beta1IngressBackendBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
