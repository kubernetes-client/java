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
public interface V1FlexVolumeSourceFluent<A extends V1FlexVolumeSourceFluent<A>> extends Fluent<A> {
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
  public V1LocalObjectReference getSecretRef();

  public V1LocalObjectReference buildSecretRef();

  public A withSecretRef(V1LocalObjectReference secretRef);

  public Boolean hasSecretRef();

  public V1FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public V1FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(
      V1LocalObjectReference item);

  public V1FlexVolumeSourceFluent.SecretRefNested<A> editSecretRef();

  public V1FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();

  public V1FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(
      V1LocalObjectReference item);

  public A withReadOnly();

  public interface SecretRefNested<N>
      extends Nested<N>, V1LocalObjectReferenceFluent<V1FlexVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
