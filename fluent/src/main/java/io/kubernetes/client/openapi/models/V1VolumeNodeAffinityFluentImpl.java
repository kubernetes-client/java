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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1VolumeNodeAffinityFluentImpl<A extends V1VolumeNodeAffinityFluent<A>>
    extends BaseFluent<A> implements V1VolumeNodeAffinityFluent<A> {
  public V1VolumeNodeAffinityFluentImpl() {}

  public V1VolumeNodeAffinityFluentImpl(
      io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance) {
    this.withRequired(instance.getRequired());
  }

  private V1NodeSelectorBuilder required;

  /**
   * This method has been deprecated, please use method buildRequired instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getRequired() {
    return this.required != null ? this.required.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeSelector buildRequired() {
    return this.required != null ? this.required.build() : null;
  }

  public A withRequired(io.kubernetes.client.openapi.models.V1NodeSelector required) {
    _visitables.get("required").remove(this.required);
    if (required != null) {
      this.required = new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder(required);
      _visitables.get("required").add(this.required);
    }
    return (A) this;
  }

  public Boolean hasRequired() {
    return this.required != null;
  }

  public V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequired() {
    return new V1VolumeNodeAffinityFluentImpl.RequiredNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      withNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item) {
    return new V1VolumeNodeAffinityFluentImpl.RequiredNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      editRequired() {
    return withNewRequiredLike(getRequired());
  }

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      editOrNewRequired() {
    return withNewRequiredLike(
        getRequired() != null
            ? getRequired()
            : new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A>
      editOrNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item) {
    return withNewRequiredLike(getRequired() != null ? getRequired() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeNodeAffinityFluentImpl that = (V1VolumeNodeAffinityFluentImpl) o;
    if (required != null ? !required.equals(that.required) : that.required != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(required, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (required != null) {
      sb.append("required:");
      sb.append(required);
    }
    sb.append("}");
    return sb.toString();
  }

  class RequiredNestedImpl<N>
      extends V1NodeSelectorFluentImpl<V1VolumeNodeAffinityFluent.RequiredNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<N>,
          Nested<N> {
    RequiredNestedImpl(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }

    RequiredNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeSelectorBuilder builder;

    public N and() {
      return (N) V1VolumeNodeAffinityFluentImpl.this.withRequired(builder.build());
    }

    public N endRequired() {
      return and();
    }
  }
}
