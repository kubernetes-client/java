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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V2beta2MetricStatusFluent<A extends V2beta2MetricStatusFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ContainerResourceMetricStatus getContainerResource();

  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus
      buildContainerResource();

  public A withContainerResource(
      io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus containerResource);

  public Boolean hasContainerResource();

  public V2beta2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResource();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A>
      withNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A>
      editContainerResource();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A>
      editOrNewContainerResource();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A>
      editOrNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus item);

  /**
   * This method has been deprecated, please use method buildExternal instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta2ExternalMetricStatus getExternal();

  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus buildExternal();

  public A withExternal(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus external);

  public java.lang.Boolean hasExternal();

  public V2beta2MetricStatusFluent.ExternalNested<A> withNewExternal();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A>
      withNewExternalLike(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A>
      editExternal();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A>
      editOrNewExternal();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A>
      editOrNewExternalLike(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus item);

  /**
   * This method has been deprecated, please use method buildObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta2ObjectMetricStatus getObject();

  public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus buildObject();

  public A withObject(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus _object);

  public java.lang.Boolean hasObject();

  public V2beta2MetricStatusFluent.ObjectNested<A> withNewObject();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A>
      withNewObjectLike(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> editObject();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A>
      editOrNewObject();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A>
      editOrNewObjectLike(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus item);

  /**
   * This method has been deprecated, please use method buildPods instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta2PodsMetricStatus getPods();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus buildPods();

  public A withPods(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus pods);

  public java.lang.Boolean hasPods();

  public V2beta2MetricStatusFluent.PodsNested<A> withNewPods();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A>
      withNewPodsLike(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> editPods();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A>
      editOrNewPods();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A>
      editOrNewPodsLike(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus item);

  /**
   * This method has been deprecated, please use method buildResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta2ResourceMetricStatus getResource();

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus buildResource();

  public A withResource(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus resource);

  public java.lang.Boolean hasResource();

  public V2beta2MetricStatusFluent.ResourceNested<A> withNewResource();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A>
      withNewResourceLike(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A>
      editResource();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A>
      editOrNewResource();

  public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A>
      editOrNewResourceLike(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus item);

  public String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  public interface ContainerResourceNested<N>
      extends Nested<N>,
          V2beta2ContainerResourceMetricStatusFluent<
              V2beta2MetricStatusFluent.ContainerResourceNested<N>> {
    public N and();

    public N endContainerResource();
  }

  public interface ExternalNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta2ExternalMetricStatusFluent<V2beta2MetricStatusFluent.ExternalNested<N>> {
    public N and();

    public N endExternal();
  }

  public interface ObjectNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta2ObjectMetricStatusFluent<V2beta2MetricStatusFluent.ObjectNested<N>> {
    public N and();

    public N endObject();
  }

  public interface PodsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta2PodsMetricStatusFluent<V2beta2MetricStatusFluent.PodsNested<N>> {
    public N and();

    public N endPods();
  }

  public interface ResourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta2ResourceMetricStatusFluent<V2beta2MetricStatusFluent.ResourceNested<N>> {
    public N and();

    public N endResource();
  }
}
