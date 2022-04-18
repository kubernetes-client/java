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
public interface V2beta1MetricSpecFluent<A extends V2beta1MetricSpecFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2beta1ContainerResourceMetricSource getContainerResource();

  public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource
      buildContainerResource();

  public A withContainerResource(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource containerResource);

  public Boolean hasContainerResource();

  public V2beta1MetricSpecFluent.ContainerResourceNested<A> withNewContainerResource();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      withNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource item);

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      editContainerResource();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      editOrNewContainerResource();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A>
      editOrNewContainerResourceLike(
          io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource item);

  /**
   * This method has been deprecated, please use method buildExternal instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta1ExternalMetricSource getExternal();

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource buildExternal();

  public A withExternal(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource external);

  public java.lang.Boolean hasExternal();

  public V2beta1MetricSpecFluent.ExternalNested<A> withNewExternal();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      withNewExternalLike(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource item);

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      editExternal();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      editOrNewExternal();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A>
      editOrNewExternalLike(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource item);

  /**
   * This method has been deprecated, please use method buildObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta1ObjectMetricSource getObject();

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource buildObject();

  public A withObject(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource _object);

  public java.lang.Boolean hasObject();

  public V2beta1MetricSpecFluent.ObjectNested<A> withNewObject();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A>
      withNewObjectLike(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource item);

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A> editObject();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A>
      editOrNewObject();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A>
      editOrNewObjectLike(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource item);

  /**
   * This method has been deprecated, please use method buildPods instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta1PodsMetricSource getPods();

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSource buildPods();

  public A withPods(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource pods);

  public java.lang.Boolean hasPods();

  public V2beta1MetricSpecFluent.PodsNested<A> withNewPods();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> withNewPodsLike(
      io.kubernetes.client.openapi.models.V2beta1PodsMetricSource item);

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> editPods();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> editOrNewPods();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A>
      editOrNewPodsLike(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource item);

  /**
   * This method has been deprecated, please use method buildResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta1ResourceMetricSource getResource();

  public io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource buildResource();

  public A withResource(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource resource);

  public java.lang.Boolean hasResource();

  public V2beta1MetricSpecFluent.ResourceNested<A> withNewResource();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      withNewResourceLike(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource item);

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      editResource();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      editOrNewResource();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A>
      editOrNewResourceLike(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource item);

  public String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  public interface ContainerResourceNested<N>
      extends Nested<N>,
          V2beta1ContainerResourceMetricSourceFluent<
              V2beta1MetricSpecFluent.ContainerResourceNested<N>> {
    public N and();

    public N endContainerResource();
  }

  public interface ExternalNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta1ExternalMetricSourceFluent<V2beta1MetricSpecFluent.ExternalNested<N>> {
    public N and();

    public N endExternal();
  }

  public interface ObjectNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta1ObjectMetricSourceFluent<V2beta1MetricSpecFluent.ObjectNested<N>> {
    public N and();

    public N endObject();
  }

  public interface PodsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta1PodsMetricSourceFluent<V2beta1MetricSpecFluent.PodsNested<N>> {
    public N and();

    public N endPods();
  }

  public interface ResourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2beta1ResourceMetricSourceFluent<V2beta1MetricSpecFluent.ResourceNested<N>> {
    public N and();

    public N endResource();
  }
}
