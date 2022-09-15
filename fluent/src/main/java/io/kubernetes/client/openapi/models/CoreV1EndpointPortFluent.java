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

import io.kubernetes.client.fluent.Fluent;

/** Generated */
public interface CoreV1EndpointPortFluent<A extends CoreV1EndpointPortFluent<A>> extends Fluent<A> {
  public String getAppProtocol();

  public A withAppProtocol(String appProtocol);

  public Boolean hasAppProtocol();

  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public Integer getPort();

  public A withPort(Integer port);

  public Boolean hasPort();

  public String getProtocol();

  public A withProtocol(String protocol);

  public Boolean hasProtocol();
}
