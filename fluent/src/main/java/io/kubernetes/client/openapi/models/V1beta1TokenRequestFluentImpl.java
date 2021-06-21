package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1beta1TokenRequestFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1TokenRequestFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1TokenRequestFluent<A> {

    private java.lang.String audience;
    private java.lang.Long expirationSeconds;

    public V1beta1TokenRequestFluentImpl() {
    }

    public V1beta1TokenRequestFluentImpl(io.kubernetes.client.openapi.models.V1beta1TokenRequest instance) {
        this.withAudience(instance.getAudience());
        
        this.withExpirationSeconds(instance.getExpirationSeconds());
    }

    public java.lang.String getAudience() {
        return this.audience;
    }

    public A withAudience(java.lang.String audience) {
        this.audience=audience; return (A) this;
    }

    public java.lang.Boolean hasAudience() {
        return this.audience != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAudience instead.
     */
        public A withNewAudience(java.lang.String original) {
        return (A)withAudience(new String(original));
    }

    public java.lang.Long getExpirationSeconds() {
        return this.expirationSeconds;
    }

    public A withExpirationSeconds(java.lang.Long expirationSeconds) {
        this.expirationSeconds=expirationSeconds; return (A) this;
    }

    public java.lang.Boolean hasExpirationSeconds() {
        return this.expirationSeconds != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1TokenRequestFluentImpl that = (V1beta1TokenRequestFluentImpl) o;
        if (audience != null ? !audience.equals(that.audience) :that.audience != null) return false;
        if (expirationSeconds != null ? !expirationSeconds.equals(that.expirationSeconds) :that.expirationSeconds != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(audience,  expirationSeconds,  super.hashCode());
    }

}
