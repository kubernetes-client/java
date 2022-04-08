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
public interface V1ContainerImageFluent<A extends V1ContainerImageFluent<A>> extends Fluent<A> {
  public A addToNames(Integer index, String item);

  public A setToNames(java.lang.Integer index, java.lang.String item);

  public A addToNames(java.lang.String... items);

  public A addAllToNames(Collection<java.lang.String> items);

  public A removeFromNames(java.lang.String... items);

  public A removeAllFromNames(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getNames();

  public java.lang.String getName(java.lang.Integer index);

  public java.lang.String getFirstName();

  public java.lang.String getLastName();

  public java.lang.String getMatchingName(Predicate<java.lang.String> predicate);

  public Boolean hasMatchingName(java.util.function.Predicate<java.lang.String> predicate);

  public A withNames(java.util.List<java.lang.String> names);

  public A withNames(java.lang.String... names);

  public java.lang.Boolean hasNames();

  public Long getSizeBytes();

  public A withSizeBytes(java.lang.Long sizeBytes);

  public java.lang.Boolean hasSizeBytes();
}
