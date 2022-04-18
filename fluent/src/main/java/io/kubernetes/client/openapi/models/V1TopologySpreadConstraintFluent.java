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
public interface V1TopologySpreadConstraintFluent<A extends V1TopologySpreadConstraintFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getLabelSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector();

  public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector);

  public Boolean hasLabelSelector();

  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelector();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editLabelSelector();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editOrNewLabelSelector();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public Integer getMaxSkew();

  public A withMaxSkew(java.lang.Integer maxSkew);

  public java.lang.Boolean hasMaxSkew();

  public String getTopologyKey();

  public A withTopologyKey(java.lang.String topologyKey);

  public java.lang.Boolean hasTopologyKey();

  public java.lang.String getWhenUnsatisfiable();

  public A withWhenUnsatisfiable(java.lang.String whenUnsatisfiable);

  public java.lang.Boolean hasWhenUnsatisfiable();

  public interface LabelSelectorNested<N>
      extends Nested<N>,
          V1LabelSelectorFluent<V1TopologySpreadConstraintFluent.LabelSelectorNested<N>> {
    public N and();

    public N endLabelSelector();
  }
}
