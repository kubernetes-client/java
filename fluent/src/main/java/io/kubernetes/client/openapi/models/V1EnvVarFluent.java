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
public interface V1EnvVarFluent<A extends io.kubernetes.client.openapi.models.V1EnvVarFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.String getValue();

  public A withValue(java.lang.String value);

  public java.lang.Boolean hasValue();

  /** Method is deprecated. use withValue instead. */
  @java.lang.Deprecated
  public A withNewValue(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildValueFrom instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EnvVarSource getValueFrom();

  public io.kubernetes.client.openapi.models.V1EnvVarSource buildValueFrom();

  public A withValueFrom(io.kubernetes.client.openapi.models.V1EnvVarSource valueFrom);

  public java.lang.Boolean hasValueFrom();

  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> withNewValueFrom();

  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> withNewValueFromLike(
      io.kubernetes.client.openapi.models.V1EnvVarSource item);

  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editValueFrom();

  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editOrNewValueFrom();

  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A>
      editOrNewValueFromLike(io.kubernetes.client.openapi.models.V1EnvVarSource item);

  public interface ValueFromNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<
              io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<N>> {
    public N and();

    public N endValueFrom();
  }
}
