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
public class V1beta2LimitedPriorityLevelConfigurationFluentImpl<
        A extends
            io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<
        A> {
  public V1beta2LimitedPriorityLevelConfigurationFluentImpl() {}

  public V1beta2LimitedPriorityLevelConfigurationFluentImpl(
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration instance) {
    this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    this.withLimitResponse(instance.getLimitResponse());
  }

  private java.lang.Integer assuredConcurrencyShares;
  private io.kubernetes.client.openapi.models.V1beta2LimitResponseBuilder limitResponse;

  public java.lang.Integer getAssuredConcurrencyShares() {
    return this.assuredConcurrencyShares;
  }

  public A withAssuredConcurrencyShares(java.lang.Integer assuredConcurrencyShares) {
    this.assuredConcurrencyShares = assuredConcurrencyShares;
    return (A) this;
  }

  public java.lang.Boolean hasAssuredConcurrencyShares() {
    return this.assuredConcurrencyShares != null;
  }

  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2LimitResponse getLimitResponse() {
    return this.limitResponse != null ? this.limitResponse.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitResponse buildLimitResponse() {
    return this.limitResponse != null ? this.limitResponse.build() : null;
  }

  public A withLimitResponse(
      io.kubernetes.client.openapi.models.V1beta2LimitResponse limitResponse) {
    _visitables.get("limitResponse").remove(this.limitResponse);
    if (limitResponse != null) {
      this.limitResponse =
          new io.kubernetes.client.openapi.models.V1beta2LimitResponseBuilder(limitResponse);
      _visitables.get("limitResponse").add(this.limitResponse);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLimitResponse() {
    return this.limitResponse != null;
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      withNewLimitResponse() {
    return new io.kubernetes.client.openapi.models
        .V1beta2LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      withNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta2LimitResponse item) {
    return new io.kubernetes.client.openapi.models
        .V1beta2LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      editLimitResponse() {
    return withNewLimitResponseLike(getLimitResponse());
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      editOrNewLimitResponse() {
    return withNewLimitResponseLike(
        getLimitResponse() != null
            ? getLimitResponse()
            : new io.kubernetes.client.openapi.models.V1beta2LimitResponseBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      editOrNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta2LimitResponse item) {
    return withNewLimitResponseLike(getLimitResponse() != null ? getLimitResponse() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2LimitedPriorityLevelConfigurationFluentImpl that =
        (V1beta2LimitedPriorityLevelConfigurationFluentImpl) o;
    if (assuredConcurrencyShares != null
        ? !assuredConcurrencyShares.equals(that.assuredConcurrencyShares)
        : that.assuredConcurrencyShares != null) return false;
    if (limitResponse != null
        ? !limitResponse.equals(that.limitResponse)
        : that.limitResponse != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(assuredConcurrencyShares, limitResponse, super.hashCode());
  }

  public class LimitResponseNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2LimitResponseFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
                  .LimitResponseNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
                  .LimitResponseNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    LimitResponseNestedImpl(io.kubernetes.client.openapi.models.V1beta2LimitResponse item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2LimitResponseBuilder(this, item);
    }

    LimitResponseNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta2LimitResponseBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2LimitResponseBuilder builder;

    public N and() {
      return (N)
          V1beta2LimitedPriorityLevelConfigurationFluentImpl.this.withLimitResponse(
              builder.build());
    }

    public N endLimitResponse() {
      return and();
    }
  }
}
