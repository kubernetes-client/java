package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1IngressRuleFluentImpl<A extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent<A> {

    private java.lang.String host;
    private io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueBuilder http;

    public NetworkingV1beta1IngressRuleFluentImpl() {
    }

    public NetworkingV1beta1IngressRuleFluentImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule instance) {
        this.withHost(instance.getHost());
        
        this.withHttp(instance.getHttp());
    }

    public java.lang.String getHost() {
        return this.host;
    }

    public A withHost(java.lang.String host) {
        this.host=host; return (A) this;
    }

    public java.lang.Boolean hasHost() {
        return this.host != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHost instead.
     */
        public A withNewHost(java.lang.String original) {
        return (A)withHost(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildHttp instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValue getHttp() {
        return this.http!=null?this.http.build():null;
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValue buildHttp() {
        return this.http!=null?this.http.build():null;
    }

    public A withHttp(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValue http) {
        _visitables.get("http").remove(this.http);
        if (http!=null){ this.http= new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueBuilder(http); _visitables.get("http").add(this.http);} return (A) this;
    }

    public java.lang.Boolean hasHttp() {
        return this.http != null;
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent.HttpNested<A> withNewHttp() {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluentImpl.HttpNestedImpl();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent.HttpNested<A> withNewHttpLike(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValue item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluentImpl.HttpNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent.HttpNested<A> editHttp() {
        return withNewHttpLike(getHttp());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent.HttpNested<A> editOrNewHttp() {
        return withNewHttpLike(getHttp() != null ? getHttp(): new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueBuilder().build());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent.HttpNested<A> editOrNewHttpLike(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValue item) {
        return withNewHttpLike(getHttp() != null ? getHttp(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkingV1beta1IngressRuleFluentImpl that = (NetworkingV1beta1IngressRuleFluentImpl) o;
        if (host != null ? !host.equals(that.host) :that.host != null) return false;
        if (http != null ? !http.equals(that.http) :that.http != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(host,  http,  super.hashCode());
    }

    public class HttpNestedImpl<N> extends io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent.HttpNested<N>> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent.HttpNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueBuilder builder;

            HttpNestedImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValue item) {
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueBuilder(this, item);
                        
            }

            HttpNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueBuilder(this);
                        
            }

            public N and() {
                return (N) NetworkingV1beta1IngressRuleFluentImpl.this.withHttp(builder.build());
            }

            public N endHttp() {
                return and();
            }
    }


}
