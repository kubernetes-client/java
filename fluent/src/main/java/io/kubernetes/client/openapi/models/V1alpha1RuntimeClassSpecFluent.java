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
public interface V1alpha1RuntimeClassSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildOverhead instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1alpha1Overhead getOverhead();

  public io.kubernetes.client.openapi.models.V1alpha1Overhead buildOverhead();

  public A withOverhead(io.kubernetes.client.openapi.models.V1alpha1Overhead overhead);

  public java.lang.Boolean hasOverhead();

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      withNewOverhead();

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      withNewOverheadLike(io.kubernetes.client.openapi.models.V1alpha1Overhead item);

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      editOverhead();

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      editOrNewOverhead();

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      editOrNewOverheadLike(io.kubernetes.client.openapi.models.V1alpha1Overhead item);

  public java.lang.String getRuntimeHandler();

  public A withRuntimeHandler(java.lang.String runtimeHandler);

  public java.lang.Boolean hasRuntimeHandler();

  /** Method is deprecated. use withRuntimeHandler instead. */
  @java.lang.Deprecated
  public A withNewRuntimeHandler(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildScheduling instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1alpha1Scheduling getScheduling();

  public io.kubernetes.client.openapi.models.V1alpha1Scheduling buildScheduling();

  public A withScheduling(io.kubernetes.client.openapi.models.V1alpha1Scheduling scheduling);

  public java.lang.Boolean hasScheduling();

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      withNewScheduling();

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      withNewSchedulingLike(io.kubernetes.client.openapi.models.V1alpha1Scheduling item);

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      editScheduling();

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      editOrNewScheduling();

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      editOrNewSchedulingLike(io.kubernetes.client.openapi.models.V1alpha1Scheduling item);

  public interface OverheadNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<
              io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<
                  N>> {
    public N and();

    public N endOverhead();
  }

  public interface SchedulingNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent<
              io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<
                  N>> {
    public N and();

    public N endScheduling();
  }
}
