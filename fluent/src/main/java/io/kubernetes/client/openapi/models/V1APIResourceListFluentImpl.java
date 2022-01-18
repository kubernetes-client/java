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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1APIResourceListFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1APIResourceListFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1APIResourceListFluent<A> {
  public V1APIResourceListFluentImpl() {}

  public V1APIResourceListFluentImpl(
      io.kubernetes.client.openapi.models.V1APIResourceList instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withGroupVersion(instance.getGroupVersion());

    this.withKind(instance.getKind());

    this.withResources(instance.getResources());
  }

  private java.lang.String apiVersion;
  private java.lang.String groupVersion;
  private java.lang.String kind;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIResourceBuilder> resources;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public java.lang.String getGroupVersion() {
    return this.groupVersion;
  }

  public A withGroupVersion(java.lang.String groupVersion) {
    this.groupVersion = groupVersion;
    return (A) this;
  }

  public java.lang.Boolean hasGroupVersion() {
    return this.groupVersion != null;
  }

  /** Method is deprecated. use withGroupVersion instead. */
  @java.lang.Deprecated
  public A withNewGroupVersion(java.lang.String original) {
    return (A) withGroupVersion(new String(original));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  public A addToResources(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIResource item) {
    if (this.resources == null) {
      this.resources =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIResourceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1APIResourceBuilder builder =
        new io.kubernetes.client.openapi.models.V1APIResourceBuilder(item);
    _visitables
        .get("resources")
        .add(index >= 0 ? index : _visitables.get("resources").size(), builder);
    this.resources.add(index >= 0 ? index : resources.size(), builder);
    return (A) this;
  }

  public A setToResources(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIResource item) {
    if (this.resources == null) {
      this.resources =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIResourceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1APIResourceBuilder builder =
        new io.kubernetes.client.openapi.models.V1APIResourceBuilder(item);
    if (index < 0 || index >= _visitables.get("resources").size()) {
      _visitables.get("resources").add(builder);
    } else {
      _visitables.get("resources").set(index, builder);
    }
    if (index < 0 || index >= resources.size()) {
      resources.add(builder);
    } else {
      resources.set(index, builder);
    }
    return (A) this;
  }

  public A addToResources(io.kubernetes.client.openapi.models.V1APIResource... items) {
    if (this.resources == null) {
      this.resources =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIResourceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1APIResource item : items) {
      io.kubernetes.client.openapi.models.V1APIResourceBuilder builder =
          new io.kubernetes.client.openapi.models.V1APIResourceBuilder(item);
      _visitables.get("resources").add(builder);
      this.resources.add(builder);
    }
    return (A) this;
  }

  public A addAllToResources(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIResource> items) {
    if (this.resources == null) {
      this.resources =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIResourceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1APIResource item : items) {
      io.kubernetes.client.openapi.models.V1APIResourceBuilder builder =
          new io.kubernetes.client.openapi.models.V1APIResourceBuilder(item);
      _visitables.get("resources").add(builder);
      this.resources.add(builder);
    }
    return (A) this;
  }

  public A removeFromResources(io.kubernetes.client.openapi.models.V1APIResource... items) {
    for (io.kubernetes.client.openapi.models.V1APIResource item : items) {
      io.kubernetes.client.openapi.models.V1APIResourceBuilder builder =
          new io.kubernetes.client.openapi.models.V1APIResourceBuilder(item);
      _visitables.get("resources").remove(builder);
      if (this.resources != null) {
        this.resources.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromResources(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIResource> items) {
    for (io.kubernetes.client.openapi.models.V1APIResource item : items) {
      io.kubernetes.client.openapi.models.V1APIResourceBuilder builder =
          new io.kubernetes.client.openapi.models.V1APIResourceBuilder(item);
      _visitables.get("resources").remove(builder);
      if (this.resources != null) {
        this.resources.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromResources(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder>
          predicate) {
    if (resources == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1APIResourceBuilder> each =
        resources.iterator();
    final List visitables = _visitables.get("resources");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1APIResourceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildResources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1APIResource> getResources() {
    return resources != null ? build(resources) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1APIResource> buildResources() {
    return resources != null ? build(resources) : null;
  }

  public io.kubernetes.client.openapi.models.V1APIResource buildResource(java.lang.Integer index) {
    return this.resources.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1APIResource buildFirstResource() {
    return this.resources.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1APIResource buildLastResource() {
    return this.resources.get(resources.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1APIResource buildMatchingResource(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1APIResourceBuilder item : resources) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingResource(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1APIResourceBuilder item : resources) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withResources(
      java.util.List<io.kubernetes.client.openapi.models.V1APIResource> resources) {
    if (this.resources != null) {
      _visitables.get("resources").removeAll(this.resources);
    }
    if (resources != null) {
      this.resources = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1APIResource item : resources) {
        this.addToResources(item);
      }
    } else {
      this.resources = null;
    }
    return (A) this;
  }

  public A withResources(io.kubernetes.client.openapi.models.V1APIResource... resources) {
    if (this.resources != null) {
      this.resources.clear();
    }
    if (resources != null) {
      for (io.kubernetes.client.openapi.models.V1APIResource item : resources) {
        this.addToResources(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasResources() {
    return resources != null && !resources.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      addNewResource() {
    return new io.kubernetes.client.openapi.models.V1APIResourceListFluentImpl
        .ResourcesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      addNewResourceLike(io.kubernetes.client.openapi.models.V1APIResource item) {
    return new io.kubernetes.client.openapi.models.V1APIResourceListFluentImpl.ResourcesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      setNewResourceLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIResource item) {
    return new io.kubernetes.client.openapi.models.V1APIResourceListFluentImpl.ResourcesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      editResource(java.lang.Integer index) {
    if (resources.size() <= index)
      throw new RuntimeException("Can't edit resources. Index exceeds size.");
    return setNewResourceLike(index, buildResource(index));
  }

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      editFirstResource() {
    if (resources.size() == 0)
      throw new RuntimeException("Can't edit first resources. The list is empty.");
    return setNewResourceLike(0, buildResource(0));
  }

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      editLastResource() {
    int index = resources.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resources. The list is empty.");
    return setNewResourceLike(index, buildResource(index));
  }

  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A>
      editMatchingResource(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < resources.size(); i++) {
      if (predicate.test(resources.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching resources. No match found.");
    return setNewResourceLike(index, buildResource(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIResourceListFluentImpl that = (V1APIResourceListFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (groupVersion != null ? !groupVersion.equals(that.groupVersion) : that.groupVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (resources != null ? !resources.equals(that.resources) : that.resources != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, groupVersion, kind, resources, super.hashCode());
  }

  public class ResourcesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1APIResourceFluentImpl<
          io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<N>>
      implements io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourcesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIResource item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1APIResourceBuilder(this, item);
    }

    ResourcesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1APIResourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1APIResourceBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1APIResourceListFluentImpl.this.setToResources(index, builder.build());
    }

    public N endResource() {
      return and();
    }
  }
}
