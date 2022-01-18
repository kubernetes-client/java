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
public interface V1ConfigMapNodeConfigSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getKubeletConfigKey();

  public A withKubeletConfigKey(java.lang.String kubeletConfigKey);

  public java.lang.Boolean hasKubeletConfigKey();

  /** Method is deprecated. use withKubeletConfigKey instead. */
  @java.lang.Deprecated
  public A withNewKubeletConfigKey(java.lang.String original);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.String getNamespace();

  public A withNamespace(java.lang.String namespace);

  public java.lang.Boolean hasNamespace();

  /** Method is deprecated. use withNamespace instead. */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String original);

  public java.lang.String getResourceVersion();

  public A withResourceVersion(java.lang.String resourceVersion);

  public java.lang.Boolean hasResourceVersion();

  /** Method is deprecated. use withResourceVersion instead. */
  @java.lang.Deprecated
  public A withNewResourceVersion(java.lang.String original);

  public java.lang.String getUid();

  public A withUid(java.lang.String uid);

  public java.lang.Boolean hasUid();

  /** Method is deprecated. use withUid instead. */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String original);
}
