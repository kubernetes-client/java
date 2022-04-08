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
public class V1EphemeralVolumeSourceFluentImpl<A extends V1EphemeralVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1EphemeralVolumeSourceFluent<A> {
  public V1EphemeralVolumeSourceFluentImpl() {}

  public V1EphemeralVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance) {
    this.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());
  }

  private V1PersistentVolumeClaimTemplateBuilder volumeClaimTemplate;

  /**
   * This method has been deprecated, please use method buildVolumeClaimTemplate instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
    return this.volumeClaimTemplate != null ? this.volumeClaimTemplate.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate
      buildVolumeClaimTemplate() {
    return this.volumeClaimTemplate != null ? this.volumeClaimTemplate.build() : null;
  }

  public A withVolumeClaimTemplate(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate volumeClaimTemplate) {
    _visitables.get("volumeClaimTemplate").remove(this.volumeClaimTemplate);
    if (volumeClaimTemplate != null) {
      this.volumeClaimTemplate =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateBuilder(
              volumeClaimTemplate);
      _visitables.get("volumeClaimTemplate").add(this.volumeClaimTemplate);
    }
    return (A) this;
  }

  public Boolean hasVolumeClaimTemplate() {
    return this.volumeClaimTemplate != null;
  }

  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> withNewVolumeClaimTemplate() {
    return new V1EphemeralVolumeSourceFluentImpl.VolumeClaimTemplateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      withNewVolumeClaimTemplateLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate item) {
    return new V1EphemeralVolumeSourceFluentImpl.VolumeClaimTemplateNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      editVolumeClaimTemplate() {
    return withNewVolumeClaimTemplateLike(getVolumeClaimTemplate());
  }

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      editOrNewVolumeClaimTemplate() {
    return withNewVolumeClaimTemplateLike(
        getVolumeClaimTemplate() != null
            ? getVolumeClaimTemplate()
            : new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      editOrNewVolumeClaimTemplateLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate item) {
    return withNewVolumeClaimTemplateLike(
        getVolumeClaimTemplate() != null ? getVolumeClaimTemplate() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EphemeralVolumeSourceFluentImpl that = (V1EphemeralVolumeSourceFluentImpl) o;
    if (volumeClaimTemplate != null
        ? !volumeClaimTemplate.equals(that.volumeClaimTemplate)
        : that.volumeClaimTemplate != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(volumeClaimTemplate, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (volumeClaimTemplate != null) {
      sb.append("volumeClaimTemplate:");
      sb.append(volumeClaimTemplate);
    }
    sb.append("}");
    return sb.toString();
  }

  class VolumeClaimTemplateNestedImpl<N>
      extends V1PersistentVolumeClaimTemplateFluentImpl<
          V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<N>>
      implements io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
                  .VolumeClaimTemplateNested<
              N>,
          Nested<N> {
    VolumeClaimTemplateNestedImpl(
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate item) {
      this.builder = new V1PersistentVolumeClaimTemplateBuilder(this, item);
    }

    VolumeClaimTemplateNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateBuilder builder;

    public N and() {
      return (N) V1EphemeralVolumeSourceFluentImpl.this.withVolumeClaimTemplate(builder.build());
    }

    public N endVolumeClaimTemplate() {
      return and();
    }
  }
}
