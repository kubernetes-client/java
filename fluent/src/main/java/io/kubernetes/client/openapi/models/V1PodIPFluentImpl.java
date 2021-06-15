package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1PodIPFluentImpl<A extends io.kubernetes.client.openapi.models.V1PodIPFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PodIPFluent<A> {

    private java.lang.String ip;

    public V1PodIPFluentImpl() {
    }

    public V1PodIPFluentImpl(io.kubernetes.client.openapi.models.V1PodIP instance) {
        this.withIp(instance.getIp());
    }

    public java.lang.String getIp() {
        return this.ip;
    }

    public A withIp(java.lang.String ip) {
        this.ip=ip; return (A) this;
    }

    public java.lang.Boolean hasIp() {
        return this.ip != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withIp instead.
     */
        public A withNewIp(java.lang.String original) {
        return (A)withIp(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PodIPFluentImpl that = (V1PodIPFluentImpl) o;
        if (ip != null ? !ip.equals(that.ip) :that.ip != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(ip,  super.hashCode());
    }

}
