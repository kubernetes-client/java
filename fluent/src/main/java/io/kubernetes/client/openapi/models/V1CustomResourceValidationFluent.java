package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceValidationFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<A>> extends BaseFluent<A>{

  private V1JSONSchemaPropsBuilder openAPIV3Schema;

  public V1CustomResourceValidationFluent() {
  }
  
  public V1CustomResourceValidationFluent(V1CustomResourceValidation instance) {
    this.copyInstance(instance);
  }

  public V1JSONSchemaProps buildOpenAPIV3Schema() {
    return this.openAPIV3Schema != null ? this.openAPIV3Schema.build() : null;
  }
  
  protected void copyInstance(V1CustomResourceValidation instance) {
    instance = instance != null ? instance : new V1CustomResourceValidation();
    if (instance != null) {
      this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());
    }
  }
  
  public OpenAPIV3SchemaNested<A> editOpenAPIV3Schema() {
    return this.withNewOpenAPIV3SchemaLike(Optional.ofNullable(this.buildOpenAPIV3Schema()).orElse(null));
  }
  
  public OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3Schema() {
    return this.withNewOpenAPIV3SchemaLike(Optional.ofNullable(this.buildOpenAPIV3Schema()).orElse(new V1JSONSchemaPropsBuilder().build()));
  }
  
  public OpenAPIV3SchemaNested<A> editOrNewOpenAPIV3SchemaLike(V1JSONSchemaProps item) {
    return this.withNewOpenAPIV3SchemaLike(Optional.ofNullable(this.buildOpenAPIV3Schema()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1CustomResourceValidationFluent that = (V1CustomResourceValidationFluent) o;
    if (!(Objects.equals(openAPIV3Schema, that.openAPIV3Schema))) {
      return false;
    }
    return true;
  }
  
  public boolean hasOpenAPIV3Schema() {
    return this.openAPIV3Schema != null;
  }
  
  public int hashCode() {
    return Objects.hash(openAPIV3Schema);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(openAPIV3Schema == null)) {
        sb.append("openAPIV3Schema:");
        sb.append(openAPIV3Schema);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public OpenAPIV3SchemaNested<A> withNewOpenAPIV3Schema() {
    return new OpenAPIV3SchemaNested(null);
  }
  
  public OpenAPIV3SchemaNested<A> withNewOpenAPIV3SchemaLike(V1JSONSchemaProps item) {
    return new OpenAPIV3SchemaNested(item);
  }
  
  public A withOpenAPIV3Schema(V1JSONSchemaProps openAPIV3Schema) {
    this._visitables.remove("openAPIV3Schema");
    if (openAPIV3Schema != null) {
        this.openAPIV3Schema = new V1JSONSchemaPropsBuilder(openAPIV3Schema);
        this._visitables.get("openAPIV3Schema").add(this.openAPIV3Schema);
    } else {
        this.openAPIV3Schema = null;
        this._visitables.get("openAPIV3Schema").remove(this.openAPIV3Schema);
    }
    return (A) this;
  }
  public class OpenAPIV3SchemaNested<N> extends V1JSONSchemaPropsFluent<OpenAPIV3SchemaNested<N>> implements Nested<N>{
  
    V1JSONSchemaPropsBuilder builder;
  
    OpenAPIV3SchemaNested(V1JSONSchemaProps item) {
      this.builder = new V1JSONSchemaPropsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CustomResourceValidationFluent.this.withOpenAPIV3Schema(builder.build());
    }
    
    public N endOpenAPIV3Schema() {
      return and();
    }
    
  }
}