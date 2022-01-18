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
public interface V2MetricTargetFluent<
        A extends io.kubernetes.client.openapi.models.V2MetricTargetFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Integer getAverageUtilization();

  public A withAverageUtilization(java.lang.Integer averageUtilization);

  public java.lang.Boolean hasAverageUtilization();

  public io.kubernetes.client.custom.Quantity getAverageValue();

  public A withAverageValue(io.kubernetes.client.custom.Quantity averageValue);

  public java.lang.Boolean hasAverageValue();

  public A withNewAverageValue(java.lang.String value);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);

  public io.kubernetes.client.custom.Quantity getValue();

  public A withValue(io.kubernetes.client.custom.Quantity value);

  public java.lang.Boolean hasValue();

  public A withNewValue(java.lang.String value);
}
