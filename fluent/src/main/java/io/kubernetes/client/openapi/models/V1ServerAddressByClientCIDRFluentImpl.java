package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ServerAddressByClientCIDRFluentImpl<A extends io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<A> {

    private java.lang.String clientCIDR;
    private java.lang.String serverAddress;

    public V1ServerAddressByClientCIDRFluentImpl() {
    }

    public V1ServerAddressByClientCIDRFluentImpl(io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR instance) {
        this.withClientCIDR(instance.getClientCIDR());
        
        this.withServerAddress(instance.getServerAddress());
    }

    public java.lang.String getClientCIDR() {
        return this.clientCIDR;
    }

    public A withClientCIDR(java.lang.String clientCIDR) {
        this.clientCIDR=clientCIDR; return (A) this;
    }

    public java.lang.Boolean hasClientCIDR() {
        return this.clientCIDR != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withClientCIDR instead.
     */
        public A withNewClientCIDR(java.lang.String original) {
        return (A)withClientCIDR(new String(original));
    }

    public java.lang.String getServerAddress() {
        return this.serverAddress;
    }

    public A withServerAddress(java.lang.String serverAddress) {
        this.serverAddress=serverAddress; return (A) this;
    }

    public java.lang.Boolean hasServerAddress() {
        return this.serverAddress != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withServerAddress instead.
     */
        public A withNewServerAddress(java.lang.String original) {
        return (A)withServerAddress(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ServerAddressByClientCIDRFluentImpl that = (V1ServerAddressByClientCIDRFluentImpl) o;
        if (clientCIDR != null ? !clientCIDR.equals(that.clientCIDR) :that.clientCIDR != null) return false;
        if (serverAddress != null ? !serverAddress.equals(that.serverAddress) :that.serverAddress != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(clientCIDR,  serverAddress,  super.hashCode());
    }

}
