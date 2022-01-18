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
public interface V2beta2ContainerResourceMetricStatusFluent<
        A extends io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getContainer();

  public A withContainer(java.lang.String container);

  public java.lang.Boolean hasContainer();

  /** Method is deprecated. use withContainer instead. */
  @java.lang.Deprecated
  public A withNewContainer(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus getCurrent();

  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent();

  public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current);

  public java.lang.Boolean hasCurrent();

  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent
              .CurrentNested<
          A>
      withNewCurrent();

  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent
              .CurrentNested<
          A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);

  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent
              .CurrentNested<
          A>
      editCurrent();

  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent
              .CurrentNested<
          A>
      editOrNewCurrent();

  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent
              .CurrentNested<
          A>
      editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public interface CurrentNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<
              io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent
                      .CurrentNested<
                  N>> {
    public N and();

    public N endCurrent();
  }
}
