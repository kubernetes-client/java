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
public class V1beta1PriorityLevelConfigurationSpecFluentImpl<
        A extends
            io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<A> {
  public V1beta1PriorityLevelConfigurationSpecFluentImpl() {}

  public V1beta1PriorityLevelConfigurationSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpec instance) {
    this.withLimited(instance.getLimited());

    this.withType(instance.getType());
  }

  private io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationBuilder
      limited;
  private java.lang.String type;

  /**
   * This method has been deprecated, please use method buildLimited instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration getLimited() {
    return this.limited != null ? this.limited.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration
      buildLimited() {
    return this.limited != null ? this.limited.build() : null;
  }

  public A withLimited(
      io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration limited) {
    _visitables.get("limited").remove(this.limited);
    if (limited != null) {
      this.limited =
          new io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationBuilder(
              limited);
      _visitables.get("limited").add(this.limited);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLimited() {
    return this.limited != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      withNewLimited() {
    return new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluentImpl
        .LimitedNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      withNewLimitedLike(
          io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item) {
    return new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluentImpl
        .LimitedNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editLimited() {
    return withNewLimitedLike(getLimited());
  }

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editOrNewLimited() {
    return withNewLimitedLike(
        getLimited() != null
            ? getLimited()
            : new io.kubernetes.client.openapi.models
                    .V1beta1LimitedPriorityLevelConfigurationBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editOrNewLimitedLike(
          io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item) {
    return withNewLimitedLike(getLimited() != null ? getLimited() : item);
  }

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original) {
    return (A) withType(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1PriorityLevelConfigurationSpecFluentImpl that =
        (V1beta1PriorityLevelConfigurationSpecFluentImpl) o;
    if (limited != null ? !limited.equals(that.limited) : that.limited != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(limited, type, super.hashCode());
  }

  public class LimitedNestedImpl<N>
      extends io.kubernetes.client.openapi.models
              .V1beta1LimitedPriorityLevelConfigurationFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
                  .LimitedNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
                  .LimitedNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    LimitedNestedImpl(
        io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationBuilder(
              this, item);
    }

    LimitedNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationBuilder(
              this);
    }

    io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationBuilder builder;

    public N and() {
      return (N) V1beta1PriorityLevelConfigurationSpecFluentImpl.this.withLimited(builder.build());
    }

    public N endLimited() {
      return and();
    }
  }
}
