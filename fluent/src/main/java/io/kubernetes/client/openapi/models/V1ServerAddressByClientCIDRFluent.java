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
public interface V1ServerAddressByClientCIDRFluent<A extends V1ServerAddressByClientCIDRFluent<A>>
    extends Fluent<A> {
  public String getClientCIDR();

  public A withClientCIDR(java.lang.String clientCIDR);

  public Boolean hasClientCIDR();

  public java.lang.String getServerAddress();

  public A withServerAddress(java.lang.String serverAddress);

  public java.lang.Boolean hasServerAddress();
}
