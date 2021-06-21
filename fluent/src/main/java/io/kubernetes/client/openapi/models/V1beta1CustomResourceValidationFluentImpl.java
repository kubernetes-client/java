package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceValidationFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<A> {

    private io.kubernetes.client.openapi.models.V1beta1JSONSchemaPropsBuilder openAPIV3Schema;

    public V1beta1CustomResourceValidationFluentImpl() {
    }

    public V1beta1CustomResourceValidationFluentImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation instance) {
        this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildOpenAPIV3Schema instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1JSONSchemaProps getOpenAPIV3Schema() {
        return this.openAPIV3Schema!=null?this.openAPIV3Schema.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1JSONSchemaProps buildOpenAPIV3Schema() {
        return this.openAPIV3Schema!=null?this.openAPIV3Schema.build():null;
    }

    public A withOpenAPIV3Schema(io.kubernetes.client.openapi.models.V1beta1JSONSchemaProps openAPIV3Schema) {
        _visitables.get("openAPIV3Schema").remove(this.openAPIV3Schema);
        if (openAPIV3Schema!=null){ this.openAPIV3Schema= new io.kubernetes.client.openapi.models.V1beta1JSONSchemaPropsBuilder(openAPIV3Schema); _visitables.get("openAPIV3Schema").add(this.openAPIV3Schema);} return (A) this;
    }

    public java.lang.Boolean hasOpenAPIV3Schema() {
        return this.openAPIV3Schema != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3Schema() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluentImpl.OpenAPIV3SchemaNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3SchemaLike(io.kubernetes.client.openapi.models.V1beta1JSONSchemaProps item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluentImpl.OpenAPIV3SchemaNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOpenAPIV3Schema() {
        return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3Schema() {
        return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema() != null ? getOpenAPIV3Schema(): new io.kubernetes.client.openapi.models.V1beta1JSONSchemaPropsBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3SchemaLike(io.kubernetes.client.openapi.models.V1beta1JSONSchemaProps item) {
        return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema() != null ? getOpenAPIV3Schema(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CustomResourceValidationFluentImpl that = (V1beta1CustomResourceValidationFluentImpl) o;
        if (openAPIV3Schema != null ? !openAPIV3Schema.equals(that.openAPIV3Schema) :that.openAPIV3Schema != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(openAPIV3Schema,  super.hashCode());
    }

    public class OpenAPIV3SchemaNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1JSONSchemaPropsFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1JSONSchemaPropsBuilder builder;

            OpenAPIV3SchemaNestedImpl(io.kubernetes.client.openapi.models.V1beta1JSONSchemaProps item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1JSONSchemaPropsBuilder(this, item);
                        
            }

            OpenAPIV3SchemaNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1JSONSchemaPropsBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceValidationFluentImpl.this.withOpenAPIV3Schema(builder.build());
            }

            public N endOpenAPIV3Schema() {
                return and();
            }
    }


}
