package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1IngressServiceBackendFluentImpl<A extends io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<A> {

    private java.lang.String name;
    private io.kubernetes.client.openapi.models.V1ServiceBackendPortBuilder port;

    public V1IngressServiceBackendFluentImpl() {
    }

    public V1IngressServiceBackendFluentImpl(io.kubernetes.client.openapi.models.V1IngressServiceBackend instance) {
        this.withName(instance.getName());
        
        this.withPort(instance.getPort());
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPort instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ServiceBackendPort getPort() {
        return this.port!=null?this.port.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ServiceBackendPort buildPort() {
        return this.port!=null?this.port.build():null;
    }

    public A withPort(io.kubernetes.client.openapi.models.V1ServiceBackendPort port) {
        _visitables.get("port").remove(this.port);
        if (port!=null){ this.port= new io.kubernetes.client.openapi.models.V1ServiceBackendPortBuilder(port); _visitables.get("port").add(this.port);} return (A) this;
    }

    public java.lang.Boolean hasPort() {
        return this.port != null;
    }

    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> withNewPort() {
        return new io.kubernetes.client.openapi.models.V1IngressServiceBackendFluentImpl.PortNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> withNewPortLike(io.kubernetes.client.openapi.models.V1ServiceBackendPort item) {
        return new io.kubernetes.client.openapi.models.V1IngressServiceBackendFluentImpl.PortNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editPort() {
        return withNewPortLike(getPort());
    }

    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editOrNewPort() {
        return withNewPortLike(getPort() != null ? getPort(): new io.kubernetes.client.openapi.models.V1ServiceBackendPortBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editOrNewPortLike(io.kubernetes.client.openapi.models.V1ServiceBackendPort item) {
        return withNewPortLike(getPort() != null ? getPort(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1IngressServiceBackendFluentImpl that = (V1IngressServiceBackendFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (port != null ? !port.equals(that.port) :that.port != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  port,  super.hashCode());
    }

    public class PortNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ServiceBackendPortFluentImpl<io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<N>> implements io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ServiceBackendPortBuilder builder;

            PortNestedImpl(io.kubernetes.client.openapi.models.V1ServiceBackendPort item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ServiceBackendPortBuilder(this, item);
                        
            }

            PortNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ServiceBackendPortBuilder(this);
                        
            }

            public N and() {
                return (N) V1IngressServiceBackendFluentImpl.this.withPort(builder.build());
            }

            public N endPort() {
                return and();
            }
    }


}
