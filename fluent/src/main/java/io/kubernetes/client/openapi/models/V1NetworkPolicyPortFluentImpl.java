package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1NetworkPolicyPortFluentImpl<A extends io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<A> {

    private io.kubernetes.client.custom.IntOrString port;
    private java.lang.String protocol;

    public V1NetworkPolicyPortFluentImpl() {
    }

    public V1NetworkPolicyPortFluentImpl(io.kubernetes.client.openapi.models.V1NetworkPolicyPort instance) {
        this.withPort(instance.getPort());
        
        this.withProtocol(instance.getProtocol());
    }

    public io.kubernetes.client.custom.IntOrString getPort() {
        return this.port;
    }

    public A withPort(io.kubernetes.client.custom.IntOrString port) {
        this.port=port; return (A) this;
    }

    public java.lang.Boolean hasPort() {
        return this.port != null;
    }

    public A withNewPort(int value) {
        return (A)withPort(new IntOrString(value));
    }

    public A withNewPort(java.lang.String value) {
        return (A)withPort(new IntOrString(value));
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
        V1NetworkPolicyPortFluentImpl that = (V1NetworkPolicyPortFluentImpl) o;
        if (port != null ? !port.equals(that.port) :that.port != null) return false;
        if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(port,  protocol,  super.hashCode());
    }

}
