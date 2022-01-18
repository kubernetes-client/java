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
public class V1beta1AllowedFlexVolumeFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<A> {
  public V1beta1AllowedFlexVolumeFluentImpl() {}

  public V1beta1AllowedFlexVolumeFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance) {
    this.withDriver(instance.getDriver());
  }

  private java.lang.String driver;

  public java.lang.String getDriver() {
    return this.driver;
  }

  public A withDriver(java.lang.String driver) {
    this.driver = driver;
    return (A) this;
  }

  public java.lang.Boolean hasDriver() {
    return this.driver != null;
  }

  /** Method is deprecated. use withDriver instead. */
  @java.lang.Deprecated
  public A withNewDriver(java.lang.String original) {
    return (A) withDriver(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1AllowedFlexVolumeFluentImpl that = (V1beta1AllowedFlexVolumeFluentImpl) o;
    if (driver != null ? !driver.equals(that.driver) : that.driver != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(driver, super.hashCode());
  }
}
