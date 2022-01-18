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
public class V1AffinityFluentImpl<A extends io.kubernetes.client.openapi.models.V1AffinityFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1AffinityFluent<A> {
  public V1AffinityFluentImpl() {}

  public V1AffinityFluentImpl(io.kubernetes.client.openapi.models.V1Affinity instance) {
    this.withNodeAffinity(instance.getNodeAffinity());

    this.withPodAffinity(instance.getPodAffinity());

    this.withPodAntiAffinity(instance.getPodAntiAffinity());
  }

  private io.kubernetes.client.openapi.models.V1NodeAffinityBuilder nodeAffinity;
  private io.kubernetes.client.openapi.models.V1PodAffinityBuilder podAffinity;
  private io.kubernetes.client.openapi.models.V1PodAntiAffinityBuilder podAntiAffinity;

  /**
   * This method has been deprecated, please use method buildNodeAffinity instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeAffinity getNodeAffinity() {
    return this.nodeAffinity != null ? this.nodeAffinity.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinity buildNodeAffinity() {
    return this.nodeAffinity != null ? this.nodeAffinity.build() : null;
  }

  public A withNodeAffinity(io.kubernetes.client.openapi.models.V1NodeAffinity nodeAffinity) {
    _visitables.get("nodeAffinity").remove(this.nodeAffinity);
    if (nodeAffinity != null) {
      this.nodeAffinity =
          new io.kubernetes.client.openapi.models.V1NodeAffinityBuilder(nodeAffinity);
      _visitables.get("nodeAffinity").add(this.nodeAffinity);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodeAffinity() {
    return this.nodeAffinity != null;
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A>
      withNewNodeAffinity() {
    return new io.kubernetes.client.openapi.models.V1AffinityFluentImpl.NodeAffinityNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A>
      withNewNodeAffinityLike(io.kubernetes.client.openapi.models.V1NodeAffinity item) {
    return new io.kubernetes.client.openapi.models.V1AffinityFluentImpl.NodeAffinityNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A>
      editNodeAffinity() {
    return withNewNodeAffinityLike(getNodeAffinity());
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A>
      editOrNewNodeAffinity() {
    return withNewNodeAffinityLike(
        getNodeAffinity() != null
            ? getNodeAffinity()
            : new io.kubernetes.client.openapi.models.V1NodeAffinityBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A>
      editOrNewNodeAffinityLike(io.kubernetes.client.openapi.models.V1NodeAffinity item) {
    return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity() : item);
  }

  /**
   * This method has been deprecated, please use method buildPodAffinity instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PodAffinity getPodAffinity() {
    return this.podAffinity != null ? this.podAffinity.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PodAffinity buildPodAffinity() {
    return this.podAffinity != null ? this.podAffinity.build() : null;
  }

  public A withPodAffinity(io.kubernetes.client.openapi.models.V1PodAffinity podAffinity) {
    _visitables.get("podAffinity").remove(this.podAffinity);
    if (podAffinity != null) {
      this.podAffinity = new io.kubernetes.client.openapi.models.V1PodAffinityBuilder(podAffinity);
      _visitables.get("podAffinity").add(this.podAffinity);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPodAffinity() {
    return this.podAffinity != null;
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A>
      withNewPodAffinity() {
    return new io.kubernetes.client.openapi.models.V1AffinityFluentImpl.PodAffinityNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A>
      withNewPodAffinityLike(io.kubernetes.client.openapi.models.V1PodAffinity item) {
    return new io.kubernetes.client.openapi.models.V1AffinityFluentImpl.PodAffinityNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A>
      editPodAffinity() {
    return withNewPodAffinityLike(getPodAffinity());
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A>
      editOrNewPodAffinity() {
    return withNewPodAffinityLike(
        getPodAffinity() != null
            ? getPodAffinity()
            : new io.kubernetes.client.openapi.models.V1PodAffinityBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A>
      editOrNewPodAffinityLike(io.kubernetes.client.openapi.models.V1PodAffinity item) {
    return withNewPodAffinityLike(getPodAffinity() != null ? getPodAffinity() : item);
  }

  /**
   * This method has been deprecated, please use method buildPodAntiAffinity instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PodAntiAffinity getPodAntiAffinity() {
    return this.podAntiAffinity != null ? this.podAntiAffinity.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinity buildPodAntiAffinity() {
    return this.podAntiAffinity != null ? this.podAntiAffinity.build() : null;
  }

  public A withPodAntiAffinity(
      io.kubernetes.client.openapi.models.V1PodAntiAffinity podAntiAffinity) {
    _visitables.get("podAntiAffinity").remove(this.podAntiAffinity);
    if (podAntiAffinity != null) {
      this.podAntiAffinity =
          new io.kubernetes.client.openapi.models.V1PodAntiAffinityBuilder(podAntiAffinity);
      _visitables.get("podAntiAffinity").add(this.podAntiAffinity);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPodAntiAffinity() {
    return this.podAntiAffinity != null;
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A>
      withNewPodAntiAffinity() {
    return new io.kubernetes.client.openapi.models.V1AffinityFluentImpl.PodAntiAffinityNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A>
      withNewPodAntiAffinityLike(io.kubernetes.client.openapi.models.V1PodAntiAffinity item) {
    return new io.kubernetes.client.openapi.models.V1AffinityFluentImpl.PodAntiAffinityNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A>
      editPodAntiAffinity() {
    return withNewPodAntiAffinityLike(getPodAntiAffinity());
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A>
      editOrNewPodAntiAffinity() {
    return withNewPodAntiAffinityLike(
        getPodAntiAffinity() != null
            ? getPodAntiAffinity()
            : new io.kubernetes.client.openapi.models.V1PodAntiAffinityBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A>
      editOrNewPodAntiAffinityLike(io.kubernetes.client.openapi.models.V1PodAntiAffinity item) {
    return withNewPodAntiAffinityLike(getPodAntiAffinity() != null ? getPodAntiAffinity() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AffinityFluentImpl that = (V1AffinityFluentImpl) o;
    if (nodeAffinity != null ? !nodeAffinity.equals(that.nodeAffinity) : that.nodeAffinity != null)
      return false;
    if (podAffinity != null ? !podAffinity.equals(that.podAffinity) : that.podAffinity != null)
      return false;
    if (podAntiAffinity != null
        ? !podAntiAffinity.equals(that.podAntiAffinity)
        : that.podAntiAffinity != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(nodeAffinity, podAffinity, podAntiAffinity, super.hashCode());
  }

  public class NodeAffinityNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeAffinityFluentImpl<
          io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<N>>
      implements io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    NodeAffinityNestedImpl(io.kubernetes.client.openapi.models.V1NodeAffinity item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeAffinityBuilder(this, item);
    }

    NodeAffinityNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeAffinityBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeAffinityBuilder builder;

    public N and() {
      return (N) V1AffinityFluentImpl.this.withNodeAffinity(builder.build());
    }

    public N endNodeAffinity() {
      return and();
    }
  }

  public class PodAffinityNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodAffinityFluentImpl<
          io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<N>>
      implements io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PodAffinityNestedImpl(io.kubernetes.client.openapi.models.V1PodAffinity item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PodAffinityBuilder(this, item);
    }

    PodAffinityNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodAffinityBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodAffinityBuilder builder;

    public N and() {
      return (N) V1AffinityFluentImpl.this.withPodAffinity(builder.build());
    }

    public N endPodAffinity() {
      return and();
    }
  }

  public class PodAntiAffinityNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodAntiAffinityFluentImpl<
          io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<N>>
      implements io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PodAntiAffinityNestedImpl(io.kubernetes.client.openapi.models.V1PodAntiAffinity item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PodAntiAffinityBuilder(this, item);
    }

    PodAntiAffinityNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodAntiAffinityBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodAntiAffinityBuilder builder;

    public N and() {
      return (N) V1AffinityFluentImpl.this.withPodAntiAffinity(builder.build());
    }

    public N endPodAntiAffinity() {
      return and();
    }
  }
}
