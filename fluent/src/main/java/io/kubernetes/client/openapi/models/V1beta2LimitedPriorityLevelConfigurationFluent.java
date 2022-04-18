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
public interface V1beta2LimitedPriorityLevelConfigurationFluent<
        A extends V1beta2LimitedPriorityLevelConfigurationFluent<A>>
    extends Fluent<A> {
  public Integer getAssuredConcurrencyShares();

  public A withAssuredConcurrencyShares(java.lang.Integer assuredConcurrencyShares);

  public Boolean hasAssuredConcurrencyShares();

  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2LimitResponse getLimitResponse();

  public io.kubernetes.client.openapi.models.V1beta2LimitResponse buildLimitResponse();

  public A withLimitResponse(
      io.kubernetes.client.openapi.models.V1beta2LimitResponse limitResponse);

  public java.lang.Boolean hasLimitResponse();

  public V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A>
      withNewLimitResponse();

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      withNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta2LimitResponse item);

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      editLimitResponse();

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      editOrNewLimitResponse();

  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent
              .LimitResponseNested<
          A>
      editOrNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta2LimitResponse item);

  public interface LimitResponseNested<N>
      extends Nested<N>,
          V1beta2LimitResponseFluent<
              V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>> {
    public N and();

    public N endLimitResponse();
  }
}
