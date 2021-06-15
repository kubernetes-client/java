package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1CustomResourceValidationFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildOpenAPIV3Schema instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1JSONSchemaProps getOpenAPIV3Schema();
    public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildOpenAPIV3Schema();
    public A withOpenAPIV3Schema(io.kubernetes.client.openapi.models.V1JSONSchemaProps openAPIV3Schema);
    public java.lang.Boolean hasOpenAPIV3Schema();
    public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3Schema();
    public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3SchemaLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOpenAPIV3Schema();
    public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3Schema();
    public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3SchemaLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item);
    public interface OpenAPIV3SchemaNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluent<io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>> {

            public N and();
            public N endOpenAPIV3Schema();    }


}
