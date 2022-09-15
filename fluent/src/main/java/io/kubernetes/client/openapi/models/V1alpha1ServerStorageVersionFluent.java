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
public interface V1alpha1ServerStorageVersionFluent<A extends V1alpha1ServerStorageVersionFluent<A>>
    extends Fluent<A> {
  public String getApiServerID();

  public A withApiServerID(String apiServerID);

  public Boolean hasApiServerID();

  public A addToDecodableVersions(Integer index, String item);

  public A setToDecodableVersions(Integer index, String item);

  public A addToDecodableVersions(java.lang.String... items);

  public A addAllToDecodableVersions(Collection<String> items);

  public A removeFromDecodableVersions(java.lang.String... items);

  public A removeAllFromDecodableVersions(Collection<String> items);

  public List<String> getDecodableVersions();

  public String getDecodableVersion(Integer index);

  public String getFirstDecodableVersion();

  public String getLastDecodableVersion();

  public String getMatchingDecodableVersion(Predicate<String> predicate);

  public Boolean hasMatchingDecodableVersion(Predicate<String> predicate);

  public A withDecodableVersions(List<String> decodableVersions);

  public A withDecodableVersions(java.lang.String... decodableVersions);

  public Boolean hasDecodableVersions();

  public String getEncodingVersion();

  public A withEncodingVersion(String encodingVersion);

  public Boolean hasEncodingVersion();
}
