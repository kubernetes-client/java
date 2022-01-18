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
public class V2beta1MetricStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent<A> {
  public V2beta1MetricStatusFluentImpl() {}

  public V2beta1MetricStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1MetricStatus instance) {
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());
  }

  private io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusBuilder
      containerResource;
  private io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder external;
  private io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder _object;
  private io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusBuilder pods;
  private io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusBuilder resource;
  private java.lang.String type;

  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus
      getContainerResource() {
    return this.containerResource != null ? this.containerResource.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus
      buildContainerResource() {
    return this.containerResource != null ? this.containerResource.build() : null;
  }

  public A withContainerResource(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus containerResource) {
    _visitables.get("containerResource").remove(this.containerResource);
    if (containerResource != null) {
      this.containerResource =
          new io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusBuilder(
              containerResource);
      _visitables.get("containerResource").add(this.containerResource);
    }
    return (A) this;
  }

  public java.lang.Boolean hasContainerResource() {
    return this.containerResource != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ContainerResourceNested<A>
      withNewContainerResource() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl
        .ContainerResourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ContainerResourceNested<A>
      withNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl
        .ContainerResourceNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ContainerResourceNested<A>
      editContainerResource() {
    return withNewContainerResourceLike(getContainerResource());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ContainerResourceNested<A>
      editOrNewContainerResource() {
    return withNewContainerResourceLike(
        getContainerResource() != null
            ? getContainerResource()
            : new io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ContainerResourceNested<A>
      editOrNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus item) {
    return withNewContainerResourceLike(
        getContainerResource() != null ? getContainerResource() : item);
  }

  /**
   * This method has been deprecated, please use method buildExternal instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus getExternal() {
    return this.external != null ? this.external.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus buildExternal() {
    return this.external != null ? this.external.build() : null;
  }

  public A withExternal(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus external) {
    _visitables.get("external").remove(this.external);
    if (external != null) {
      this.external =
          new io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder(external);
      _visitables.get("external").add(this.external);
    }
    return (A) this;
  }

  public java.lang.Boolean hasExternal() {
    return this.external != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ExternalNested<A>
      withNewExternal() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl
        .ExternalNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ExternalNested<A>
      withNewExternalLike(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl.ExternalNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ExternalNested<A>
      editExternal() {
    return withNewExternalLike(getExternal());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ExternalNested<A>
      editOrNewExternal() {
    return withNewExternalLike(
        getExternal() != null
            ? getExternal()
            : new io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ExternalNested<A>
      editOrNewExternalLike(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus item) {
    return withNewExternalLike(getExternal() != null ? getExternal() : item);
  }

  /**
   * This method has been deprecated, please use method buildObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus getObject() {
    return this._object != null ? this._object.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus buildObject() {
    return this._object != null ? this._object.build() : null;
  }

  public A withObject(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus _object) {
    _visitables.get("_object").remove(this._object);
    if (_object != null) {
      this._object =
          new io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder(_object);
      _visitables.get("_object").add(this._object);
    }
    return (A) this;
  }

  public java.lang.Boolean hasObject() {
    return this._object != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ObjectNested<A>
      withNewObject() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl.ObjectNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ObjectNested<A>
      withNewObjectLike(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl.ObjectNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ObjectNested<A>
      editObject() {
    return withNewObjectLike(getObject());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ObjectNested<A>
      editOrNewObject() {
    return withNewObjectLike(
        getObject() != null
            ? getObject()
            : new io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ObjectNested<A>
      editOrNewObjectLike(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus item) {
    return withNewObjectLike(getObject() != null ? getObject() : item);
  }

  /**
   * This method has been deprecated, please use method buildPods instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus getPods() {
    return this.pods != null ? this.pods.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus buildPods() {
    return this.pods != null ? this.pods.build() : null;
  }

  public A withPods(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus pods) {
    _visitables.get("pods").remove(this.pods);
    if (pods != null) {
      this.pods = new io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusBuilder(pods);
      _visitables.get("pods").add(this.pods);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPods() {
    return this.pods != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.PodsNested<A> withNewPods() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl.PodsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.PodsNested<A>
      withNewPodsLike(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl.PodsNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.PodsNested<A> editPods() {
    return withNewPodsLike(getPods());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.PodsNested<A>
      editOrNewPods() {
    return withNewPodsLike(
        getPods() != null
            ? getPods()
            : new io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.PodsNested<A>
      editOrNewPodsLike(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus item) {
    return withNewPodsLike(getPods() != null ? getPods() : item);
  }

  /**
   * This method has been deprecated, please use method buildResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus getResource() {
    return this.resource != null ? this.resource.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }

  public A withResource(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus resource) {
    _visitables.get("resource").remove(this.resource);
    if (resource != null) {
      this.resource =
          new io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusBuilder(resource);
      _visitables.get("resource").add(this.resource);
    }
    return (A) this;
  }

  public java.lang.Boolean hasResource() {
    return this.resource != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ResourceNested<A>
      withNewResource() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl
        .ResourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ResourceNested<A>
      withNewResourceLike(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricStatusFluentImpl.ResourceNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ResourceNested<A>
      editResource() {
    return withNewResourceLike(getResource());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ResourceNested<A>
      editOrNewResource() {
    return withNewResourceLike(
        getResource() != null
            ? getResource()
            : new io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ResourceNested<A>
      editOrNewResourceLike(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus item) {
    return withNewResourceLike(getResource() != null ? getResource() : item);
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
    V2beta1MetricStatusFluentImpl that = (V2beta1MetricStatusFluentImpl) o;
    if (containerResource != null
        ? !containerResource.equals(that.containerResource)
        : that.containerResource != null) return false;
    if (external != null ? !external.equals(that.external) : that.external != null) return false;
    if (_object != null ? !_object.equals(that._object) : that._object != null) return false;
    if (pods != null ? !pods.equals(that.pods) : that.pods != null) return false;
    if (resource != null ? !resource.equals(that.resource) : that.resource != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        containerResource, external, _object, pods, resource, type, super.hashCode());
  }

  public class ContainerResourceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ContainerResourceNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent
                  .ContainerResourceNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ContainerResourceNestedImpl(
        io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusBuilder(
              this, item);
    }

    ContainerResourceNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusBuilder builder;

    public N and() {
      return (N) V2beta1MetricStatusFluentImpl.this.withContainerResource(builder.build());
    }

    public N endContainerResource() {
      return and();
    }
  }

  public class ExternalNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ExternalNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ExternalNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ExternalNestedImpl(io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder(this, item);
    }

    ExternalNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder builder;

    public N and() {
      return (N) V2beta1MetricStatusFluentImpl.this.withExternal(builder.build());
    }

    public N endExternal() {
      return and();
    }
  }

  public class ObjectNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ObjectNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ObjectNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ObjectNestedImpl(io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder(this, item);
    }

    ObjectNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder builder;

    public N and() {
      return (N) V2beta1MetricStatusFluentImpl.this.withObject(builder.build());
    }

    public N endObject() {
      return and();
    }
  }

  public class PodsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.PodsNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.PodsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PodsNestedImpl(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusBuilder(this, item);
    }

    PodsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusBuilder builder;

    public N and() {
      return (N) V2beta1MetricStatusFluentImpl.this.withPods(builder.build());
    }

    public N endPods() {
      return and();
    }
  }

  public class ResourceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ResourceNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent.ResourceNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourceNestedImpl(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusBuilder(this, item);
    }

    ResourceNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusBuilder builder;

    public N and() {
      return (N) V2beta1MetricStatusFluentImpl.this.withResource(builder.build());
    }

    public N endResource() {
      return and();
    }
  }
}
