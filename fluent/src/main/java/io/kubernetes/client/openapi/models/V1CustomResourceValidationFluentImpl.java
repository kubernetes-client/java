package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CustomResourceValidationFluentImpl<A extends V1CustomResourceValidationFluent<A>> extends BaseFluent<A> implements V1CustomResourceValidationFluent<A>{
  public V1CustomResourceValidationFluentImpl() {
  }
  public V1CustomResourceValidationFluentImpl(V1CustomResourceValidation instance) {
    this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());

  }
  private V1JSONSchemaPropsBuilder openAPIV3Schema;
  
  /**
   * This method has been deprecated, please use method buildOpenAPIV3Schema instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JSONSchemaProps getOpenAPIV3Schema() {
    return this.openAPIV3Schema!=null ?this.openAPIV3Schema.build():null;
  }
  public V1JSONSchemaProps buildOpenAPIV3Schema() {
    return this.openAPIV3Schema!=null ?this.openAPIV3Schema.build():null;
  }
  public A withOpenAPIV3Schema(V1JSONSchemaProps openAPIV3Schema) {
    _visitables.get("openAPIV3Schema").remove(this.openAPIV3Schema);
    if (openAPIV3Schema!=null){ this.openAPIV3Schema= new V1JSONSchemaPropsBuilder(openAPIV3Schema); _visitables.get("openAPIV3Schema").add(this.openAPIV3Schema);} else { this.openAPIV3Schema = null; _visitables.get("openAPIV3Schema").remove(this.openAPIV3Schema); } return (A) this;
  }
  public Boolean hasOpenAPIV3Schema() {
    return this.openAPIV3Schema != null;
  }
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3Schema() {
    return new V1CustomResourceValidationFluentImpl.OpenAPIV3SchemaNestedImpl();
  }
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> withNewOpenAPIV3SchemaLike(V1JSONSchemaProps item) {
    return new V1CustomResourceValidationFluentImpl.OpenAPIV3SchemaNestedImpl(item);
  }
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOpenAPIV3Schema() {
    return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema());
  }
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3Schema() {
    return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema() != null ? getOpenAPIV3Schema(): new V1JSONSchemaPropsBuilder().build());
  }
  public V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3SchemaLike(V1JSONSchemaProps item) {
    return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema() != null ? getOpenAPIV3Schema(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceValidationFluentImpl that = (V1CustomResourceValidationFluentImpl) o;
    if (openAPIV3Schema != null ? !openAPIV3Schema.equals(that.openAPIV3Schema) :that.openAPIV3Schema != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(openAPIV3Schema,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (openAPIV3Schema != null) { sb.append("openAPIV3Schema:"); sb.append(openAPIV3Schema); }
    sb.append("}");
    return sb.toString();
  }
  class OpenAPIV3SchemaNestedImpl<N> extends V1JSONSchemaPropsFluentImpl<V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>> implements V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<N>,Nested<N>{
    OpenAPIV3SchemaNestedImpl(V1JSONSchemaProps item) {
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
    OpenAPIV3SchemaNestedImpl() {
      this.builder = new V1JSONSchemaPropsBuilder(this);
    }
    V1JSONSchemaPropsBuilder builder;
    public N and() {
      return (N) V1CustomResourceValidationFluentImpl.this.withOpenAPIV3Schema(builder.build());
    }
    public N endOpenAPIV3Schema() {
      return and();
    }
    
  }
  
}