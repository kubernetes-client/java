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
public interface V1HostAliasFluent<
        A extends io.kubernetes.client.openapi.models.V1HostAliasFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToHostnames(java.lang.Integer index, java.lang.String item);

  public A setToHostnames(java.lang.Integer index, java.lang.String item);

  public A addToHostnames(java.lang.String... items);

  public A addAllToHostnames(java.util.Collection<java.lang.String> items);

  public A removeFromHostnames(java.lang.String... items);

  public A removeAllFromHostnames(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getHostnames();

  public java.lang.String getHostname(java.lang.Integer index);

  public java.lang.String getFirstHostname();

  public java.lang.String getLastHostname();

  public java.lang.String getMatchingHostname(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingHostname(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withHostnames(java.util.List<java.lang.String> hostnames);

  public A withHostnames(java.lang.String... hostnames);

  public java.lang.Boolean hasHostnames();

  public A addNewHostname(java.lang.String original);

  public java.lang.String getIp();

  public A withIp(java.lang.String ip);

  public java.lang.Boolean hasIp();

  /** Method is deprecated. use withIp instead. */
  @java.lang.Deprecated
  public A withNewIp(java.lang.String original);
}
