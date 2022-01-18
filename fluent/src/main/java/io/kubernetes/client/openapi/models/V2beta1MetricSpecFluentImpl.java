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
public class V2beta1MetricSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<A> {
  public V2beta1MetricSpecFluentImpl() {}

  public V2beta1MetricSpecFluentImpl(
      io.kubernetes.client.openapi.models.V2beta1MetricSpec instance) {
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());
  }

  private io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceBuilder
      containerResource;
  private io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceBuilder external;
  private io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder _object;
  private io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceBuilder pods;
  private io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceBuilder resource;
  private java.lang.String type;

  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource
      getContainerResource() {
    return this.containerResource != null ? this.containerResource.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource
      buildContainerResource() {
    return this.containerResource != null ? this.containerResource.build() : null;
  }

  public A withContainerResource(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource containerResource) {
    _visitables.get("containerResource").remove(this.containerResource);
    if (containerResource != null) {
      this.containerResource =
          new io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceBuilder(
              containerResource);
      _visitables.get("containerResource").add(this.containerResource);
    }
    return (A) this;
  }

  public java.lang.Boolean hasContainerResource() {
    return this.containerResource != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      withNewContainerResource() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl
        .ContainerResourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      withNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl
        .ContainerResourceNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      editContainerResource() {
    return withNewContainerResourceLike(getContainerResource());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      editOrNewContainerResource() {
    return withNewContainerResourceLike(
        getContainerResource() != null
            ? getContainerResource()
            : new io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      editOrNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource item) {
    return withNewContainerResourceLike(
        getContainerResource() != null ? getContainerResource() : item);
  }

  /**
   * This method has been deprecated, please use method buildExternal instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource getExternal() {
    return this.external != null ? this.external.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource buildExternal() {
    return this.external != null ? this.external.build() : null;
  }

  public A withExternal(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource external) {
    _visitables.get("external").remove(this.external);
    if (external != null) {
      this.external =
          new io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceBuilder(external);
      _visitables.get("external").add(this.external);
    }
    return (A) this;
  }

  public java.lang.Boolean hasExternal() {
    return this.external != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      withNewExternal() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl.ExternalNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      withNewExternalLike(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl.ExternalNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      editExternal() {
    return withNewExternalLike(getExternal());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      editOrNewExternal() {
    return withNewExternalLike(
        getExternal() != null
            ? getExternal()
            : new io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      editOrNewExternalLike(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource item) {
    return withNewExternalLike(getExternal() != null ? getExternal() : item);
  }

  /**
   * This method has been deprecated, please use method buildObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource getObject() {
    return this._object != null ? this._object.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource buildObject() {
    return this._object != null ? this._object.build() : null;
  }

  public A withObject(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource _object) {
    _visitables.get("_object").remove(this._object);
    if (_object != null) {
      this._object =
          new io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder(_object);
      _visitables.get("_object").add(this._object);
    }
    return (A) this;
  }

  public java.lang.Boolean hasObject() {
    return this._object != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A>
      withNewObject() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl.ObjectNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A>
      withNewObjectLike(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl.ObjectNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A> editObject() {
    return withNewObjectLike(getObject());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A>
      editOrNewObject() {
    return withNewObjectLike(
        getObject() != null
            ? getObject()
            : new io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A>
      editOrNewObjectLike(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource item) {
    return withNewObjectLike(getObject() != null ? getObject() : item);
  }

  /**
   * This method has been deprecated, please use method buildPods instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSource getPods() {
    return this.pods != null ? this.pods.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSource buildPods() {
    return this.pods != null ? this.pods.build() : null;
  }

  public A withPods(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource pods) {
    _visitables.get("pods").remove(this.pods);
    if (pods != null) {
      this.pods = new io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceBuilder(pods);
      _visitables.get("pods").add(this.pods);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPods() {
    return this.pods != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> withNewPods() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl.PodsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> withNewPodsLike(
      io.kubernetes.client.openapi.models.V2beta1PodsMetricSource item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl.PodsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> editPods() {
    return withNewPodsLike(getPods());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> editOrNewPods() {
    return withNewPodsLike(
        getPods() != null
            ? getPods()
            : new io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A>
      editOrNewPodsLike(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource item) {
    return withNewPodsLike(getPods() != null ? getPods() : item);
  }

  /**
   * This method has been deprecated, please use method buildResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource getResource() {
    return this.resource != null ? this.resource.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }

  public A withResource(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource resource) {
    _visitables.get("resource").remove(this.resource);
    if (resource != null) {
      this.resource =
          new io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceBuilder(resource);
      _visitables.get("resource").add(this.resource);
    }
    return (A) this;
  }

  public java.lang.Boolean hasResource() {
    return this.resource != null;
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      withNewResource() {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl.ResourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      withNewResourceLike(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource item) {
    return new io.kubernetes.client.openapi.models.V2beta1MetricSpecFluentImpl.ResourceNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      editResource() {
    return withNewResourceLike(getResource());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      editOrNewResource() {
    return withNewResourceLike(
        getResource() != null
            ? getResource()
            : new io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      editOrNewResourceLike(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource item) {
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
    V2beta1MetricSpecFluentImpl that = (V2beta1MetricSpecFluentImpl) o;
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
      extends io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent
                  .ContainerResourceNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ContainerResourceNestedImpl(
        io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceBuilder(
              this, item);
    }

    ContainerResourceNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceBuilder builder;

    public N and() {
      return (N) V2beta1MetricSpecFluentImpl.this.withContainerResource(builder.build());
    }

    public N endContainerResource() {
      return and();
    }
  }

  public class ExternalNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ExternalNestedImpl(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceBuilder(this, item);
    }

    ExternalNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceBuilder builder;

    public N and() {
      return (N) V2beta1MetricSpecFluentImpl.this.withExternal(builder.build());
    }

    public N endExternal() {
      return and();
    }
  }

  public class ObjectNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ObjectNestedImpl(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder(this, item);
    }

    ObjectNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder builder;

    public N and() {
      return (N) V2beta1MetricSpecFluentImpl.this.withObject(builder.build());
    }

    public N endObject() {
      return and();
    }
  }

  public class PodsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PodsNestedImpl(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceBuilder(this, item);
    }

    PodsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceBuilder builder;

    public N and() {
      return (N) V2beta1MetricSpecFluentImpl.this.withPods(builder.build());
    }

    public N endPods() {
      return and();
    }
  }

  public class ResourceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceFluentImpl<
          io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourceNestedImpl(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceBuilder(this, item);
    }

    ResourceNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceBuilder builder;

    public N and() {
      return (N) V2beta1MetricSpecFluentImpl.this.withResource(builder.build());
    }

    public N endResource() {
      return and();
    }
  }
}
