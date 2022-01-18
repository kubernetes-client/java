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
public class V1PersistentVolumeClaimVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<A> {
  public V1PersistentVolumeClaimVolumeSourceFluentImpl() {}

  public V1PersistentVolumeClaimVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance) {
    this.withClaimName(instance.getClaimName());

    this.withReadOnly(instance.getReadOnly());
  }

  private java.lang.String claimName;
  private java.lang.Boolean readOnly;

  public java.lang.String getClaimName() {
    return this.claimName;
  }

  public A withClaimName(java.lang.String claimName) {
    this.claimName = claimName;
    return (A) this;
  }

  public java.lang.Boolean hasClaimName() {
    return this.claimName != null;
  }

  /** Method is deprecated. use withClaimName instead. */
  @java.lang.Deprecated
  public A withNewClaimName(java.lang.String original) {
    return (A) withClaimName(new String(original));
  }

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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeClaimVolumeSourceFluentImpl that =
        (V1PersistentVolumeClaimVolumeSourceFluentImpl) o;
    if (claimName != null ? !claimName.equals(that.claimName) : that.claimName != null)
      return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(claimName, readOnly, super.hashCode());
  }
}
