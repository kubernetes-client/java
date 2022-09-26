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
public interface V1IPBlockFluent<A extends V1IPBlockFluent<A>> extends Fluent<A> {
  public String getCidr();

  public A withCidr(String cidr);

  public Boolean hasCidr();

  public A addToExcept(Integer index, String item);

  public A setToExcept(Integer index, String item);

  public A addToExcept(java.lang.String... items);

  public A addAllToExcept(Collection<String> items);

  public A removeFromExcept(java.lang.String... items);

  public A removeAllFromExcept(Collection<String> items);

  public List<String> getExcept();

  public String getExcept(Integer index);

  public String getFirstExcept();

  public String getLastExcept();

  public String getMatchingExcept(Predicate<String> predicate);

  public Boolean hasMatchingExcept(Predicate<String> predicate);

  public A withExcept(List<String> except);

  public A withExcept(java.lang.String... except);

  public Boolean hasExcept();
}
