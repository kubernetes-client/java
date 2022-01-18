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
public interface V2MetricStatusFluent<
        A extends io.kubernetes.client.openapi.models.V2MetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus getContainerResource();

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus
      buildContainerResource();

  public A withContainerResource(
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus containerResource);

  public java.lang.Boolean hasContainerResource();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ContainerResourceNested<A>
      withNewContainerResource();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ContainerResourceNested<A>
      withNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus item);

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ContainerResourceNested<A>
      editContainerResource();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ContainerResourceNested<A>
      editOrNewContainerResource();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ContainerResourceNested<A>
      editOrNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus item);

  /**
   * This method has been deprecated, please use method buildExternal instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatus getExternal();

  public io.kubernetes.client.openapi.models.V2ExternalMetricStatus buildExternal();

  public A withExternal(io.kubernetes.client.openapi.models.V2ExternalMetricStatus external);

  public java.lang.Boolean hasExternal();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ExternalNested<A>
      withNewExternal();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ExternalNested<A>
      withNewExternalLike(io.kubernetes.client.openapi.models.V2ExternalMetricStatus item);

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ExternalNested<A> editExternal();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ExternalNested<A>
      editOrNewExternal();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ExternalNested<A>
      editOrNewExternalLike(io.kubernetes.client.openapi.models.V2ExternalMetricStatus item);

  /**
   * This method has been deprecated, please use method buildObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2ObjectMetricStatus getObject();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatus buildObject();

  public A withObject(io.kubernetes.client.openapi.models.V2ObjectMetricStatus _object);

  public java.lang.Boolean hasObject();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ObjectNested<A> withNewObject();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ObjectNested<A> withNewObjectLike(
      io.kubernetes.client.openapi.models.V2ObjectMetricStatus item);

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ObjectNested<A> editObject();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ObjectNested<A> editOrNewObject();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ObjectNested<A>
      editOrNewObjectLike(io.kubernetes.client.openapi.models.V2ObjectMetricStatus item);

  /**
   * This method has been deprecated, please use method buildPods instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2PodsMetricStatus getPods();

  public io.kubernetes.client.openapi.models.V2PodsMetricStatus buildPods();

  public A withPods(io.kubernetes.client.openapi.models.V2PodsMetricStatus pods);

  public java.lang.Boolean hasPods();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.PodsNested<A> withNewPods();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.PodsNested<A> withNewPodsLike(
      io.kubernetes.client.openapi.models.V2PodsMetricStatus item);

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.PodsNested<A> editPods();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.PodsNested<A> editOrNewPods();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.PodsNested<A> editOrNewPodsLike(
      io.kubernetes.client.openapi.models.V2PodsMetricStatus item);

  /**
   * This method has been deprecated, please use method buildResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2ResourceMetricStatus getResource();

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatus buildResource();

  public A withResource(io.kubernetes.client.openapi.models.V2ResourceMetricStatus resource);

  public java.lang.Boolean hasResource();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ResourceNested<A>
      withNewResource();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ResourceNested<A>
      withNewResourceLike(io.kubernetes.client.openapi.models.V2ResourceMetricStatus item);

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ResourceNested<A> editResource();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ResourceNested<A>
      editOrNewResource();

  public io.kubernetes.client.openapi.models.V2MetricStatusFluent.ResourceNested<A>
      editOrNewResourceLike(io.kubernetes.client.openapi.models.V2ResourceMetricStatus item);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);

  public interface ContainerResourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent<
              io.kubernetes.client.openapi.models.V2MetricStatusFluent.ContainerResourceNested<N>> {
    public N and();

    public N endContainerResource();
  }

  public interface ExternalNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent<
              io.kubernetes.client.openapi.models.V2MetricStatusFluent.ExternalNested<N>> {
    public N and();

    public N endExternal();
  }

  public interface ObjectNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent<
              io.kubernetes.client.openapi.models.V2MetricStatusFluent.ObjectNested<N>> {
    public N and();

    public N endObject();
  }

  public interface PodsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent<
              io.kubernetes.client.openapi.models.V2MetricStatusFluent.PodsNested<N>> {
    public N and();

    public N endPods();
  }

  public interface ResourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent<
              io.kubernetes.client.openapi.models.V2MetricStatusFluent.ResourceNested<N>> {
    public N and();

    public N endResource();
  }
}
