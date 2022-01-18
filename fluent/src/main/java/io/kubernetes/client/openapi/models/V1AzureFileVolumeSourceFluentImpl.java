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
public class V1AzureFileVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<A> {
  public V1AzureFileVolumeSourceFluentImpl() {}

  public V1AzureFileVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1AzureFileVolumeSource instance) {
    this.withReadOnly(instance.getReadOnly());

    this.withSecretName(instance.getSecretName());

    this.withShareName(instance.getShareName());
  }

  private java.lang.Boolean readOnly;
  private java.lang.String secretName;
  private java.lang.String shareName;

  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  public java.lang.String getSecretName() {
    return this.secretName;
  }

  public A withSecretName(java.lang.String secretName) {
    this.secretName = secretName;
    return (A) this;
  }

  public java.lang.Boolean hasSecretName() {
    return this.secretName != null;
  }

  /** Method is deprecated. use withSecretName instead. */
  @java.lang.Deprecated
  public A withNewSecretName(java.lang.String original) {
    return (A) withSecretName(new String(original));
  }

  public java.lang.String getShareName() {
    return this.shareName;
  }

  public A withShareName(java.lang.String shareName) {
    this.shareName = shareName;
    return (A) this;
  }

  public java.lang.Boolean hasShareName() {
    return this.shareName != null;
  }

  /** Method is deprecated. use withShareName instead. */
  @java.lang.Deprecated
  public A withNewShareName(java.lang.String original) {
    return (A) withShareName(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AzureFileVolumeSourceFluentImpl that = (V1AzureFileVolumeSourceFluentImpl) o;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretName != null ? !secretName.equals(that.secretName) : that.secretName != null)
      return false;
    if (shareName != null ? !shareName.equals(that.shareName) : that.shareName != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(readOnly, secretName, shareName, super.hashCode());
  }
}
