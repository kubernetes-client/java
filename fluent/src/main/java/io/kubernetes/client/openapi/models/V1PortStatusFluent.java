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
public interface V1PortStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1PortStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getError();

  public A withError(java.lang.String error);

  public java.lang.Boolean hasError();

  /** Method is deprecated. use withError instead. */
  @java.lang.Deprecated
  public A withNewError(java.lang.String original);

  public java.lang.Integer getPort();

  public A withPort(java.lang.Integer port);

  public java.lang.Boolean hasPort();

  public io.kubernetes.client.openapi.models.V1PortStatus.ProtocolEnum getProtocol();

  public A withProtocol(io.kubernetes.client.openapi.models.V1PortStatus.ProtocolEnum protocol);

  public java.lang.Boolean hasProtocol();
}
