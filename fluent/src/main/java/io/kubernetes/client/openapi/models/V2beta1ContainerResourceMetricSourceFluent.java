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
public interface V2beta1ContainerResourceMetricSourceFluent<
        A extends io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getContainer();

  public A withContainer(java.lang.String container);

  public java.lang.Boolean hasContainer();

  /** Method is deprecated. use withContainer instead. */
  @java.lang.Deprecated
  public A withNewContainer(java.lang.String original);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.Integer getTargetAverageUtilization();

  public A withTargetAverageUtilization(java.lang.Integer targetAverageUtilization);

  public java.lang.Boolean hasTargetAverageUtilization();

  public io.kubernetes.client.custom.Quantity getTargetAverageValue();

  public A withTargetAverageValue(io.kubernetes.client.custom.Quantity targetAverageValue);

  public java.lang.Boolean hasTargetAverageValue();

  public A withNewTargetAverageValue(java.lang.String value);
}
