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
public interface V1NamespaceSpecFluent<A extends V1NamespaceSpecFluent<A>> extends Fluent<A> {
  public A addToFinalizers(Integer index, String item);

  public A setToFinalizers(Integer index, String item);

  public A addToFinalizers(java.lang.String... items);

  public A addAllToFinalizers(Collection<String> items);

  public A removeFromFinalizers(java.lang.String... items);

  public A removeAllFromFinalizers(Collection<String> items);

  public List<String> getFinalizers();

  public String getFinalizer(Integer index);

  public String getFirstFinalizer();

  public String getLastFinalizer();

  public String getMatchingFinalizer(Predicate<String> predicate);

  public Boolean hasMatchingFinalizer(Predicate<String> predicate);

  public A withFinalizers(List<String> finalizers);

  public A withFinalizers(java.lang.String... finalizers);

  public Boolean hasFinalizers();
}
