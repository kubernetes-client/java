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
public interface V1NonResourceRuleFluent<A extends V1NonResourceRuleFluent<A>> extends Fluent<A> {
  public A addToNonResourceURLs(Integer index, String item);

  public A setToNonResourceURLs(Integer index, String item);

  public A addToNonResourceURLs(java.lang.String... items);

  public A addAllToNonResourceURLs(Collection<String> items);

  public A removeFromNonResourceURLs(java.lang.String... items);

  public A removeAllFromNonResourceURLs(Collection<String> items);

  public List<String> getNonResourceURLs();

  public String getNonResourceURL(Integer index);

  public String getFirstNonResourceURL();

  public String getLastNonResourceURL();

  public String getMatchingNonResourceURL(Predicate<String> predicate);

  public Boolean hasMatchingNonResourceURL(Predicate<String> predicate);

  public A withNonResourceURLs(List<String> nonResourceURLs);

  public A withNonResourceURLs(java.lang.String... nonResourceURLs);

  public Boolean hasNonResourceURLs();

  public A addToVerbs(Integer index, String item);

  public A setToVerbs(Integer index, String item);

  public A addToVerbs(java.lang.String... items);

  public A addAllToVerbs(Collection<String> items);

  public A removeFromVerbs(java.lang.String... items);

  public A removeAllFromVerbs(Collection<String> items);

  public List<String> getVerbs();

  public String getVerb(Integer index);

  public String getFirstVerb();

  public String getLastVerb();

  public String getMatchingVerb(Predicate<String> predicate);

  public Boolean hasMatchingVerb(Predicate<String> predicate);

  public A withVerbs(List<String> verbs);

  public A withVerbs(java.lang.String... verbs);

  public Boolean hasVerbs();
}
