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
public interface V1LifecycleFluent<
        A extends io.kubernetes.client.openapi.models.V1LifecycleFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildPostStart instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LifecycleHandler getPostStart();

  public io.kubernetes.client.openapi.models.V1LifecycleHandler buildPostStart();

  public A withPostStart(io.kubernetes.client.openapi.models.V1LifecycleHandler postStart);

  public java.lang.Boolean hasPostStart();

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A>
      withNewPostStart();

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A>
      withNewPostStartLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item);

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> editPostStart();

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A>
      editOrNewPostStart();

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A>
      editOrNewPostStartLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item);

  /**
   * This method has been deprecated, please use method buildPreStop instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LifecycleHandler getPreStop();

  public io.kubernetes.client.openapi.models.V1LifecycleHandler buildPreStop();

  public A withPreStop(io.kubernetes.client.openapi.models.V1LifecycleHandler preStop);

  public java.lang.Boolean hasPreStop();

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> withNewPreStop();

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> withNewPreStopLike(
      io.kubernetes.client.openapi.models.V1LifecycleHandler item);

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editPreStop();

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editOrNewPreStop();

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A>
      editOrNewPreStopLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item);

  public interface PostStartNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<
              io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<N>> {
    public N and();

    public N endPostStart();
  }

  public interface PreStopNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<
              io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<N>> {
    public N and();

    public N endPreStop();
  }
}
