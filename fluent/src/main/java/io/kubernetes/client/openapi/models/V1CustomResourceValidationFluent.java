package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceValidationFluent<A extends V1CustomResourceValidationFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildOpenAPIV3Schema instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JSONSchemaProps getOpenAPIV3Schema();
  public V1JSONSchemaProps buildOpenAPIV3Schema();
  public A withOpenAPIV3Schema(V1JSONSchemaProps openAPIV3Schema);
  public Boolean hasOpenAPIV3Schema();
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3Schema();
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3SchemaLike(V1JSONSchemaProps item);
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOpenAPIV3Schema();
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3Schema();
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3SchemaLike(V1JSONSchemaProps item);
  public interface OpenAPIV3SchemaNested<N> extends Nested<N>,V1JSONSchemaPropsFluent<V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>>{
    public N and();
    public N endOpenAPIV3Schema();
    
  }
  
}