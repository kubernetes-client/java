package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1LimitResponseFluent<A extends io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildQueuing instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration getQueuing();
    public io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration buildQueuing();
    public A withQueuing(io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration queuing);
    public java.lang.Boolean hasQueuing();
    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> withNewQueuing();
    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> withNewQueuingLike(io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration item);
    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> editQueuing();
    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> editOrNewQueuing();
    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> editOrNewQueuingLike(io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration item);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public interface QueuingNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationFluent<io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<N>> {

            public N and();
            public N endQueuing();    }


}
