package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1IngressClassSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<A> {

    private java.lang.String controller;
    private io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder parameters;

    public V1IngressClassSpecFluentImpl() {
    }

    public V1IngressClassSpecFluentImpl(io.kubernetes.client.openapi.models.V1IngressClassSpec instance) {
        this.withController(instance.getController());
        
        this.withParameters(instance.getParameters());
    }

    public java.lang.String getController() {
        return this.controller;
    }

    public A withController(java.lang.String controller) {
        this.controller=controller; return (A) this;
    }

    public java.lang.Boolean hasController() {
        return this.controller != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withController instead.
     */
        public A withNewController(java.lang.String original) {
        return (A)withController(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildParameters instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getParameters() {
        return this.parameters!=null?this.parameters.build():null;
    }

    public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildParameters() {
        return this.parameters!=null?this.parameters.build():null;
    }

    public A withParameters(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference parameters) {
        _visitables.get("parameters").remove(this.parameters);
        if (parameters!=null){ this.parameters= new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(parameters); _visitables.get("parameters").add(this.parameters);} return (A) this;
    }

    public java.lang.Boolean hasParameters() {
        return this.parameters != null;
    }

    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> withNewParameters() {
        return new io.kubernetes.client.openapi.models.V1IngressClassSpecFluentImpl.ParametersNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> withNewParametersLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
        return new io.kubernetes.client.openapi.models.V1IngressClassSpecFluentImpl.ParametersNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editParameters() {
        return withNewParametersLike(getParameters());
    }

    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editOrNewParameters() {
        return withNewParametersLike(getParameters() != null ? getParameters(): new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editOrNewParametersLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
        return withNewParametersLike(getParameters() != null ? getParameters(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1IngressClassSpecFluentImpl that = (V1IngressClassSpecFluentImpl) o;
        if (controller != null ? !controller.equals(that.controller) :that.controller != null) return false;
        if (parameters != null ? !parameters.equals(that.parameters) :that.parameters != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(controller,  parameters,  super.hashCode());
    }

    public class ParametersNestedImpl<N> extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<N>> implements io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder builder;

            ParametersNestedImpl(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
                this.builder = new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this, item);
                        
            }

            ParametersNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this);
                        
            }

            public N and() {
                return (N) V1IngressClassSpecFluentImpl.this.withParameters(builder.build());
            }

            public N endParameters() {
                return and();
            }
    }


}
