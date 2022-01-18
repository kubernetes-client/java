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
public class V1NodeAddressFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NodeAddressFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeAddressFluent<A> {
  public V1NodeAddressFluentImpl() {}

  public V1NodeAddressFluentImpl(io.kubernetes.client.openapi.models.V1NodeAddress instance) {
    this.withAddress(instance.getAddress());

    this.withType(instance.getType());
  }

  private java.lang.String address;
  private io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum type;

  public java.lang.String getAddress() {
    return this.address;
  }

  public A withAddress(java.lang.String address) {
    this.address = address;
    return (A) this;
  }

  public java.lang.Boolean hasAddress() {
    return this.address != null;
  }

  /** Method is deprecated. use withAddress instead. */
  @java.lang.Deprecated
  public A withNewAddress(java.lang.String original) {
    return (A) withAddress(new String(original));
  }

  public io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum getType() {
    return this.type;
  }

  public A withType(io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeAddressFluentImpl that = (V1NodeAddressFluentImpl) o;
    if (address != null ? !address.equals(that.address) : that.address != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(address, type, super.hashCode());
  }
}
