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
public interface V1beta1PriorityLevelConfigurationSpecFluent<
        A extends
            io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildLimited instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration getLimited();

  public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration
      buildLimited();

  public A withLimited(
      io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration limited);

  public java.lang.Boolean hasLimited();

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      withNewLimited();

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      withNewLimitedLike(
          io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item);

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editLimited();

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editOrNewLimited();

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editOrNewLimitedLike(
          io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item);

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);

  public interface LimitedNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<
              io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent
                      .LimitedNested<
                  N>> {
    public N and();

    public N endLimited();
  }
}
