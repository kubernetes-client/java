package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1IngressTLSBuilder extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> {

    io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public NetworkingV1beta1IngressTLSBuilder() {
        this(true);
    }

    public NetworkingV1beta1IngressTLSBuilder(java.lang.Boolean validationEnabled) {
        this(new NetworkingV1beta1IngressTLS(), validationEnabled);
    }

    public NetworkingV1beta1IngressTLSBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSFluent<?> fluent) {
        this(fluent, true);
    }

    public NetworkingV1beta1IngressTLSBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new NetworkingV1beta1IngressTLS(), validationEnabled);
    }

    public NetworkingV1beta1IngressTLSBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS instance) {
        this(fluent, instance, true);
    }

    public NetworkingV1beta1IngressTLSBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withHosts(instance.getHosts());
        
        fluent.withSecretName(instance.getSecretName());
        
        this.validationEnabled = validationEnabled; 
    }

    public NetworkingV1beta1IngressTLSBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS instance) {
        this(instance,true);
    }

    public NetworkingV1beta1IngressTLSBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withHosts(instance.getHosts());
        
        this.withSecretName(instance.getSecretName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS build() {
        NetworkingV1beta1IngressTLS buildable = new NetworkingV1beta1IngressTLS();
        buildable.setHosts(fluent.getHosts());
        buildable.setSecretName(fluent.getSecretName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NetworkingV1beta1IngressTLSBuilder that = (NetworkingV1beta1IngressTLSBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
