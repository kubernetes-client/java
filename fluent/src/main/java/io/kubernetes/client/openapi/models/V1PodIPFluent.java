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
public interface V1PodIPFluent<A extends io.kubernetes.client.openapi.models.V1PodIPFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getIp();

  public A withIp(java.lang.String ip);

  public java.lang.Boolean hasIp();

  /** Method is deprecated. use withIp instead. */
  @java.lang.Deprecated
  public A withNewIp(java.lang.String original);
}
