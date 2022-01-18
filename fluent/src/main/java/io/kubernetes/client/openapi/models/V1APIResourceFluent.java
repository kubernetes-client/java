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
public interface V1APIResourceFluent<
        A extends io.kubernetes.client.openapi.models.V1APIResourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToCategories(java.lang.Integer index, java.lang.String item);

  public A setToCategories(java.lang.Integer index, java.lang.String item);

  public A addToCategories(java.lang.String... items);

  public A addAllToCategories(java.util.Collection<java.lang.String> items);

  public A removeFromCategories(java.lang.String... items);

  public A removeAllFromCategories(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getCategories();

  public java.lang.String getCategory(java.lang.Integer index);

  public java.lang.String getFirstCategory();

  public java.lang.String getLastCategory();

  public java.lang.String getMatchingCategory(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingCategory(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withCategories(java.util.List<java.lang.String> categories);

  public A withCategories(java.lang.String... categories);

  public java.lang.Boolean hasCategories();

  public A addNewCategory(java.lang.String original);

  public java.lang.String getGroup();

  public A withGroup(java.lang.String group);

  public java.lang.Boolean hasGroup();

  /** Method is deprecated. use withGroup instead. */
  @java.lang.Deprecated
  public A withNewGroup(java.lang.String original);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.Boolean getNamespaced();

  public A withNamespaced(java.lang.Boolean namespaced);

  public java.lang.Boolean hasNamespaced();

  public A addToShortNames(java.lang.Integer index, java.lang.String item);

  public A setToShortNames(java.lang.Integer index, java.lang.String item);

  public A addToShortNames(java.lang.String... items);

  public A addAllToShortNames(java.util.Collection<java.lang.String> items);

  public A removeFromShortNames(java.lang.String... items);

  public A removeAllFromShortNames(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getShortNames();

  public java.lang.String getShortName(java.lang.Integer index);

  public java.lang.String getFirstShortName();

  public java.lang.String getLastShortName();

  public java.lang.String getMatchingShortName(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingShortName(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withShortNames(java.util.List<java.lang.String> shortNames);

  public A withShortNames(java.lang.String... shortNames);

  public java.lang.Boolean hasShortNames();

  public A addNewShortName(java.lang.String original);

  public java.lang.String getSingularName();

  public A withSingularName(java.lang.String singularName);

  public java.lang.Boolean hasSingularName();

  /** Method is deprecated. use withSingularName instead. */
  @java.lang.Deprecated
  public A withNewSingularName(java.lang.String original);

  public java.lang.String getStorageVersionHash();

  public A withStorageVersionHash(java.lang.String storageVersionHash);

  public java.lang.Boolean hasStorageVersionHash();

  /** Method is deprecated. use withStorageVersionHash instead. */
  @java.lang.Deprecated
  public A withNewStorageVersionHash(java.lang.String original);

  public A addToVerbs(java.lang.Integer index, java.lang.String item);

  public A setToVerbs(java.lang.Integer index, java.lang.String item);

  public A addToVerbs(java.lang.String... items);

  public A addAllToVerbs(java.util.Collection<java.lang.String> items);

  public A removeFromVerbs(java.lang.String... items);

  public A removeAllFromVerbs(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getVerbs();

  public java.lang.String getVerb(java.lang.Integer index);

  public java.lang.String getFirstVerb();

  public java.lang.String getLastVerb();

  public java.lang.String getMatchingVerb(java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingVerb(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withVerbs(java.util.List<java.lang.String> verbs);

  public A withVerbs(java.lang.String... verbs);

  public java.lang.Boolean hasVerbs();

  public A addNewVerb(java.lang.String original);

  public java.lang.String getVersion();

  public A withVersion(java.lang.String version);

  public java.lang.Boolean hasVersion();

  /** Method is deprecated. use withVersion instead. */
  @java.lang.Deprecated
  public A withNewVersion(java.lang.String original);
}
