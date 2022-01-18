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
public interface V1IPBlockFluent<A extends io.kubernetes.client.openapi.models.V1IPBlockFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getCidr();

  public A withCidr(java.lang.String cidr);

  public java.lang.Boolean hasCidr();

  /** Method is deprecated. use withCidr instead. */
  @java.lang.Deprecated
  public A withNewCidr(java.lang.String original);

  public A addToExcept(java.lang.Integer index, java.lang.String item);

  public A setToExcept(java.lang.Integer index, java.lang.String item);

  public A addToExcept(java.lang.String... items);

  public A addAllToExcept(java.util.Collection<java.lang.String> items);

  public A removeFromExcept(java.lang.String... items);

  public A removeAllFromExcept(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getExcept();

  public java.lang.String getExcept(java.lang.Integer index);

  public java.lang.String getFirstExcept();

  public java.lang.String getLastExcept();

  public java.lang.String getMatchingExcept(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingExcept(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withExcept(java.util.List<java.lang.String> except);

  public A withExcept(java.lang.String... except);

  public java.lang.Boolean hasExcept();

  public A addNewExcept(java.lang.String original);
}
