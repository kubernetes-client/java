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
public interface V1ContainerStatusFluent<A extends V1ContainerStatusFluent<A>> extends Fluent<A> {
  public String getContainerID();

  public A withContainerID(java.lang.String containerID);

  public Boolean hasContainerID();

  public java.lang.String getImage();

  public A withImage(java.lang.String image);

  public java.lang.Boolean hasImage();

  public java.lang.String getImageID();

  public A withImageID(java.lang.String imageID);

  public java.lang.Boolean hasImageID();

  /**
   * This method has been deprecated, please use method buildLastState instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerState getLastState();

  public io.kubernetes.client.openapi.models.V1ContainerState buildLastState();

  public A withLastState(io.kubernetes.client.openapi.models.V1ContainerState lastState);

  public java.lang.Boolean hasLastState();

  public V1ContainerStatusFluent.LastStateNested<A> withNewLastState();

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A>
      withNewLastStateLike(io.kubernetes.client.openapi.models.V1ContainerState item);

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A>
      editLastState();

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A>
      editOrNewLastState();

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A>
      editOrNewLastStateLike(io.kubernetes.client.openapi.models.V1ContainerState item);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  public java.lang.Boolean getReady();

  public A withReady(java.lang.Boolean ready);

  public java.lang.Boolean hasReady();

  public Integer getRestartCount();

  public A withRestartCount(java.lang.Integer restartCount);

  public java.lang.Boolean hasRestartCount();

  public java.lang.Boolean getStarted();

  public A withStarted(java.lang.Boolean started);

  public java.lang.Boolean hasStarted();

  /**
   * This method has been deprecated, please use method buildState instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ContainerState getState();

  public io.kubernetes.client.openapi.models.V1ContainerState buildState();

  public A withState(io.kubernetes.client.openapi.models.V1ContainerState state);

  public java.lang.Boolean hasState();

  public V1ContainerStatusFluent.StateNested<A> withNewState();

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A>
      withNewStateLike(io.kubernetes.client.openapi.models.V1ContainerState item);

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A> editState();

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A>
      editOrNewState();

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A>
      editOrNewStateLike(io.kubernetes.client.openapi.models.V1ContainerState item);

  public A withReady();

  public A withStarted();

  public interface LastStateNested<N>
      extends Nested<N>, V1ContainerStateFluent<V1ContainerStatusFluent.LastStateNested<N>> {
    public N and();

    public N endLastState();
  }

  public interface StateNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ContainerStateFluent<V1ContainerStatusFluent.StateNested<N>> {
    public N and();

    public N endState();
  }
}
