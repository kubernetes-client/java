package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1HTTPIngressPathBuilder extends io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath,io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder> {

    io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public NetworkingV1beta1HTTPIngressPathBuilder() {
        this(true);
    }

    public NetworkingV1beta1HTTPIngressPathBuilder(java.lang.Boolean validationEnabled) {
        this(new NetworkingV1beta1HTTPIngressPath(), validationEnabled);
    }

    public NetworkingV1beta1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent<?> fluent) {
        this(fluent, true);
    }

    public NetworkingV1beta1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new NetworkingV1beta1HTTPIngressPath(), validationEnabled);
    }

    public NetworkingV1beta1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath instance) {
        this(fluent, instance, true);
    }

    public NetworkingV1beta1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withBackend(instance.getBackend());
        
        fluent.withPath(instance.getPath());
        
        fluent.withPathType(instance.getPathType());
        
        this.validationEnabled = validationEnabled; 
    }

    public NetworkingV1beta1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath instance) {
        this(instance,true);
    }

    public NetworkingV1beta1HTTPIngressPathBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withBackend(instance.getBackend());
        
        this.withPath(instance.getPath());
        
        this.withPathType(instance.getPathType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath build() {
        NetworkingV1beta1HTTPIngressPath buildable = new NetworkingV1beta1HTTPIngressPath();
        buildable.setBackend(fluent.getBackend());
        buildable.setPath(fluent.getPath());
        buildable.setPathType(fluent.getPathType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NetworkingV1beta1HTTPIngressPathBuilder that = (NetworkingV1beta1HTTPIngressPathBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
