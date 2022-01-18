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
public class V1beta1EndpointHintsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<A> {
  public V1beta1EndpointHintsFluentImpl() {}

  public V1beta1EndpointHintsFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance) {
    this.withForZones(instance.getForZones());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> forZones;

  public A addToForZones(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1ForZone item) {
    if (this.forZones == null) {
      this.forZones =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder(item);
    _visitables
        .get("forZones")
        .add(index >= 0 ? index : _visitables.get("forZones").size(), builder);
    this.forZones.add(index >= 0 ? index : forZones.size(), builder);
    return (A) this;
  }

  public A setToForZones(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1ForZone item) {
    if (this.forZones == null) {
      this.forZones =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder(item);
    if (index < 0 || index >= _visitables.get("forZones").size()) {
      _visitables.get("forZones").add(builder);
    } else {
      _visitables.get("forZones").set(index, builder);
    }
    if (index < 0 || index >= forZones.size()) {
      forZones.add(builder);
    } else {
      forZones.set(index, builder);
    }
    return (A) this;
  }

  public A addToForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... items) {
    if (this.forZones == null) {
      this.forZones =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1ForZone item : items) {
      io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder(item);
      _visitables.get("forZones").add(builder);
      this.forZones.add(builder);
    }
    return (A) this;
  }

  public A addAllToForZones(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ForZone> items) {
    if (this.forZones == null) {
      this.forZones =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1ForZone item : items) {
      io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder(item);
      _visitables.get("forZones").add(builder);
      this.forZones.add(builder);
    }
    return (A) this;
  }

  public A removeFromForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... items) {
    for (io.kubernetes.client.openapi.models.V1beta1ForZone item : items) {
      io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder(item);
      _visitables.get("forZones").remove(builder);
      if (this.forZones != null) {
        this.forZones.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromForZones(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ForZone> items) {
    for (io.kubernetes.client.openapi.models.V1beta1ForZone item : items) {
      io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder(item);
      _visitables.get("forZones").remove(builder);
      if (this.forZones != null) {
        this.forZones.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromForZones(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>
          predicate) {
    if (forZones == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> each =
        forZones.iterator();
    final List visitables = _visitables.get("forZones");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildForZones instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1ForZone> getForZones() {
    return forZones != null ? build(forZones) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1ForZone> buildForZones() {
    return forZones != null ? build(forZones) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1ForZone buildForZone(java.lang.Integer index) {
    return this.forZones.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1ForZone buildFirstForZone() {
    return this.forZones.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1ForZone buildLastForZone() {
    return this.forZones.get(forZones.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1ForZone buildMatchingForZone(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder item : forZones) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingForZone(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder item : forZones) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withForZones(
      java.util.List<io.kubernetes.client.openapi.models.V1beta1ForZone> forZones) {
    if (this.forZones != null) {
      _visitables.get("forZones").removeAll(this.forZones);
    }
    if (forZones != null) {
      this.forZones = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta1ForZone item : forZones) {
        this.addToForZones(item);
      }
    } else {
      this.forZones = null;
    }
    return (A) this;
  }

  public A withForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... forZones) {
    if (this.forZones != null) {
      this.forZones.clear();
    }
    if (forZones != null) {
      for (io.kubernetes.client.openapi.models.V1beta1ForZone item : forZones) {
        this.addToForZones(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasForZones() {
    return forZones != null && !forZones.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A>
      addNewForZone() {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluentImpl
        .ForZonesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A>
      addNewForZoneLike(io.kubernetes.client.openapi.models.V1beta1ForZone item) {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluentImpl
        .ForZonesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A>
      setNewForZoneLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1ForZone item) {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluentImpl
        .ForZonesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A>
      editForZone(java.lang.Integer index) {
    if (forZones.size() <= index)
      throw new RuntimeException("Can't edit forZones. Index exceeds size.");
    return setNewForZoneLike(index, buildForZone(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A>
      editFirstForZone() {
    if (forZones.size() == 0)
      throw new RuntimeException("Can't edit first forZones. The list is empty.");
    return setNewForZoneLike(0, buildForZone(0));
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A>
      editLastForZone() {
    int index = forZones.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last forZones. The list is empty.");
    return setNewForZoneLike(index, buildForZone(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A>
      editMatchingForZone(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < forZones.size(); i++) {
      if (predicate.test(forZones.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching forZones. No match found.");
    return setNewForZoneLike(index, buildForZone(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1EndpointHintsFluentImpl that = (V1beta1EndpointHintsFluentImpl) o;
    if (forZones != null ? !forZones.equals(that.forZones) : that.forZones != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(forZones, super.hashCode());
  }

  public class ForZonesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1ForZoneFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ForZonesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1ForZone item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder(this, item);
    }

    ForZonesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1beta1EndpointHintsFluentImpl.this.setToForZones(index, builder.build());
    }

    public N endForZone() {
      return and();
    }
  }
}
