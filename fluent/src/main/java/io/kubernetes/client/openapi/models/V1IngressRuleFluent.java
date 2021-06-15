package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1IngressRuleFluent<A extends io.kubernetes.client.openapi.models.V1IngressRuleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getHost();
    public A withHost(java.lang.String host);
    public java.lang.Boolean hasHost();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHost instead.
     */
        public A withNewHost(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildHttp instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue getHttp();
    public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue buildHttp();
    public A withHttp(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue http);
    public java.lang.Boolean hasHttp();
    public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> withNewHttp();
    public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> withNewHttpLike(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item);
    public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editHttp();
    public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editOrNewHttp();
    public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editOrNewHttpLike(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item);
    public interface HttpNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<N>> {

            public N and();
            public N endHttp();    }


}
