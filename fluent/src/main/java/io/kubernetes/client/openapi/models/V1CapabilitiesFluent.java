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
public interface V1CapabilitiesFluent<
        A extends io.kubernetes.client.openapi.models.V1CapabilitiesFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAdd(java.lang.Integer index, java.lang.String item);

  public A setToAdd(java.lang.Integer index, java.lang.String item);

  public A addToAdd(java.lang.String... items);

  public A addAllToAdd(java.util.Collection<java.lang.String> items);

  public A removeFromAdd(java.lang.String... items);

  public A removeAllFromAdd(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getAdd();

  public java.lang.String getAdd(java.lang.Integer index);

  public java.lang.String getFirstAdd();

  public java.lang.String getLastAdd();

  public java.lang.String getMatchingAdd(java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingAdd(java.util.function.Predicate<java.lang.String> predicate);

  public A withAdd(java.util.List<java.lang.String> add);

  public A withAdd(java.lang.String... add);

  public java.lang.Boolean hasAdd();

  public A addNewAdd(java.lang.String original);

  public A addToDrop(java.lang.Integer index, java.lang.String item);

  public A setToDrop(java.lang.Integer index, java.lang.String item);

  public A addToDrop(java.lang.String... items);

  public A addAllToDrop(java.util.Collection<java.lang.String> items);

  public A removeFromDrop(java.lang.String... items);

  public A removeAllFromDrop(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getDrop();

  public java.lang.String getDrop(java.lang.Integer index);

  public java.lang.String getFirstDrop();

  public java.lang.String getLastDrop();

  public java.lang.String getMatchingDrop(java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingDrop(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withDrop(java.util.List<java.lang.String> drop);

  public A withDrop(java.lang.String... drop);

  public java.lang.Boolean hasDrop();

  public A addNewDrop(java.lang.String original);
}
