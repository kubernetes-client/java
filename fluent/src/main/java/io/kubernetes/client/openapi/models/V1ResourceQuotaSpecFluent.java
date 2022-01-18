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
public interface V1ResourceQuotaSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToHard(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToHard(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromHard(java.lang.String key);

  public A removeFromHard(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getHard();

  public <K, V> A withHard(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> hard);

  public java.lang.Boolean hasHard();

  /**
   * This method has been deprecated, please use method buildScopeSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ScopeSelector getScopeSelector();

  public io.kubernetes.client.openapi.models.V1ScopeSelector buildScopeSelector();

  public A withScopeSelector(io.kubernetes.client.openapi.models.V1ScopeSelector scopeSelector);

  public java.lang.Boolean hasScopeSelector();

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      withNewScopeSelector();

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      withNewScopeSelectorLike(io.kubernetes.client.openapi.models.V1ScopeSelector item);

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      editScopeSelector();

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      editOrNewScopeSelector();

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      editOrNewScopeSelectorLike(io.kubernetes.client.openapi.models.V1ScopeSelector item);

  public A addToScopes(java.lang.Integer index, java.lang.String item);

  public A setToScopes(java.lang.Integer index, java.lang.String item);

  public A addToScopes(java.lang.String... items);

  public A addAllToScopes(java.util.Collection<java.lang.String> items);

  public A removeFromScopes(java.lang.String... items);

  public A removeAllFromScopes(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getScopes();

  public java.lang.String getScope(java.lang.Integer index);

  public java.lang.String getFirstScope();

  public java.lang.String getLastScope();

  public java.lang.String getMatchingScope(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingScope(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withScopes(java.util.List<java.lang.String> scopes);

  public A withScopes(java.lang.String... scopes);

  public java.lang.Boolean hasScopes();

  public A addNewScope(java.lang.String original);

  public interface ScopeSelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<
              io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<
                  N>> {
    public N and();

    public N endScopeSelector();
  }
}
