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
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1UserInfoFluent<A extends V1UserInfoFluent<A>> extends Fluent<A> {
  public A addToExtra(String key, List<String> value);

  public A addToExtra(Map<String, List<String>> map);

  public A removeFromExtra(String key);

  public A removeFromExtra(Map<String, List<String>> map);

  public Map<String, List<String>> getExtra();

  public <K, V> A withExtra(Map<String, List<String>> extra);

  public Boolean hasExtra();

  public A addToGroups(Integer index, String item);

  public A setToGroups(Integer index, String item);

  public A addToGroups(java.lang.String... items);

  public A addAllToGroups(Collection<String> items);

  public A removeFromGroups(java.lang.String... items);

  public A removeAllFromGroups(Collection<String> items);

  public List<String> getGroups();

  public String getGroup(Integer index);

  public String getFirstGroup();

  public String getLastGroup();

  public String getMatchingGroup(Predicate<String> predicate);

  public Boolean hasMatchingGroup(Predicate<String> predicate);

  public A withGroups(List<String> groups);

  public A withGroups(java.lang.String... groups);

  public Boolean hasGroups();

  public String getUid();

  public A withUid(String uid);

  public Boolean hasUid();

  public String getUsername();

  public A withUsername(String username);

  public Boolean hasUsername();
}
