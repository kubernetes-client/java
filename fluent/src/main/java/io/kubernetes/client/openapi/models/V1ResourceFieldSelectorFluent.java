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
public interface V1ResourceFieldSelectorFluent<
        A extends io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getContainerName();

  public A withContainerName(java.lang.String containerName);

  public java.lang.Boolean hasContainerName();

  /** Method is deprecated. use withContainerName instead. */
  @java.lang.Deprecated
  public A withNewContainerName(java.lang.String original);

  public io.kubernetes.client.custom.Quantity getDivisor();

  public A withDivisor(io.kubernetes.client.custom.Quantity divisor);

  public java.lang.Boolean hasDivisor();

  public A withNewDivisor(java.lang.String value);

  public java.lang.String getResource();

  public A withResource(java.lang.String resource);

  public java.lang.Boolean hasResource();

  /** Method is deprecated. use withResource instead. */
  @java.lang.Deprecated
  public A withNewResource(java.lang.String original);
}
