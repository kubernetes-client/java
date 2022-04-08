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
public interface V1ISCSIPersistentVolumeSourceFluent<
        A extends V1ISCSIPersistentVolumeSourceFluent<A>>
    extends Fluent<A> {
  public Boolean getChapAuthDiscovery();

  public A withChapAuthDiscovery(java.lang.Boolean chapAuthDiscovery);

  public java.lang.Boolean hasChapAuthDiscovery();

  public java.lang.Boolean getChapAuthSession();

  public A withChapAuthSession(java.lang.Boolean chapAuthSession);

  public java.lang.Boolean hasChapAuthSession();

  public String getFsType();

  public A withFsType(java.lang.String fsType);

  public java.lang.Boolean hasFsType();

  public java.lang.String getInitiatorName();

  public A withInitiatorName(java.lang.String initiatorName);

  public java.lang.Boolean hasInitiatorName();

  public java.lang.String getIqn();

  public A withIqn(java.lang.String iqn);

  public java.lang.Boolean hasIqn();

  public java.lang.String getIscsiInterface();

  public A withIscsiInterface(java.lang.String iscsiInterface);

  public java.lang.Boolean hasIscsiInterface();

  public Integer getLun();

  public A withLun(java.lang.Integer lun);

  public java.lang.Boolean hasLun();

  public A addToPortals(java.lang.Integer index, java.lang.String item);

  public A setToPortals(java.lang.Integer index, java.lang.String item);

  public A addToPortals(java.lang.String... items);

  public A addAllToPortals(Collection<java.lang.String> items);

  public A removeFromPortals(java.lang.String... items);

  public A removeAllFromPortals(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getPortals();

  public java.lang.String getPortal(java.lang.Integer index);

  public java.lang.String getFirstPortal();

  public java.lang.String getLastPortal();

  public java.lang.String getMatchingPortal(Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingPortal(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withPortals(java.util.List<java.lang.String> portals);

  public A withPortals(java.lang.String... portals);

  public java.lang.Boolean hasPortals();

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getSecretRef();

  public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef();

  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef);

  public java.lang.Boolean hasSecretRef();

  public V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);

  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A>
      editSecretRef();

  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef();

  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);

  public java.lang.String getTargetPortal();

  public A withTargetPortal(java.lang.String targetPortal);

  public java.lang.Boolean hasTargetPortal();

  public A withChapAuthDiscovery();

  public A withChapAuthSession();

  public A withReadOnly();

  public interface SecretRefNested<N>
      extends Nested<N>,
          V1SecretReferenceFluent<V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
