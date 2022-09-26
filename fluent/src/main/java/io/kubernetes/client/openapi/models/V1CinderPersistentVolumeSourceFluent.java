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

/** Generated */
public interface V1CinderPersistentVolumeSourceFluent<
        A extends V1CinderPersistentVolumeSourceFluent<A>>
    extends Fluent<A> {
  public String getFsType();

  public A withFsType(String fsType);

  public Boolean hasFsType();

  public Boolean getReadOnly();

  public A withReadOnly(Boolean readOnly);

  public Boolean hasReadOnly();

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getSecretRef();

  public V1SecretReference buildSecretRef();

  public A withSecretRef(V1SecretReference secretRef);

  public Boolean hasSecretRef();

  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(
      V1SecretReference item);

  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();

  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();

  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(
      V1SecretReference item);

  public String getVolumeID();

  public A withVolumeID(String volumeID);

  public Boolean hasVolumeID();

  public A withReadOnly();

  public interface SecretRefNested<N>
      extends Nested<N>,
          V1SecretReferenceFluent<V1CinderPersistentVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
