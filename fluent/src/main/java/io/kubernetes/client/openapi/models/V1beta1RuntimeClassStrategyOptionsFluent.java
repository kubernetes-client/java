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
public interface V1beta1RuntimeClassStrategyOptionsFluent<
        A extends io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAllowedRuntimeClassNames(java.lang.Integer index, java.lang.String item);

  public A setToAllowedRuntimeClassNames(java.lang.Integer index, java.lang.String item);

  public A addToAllowedRuntimeClassNames(java.lang.String... items);

  public A addAllToAllowedRuntimeClassNames(java.util.Collection<java.lang.String> items);

  public A removeFromAllowedRuntimeClassNames(java.lang.String... items);

  public A removeAllFromAllowedRuntimeClassNames(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getAllowedRuntimeClassNames();

  public java.lang.String getAllowedRuntimeClassName(java.lang.Integer index);

  public java.lang.String getFirstAllowedRuntimeClassName();

  public java.lang.String getLastAllowedRuntimeClassName();

  public java.lang.String getMatchingAllowedRuntimeClassName(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingAllowedRuntimeClassName(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withAllowedRuntimeClassNames(java.util.List<java.lang.String> allowedRuntimeClassNames);

  public A withAllowedRuntimeClassNames(java.lang.String... allowedRuntimeClassNames);

  public java.lang.Boolean hasAllowedRuntimeClassNames();

  public A addNewAllowedRuntimeClassName(java.lang.String original);

  public java.lang.String getDefaultRuntimeClassName();

  public A withDefaultRuntimeClassName(java.lang.String defaultRuntimeClassName);

  public java.lang.Boolean hasDefaultRuntimeClassName();

  /** Method is deprecated. use withDefaultRuntimeClassName instead. */
  @java.lang.Deprecated
  public A withNewDefaultRuntimeClassName(java.lang.String original);
}
