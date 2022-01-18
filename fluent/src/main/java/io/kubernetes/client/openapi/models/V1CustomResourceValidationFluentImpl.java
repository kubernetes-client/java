/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public class V1CustomResourceValidationFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<A> {
  public V1CustomResourceValidationFluentImpl() {}

  public V1CustomResourceValidationFluentImpl(
      io.kubernetes.client.openapi.models.V1CustomResourceValidation instance) {
    this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());
  }

  private io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder openAPIV3Schema;

  /**
   * This method has been deprecated, please use method buildOpenAPIV3Schema instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1JSONSchemaProps getOpenAPIV3Schema() {
    return this.openAPIV3Schema != null ? this.openAPIV3Schema.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1JSONSchemaProps buildOpenAPIV3Schema() {
    return this.openAPIV3Schema != null ? this.openAPIV3Schema.build() : null;
  }

  public A withOpenAPIV3Schema(
      io.kubernetes.client.openapi.models.V1JSONSchemaProps openAPIV3Schema) {
    _visitables.get("openAPIV3Schema").remove(this.openAPIV3Schema);
    if (openAPIV3Schema != null) {
      this.openAPIV3Schema =
          new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(openAPIV3Schema);
      _visitables.get("openAPIV3Schema").add(this.openAPIV3Schema);
    }
    return (A) this;
  }

  public java.lang.Boolean hasOpenAPIV3Schema() {
    return this.openAPIV3Schema != null;
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<
          A>
      withNewOpenAPIV3Schema() {
    return new io.kubernetes.client.openapi.models.V1CustomResourceValidationFluentImpl
        .OpenAPIV3SchemaNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<
          A>
      withNewOpenAPIV3SchemaLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return new io.kubernetes.client.openapi.models.V1CustomResourceValidationFluentImpl
        .OpenAPIV3SchemaNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<
          A>
      editOpenAPIV3Schema() {
    return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema());
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<
          A>
      editOrNewOpenAPIV3Schema() {
    return withNewOpenAPIV3SchemaLike(
        getOpenAPIV3Schema() != null
            ? getOpenAPIV3Schema()
            : new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent.OpenAPIV3SchemaNested<
          A>
      editOrNewOpenAPIV3SchemaLike(io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
    return withNewOpenAPIV3SchemaLike(getOpenAPIV3Schema() != null ? getOpenAPIV3Schema() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceValidationFluentImpl that = (V1CustomResourceValidationFluentImpl) o;
    if (openAPIV3Schema != null
        ? !openAPIV3Schema.equals(that.openAPIV3Schema)
        : that.openAPIV3Schema != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(openAPIV3Schema, super.hashCode());
  }

  public class OpenAPIV3SchemaNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1JSONSchemaPropsFluentImpl<
          io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent
                  .OpenAPIV3SchemaNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent
                  .OpenAPIV3SchemaNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    OpenAPIV3SchemaNestedImpl(io.kubernetes.client.openapi.models.V1JSONSchemaProps item) {
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this, item);
    }

    OpenAPIV3SchemaNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1JSONSchemaPropsBuilder builder;

    public N and() {
      return (N) V1CustomResourceValidationFluentImpl.this.withOpenAPIV3Schema(builder.build());
    }

    public N endOpenAPIV3Schema() {
      return and();
    }
  }
}
