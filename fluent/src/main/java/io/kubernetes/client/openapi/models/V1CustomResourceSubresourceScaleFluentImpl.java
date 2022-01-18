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
public class V1CustomResourceSubresourceScaleFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<A> {
  public V1CustomResourceSubresourceScaleFluentImpl() {}

  public V1CustomResourceSubresourceScaleFluentImpl(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale instance) {
    this.withLabelSelectorPath(instance.getLabelSelectorPath());

    this.withSpecReplicasPath(instance.getSpecReplicasPath());

    this.withStatusReplicasPath(instance.getStatusReplicasPath());
  }

  private java.lang.String labelSelectorPath;
  private java.lang.String specReplicasPath;
  private java.lang.String statusReplicasPath;

  public java.lang.String getLabelSelectorPath() {
    return this.labelSelectorPath;
  }

  public A withLabelSelectorPath(java.lang.String labelSelectorPath) {
    this.labelSelectorPath = labelSelectorPath;
    return (A) this;
  }

  public java.lang.Boolean hasLabelSelectorPath() {
    return this.labelSelectorPath != null;
  }

  /** Method is deprecated. use withLabelSelectorPath instead. */
  @java.lang.Deprecated
  public A withNewLabelSelectorPath(java.lang.String original) {
    return (A) withLabelSelectorPath(new String(original));
  }

  public java.lang.String getSpecReplicasPath() {
    return this.specReplicasPath;
  }

  public A withSpecReplicasPath(java.lang.String specReplicasPath) {
    this.specReplicasPath = specReplicasPath;
    return (A) this;
  }

  public java.lang.Boolean hasSpecReplicasPath() {
    return this.specReplicasPath != null;
  }

  /** Method is deprecated. use withSpecReplicasPath instead. */
  @java.lang.Deprecated
  public A withNewSpecReplicasPath(java.lang.String original) {
    return (A) withSpecReplicasPath(new String(original));
  }

  public java.lang.String getStatusReplicasPath() {
    return this.statusReplicasPath;
  }

  public A withStatusReplicasPath(java.lang.String statusReplicasPath) {
    this.statusReplicasPath = statusReplicasPath;
    return (A) this;
  }

  public java.lang.Boolean hasStatusReplicasPath() {
    return this.statusReplicasPath != null;
  }

  /** Method is deprecated. use withStatusReplicasPath instead. */
  @java.lang.Deprecated
  public A withNewStatusReplicasPath(java.lang.String original) {
    return (A) withStatusReplicasPath(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceSubresourceScaleFluentImpl that =
        (V1CustomResourceSubresourceScaleFluentImpl) o;
    if (labelSelectorPath != null
        ? !labelSelectorPath.equals(that.labelSelectorPath)
        : that.labelSelectorPath != null) return false;
    if (specReplicasPath != null
        ? !specReplicasPath.equals(that.specReplicasPath)
        : that.specReplicasPath != null) return false;
    if (statusReplicasPath != null
        ? !statusReplicasPath.equals(that.statusReplicasPath)
        : that.statusReplicasPath != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        labelSelectorPath, specReplicasPath, statusReplicasPath, super.hashCode());
  }
}
