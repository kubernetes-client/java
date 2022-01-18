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
public interface V1VolumeNodeAffinityFluent<
        A extends io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildRequired instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeSelector getRequired();

  public io.kubernetes.client.openapi.models.V1NodeSelector buildRequired();

  public A withRequired(io.kubernetes.client.openapi.models.V1NodeSelector required);

  public java.lang.Boolean hasRequired();

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      withNewRequired();

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      withNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item);

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      editRequired();

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      editOrNewRequired();

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      editOrNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item);

  public interface RequiredNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeSelectorFluent<
              io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<N>> {
    public N and();

    public N endRequired();
  }
}
