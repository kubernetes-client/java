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
public interface V1RuleWithOperationsFluent<
        A extends io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToApiGroups(java.lang.Integer index, java.lang.String item);

  public A setToApiGroups(java.lang.Integer index, java.lang.String item);

  public A addToApiGroups(java.lang.String... items);

  public A addAllToApiGroups(java.util.Collection<java.lang.String> items);

  public A removeFromApiGroups(java.lang.String... items);

  public A removeAllFromApiGroups(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getApiGroups();

  public java.lang.String getApiGroup(java.lang.Integer index);

  public java.lang.String getFirstApiGroup();

  public java.lang.String getLastApiGroup();

  public java.lang.String getMatchingApiGroup(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingApiGroup(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withApiGroups(java.util.List<java.lang.String> apiGroups);

  public A withApiGroups(java.lang.String... apiGroups);

  public java.lang.Boolean hasApiGroups();

  public A addNewApiGroup(java.lang.String original);

  public A addToApiVersions(java.lang.Integer index, java.lang.String item);

  public A setToApiVersions(java.lang.Integer index, java.lang.String item);

  public A addToApiVersions(java.lang.String... items);

  public A addAllToApiVersions(java.util.Collection<java.lang.String> items);

  public A removeFromApiVersions(java.lang.String... items);

  public A removeAllFromApiVersions(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getApiVersions();

  public java.lang.String getApiVersion(java.lang.Integer index);

  public java.lang.String getFirstApiVersion();

  public java.lang.String getLastApiVersion();

  public java.lang.String getMatchingApiVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingApiVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withApiVersions(java.util.List<java.lang.String> apiVersions);

  public A withApiVersions(java.lang.String... apiVersions);

  public java.lang.Boolean hasApiVersions();

  public A addNewApiVersion(java.lang.String original);

  public A addToOperations(java.lang.Integer index, java.lang.String item);

  public A setToOperations(java.lang.Integer index, java.lang.String item);

  public A addToOperations(java.lang.String... items);

  public A addAllToOperations(java.util.Collection<java.lang.String> items);

  public A removeFromOperations(java.lang.String... items);

  public A removeAllFromOperations(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getOperations();

  public java.lang.String getOperation(java.lang.Integer index);

  public java.lang.String getFirstOperation();

  public java.lang.String getLastOperation();

  public java.lang.String getMatchingOperation(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingOperation(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withOperations(java.util.List<java.lang.String> operations);

  public A withOperations(java.lang.String... operations);

  public java.lang.Boolean hasOperations();

  public A addNewOperation(java.lang.String original);

  public A addToResources(java.lang.Integer index, java.lang.String item);

  public A setToResources(java.lang.Integer index, java.lang.String item);

  public A addToResources(java.lang.String... items);

  public A addAllToResources(java.util.Collection<java.lang.String> items);

  public A removeFromResources(java.lang.String... items);

  public A removeAllFromResources(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getResources();

  public java.lang.String getResource(java.lang.Integer index);

  public java.lang.String getFirstResource();

  public java.lang.String getLastResource();

  public java.lang.String getMatchingResource(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingResource(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withResources(java.util.List<java.lang.String> resources);

  public A withResources(java.lang.String... resources);

  public java.lang.Boolean hasResources();

  public A addNewResource(java.lang.String original);

  public java.lang.String getScope();

  public A withScope(java.lang.String scope);

  public java.lang.Boolean hasScope();

  /** Method is deprecated. use withScope instead. */
  @java.lang.Deprecated
  public A withNewScope(java.lang.String original);
}
