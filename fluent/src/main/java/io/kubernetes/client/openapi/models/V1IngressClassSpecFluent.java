package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1IngressClassSpecFluent<A extends io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getController();
    public A withController(java.lang.String controller);
    public java.lang.Boolean hasController();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withController instead.
     */
        public A withNewController(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildParameters instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getParameters();
    public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildParameters();
    public A withParameters(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference parameters);
    public java.lang.Boolean hasParameters();
    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> withNewParameters();
    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> withNewParametersLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);
    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editParameters();
    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editOrNewParameters();
    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editOrNewParametersLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);
    public interface ParametersNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<N>> {

            public N and();
            public N endParameters();    }


}
