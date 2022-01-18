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
public class V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl<
        A extends
            io.kubernetes.client.openapi.models
                        .V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<
                    A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models
            .V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<
        A> {
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl() {}

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl(
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
          instance) {
    this.withWhenDeleted(instance.getWhenDeleted());

    this.withWhenScaled(instance.getWhenScaled());
  }

  private java.lang.String whenDeleted;
  private java.lang.String whenScaled;

  public java.lang.String getWhenDeleted() {
    return this.whenDeleted;
  }

  public A withWhenDeleted(java.lang.String whenDeleted) {
    this.whenDeleted = whenDeleted;
    return (A) this;
  }

  public java.lang.Boolean hasWhenDeleted() {
    return this.whenDeleted != null;
  }

  /** Method is deprecated. use withWhenDeleted instead. */
  @java.lang.Deprecated
  public A withNewWhenDeleted(java.lang.String original) {
    return (A) withWhenDeleted(new String(original));
  }

  public java.lang.String getWhenScaled() {
    return this.whenScaled;
  }

  public A withWhenScaled(java.lang.String whenScaled) {
    this.whenScaled = whenScaled;
    return (A) this;
  }

  public java.lang.Boolean hasWhenScaled() {
    return this.whenScaled != null;
  }

  /** Method is deprecated. use withWhenScaled instead. */
  @java.lang.Deprecated
  public A withNewWhenScaled(java.lang.String original) {
    return (A) withWhenScaled(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl that =
        (V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl) o;
    if (whenDeleted != null ? !whenDeleted.equals(that.whenDeleted) : that.whenDeleted != null)
      return false;
    if (whenScaled != null ? !whenScaled.equals(that.whenScaled) : that.whenScaled != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(whenDeleted, whenScaled, super.hashCode());
  }
}
