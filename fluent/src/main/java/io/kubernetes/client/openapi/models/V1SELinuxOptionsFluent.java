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
public interface V1SELinuxOptionsFluent<
        A extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getLevel();

  public A withLevel(java.lang.String level);

  public java.lang.Boolean hasLevel();

  /** Method is deprecated. use withLevel instead. */
  @java.lang.Deprecated
  public A withNewLevel(java.lang.String original);

  public java.lang.String getRole();

  public A withRole(java.lang.String role);

  public java.lang.Boolean hasRole();

  /** Method is deprecated. use withRole instead. */
  @java.lang.Deprecated
  public A withNewRole(java.lang.String original);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);

  public java.lang.String getUser();

  public A withUser(java.lang.String user);

  public java.lang.Boolean hasUser();

  /** Method is deprecated. use withUser instead. */
  @java.lang.Deprecated
  public A withNewUser(java.lang.String original);
}
