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
public interface V1ResourceRequirementsFluent<
        A extends io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToLimits(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToLimits(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromLimits(java.lang.String key);

  public A removeFromLimits(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getLimits();

  public <K, V> A withLimits(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> limits);

  public java.lang.Boolean hasLimits();

  public A addToRequests(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToRequests(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromRequests(java.lang.String key);

  public A removeFromRequests(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getRequests();

  public <K, V> A withRequests(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> requests);

  public java.lang.Boolean hasRequests();
}
