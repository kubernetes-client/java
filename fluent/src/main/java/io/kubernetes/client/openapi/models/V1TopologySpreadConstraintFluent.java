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

/** Generated */
public interface V1TopologySpreadConstraintFluent<
        A extends io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getLabelSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector();

  public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector);

  public java.lang.Boolean hasLabelSelector();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      withNewLabelSelector();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editLabelSelector();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editOrNewLabelSelector();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public java.lang.Integer getMaxSkew();

  public A withMaxSkew(java.lang.Integer maxSkew);

  public java.lang.Boolean hasMaxSkew();

  public java.lang.String getTopologyKey();

  public A withTopologyKey(java.lang.String topologyKey);

  public java.lang.Boolean hasTopologyKey();

  /** Method is deprecated. use withTopologyKey instead. */
  @java.lang.Deprecated
  public A withNewTopologyKey(java.lang.String original);

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint.WhenUnsatisfiableEnum
      getWhenUnsatisfiable();

  public A withWhenUnsatisfiable(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint.WhenUnsatisfiableEnum
          whenUnsatisfiable);

  public java.lang.Boolean hasWhenUnsatisfiable();

  public interface LabelSelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LabelSelectorFluent<
              io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent
                      .LabelSelectorNested<
                  N>> {
    public N and();

    public N endLabelSelector();
  }
}
