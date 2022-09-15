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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1CustomResourceDefinitionNamesFluent<
        A extends V1CustomResourceDefinitionNamesFluent<A>>
    extends Fluent<A> {
  public A addToCategories(Integer index, String item);

  public A setToCategories(Integer index, String item);

  public A addToCategories(java.lang.String... items);

  public A addAllToCategories(Collection<String> items);

  public A removeFromCategories(java.lang.String... items);

  public A removeAllFromCategories(Collection<String> items);

  public List<String> getCategories();

  public String getCategory(Integer index);

  public String getFirstCategory();

  public String getLastCategory();

  public String getMatchingCategory(Predicate<String> predicate);

  public Boolean hasMatchingCategory(Predicate<String> predicate);

  public A withCategories(List<String> categories);

  public A withCategories(java.lang.String... categories);

  public Boolean hasCategories();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  public String getListKind();

  public A withListKind(String listKind);

  public Boolean hasListKind();

  public String getPlural();

  public A withPlural(String plural);

  public Boolean hasPlural();

  public A addToShortNames(Integer index, String item);

  public A setToShortNames(Integer index, String item);

  public A addToShortNames(java.lang.String... items);

  public A addAllToShortNames(Collection<String> items);

  public A removeFromShortNames(java.lang.String... items);

  public A removeAllFromShortNames(Collection<String> items);

  public List<String> getShortNames();

  public String getShortName(Integer index);

  public String getFirstShortName();

  public String getLastShortName();

  public String getMatchingShortName(Predicate<String> predicate);

  public Boolean hasMatchingShortName(Predicate<String> predicate);

  public A withShortNames(List<String> shortNames);

  public A withShortNames(java.lang.String... shortNames);

  public Boolean hasShortNames();

  public String getSingular();

  public A withSingular(String singular);

  public Boolean hasSingular();
}
