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
public interface V1DeploymentStrategyFluent<
        A extends io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment getRollingUpdate();

  public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment buildRollingUpdate();

  public A withRollingUpdate(
      io.kubernetes.client.openapi.models.V1RollingUpdateDeployment rollingUpdate);

  public java.lang.Boolean hasRollingUpdate();

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      withNewRollingUpdate();

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item);

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      editRollingUpdate();

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      editOrNewRollingUpdate();

  public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A>
      editOrNewRollingUpdateLike(
          io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item);

  public io.kubernetes.client.openapi.models.V1DeploymentStrategy.TypeEnum getType();

  public A withType(io.kubernetes.client.openapi.models.V1DeploymentStrategy.TypeEnum type);

  public java.lang.Boolean hasType();

  public interface RollingUpdateNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<
              io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<
                  N>> {
    public N and();

    public N endRollingUpdate();
  }
}
