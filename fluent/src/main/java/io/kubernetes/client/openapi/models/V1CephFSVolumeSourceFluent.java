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
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1CephFSVolumeSourceFluent<A extends V1CephFSVolumeSourceFluent<A>>
    extends Fluent<A> {
  public A addToMonitors(Integer index, String item);

  public A setToMonitors(Integer index, String item);

  public A addToMonitors(java.lang.String... items);

  public A addAllToMonitors(Collection<String> items);

  public A removeFromMonitors(java.lang.String... items);

  public A removeAllFromMonitors(Collection<String> items);

  public List<String> getMonitors();

  public String getMonitor(Integer index);

  public String getFirstMonitor();

  public String getLastMonitor();

  public String getMatchingMonitor(Predicate<String> predicate);

  public Boolean hasMatchingMonitor(Predicate<String> predicate);

  public A withMonitors(List<String> monitors);

  public A withMonitors(java.lang.String... monitors);

  public Boolean hasMonitors();

  public String getPath();

  public A withPath(String path);

  public Boolean hasPath();

  public Boolean getReadOnly();

  public A withReadOnly(Boolean readOnly);

  public Boolean hasReadOnly();

  public String getSecretFile();

  public A withSecretFile(String secretFile);

  public Boolean hasSecretFile();

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getSecretRef();

  public V1LocalObjectReference buildSecretRef();

  public A withSecretRef(V1LocalObjectReference secretRef);

  public Boolean hasSecretRef();

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(
      V1LocalObjectReference item);

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> editSecretRef();

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(
      V1LocalObjectReference item);

  public String getUser();

  public A withUser(String user);

  public Boolean hasUser();

  public A withReadOnly();

  public interface SecretRefNested<N>
      extends Nested<N>,
          V1LocalObjectReferenceFluent<V1CephFSVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
