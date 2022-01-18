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
public class ApiregistrationV1ServiceReferenceFluentImpl<
        A extends io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReferenceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReferenceFluent<A> {
  public ApiregistrationV1ServiceReferenceFluentImpl() {}

  public ApiregistrationV1ServiceReferenceFluentImpl(
      io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference instance) {
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withPort(instance.getPort());
  }

  private java.lang.String name;
  private java.lang.String namespace;
  private java.lang.Integer port;

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  public java.lang.String getNamespace() {
    return this.namespace;
  }

  public A withNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return (A) this;
  }

  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }

  /** Method is deprecated. use withNamespace instead. */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String original) {
    return (A) withNamespace(new String(original));
  }

  public java.lang.Integer getPort() {
    return this.port;
  }

  public A withPort(java.lang.Integer port) {
    this.port = port;
    return (A) this;
  }

  public java.lang.Boolean hasPort() {
    return this.port != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiregistrationV1ServiceReferenceFluentImpl that =
        (ApiregistrationV1ServiceReferenceFluentImpl) o;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null)
      return false;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(name, namespace, port, super.hashCode());
  }
}
