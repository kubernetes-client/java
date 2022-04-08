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

  public A withCidr(java.lang.String cidr);

  public Boolean hasCidr();

  public A addToExcept(Integer index, java.lang.String item);

  public A setToExcept(java.lang.Integer index, java.lang.String item);

  public A addToExcept(java.lang.String... items);

  public A addAllToExcept(Collection<java.lang.String> items);

  public A removeFromExcept(java.lang.String... items);

  public A removeAllFromExcept(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getExcept();

  public java.lang.String getExcept(java.lang.Integer index);

  public java.lang.String getFirstExcept();

  public java.lang.String getLastExcept();

  public java.lang.String getMatchingExcept(Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingExcept(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withExcept(java.util.List<java.lang.String> except);

  public A withExcept(java.lang.String... except);

  public java.lang.Boolean hasExcept();
}
