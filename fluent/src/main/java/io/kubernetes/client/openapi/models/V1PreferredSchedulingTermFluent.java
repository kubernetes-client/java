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
public interface V1PreferredSchedulingTermFluent<A extends V1PreferredSchedulingTermFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildPreference instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelectorTerm getPreference();

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildPreference();

  public A withPreference(io.kubernetes.client.openapi.models.V1NodeSelectorTerm preference);

  public Boolean hasPreference();

  public V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreference();

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      withNewPreferenceLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      editPreference();

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      editOrNewPreference();

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      editOrNewPreferenceLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);

  public Integer getWeight();

  public A withWeight(java.lang.Integer weight);

  public java.lang.Boolean hasWeight();

  public interface PreferenceNested<N>
      extends Nested<N>,
          V1NodeSelectorTermFluent<V1PreferredSchedulingTermFluent.PreferenceNested<N>> {
    public N and();

    public N endPreference();
  }
}
