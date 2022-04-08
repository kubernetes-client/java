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
public interface V2ObjectMetricSourceFluent<A extends V2ObjectMetricSourceFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2CrossVersionObjectReference getDescribedObject();

  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference buildDescribedObject();

  public A withDescribedObject(
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReference describedObject);

  public Boolean hasDescribedObject();

  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObject();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
      withNewDescribedObjectLike(
          io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item);

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
      editDescribedObject();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
      editOrNewDescribedObject();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.DescribedObjectNested<A>
      editOrNewDescribedObjectLike(
          io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item);

  /**
   * This method has been deprecated, please use method buildMetric instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2MetricIdentifier getMetric();

  public io.kubernetes.client.openapi.models.V2MetricIdentifier buildMetric();

  public A withMetric(io.kubernetes.client.openapi.models.V2MetricIdentifier metric);

  public java.lang.Boolean hasMetric();

  public V2ObjectMetricSourceFluent.MetricNested<A> withNewMetric();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      withNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      editMetric();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      editOrNewMetric();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.MetricNested<A>
      editOrNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2MetricTarget getTarget();

  public io.kubernetes.client.openapi.models.V2MetricTarget buildTarget();

  public A withTarget(io.kubernetes.client.openapi.models.V2MetricTarget target);

  public java.lang.Boolean hasTarget();

  public V2ObjectMetricSourceFluent.TargetNested<A> withNewTarget();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      withNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      editTarget();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      editOrNewTarget();

  public io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent.TargetNested<A>
      editOrNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);

  public interface DescribedObjectNested<N>
      extends Nested<N>,
          V2CrossVersionObjectReferenceFluent<V2ObjectMetricSourceFluent.DescribedObjectNested<N>> {
    public N and();

    public N endDescribedObject();
  }

  public interface MetricNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2MetricIdentifierFluent<V2ObjectMetricSourceFluent.MetricNested<N>> {
    public N and();

    public N endMetric();
  }

  public interface TargetNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V2MetricTargetFluent<V2ObjectMetricSourceFluent.TargetNested<N>> {
    public N and();

    public N endTarget();
  }
}
