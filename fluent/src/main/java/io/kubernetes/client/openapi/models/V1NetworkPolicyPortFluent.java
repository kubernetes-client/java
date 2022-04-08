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

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;

/** Generated */
public interface V1NetworkPolicyPortFluent<A extends V1NetworkPolicyPortFluent<A>>
    extends Fluent<A> {
  public Integer getEndPort();

  public A withEndPort(java.lang.Integer endPort);

  public Boolean hasEndPort();

  public IntOrString getPort();

  public A withPort(io.kubernetes.client.custom.IntOrString port);

  public java.lang.Boolean hasPort();

  public A withNewPort(int value);

  public A withNewPort(String value);

  public java.lang.String getProtocol();

  public A withProtocol(java.lang.String protocol);

  public java.lang.Boolean hasProtocol();
}
