package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1IngressBuilder extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.NetworkingV1beta1Ingress,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBuilder> {

    io.kubernetes.client.openapi.models.NetworkingV1beta1IngressFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public NetworkingV1beta1IngressBuilder() {
        this(true);
    }

    public NetworkingV1beta1IngressBuilder(java.lang.Boolean validationEnabled) {
        this(new NetworkingV1beta1Ingress(), validationEnabled);
    }

    public NetworkingV1beta1IngressBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressFluent<?> fluent) {
        this(fluent, true);
    }

    public NetworkingV1beta1IngressBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new NetworkingV1beta1Ingress(), validationEnabled);
    }

    public NetworkingV1beta1IngressBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1Ingress instance) {
        this(fluent, instance, true);
    }

    public NetworkingV1beta1IngressBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1Ingress instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        fluent.withStatus(instance.getStatus());
        
        this.validationEnabled = validationEnabled; 
    }

    public NetworkingV1beta1IngressBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1Ingress instance) {
        this(instance,true);
    }

    public NetworkingV1beta1IngressBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1Ingress instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.withStatus(instance.getStatus());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1Ingress build() {
        NetworkingV1beta1Ingress buildable = new NetworkingV1beta1Ingress();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        buildable.setStatus(fluent.getStatus());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NetworkingV1beta1IngressBuilder that = (NetworkingV1beta1IngressBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
