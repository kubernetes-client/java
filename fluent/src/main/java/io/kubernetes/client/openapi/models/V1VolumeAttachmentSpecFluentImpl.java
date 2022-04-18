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
public class V1VolumeAttachmentSpecFluentImpl<A extends V1VolumeAttachmentSpecFluent<A>>
    extends BaseFluent<A> implements V1VolumeAttachmentSpecFluent<A> {
  public V1VolumeAttachmentSpecFluentImpl() {}

  public V1VolumeAttachmentSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec instance) {
    this.withAttacher(instance.getAttacher());

    this.withNodeName(instance.getNodeName());

    this.withSource(instance.getSource());
  }

  private String attacher;
  private java.lang.String nodeName;
  private V1VolumeAttachmentSourceBuilder source;

  public java.lang.String getAttacher() {
    return this.attacher;
  }

  public A withAttacher(java.lang.String attacher) {
    this.attacher = attacher;
    return (A) this;
  }

  public Boolean hasAttacher() {
    return this.attacher != null;
  }

  public java.lang.String getNodeName() {
    return this.nodeName;
  }

  public A withNodeName(java.lang.String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }

  public java.lang.Boolean hasNodeName() {
    return this.nodeName != null;
  }

  /**
   * This method has been deprecated, please use method buildSource instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentSource getSource() {
    return this.source != null ? this.source.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSource buildSource() {
    return this.source != null ? this.source.build() : null;
  }

  public A withSource(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource source) {
    _visitables.get("source").remove(this.source);
    if (source != null) {
      this.source = new io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder(source);
      _visitables.get("source").add(this.source);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSource() {
    return this.source != null;
  }

  public V1VolumeAttachmentSpecFluent.SourceNested<A> withNewSource() {
    return new V1VolumeAttachmentSpecFluentImpl.SourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      withNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item) {
    return new V1VolumeAttachmentSpecFluentImpl.SourceNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editSource() {
    return withNewSourceLike(getSource());
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editOrNewSource() {
    return withNewSourceLike(
        getSource() != null
            ? getSource()
            : new io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A>
      editOrNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item) {
    return withNewSourceLike(getSource() != null ? getSource() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeAttachmentSpecFluentImpl that = (V1VolumeAttachmentSpecFluentImpl) o;
    if (attacher != null ? !attacher.equals(that.attacher) : that.attacher != null) return false;
    if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;
    if (source != null ? !source.equals(that.source) : that.source != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(attacher, nodeName, source, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (attacher != null) {
      sb.append("attacher:");
      sb.append(attacher + ",");
    }
    if (nodeName != null) {
      sb.append("nodeName:");
      sb.append(nodeName + ",");
    }
    if (source != null) {
      sb.append("source:");
      sb.append(source);
    }
    sb.append("}");
    return sb.toString();
  }

  class SourceNestedImpl<N>
      extends V1VolumeAttachmentSourceFluentImpl<V1VolumeAttachmentSpecFluent.SourceNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<N>,
          Nested<N> {
    SourceNestedImpl(V1VolumeAttachmentSource item) {
      this.builder = new V1VolumeAttachmentSourceBuilder(this, item);
    }

    SourceNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder builder;

    public N and() {
      return (N) V1VolumeAttachmentSpecFluentImpl.this.withSource(builder.build());
    }

    public N endSource() {
      return and();
    }
  }
}
