package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1IngressStatusFluent<A extends io.kubernetes.client.openapi.models.V1IngressStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLoadBalancer instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LoadBalancerStatus getLoadBalancer();
    public io.kubernetes.client.openapi.models.V1LoadBalancerStatus buildLoadBalancer();
    public A withLoadBalancer(io.kubernetes.client.openapi.models.V1LoadBalancerStatus loadBalancer);
    public java.lang.Boolean hasLoadBalancer();
    public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancer();
    public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item);
    public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> editLoadBalancer();
    public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer();
    public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item);
    public interface LoadBalancerNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<N>> {

            public N and();
            public N endLoadBalancer();    }


}
