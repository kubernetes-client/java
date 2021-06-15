package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1PortStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1PortStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PortStatusFluent<A> {

    private java.lang.String error;
    private java.lang.Integer port;
    private java.lang.String protocol;

    public V1PortStatusFluentImpl() {
    }

    public V1PortStatusFluentImpl(io.kubernetes.client.openapi.models.V1PortStatus instance) {
        this.withError(instance.getError());
        
        this.withPort(instance.getPort());
        
        this.withProtocol(instance.getProtocol());
    }

    public java.lang.String getError() {
        return this.error;
    }

    public A withError(java.lang.String error) {
        this.error=error; return (A) this;
    }

    public java.lang.Boolean hasError() {
        return this.error != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withError instead.
     */
        public A withNewError(java.lang.String original) {
        return (A)withError(new String(original));
    }

    public java.lang.Integer getPort() {
        return this.port;
    }

    public A withPort(java.lang.Integer port) {
        this.port=port; return (A) this;
    }

    public java.lang.Boolean hasPort() {
        return this.port != null;
    }

    public java.lang.String getProtocol() {
        return this.protocol;
    }

    public A withProtocol(java.lang.String protocol) {
        this.protocol=protocol; return (A) this;
    }

    public java.lang.Boolean hasProtocol() {
        return this.protocol != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withProtocol instead.
     */
        public A withNewProtocol(java.lang.String original) {
        return (A)withProtocol(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PortStatusFluentImpl that = (V1PortStatusFluentImpl) o;
        if (error != null ? !error.equals(that.error) :that.error != null) return false;
        if (port != null ? !port.equals(that.port) :that.port != null) return false;
        if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(error,  port,  protocol,  super.hashCode());
    }

}
