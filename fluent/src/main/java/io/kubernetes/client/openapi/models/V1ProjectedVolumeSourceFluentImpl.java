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
public class V1ProjectedVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<A> {
  public V1ProjectedVolumeSourceFluentImpl() {}

  public V1ProjectedVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSource instance) {
    this.withDefaultMode(instance.getDefaultMode());

    this.withSources(instance.getSources());
  }

  private java.lang.Integer defaultMode;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
      sources;

  public java.lang.Integer getDefaultMode() {
    return this.defaultMode;
  }

  public A withDefaultMode(java.lang.Integer defaultMode) {
    this.defaultMode = defaultMode;
    return (A) this;
  }

  public java.lang.Boolean hasDefaultMode() {
    return this.defaultMode != null;
  }

  public A addToSources(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeProjection item) {
    if (this.sources == null) {
      this.sources =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder builder =
        new io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder(item);
    _visitables.get("sources").add(index >= 0 ? index : _visitables.get("sources").size(), builder);
    this.sources.add(index >= 0 ? index : sources.size(), builder);
    return (A) this;
  }

  public A setToSources(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeProjection item) {
    if (this.sources == null) {
      this.sources =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder builder =
        new io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder(item);
    if (index < 0 || index >= _visitables.get("sources").size()) {
      _visitables.get("sources").add(builder);
    } else {
      _visitables.get("sources").set(index, builder);
    }
    if (index < 0 || index >= sources.size()) {
      sources.add(builder);
    } else {
      sources.set(index, builder);
    }
    return (A) this;
  }

  public A addToSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items) {
    if (this.sources == null) {
      this.sources =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1VolumeProjection item : items) {
      io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder(item);
      _visitables.get("sources").add(builder);
      this.sources.add(builder);
    }
    return (A) this;
  }

  public A addAllToSources(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeProjection> items) {
    if (this.sources == null) {
      this.sources =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1VolumeProjection item : items) {
      io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder(item);
      _visitables.get("sources").add(builder);
      this.sources.add(builder);
    }
    return (A) this;
  }

  public A removeFromSources(io.kubernetes.client.openapi.models.V1VolumeProjection... items) {
    for (io.kubernetes.client.openapi.models.V1VolumeProjection item : items) {
      io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder(item);
      _visitables.get("sources").remove(builder);
      if (this.sources != null) {
        this.sources.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromSources(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeProjection> items) {
    for (io.kubernetes.client.openapi.models.V1VolumeProjection item : items) {
      io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder builder =
          new io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder(item);
      _visitables.get("sources").remove(builder);
      if (this.sources != null) {
        this.sources.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromSources(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
          predicate) {
    if (sources == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder> each =
        sources.iterator();
    final List visitables = _visitables.get("sources");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildSources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> getSources() {
    return sources != null ? build(sources) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> buildSources() {
    return sources != null ? build(sources) : null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjection buildSource(
      java.lang.Integer index) {
    return this.sources.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjection buildFirstSource() {
    return this.sources.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjection buildLastSource() {
    return this.sources.get(sources.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjection buildMatchingSource(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder item : sources) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSource(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder item : sources) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSources(
      java.util.List<io.kubernetes.client.openapi.models.V1VolumeProjection> sources) {
    if (this.sources != null) {
      _visitables.get("sources").removeAll(this.sources);
    }
    if (sources != null) {
      this.sources = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1VolumeProjection item : sources) {
        this.addToSources(item);
      }
    } else {
      this.sources = null;
    }
    return (A) this;
  }

  public A withSources(io.kubernetes.client.openapi.models.V1VolumeProjection... sources) {
    if (this.sources != null) {
      this.sources.clear();
    }
    if (sources != null) {
      for (io.kubernetes.client.openapi.models.V1VolumeProjection item : sources) {
        this.addToSources(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSources() {
    return sources != null && !sources.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      addNewSource() {
    return new io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluentImpl
        .SourcesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      addNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeProjection item) {
    return new io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluentImpl
        .SourcesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      setNewSourceLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeProjection item) {
    return new io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluentImpl
        .SourcesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      editSource(java.lang.Integer index) {
    if (sources.size() <= index)
      throw new RuntimeException("Can't edit sources. Index exceeds size.");
    return setNewSourceLike(index, buildSource(index));
  }

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      editFirstSource() {
    if (sources.size() == 0)
      throw new RuntimeException("Can't edit first sources. The list is empty.");
    return setNewSourceLike(0, buildSource(0));
  }

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      editLastSource() {
    int index = sources.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sources. The list is empty.");
    return setNewSourceLike(index, buildSource(index));
  }

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<A>
      editMatchingSource(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < sources.size(); i++) {
      if (predicate.test(sources.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching sources. No match found.");
    return setNewSourceLike(index, buildSource(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ProjectedVolumeSourceFluentImpl that = (V1ProjectedVolumeSourceFluentImpl) o;
    if (defaultMode != null ? !defaultMode.equals(that.defaultMode) : that.defaultMode != null)
      return false;
    if (sources != null ? !sources.equals(that.sources) : that.sources != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(defaultMode, sources, super.hashCode());
  }

  public class SourcesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl<
          io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<N>>
      implements io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent.SourcesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SourcesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeProjection item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder(this, item);
    }

    SourcesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeProjectionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ProjectedVolumeSourceFluentImpl.this.setToSources(index, builder.build());
    }

    public N endSource() {
      return and();
    }
  }
}
