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

  public A setToMonitors(java.lang.Integer index, java.lang.String item);

  public A addToMonitors(java.lang.String... items);

  public A addAllToMonitors(Collection<java.lang.String> items);

  public A removeFromMonitors(java.lang.String... items);

  public A removeAllFromMonitors(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getMonitors();

  public java.lang.String getMonitor(java.lang.Integer index);

  public java.lang.String getFirstMonitor();

  public java.lang.String getLastMonitor();

  public java.lang.String getMatchingMonitor(Predicate<java.lang.String> predicate);

  public Boolean hasMatchingMonitor(java.util.function.Predicate<java.lang.String> predicate);

  public A withMonitors(java.util.List<java.lang.String> monitors);

  public A withMonitors(java.lang.String... monitors);

  public java.lang.Boolean hasMonitors();

  public java.lang.String getPath();

  public A withPath(java.lang.String path);

  public java.lang.Boolean hasPath();

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public java.lang.String getSecretFile();

  public A withSecretFile(java.lang.String secretFile);

  public java.lang.Boolean hasSecretFile();

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getSecretRef();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef();

  public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef);

  public java.lang.Boolean hasSecretRef();

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      editSecretRef();

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef();

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public java.lang.String getUser();

  public A withUser(java.lang.String user);

  public java.lang.Boolean hasUser();

  public A withReadOnly();

  public interface SecretRefNested<N>
      extends Nested<N>,
          V1LocalObjectReferenceFluent<V1CephFSVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
