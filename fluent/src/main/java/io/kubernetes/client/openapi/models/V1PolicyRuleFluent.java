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
public interface V1PolicyRuleFluent<
        A extends io.kubernetes.client.openapi.models.V1PolicyRuleFluent<A>>
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

  public A addToResourceNames(java.lang.Integer index, java.lang.String item);

  public A setToResourceNames(java.lang.Integer index, java.lang.String item);

  public A addToResourceNames(java.lang.String... items);

  public A addAllToResourceNames(java.util.Collection<java.lang.String> items);

  public A removeFromResourceNames(java.lang.String... items);

  public A removeAllFromResourceNames(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getResourceNames();

  public java.lang.String getResourceName(java.lang.Integer index);

  public java.lang.String getFirstResourceName();

  public java.lang.String getLastResourceName();

  public java.lang.String getMatchingResourceName(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingResourceName(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withResourceNames(java.util.List<java.lang.String> resourceNames);

  public A withResourceNames(java.lang.String... resourceNames);

  public java.lang.Boolean hasResourceNames();

  public A addNewResourceName(java.lang.String original);

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
