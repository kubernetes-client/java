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
public interface V1alpha1ClusterCIDRSpecFluent<A extends V1alpha1ClusterCIDRSpecFluent<A>>
    extends Fluent<A> {
  public String getIpv4();

  public A withIpv4(String ipv4);

  public Boolean hasIpv4();

  public String getIpv6();

  public A withIpv6(String ipv6);

  public Boolean hasIpv6();

  /**
   * This method has been deprecated, please use method buildNodeSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getNodeSelector();

  public V1NodeSelector buildNodeSelector();

  public A withNodeSelector(V1NodeSelector nodeSelector);

  public Boolean hasNodeSelector();

  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> withNewNodeSelector();

  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> withNewNodeSelectorLike(
      V1NodeSelector item);

  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editNodeSelector();

  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editOrNewNodeSelector();

  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editOrNewNodeSelectorLike(
      V1NodeSelector item);

  public Integer getPerNodeHostBits();

  public A withPerNodeHostBits(Integer perNodeHostBits);

  public Boolean hasPerNodeHostBits();

  public interface NodeSelectorNested<N>
      extends Nested<N>, V1NodeSelectorFluent<V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<N>> {
    public N and();

    public N endNodeSelector();
  }
}
