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
public interface V1CustomResourceColumnDefinitionFluent<
        A extends io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getDescription();

  public A withDescription(java.lang.String description);

  public java.lang.Boolean hasDescription();

  /** Method is deprecated. use withDescription instead. */
  @java.lang.Deprecated
  public A withNewDescription(java.lang.String original);

  public java.lang.String getFormat();

  public A withFormat(java.lang.String format);

  public java.lang.Boolean hasFormat();

  /** Method is deprecated. use withFormat instead. */
  @java.lang.Deprecated
  public A withNewFormat(java.lang.String original);

  public java.lang.String getJsonPath();

  public A withJsonPath(java.lang.String jsonPath);

  public java.lang.Boolean hasJsonPath();

  /** Method is deprecated. use withJsonPath instead. */
  @java.lang.Deprecated
  public A withNewJsonPath(java.lang.String original);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.Integer getPriority();

  public A withPriority(java.lang.Integer priority);

  public java.lang.Boolean hasPriority();

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);
}
