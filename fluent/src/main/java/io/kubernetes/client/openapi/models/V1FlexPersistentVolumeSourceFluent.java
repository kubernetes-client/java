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
import java.util.Map;

/** Generated */
public interface V1FlexPersistentVolumeSourceFluent<A extends V1FlexPersistentVolumeSourceFluent<A>>
    extends Fluent<A> {
  public String getDriver();

  public A withDriver(String driver);

  public Boolean hasDriver();

  public String getFsType();

  public A withFsType(String fsType);

  public Boolean hasFsType();

  public A addToOptions(String key, String value);

  public A addToOptions(Map<String, String> map);

  public A removeFromOptions(String key);

  public A removeFromOptions(Map<String, String> map);

  public Map<String, String> getOptions();

  public <K, V> A withOptions(Map<String, String> options);

  public Boolean hasOptions();

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

  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(
      V1SecretReference item);

  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();

  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();

  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(
      V1SecretReference item);

  public A withReadOnly();

  public interface SecretRefNested<N>
      extends Nested<N>,
          V1SecretReferenceFluent<V1FlexPersistentVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
