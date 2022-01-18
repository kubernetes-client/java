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
public interface V1NamespaceSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToFinalizers(java.lang.Integer index, java.lang.String item);

  public A setToFinalizers(java.lang.Integer index, java.lang.String item);

  public A addToFinalizers(java.lang.String... items);

  public A addAllToFinalizers(java.util.Collection<java.lang.String> items);

  public A removeFromFinalizers(java.lang.String... items);

  public A removeAllFromFinalizers(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getFinalizers();

  public java.lang.String getFinalizer(java.lang.Integer index);

  public java.lang.String getFirstFinalizer();

  public java.lang.String getLastFinalizer();

  public java.lang.String getMatchingFinalizer(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingFinalizer(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withFinalizers(java.util.List<java.lang.String> finalizers);

  public A withFinalizers(java.lang.String... finalizers);

  public java.lang.Boolean hasFinalizers();

  public A addNewFinalizer(java.lang.String original);
}
