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
public interface V1GlusterfsPersistentVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getEndpoints();

  public A withEndpoints(java.lang.String endpoints);

  public java.lang.Boolean hasEndpoints();

  /** Method is deprecated. use withEndpoints instead. */
  @java.lang.Deprecated
  public A withNewEndpoints(java.lang.String original);

  public java.lang.String getEndpointsNamespace();

  public A withEndpointsNamespace(java.lang.String endpointsNamespace);

  public java.lang.Boolean hasEndpointsNamespace();

  /** Method is deprecated. use withEndpointsNamespace instead. */
  @java.lang.Deprecated
  public A withNewEndpointsNamespace(java.lang.String original);

  public java.lang.String getPath();

  public A withPath(java.lang.String path);

  public java.lang.Boolean hasPath();

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original);

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();
}
