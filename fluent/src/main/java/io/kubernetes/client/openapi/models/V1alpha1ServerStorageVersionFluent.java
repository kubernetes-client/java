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

  public A withApiServerID(java.lang.String apiServerID);

  public Boolean hasApiServerID();

  public A addToDecodableVersions(Integer index, java.lang.String item);

  public A setToDecodableVersions(java.lang.Integer index, java.lang.String item);

  public A addToDecodableVersions(java.lang.String... items);

  public A addAllToDecodableVersions(Collection<java.lang.String> items);

  public A removeFromDecodableVersions(java.lang.String... items);

  public A removeAllFromDecodableVersions(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getDecodableVersions();

  public java.lang.String getDecodableVersion(java.lang.Integer index);

  public java.lang.String getFirstDecodableVersion();

  public java.lang.String getLastDecodableVersion();

  public java.lang.String getMatchingDecodableVersion(Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingDecodableVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withDecodableVersions(java.util.List<java.lang.String> decodableVersions);

  public A withDecodableVersions(java.lang.String... decodableVersions);

  public java.lang.Boolean hasDecodableVersions();

  public java.lang.String getEncodingVersion();

  public A withEncodingVersion(java.lang.String encodingVersion);

  public java.lang.Boolean hasEncodingVersion();
}
