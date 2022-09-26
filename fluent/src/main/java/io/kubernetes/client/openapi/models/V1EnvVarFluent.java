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
public interface V1EnvVarFluent<A extends V1EnvVarFluent<A>> extends Fluent<A> {
  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public String getValue();

  public A withValue(String value);

  public Boolean hasValue();

  /**
   * This method has been deprecated, please use method buildValueFrom instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1EnvVarSource getValueFrom();

  public V1EnvVarSource buildValueFrom();

  public A withValueFrom(V1EnvVarSource valueFrom);

  public Boolean hasValueFrom();

  public V1EnvVarFluent.ValueFromNested<A> withNewValueFrom();

  public V1EnvVarFluent.ValueFromNested<A> withNewValueFromLike(V1EnvVarSource item);

  public V1EnvVarFluent.ValueFromNested<A> editValueFrom();

  public V1EnvVarFluent.ValueFromNested<A> editOrNewValueFrom();

  public V1EnvVarFluent.ValueFromNested<A> editOrNewValueFromLike(V1EnvVarSource item);

  public interface ValueFromNested<N>
      extends Nested<N>, V1EnvVarSourceFluent<V1EnvVarFluent.ValueFromNested<N>> {
    public N and();

    public N endValueFrom();
  }
}
