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
public interface V1VolumeMountFluent<
        A extends io.kubernetes.client.openapi.models.V1VolumeMountFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getMountPath();

  public A withMountPath(java.lang.String mountPath);

  public java.lang.Boolean hasMountPath();

  /** Method is deprecated. use withMountPath instead. */
  @java.lang.Deprecated
  public A withNewMountPath(java.lang.String original);

  public java.lang.String getMountPropagation();

  public A withMountPropagation(java.lang.String mountPropagation);

  public java.lang.Boolean hasMountPropagation();

  /** Method is deprecated. use withMountPropagation instead. */
  @java.lang.Deprecated
  public A withNewMountPropagation(java.lang.String original);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public java.lang.String getSubPath();

  public A withSubPath(java.lang.String subPath);

  public java.lang.Boolean hasSubPath();

  /** Method is deprecated. use withSubPath instead. */
  @java.lang.Deprecated
  public A withNewSubPath(java.lang.String original);

  public java.lang.String getSubPathExpr();

  public A withSubPathExpr(java.lang.String subPathExpr);

  public java.lang.Boolean hasSubPathExpr();

  /** Method is deprecated. use withSubPathExpr instead. */
  @java.lang.Deprecated
  public A withNewSubPathExpr(java.lang.String original);
}
