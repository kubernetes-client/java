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

import io.kubernetes.client.custom.Quantity;

/** Generated */
public class V1EmptyDirVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceFluent<A> {
  public V1EmptyDirVolumeSourceFluentImpl() {}

  public V1EmptyDirVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource instance) {
    this.withMedium(instance.getMedium());

    this.withSizeLimit(instance.getSizeLimit());
  }

  private java.lang.String medium;
  private io.kubernetes.client.custom.Quantity sizeLimit;

  public java.lang.String getMedium() {
    return this.medium;
  }

  public A withMedium(java.lang.String medium) {
    this.medium = medium;
    return (A) this;
  }

  public java.lang.Boolean hasMedium() {
    return this.medium != null;
  }

  /** Method is deprecated. use withMedium instead. */
  @java.lang.Deprecated
  public A withNewMedium(java.lang.String original) {
    return (A) withMedium(new String(original));
  }

  public io.kubernetes.client.custom.Quantity getSizeLimit() {
    return this.sizeLimit;
  }

  public A withSizeLimit(io.kubernetes.client.custom.Quantity sizeLimit) {
    this.sizeLimit = sizeLimit;
    return (A) this;
  }

  public java.lang.Boolean hasSizeLimit() {
    return this.sizeLimit != null;
  }

  public A withNewSizeLimit(java.lang.String value) {
    return (A) withSizeLimit(new Quantity(value));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EmptyDirVolumeSourceFluentImpl that = (V1EmptyDirVolumeSourceFluentImpl) o;
    if (medium != null ? !medium.equals(that.medium) : that.medium != null) return false;
    if (sizeLimit != null ? !sizeLimit.equals(that.sizeLimit) : that.sizeLimit != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(medium, sizeLimit, super.hashCode());
  }
}
