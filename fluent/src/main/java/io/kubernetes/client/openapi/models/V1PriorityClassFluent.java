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
public interface V1PriorityClassFluent<A extends V1PriorityClassFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public String getDescription();

  public A withDescription(String description);

  public Boolean hasDescription();

  public Boolean getGlobalDefault();

  public A withGlobalDefault(Boolean globalDefault);

  public Boolean hasGlobalDefault();

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

  public V1PriorityClassFluent.MetadataNested<A> withNewMetadata();

  public V1PriorityClassFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1PriorityClassFluent.MetadataNested<A> editMetadata();

  public V1PriorityClassFluent.MetadataNested<A> editOrNewMetadata();

  public V1PriorityClassFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  public String getPreemptionPolicy();

  public A withPreemptionPolicy(String preemptionPolicy);

  public Boolean hasPreemptionPolicy();

  public Integer getValue();

  public A withValue(Integer value);

  public Boolean hasValue();

  public A withGlobalDefault();

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1PriorityClassFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
