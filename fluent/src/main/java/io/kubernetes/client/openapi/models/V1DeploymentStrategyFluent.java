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
public interface V1DeploymentStrategyFluent<A extends V1DeploymentStrategyFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateDeployment getRollingUpdate();

  public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment buildRollingUpdate();

  public A withRollingUpdate(
      io.kubernetes.client.openapi.models.V1RollingUpdateDeployment rollingUpdate);

  public Boolean hasRollingUpdate();

  public V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item);

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      editRollingUpdate();

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      editOrNewRollingUpdate();

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      editOrNewRollingUpdateLike(
          io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item);

  public String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();

  public interface RollingUpdateNested<N>
      extends Nested<N>,
          V1RollingUpdateDeploymentFluent<V1DeploymentStrategyFluent.RollingUpdateNested<N>> {
    public N and();

    public N endRollingUpdate();
  }
}
