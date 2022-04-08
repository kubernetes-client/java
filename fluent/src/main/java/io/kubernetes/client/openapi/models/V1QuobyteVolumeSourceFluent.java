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
public interface V1QuobyteVolumeSourceFluent<A extends V1QuobyteVolumeSourceFluent<A>>
    extends Fluent<A> {
  public String getGroup();

  public A withGroup(java.lang.String group);

  public Boolean hasGroup();

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public java.lang.String getRegistry();

  public A withRegistry(java.lang.String registry);

  public java.lang.Boolean hasRegistry();

  public java.lang.String getTenant();

  public A withTenant(java.lang.String tenant);

  public java.lang.Boolean hasTenant();

  public java.lang.String getUser();

  public A withUser(java.lang.String user);

  public java.lang.Boolean hasUser();

  public java.lang.String getVolume();

  public A withVolume(java.lang.String volume);

  public java.lang.Boolean hasVolume();

  public A withReadOnly();
}
