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
public interface V1NonResourceRuleFluent<
        A extends io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToNonResourceURLs(java.lang.Integer index, java.lang.String item);

  public A setToNonResourceURLs(java.lang.Integer index, java.lang.String item);

  public A addToNonResourceURLs(java.lang.String... items);

  public A addAllToNonResourceURLs(java.util.Collection<java.lang.String> items);

  public A removeFromNonResourceURLs(java.lang.String... items);

  public A removeAllFromNonResourceURLs(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getNonResourceURLs();

  public java.lang.String getNonResourceURL(java.lang.Integer index);

  public java.lang.String getFirstNonResourceURL();

  public java.lang.String getLastNonResourceURL();

  public java.lang.String getMatchingNonResourceURL(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingNonResourceURL(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withNonResourceURLs(java.util.List<java.lang.String> nonResourceURLs);

  public A withNonResourceURLs(java.lang.String... nonResourceURLs);

  public java.lang.Boolean hasNonResourceURLs();

  public A addNewNonResourceURL(java.lang.String original);

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
}
