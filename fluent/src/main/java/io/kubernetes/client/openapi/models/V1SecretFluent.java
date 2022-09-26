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
public interface V1SecretFluent<A extends V1SecretFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToData(String key, byte[] value);

  public A addToData(Map<String, byte[]> map);

  public A removeFromData(String key);

  public A removeFromData(Map<String, byte[]> map);

  public Map<String, byte[]> getData();

  public <K, V> A withData(Map<String, byte[]> data);

  public Boolean hasData();

  public Boolean getImmutable();

  public A withImmutable(Boolean immutable);

  public Boolean hasImmutable();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public V1ObjectMeta buildMetadata();

  public A withMetadata(V1ObjectMeta metadata);

  public Boolean hasMetadata();

  public V1SecretFluent.MetadataNested<A> withNewMetadata();

  public V1SecretFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1SecretFluent.MetadataNested<A> editMetadata();

  public V1SecretFluent.MetadataNested<A> editOrNewMetadata();

  public V1SecretFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  public A addToStringData(String key, String value);

  public A addToStringData(Map<String, String> map);

  public A removeFromStringData(String key);

  public A removeFromStringData(Map<String, String> map);

  public Map<String, String> getStringData();

  public <K, V> A withStringData(Map<String, String> stringData);

  public Boolean hasStringData();

  public String getType();

  public A withType(String type);

  public Boolean hasType();

  public A withImmutable();

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1SecretFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
