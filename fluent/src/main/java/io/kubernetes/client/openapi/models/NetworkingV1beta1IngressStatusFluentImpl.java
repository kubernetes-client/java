package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1IngressStatusFluentImpl<A extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent<A> {

    private io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder loadBalancer;

    public NetworkingV1beta1IngressStatusFluentImpl() {
    }

    public NetworkingV1beta1IngressStatusFluentImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatus instance) {
        this.withLoadBalancer(instance.getLoadBalancer());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLoadBalancer instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LoadBalancerStatus getLoadBalancer() {
        return this.loadBalancer!=null?this.loadBalancer.build():null;
    }

    public io.kubernetes.client.openapi.models.V1LoadBalancerStatus buildLoadBalancer() {
        return this.loadBalancer!=null?this.loadBalancer.build():null;
    }

    public A withLoadBalancer(io.kubernetes.client.openapi.models.V1LoadBalancerStatus loadBalancer) {
        _visitables.get("loadBalancer").remove(this.loadBalancer);
        if (loadBalancer!=null){ this.loadBalancer= new io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder(loadBalancer); _visitables.get("loadBalancer").add(this.loadBalancer);} return (A) this;
    }

    public java.lang.Boolean hasLoadBalancer() {
        return this.loadBalancer != null;
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancer() {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluentImpl.LoadBalancerNestedImpl();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluentImpl.LoadBalancerNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent.LoadBalancerNested<A> editLoadBalancer() {
        return withNewLoadBalancerLike(getLoadBalancer());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer() {
        return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): new io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item) {
        return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkingV1beta1IngressStatusFluentImpl that = (NetworkingV1beta1IngressStatusFluentImpl) o;
        if (loadBalancer != null ? !loadBalancer.equals(that.loadBalancer) :that.loadBalancer != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(loadBalancer,  super.hashCode());
    }

    public class LoadBalancerNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent.LoadBalancerNested<N>> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressStatusFluent.LoadBalancerNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder builder;

            LoadBalancerNestedImpl(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder(this, item);
                        
            }

            LoadBalancerNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder(this);
                        
            }

            public N and() {
                return (N) NetworkingV1beta1IngressStatusFluentImpl.this.withLoadBalancer(builder.build());
            }

            public N endLoadBalancer() {
                return and();
            }
    }


}
