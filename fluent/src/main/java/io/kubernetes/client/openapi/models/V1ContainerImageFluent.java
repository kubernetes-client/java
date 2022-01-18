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
public interface V1ContainerImageFluent<
        A extends io.kubernetes.client.openapi.models.V1ContainerImageFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToNames(java.lang.Integer index, java.lang.String item);

  public A setToNames(java.lang.Integer index, java.lang.String item);

  public A addToNames(java.lang.String... items);

  public A addAllToNames(java.util.Collection<java.lang.String> items);

  public A removeFromNames(java.lang.String... items);

  public A removeAllFromNames(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getNames();

  public java.lang.String getName(java.lang.Integer index);

  public java.lang.String getFirstName();

  public java.lang.String getLastName();

  public java.lang.String getMatchingName(java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingName(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withNames(java.util.List<java.lang.String> names);

  public A withNames(java.lang.String... names);

  public java.lang.Boolean hasNames();

  public A addNewName(java.lang.String original);

  public java.lang.Long getSizeBytes();

  public A withSizeBytes(java.lang.Long sizeBytes);

  public java.lang.Boolean hasSizeBytes();
}
