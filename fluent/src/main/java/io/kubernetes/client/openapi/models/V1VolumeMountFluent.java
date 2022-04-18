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
public interface V1VolumeMountFluent<A extends V1VolumeMountFluent<A>> extends Fluent<A> {
  public String getMountPath();

  public A withMountPath(java.lang.String mountPath);

  public Boolean hasMountPath();

  public java.lang.String getMountPropagation();

  public A withMountPropagation(java.lang.String mountPropagation);

  public java.lang.Boolean hasMountPropagation();

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public java.lang.String getSubPath();

  public A withSubPath(java.lang.String subPath);

  public java.lang.Boolean hasSubPath();

  public java.lang.String getSubPathExpr();

  public A withSubPathExpr(java.lang.String subPathExpr);

  public java.lang.Boolean hasSubPathExpr();

  public A withReadOnly();
}
