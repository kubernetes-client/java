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
public interface V1RBDVolumeSourceFluent<A extends V1RBDVolumeSourceFluent<A>> extends Fluent<A> {
  public String getFsType();

  public A withFsType(java.lang.String fsType);

  public Boolean hasFsType();

  public java.lang.String getImage();

  public A withImage(java.lang.String image);

  public java.lang.Boolean hasImage();

  public java.lang.String getKeyring();

  public A withKeyring(java.lang.String keyring);

  public java.lang.Boolean hasKeyring();

  public A addToMonitors(Integer index, java.lang.String item);

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

  public java.lang.Boolean hasMatchingMonitor(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withMonitors(java.util.List<java.lang.String> monitors);

  public A withMonitors(java.lang.String... monitors);

  public java.lang.Boolean hasMonitors();

  public java.lang.String getPool();

  public A withPool(java.lang.String pool);

  public java.lang.Boolean hasPool();

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

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

  public V1RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<A>
      editSecretRef();

  public io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef();

  public io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public java.lang.String getUser();

  public A withUser(java.lang.String user);

  public java.lang.Boolean hasUser();

  public A withReadOnly();

  public interface SecretRefNested<N>
      extends Nested<N>, V1LocalObjectReferenceFluent<V1RBDVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
