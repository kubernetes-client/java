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
public interface V1ScaleIOVolumeSourceFluent<A extends V1ScaleIOVolumeSourceFluent<A>>
    extends Fluent<A> {
  public String getFsType();

  public A withFsType(String fsType);

  public Boolean hasFsType();

  public String getGateway();

  public A withGateway(String gateway);

  public Boolean hasGateway();

  public String getProtectionDomain();

  public A withProtectionDomain(String protectionDomain);

  public Boolean hasProtectionDomain();

  public Boolean getReadOnly();

  public A withReadOnly(Boolean readOnly);

  public Boolean hasReadOnly();

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

  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(
      V1LocalObjectReference item);

  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editSecretRef();

  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();

  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(
      V1LocalObjectReference item);

  public Boolean getSslEnabled();

  public A withSslEnabled(Boolean sslEnabled);

  public Boolean hasSslEnabled();

  public String getStorageMode();

  public A withStorageMode(String storageMode);

  public Boolean hasStorageMode();

  public String getStoragePool();

  public A withStoragePool(String storagePool);

  public Boolean hasStoragePool();

  public String getSystem();

  public A withSystem(String system);

  public Boolean hasSystem();

  public String getVolumeName();

  public A withVolumeName(String volumeName);

  public Boolean hasVolumeName();

  public A withReadOnly();

  public A withSslEnabled();

  public interface SecretRefNested<N>
      extends Nested<N>,
          V1LocalObjectReferenceFluent<V1ScaleIOVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
