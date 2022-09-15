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
public interface V1alpha1ClusterCIDRFluent<A extends V1alpha1ClusterCIDRFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

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

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> withNewMetadata();

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> editMetadata();

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> editOrNewMetadata();

  public V1alpha1ClusterCIDRFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ClusterCIDRSpec getSpec();

  public V1alpha1ClusterCIDRSpec buildSpec();

  public A withSpec(V1alpha1ClusterCIDRSpec spec);

  public Boolean hasSpec();

  public V1alpha1ClusterCIDRFluent.SpecNested<A> withNewSpec();

  public V1alpha1ClusterCIDRFluent.SpecNested<A> withNewSpecLike(V1alpha1ClusterCIDRSpec item);

  public V1alpha1ClusterCIDRFluent.SpecNested<A> editSpec();

  public V1alpha1ClusterCIDRFluent.SpecNested<A> editOrNewSpec();

  public V1alpha1ClusterCIDRFluent.SpecNested<A> editOrNewSpecLike(V1alpha1ClusterCIDRSpec item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1alpha1ClusterCIDRFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface SpecNested<N>
      extends Nested<N>, V1alpha1ClusterCIDRSpecFluent<V1alpha1ClusterCIDRFluent.SpecNested<N>> {
    public N and();

    public N endSpec();
  }
}
