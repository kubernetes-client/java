package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1NodeDaemonEndpointsFluentImpl<A extends io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<A> {

    private io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder kubeletEndpoint;

    public V1NodeDaemonEndpointsFluentImpl() {
    }

    public V1NodeDaemonEndpointsFluentImpl(io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints instance) {
        this.withKubeletEndpoint(instance.getKubeletEndpoint());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildKubeletEndpoint instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1DaemonEndpoint getKubeletEndpoint() {
        return this.kubeletEndpoint!=null?this.kubeletEndpoint.build():null;
    }

    public io.kubernetes.client.openapi.models.V1DaemonEndpoint buildKubeletEndpoint() {
        return this.kubeletEndpoint!=null?this.kubeletEndpoint.build():null;
    }

    public A withKubeletEndpoint(io.kubernetes.client.openapi.models.V1DaemonEndpoint kubeletEndpoint) {
        _visitables.get("kubeletEndpoint").remove(this.kubeletEndpoint);
        if (kubeletEndpoint!=null){ this.kubeletEndpoint= new io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder(kubeletEndpoint); _visitables.get("kubeletEndpoint").add(this.kubeletEndpoint);} return (A) this;
    }

    public java.lang.Boolean hasKubeletEndpoint() {
        return this.kubeletEndpoint != null;
    }

    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpoint() {
        return new io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluentImpl.KubeletEndpointNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpointLike(io.kubernetes.client.openapi.models.V1DaemonEndpoint item) {
        return new io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluentImpl.KubeletEndpointNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editKubeletEndpoint() {
        return withNewKubeletEndpointLike(getKubeletEndpoint());
    }

    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpoint() {
        return withNewKubeletEndpointLike(getKubeletEndpoint() != null ? getKubeletEndpoint(): new io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpointLike(io.kubernetes.client.openapi.models.V1DaemonEndpoint item) {
        return withNewKubeletEndpointLike(getKubeletEndpoint() != null ? getKubeletEndpoint(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1NodeDaemonEndpointsFluentImpl that = (V1NodeDaemonEndpointsFluentImpl) o;
        if (kubeletEndpoint != null ? !kubeletEndpoint.equals(that.kubeletEndpoint) :that.kubeletEndpoint != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(kubeletEndpoint,  super.hashCode());
    }

    public class KubeletEndpointNestedImpl<N> extends io.kubernetes.client.openapi.models.V1DaemonEndpointFluentImpl<io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<N>> implements io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder builder;

            KubeletEndpointNestedImpl(io.kubernetes.client.openapi.models.V1DaemonEndpoint item) {
                this.builder = new io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder(this, item);
                        
            }

            KubeletEndpointNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder(this);
                        
            }

            public N and() {
                return (N) V1NodeDaemonEndpointsFluentImpl.this.withKubeletEndpoint(builder.build());
            }

            public N endKubeletEndpoint() {
                return and();
            }
    }


}
