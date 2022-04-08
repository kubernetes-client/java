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
public interface V1beta2PriorityLevelConfigurationSpecFluent<
        A extends V1beta2PriorityLevelConfigurationSpecFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildLimited instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2LimitedPriorityLevelConfiguration getLimited();

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration
      buildLimited();

  public A withLimited(
      io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration limited);

  public Boolean hasLimited();

  public V1beta2PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimited();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      withNewLimitedLike(
          io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration item);

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editLimited();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editOrNewLimited();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent
              .LimitedNested<
          A>
      editOrNewLimitedLike(
          io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration item);

  public String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  public interface LimitedNested<N>
      extends Nested<N>,
          V1beta2LimitedPriorityLevelConfigurationFluent<
              V1beta2PriorityLevelConfigurationSpecFluent.LimitedNested<N>> {
    public N and();

    public N endLimited();
  }
}
