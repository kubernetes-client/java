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
public interface V2ObjectMetricStatusFluent<
        A extends io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricValueStatus getCurrent();

  public io.kubernetes.client.openapi.models.V2MetricValueStatus buildCurrent();

  public A withCurrent(io.kubernetes.client.openapi.models.V2MetricValueStatus current);

  public java.lang.Boolean hasCurrent();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      withNewCurrent();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item);

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      editCurrent();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      editOrNewCurrent();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<A>
      editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item);

  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference getDescribedObject();

  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference buildDescribedObject();

  public A withDescribedObject(
      io.kubernetes.client.openapi.models.V2CrossVersionObjectReference describedObject);

  public java.lang.Boolean hasDescribedObject();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      withNewDescribedObject();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      withNewDescribedObjectLike(
          io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item);

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      editDescribedObject();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      editOrNewDescribedObject();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<A>
      editOrNewDescribedObjectLike(
          io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item);

  /**
   * This method has been deprecated, please use method buildMetric instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricIdentifier getMetric();

  public io.kubernetes.client.openapi.models.V2MetricIdentifier buildMetric();

  public A withMetric(io.kubernetes.client.openapi.models.V2MetricIdentifier metric);

  public java.lang.Boolean hasMetric();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      withNewMetric();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      withNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      editMetric();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      editOrNewMetric();

  public io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<A>
      editOrNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);

  public interface CurrentNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<
              io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.CurrentNested<N>> {
    public N and();

    public N endCurrent();
  }

  public interface DescribedObjectNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.DescribedObjectNested<
                  N>> {
    public N and();

    public N endDescribedObject();
  }

  public interface MetricNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2MetricIdentifierFluent<
              io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent.MetricNested<N>> {
    public N and();

    public N endMetric();
  }
}
