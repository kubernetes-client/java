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
public class V1PreferredSchedulingTermFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<A> {
  public V1PreferredSchedulingTermFluentImpl() {}

  public V1PreferredSchedulingTermFluentImpl(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm instance) {
    this.withPreference(instance.getPreference());

    this.withWeight(instance.getWeight());
  }

  private io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder preference;
  private java.lang.Integer weight;

  /**
   * This method has been deprecated, please use method buildPreference instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm getPreference() {
    return this.preference != null ? this.preference.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildPreference() {
    return this.preference != null ? this.preference.build() : null;
  }

  public A withPreference(io.kubernetes.client.openapi.models.V1NodeSelectorTerm preference) {
    _visitables.get("preference").remove(this.preference);
    if (preference != null) {
      this.preference =
          new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(preference);
      _visitables.get("preference").add(this.preference);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPreference() {
    return this.preference != null;
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      withNewPreference() {
    return new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluentImpl
        .PreferenceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      withNewPreferenceLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item) {
    return new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluentImpl
        .PreferenceNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      editPreference() {
    return withNewPreferenceLike(getPreference());
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      editOrNewPreference() {
    return withNewPreferenceLike(
        getPreference() != null
            ? getPreference()
            : new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A>
      editOrNewPreferenceLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item) {
    return withNewPreferenceLike(getPreference() != null ? getPreference() : item);
  }

  public java.lang.Integer getWeight() {
    return this.weight;
  }

  public A withWeight(java.lang.Integer weight) {
    this.weight = weight;
    return (A) this;
  }

  public java.lang.Boolean hasWeight() {
    return this.weight != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PreferredSchedulingTermFluentImpl that = (V1PreferredSchedulingTermFluentImpl) o;
    if (preference != null ? !preference.equals(that.preference) : that.preference != null)
      return false;
    if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(preference, weight, super.hashCode());
  }

  public class PreferenceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl<
          io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<N>>
      implements io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent
                  .PreferenceNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    PreferenceNestedImpl(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(this, item);
    }

    PreferenceNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder;

    public N and() {
      return (N) V1PreferredSchedulingTermFluentImpl.this.withPreference(builder.build());
    }

    public N endPreference() {
      return and();
    }
  }
}
