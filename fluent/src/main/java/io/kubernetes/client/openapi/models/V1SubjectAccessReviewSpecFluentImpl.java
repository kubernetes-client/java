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
public class V1SubjectAccessReviewSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<A> {
  public V1SubjectAccessReviewSpecFluentImpl() {}

  public V1SubjectAccessReviewSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance) {
    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

    this.withUid(instance.getUid());

    this.withUser(instance.getUser());
  }

  private java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra;
  private java.util.List<java.lang.String> groups;
  private io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder nonResourceAttributes;
  private io.kubernetes.client.openapi.models.V1ResourceAttributesBuilder resourceAttributes;
  private java.lang.String uid;
  private java.lang.String user;

  public A addToExtra(java.lang.String key, java.util.List<java.lang.String> value) {
    if (this.extra == null && key != null && value != null) {
      this.extra = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.extra.put(key, value);
    }
    return (A) this;
  }

  public A addToExtra(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    if (this.extra == null && map != null) {
      this.extra = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.extra.putAll(map);
    }
    return (A) this;
  }

  public A removeFromExtra(java.lang.String key) {
    if (this.extra == null) {
      return (A) this;
    }
    if (key != null && this.extra != null) {
      this.extra.remove(key);
    }
    return (A) this;
  }

  public A removeFromExtra(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    if (this.extra == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.extra != null) {
          this.extra.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getExtra() {
    return this.extra;
  }

  public <K, V> A withExtra(
      java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra) {
    if (extra == null) {
      this.extra = null;
    } else {
      this.extra = new java.util.LinkedHashMap(extra);
    }
    return (A) this;
  }

  public java.lang.Boolean hasExtra() {
    return this.extra != null;
  }

  public A addToGroups(java.lang.Integer index, java.lang.String item) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<java.lang.String>();
    }
    this.groups.add(index, item);
    return (A) this;
  }

  public A setToGroups(java.lang.Integer index, java.lang.String item) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<java.lang.String>();
    }
    this.groups.set(index, item);
    return (A) this;
  }

  public A addToGroups(java.lang.String... items) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.groups.add(item);
    }
    return (A) this;
  }

  public A addAllToGroups(java.util.Collection<java.lang.String> items) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.groups.add(item);
    }
    return (A) this;
  }

  public A removeFromGroups(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.groups != null) {
        this.groups.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromGroups(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.groups != null) {
        this.groups.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getGroups() {
    return this.groups;
  }

  public java.lang.String getGroup(java.lang.Integer index) {
    return this.groups.get(index);
  }

  public java.lang.String getFirstGroup() {
    return this.groups.get(0);
  }

  public java.lang.String getLastGroup() {
    return this.groups.get(groups.size() - 1);
  }

  public java.lang.String getMatchingGroup(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : groups) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingGroup(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : groups) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withGroups(java.util.List<java.lang.String> groups) {
    if (groups != null) {
      this.groups = new java.util.ArrayList();
      for (java.lang.String item : groups) {
        this.addToGroups(item);
      }
    } else {
      this.groups = null;
    }
    return (A) this;
  }

  public A withGroups(java.lang.String... groups) {
    if (this.groups != null) {
      this.groups.clear();
    }
    if (groups != null) {
      for (java.lang.String item : groups) {
        this.addToGroups(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasGroups() {
    return groups != null && !groups.isEmpty();
  }

  public A addNewGroup(java.lang.String original) {
    return (A) addToGroups(new String(original));
  }

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

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      withNewNonResourceAttributes() {
    return new io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluentImpl
        .NonResourceAttributesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      withNewNonResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1NonResourceAttributes item) {
    return new io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluentImpl
        .NonResourceAttributesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editNonResourceAttributes() {
    return withNewNonResourceAttributesLike(getNonResourceAttributes());
  }

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editOrNewNonResourceAttributes() {
    return withNewNonResourceAttributesLike(
        getNonResourceAttributes() != null
            ? getNonResourceAttributes()
            : new io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
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

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      withNewResourceAttributes() {
    return new io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluentImpl
        .ResourceAttributesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      withNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1ResourceAttributes item) {
    return new io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluentImpl
        .ResourceAttributesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editResourceAttributes() {
    return withNewResourceAttributesLike(getResourceAttributes());
  }

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editOrNewResourceAttributes() {
    return withNewResourceAttributesLike(
        getResourceAttributes() != null
            ? getResourceAttributes()
            : new io.kubernetes.client.openapi.models.V1ResourceAttributesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editOrNewResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1ResourceAttributes item) {
    return withNewResourceAttributesLike(
        getResourceAttributes() != null ? getResourceAttributes() : item);
  }

  public java.lang.String getUid() {
    return this.uid;
  }

  public A withUid(java.lang.String uid) {
    this.uid = uid;
    return (A) this;
  }

  public java.lang.Boolean hasUid() {
    return this.uid != null;
  }

  /** Method is deprecated. use withUid instead. */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String original) {
    return (A) withUid(new String(original));
  }

  public java.lang.String getUser() {
    return this.user;
  }

  public A withUser(java.lang.String user) {
    this.user = user;
    return (A) this;
  }

  public java.lang.Boolean hasUser() {
    return this.user != null;
  }

  /** Method is deprecated. use withUser instead. */
  @java.lang.Deprecated
  public A withNewUser(java.lang.String original) {
    return (A) withUser(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SubjectAccessReviewSpecFluentImpl that = (V1SubjectAccessReviewSpecFluentImpl) o;
    if (extra != null ? !extra.equals(that.extra) : that.extra != null) return false;
    if (groups != null ? !groups.equals(that.groups) : that.groups != null) return false;
    if (nonResourceAttributes != null
        ? !nonResourceAttributes.equals(that.nonResourceAttributes)
        : that.nonResourceAttributes != null) return false;
    if (resourceAttributes != null
        ? !resourceAttributes.equals(that.resourceAttributes)
        : that.resourceAttributes != null) return false;
    if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
    if (user != null ? !user.equals(that.user) : that.user != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        extra, groups, nonResourceAttributes, resourceAttributes, uid, user, super.hashCode());
  }

  public class NonResourceAttributesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NonResourceAttributesFluentImpl<
          io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
                  .NonResourceAttributesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
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
          V1SubjectAccessReviewSpecFluentImpl.this.withNonResourceAttributes(builder.build());
    }

    public N endNonResourceAttributes() {
      return and();
    }
  }

  public class ResourceAttributesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceAttributesFluentImpl<
          io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
                  .ResourceAttributesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
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
      return (N) V1SubjectAccessReviewSpecFluentImpl.this.withResourceAttributes(builder.build());
    }

    public N endResourceAttributes() {
      return and();
    }
  }
}
