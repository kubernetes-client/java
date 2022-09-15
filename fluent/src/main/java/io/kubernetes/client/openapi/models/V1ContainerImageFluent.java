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

  public A setToNames(Integer index, String item);

  public A addToNames(java.lang.String... items);

  public A addAllToNames(Collection<String> items);

  public A removeFromNames(java.lang.String... items);

  public A removeAllFromNames(Collection<String> items);

  public List<String> getNames();

  public String getName(Integer index);

  public String getFirstName();

  public String getLastName();

  public String getMatchingName(Predicate<String> predicate);

  public Boolean hasMatchingName(Predicate<String> predicate);

  public A withNames(List<String> names);

  public A withNames(java.lang.String... names);

  public Boolean hasNames();

  public Long getSizeBytes();

  public A withSizeBytes(Long sizeBytes);

  public Boolean hasSizeBytes();
}
