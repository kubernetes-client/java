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
public class V1SelfSubjectAccessReviewSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<A> {
  public V1SelfSubjectAccessReviewSpecFluentImpl() {}

  public V1SelfSubjectAccessReviewSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance) {
    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());
  }

  private io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder nonResourceAttributes;
  private io.kubernetes.client.openapi.models.V1ResourceAttributesBuilder resourceAttributes;

  /**
   * This method has been deprecated, please use method buildNonResourceAttributes instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NonResourceAttributes getNonResourceAttributes() {
    return this.nonResourceAttributes != null ? this.nonResourceAttributes.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NonResourceAttributes buildNonResourceAttributes() {
    return this.nonResourceAttributes != null ? this.nonResourceAttributes.build() : null;
  }

  public A withNonResourceAttributes(
      io.kubernetes.client.openapi.models.V1NonResourceAttributes nonResourceAttributes) {
    _visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes);
    if (nonResourceAttributes != null) {
      this.nonResourceAttributes =
          new io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder(
              nonResourceAttributes);
      _visitables.get("nonResourceAttributes").add(this.nonResourceAttributes);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNonResourceAttributes() {
    return this.nonResourceAttributes != null;
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      withNewNonResourceAttributes() {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluentImpl
        .NonResourceAttributesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      withNewNonResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1NonResourceAttributes item) {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluentImpl
        .NonResourceAttributesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editNonResourceAttributes() {
    return withNewNonResourceAttributesLike(getNonResourceAttributes());
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editOrNewNonResourceAttributes() {
    return withNewNonResourceAttributesLike(
        getNonResourceAttributes() != null
            ? getNonResourceAttributes()
            : new io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editOrNewNonResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1NonResourceAttributes item) {
    return withNewNonResourceAttributesLike(
        getNonResourceAttributes() != null ? getNonResourceAttributes() : item);
  }

  /**
   * This method has been deprecated, please use method buildResourceAttributes instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceAttributes getResourceAttributes() {
    return this.resourceAttributes != null ? this.resourceAttributes.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceAttributes buildResourceAttributes() {
    return this.resourceAttributes != null ? this.resourceAttributes.build() : null;
  }

  public A withResourceAttributes(
      io.kubernetes.client.openapi.models.V1ResourceAttributes resourceAttributes) {
    _visitables.get("resourceAttributes").remove(this.resourceAttributes);
    if (resourceAttributes != null) {
      this.resourceAttributes =
          new io.kubernetes.client.openapi.models.V1ResourceAttributesBuilder(resourceAttributes);
      _visitables.get("resourceAttributes").add(this.resourceAttributes);
    }
    return (A) this;
  }

  public java.lang.Boolean hasResourceAttributes() {
    return this.resourceAttributes != null;
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      withNewResourceAttributes() {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluentImpl
        .ResourceAttributesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      withNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1ResourceAttributes item) {
    return new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluentImpl
        .ResourceAttributesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editResourceAttributes() {
    return withNewResourceAttributesLike(getResourceAttributes());
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editOrNewResourceAttributes() {
    return withNewResourceAttributesLike(
        getResourceAttributes() != null
            ? getResourceAttributes()
            : new io.kubernetes.client.openapi.models.V1ResourceAttributesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editOrNewResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1ResourceAttributes item) {
    return withNewResourceAttributesLike(
        getResourceAttributes() != null ? getResourceAttributes() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SelfSubjectAccessReviewSpecFluentImpl that = (V1SelfSubjectAccessReviewSpecFluentImpl) o;
    if (nonResourceAttributes != null
        ? !nonResourceAttributes.equals(that.nonResourceAttributes)
        : that.nonResourceAttributes != null) return false;
    if (resourceAttributes != null
        ? !resourceAttributes.equals(that.resourceAttributes)
        : that.resourceAttributes != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(nonResourceAttributes, resourceAttributes, super.hashCode());
  }

  public class NonResourceAttributesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NonResourceAttributesFluentImpl<
          io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
                  .NonResourceAttributesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
                  .NonResourceAttributesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NonResourceAttributesNestedImpl(
        io.kubernetes.client.openapi.models.V1NonResourceAttributes item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder(this, item);
    }

    NonResourceAttributesNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder builder;

    public N and() {
      return (N)
          V1SelfSubjectAccessReviewSpecFluentImpl.this.withNonResourceAttributes(builder.build());
    }

    public N endNonResourceAttributes() {
      return and();
    }
  }

  public class ResourceAttributesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceAttributesFluentImpl<
          io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
                  .ResourceAttributesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
                  .ResourceAttributesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourceAttributesNestedImpl(io.kubernetes.client.openapi.models.V1ResourceAttributes item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ResourceAttributesBuilder(this, item);
    }

    ResourceAttributesNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceAttributesBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ResourceAttributesBuilder builder;

    public N and() {
      return (N)
          V1SelfSubjectAccessReviewSpecFluentImpl.this.withResourceAttributes(builder.build());
    }

    public N endResourceAttributes() {
      return and();
    }
  }
}
