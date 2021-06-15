package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1NodeAddressFluentImpl<A extends io.kubernetes.client.openapi.models.V1NodeAddressFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1NodeAddressFluent<A> {

    private java.lang.String address;
    private java.lang.String type;

    public V1NodeAddressFluentImpl() {
    }

    public V1NodeAddressFluentImpl(io.kubernetes.client.openapi.models.V1NodeAddress instance) {
        this.withAddress(instance.getAddress());
        
        this.withType(instance.getType());
    }

    public java.lang.String getAddress() {
        return this.address;
    }

    public A withAddress(java.lang.String address) {
        this.address=address; return (A) this;
    }

    public java.lang.Boolean hasAddress() {
        return this.address != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAddress instead.
     */
        public A withNewAddress(java.lang.String original) {
        return (A)withAddress(new String(original));
    }

    public java.lang.String getType() {
        return this.type;
    }

    public A withType(java.lang.String type) {
        this.type=type; return (A) this;
    }

    public java.lang.Boolean hasType() {
        return this.type != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original) {
        return (A)withType(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1NodeAddressFluentImpl that = (V1NodeAddressFluentImpl) o;
        if (address != null ? !address.equals(that.address) :that.address != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(address,  type,  super.hashCode());
    }

}
