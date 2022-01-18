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
public interface V1AzureFileVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public java.lang.String getSecretName();

  public A withSecretName(java.lang.String secretName);

  public java.lang.Boolean hasSecretName();

  /** Method is deprecated. use withSecretName instead. */
  @java.lang.Deprecated
  public A withNewSecretName(java.lang.String original);

  public java.lang.String getShareName();

  public A withShareName(java.lang.String shareName);

  public java.lang.Boolean hasShareName();

  /** Method is deprecated. use withShareName instead. */
  @java.lang.Deprecated
  public A withNewShareName(java.lang.String original);
}
