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
public class V1IngressClassSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<A> {
  public V1IngressClassSpecFluentImpl() {}

  public V1IngressClassSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1IngressClassSpec instance) {
    this.withController(instance.getController());

    this.withParameters(instance.getParameters());
  }

  private java.lang.String controller;
  private io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceBuilder parameters;

  public java.lang.String getController() {
    return this.controller;
  }

  public A withController(java.lang.String controller) {
    this.controller = controller;
    return (A) this;
  }

  public java.lang.Boolean hasController() {
    return this.controller != null;
  }

  /** Method is deprecated. use withController instead. */
  @java.lang.Deprecated
  public A withNewController(java.lang.String original) {
    return (A) withController(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildParameters instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressClassParametersReference getParameters() {
    return this.parameters != null ? this.parameters.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1IngressClassParametersReference buildParameters() {
    return this.parameters != null ? this.parameters.build() : null;
  }

  public A withParameters(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReference parameters) {
    _visitables.get("parameters").remove(this.parameters);
    if (parameters != null) {
      this.parameters =
          new io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceBuilder(
              parameters);
      _visitables.get("parameters").add(this.parameters);
    }
    return (A) this;
  }

  public java.lang.Boolean hasParameters() {
    return this.parameters != null;
  }

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      withNewParameters() {
    return new io.kubernetes.client.openapi.models.V1IngressClassSpecFluentImpl
        .ParametersNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      withNewParametersLike(
          io.kubernetes.client.openapi.models.V1IngressClassParametersReference item) {
    return new io.kubernetes.client.openapi.models.V1IngressClassSpecFluentImpl
        .ParametersNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      editParameters() {
    return withNewParametersLike(getParameters());
  }

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      editOrNewParameters() {
    return withNewParametersLike(
        getParameters() != null
            ? getParameters()
            : new io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      editOrNewParametersLike(
          io.kubernetes.client.openapi.models.V1IngressClassParametersReference item) {
    return withNewParametersLike(getParameters() != null ? getParameters() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressClassSpecFluentImpl that = (V1IngressClassSpecFluentImpl) o;
    if (controller != null ? !controller.equals(that.controller) : that.controller != null)
      return false;
    if (parameters != null ? !parameters.equals(that.parameters) : that.parameters != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(controller, parameters, super.hashCode());
  }

  public class ParametersNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<N>>
      implements io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ParametersNestedImpl(
        io.kubernetes.client.openapi.models.V1IngressClassParametersReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceBuilder(
              this, item);
    }

    ParametersNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1IngressClassParametersReferenceBuilder builder;

    public N and() {
      return (N) V1IngressClassSpecFluentImpl.this.withParameters(builder.build());
    }

    public N endParameters() {
      return and();
    }
  }
}
