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
public class V1SecretEnvSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SecretEnvSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SecretEnvSourceFluent<A> {
  public V1SecretEnvSourceFluentImpl() {}

  public V1SecretEnvSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1SecretEnvSource instance) {
    this.withName(instance.getName());

    this.withOptional(instance.getOptional());
  }

  private java.lang.String name;
  private java.lang.Boolean optional;

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

  public java.lang.Boolean getOptional() {
    return this.optional;
  }

  public A withOptional(java.lang.Boolean optional) {
    this.optional = optional;
    return (A) this;
  }

  public java.lang.Boolean hasOptional() {
    return this.optional != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SecretEnvSourceFluentImpl that = (V1SecretEnvSourceFluentImpl) o;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (optional != null ? !optional.equals(that.optional) : that.optional != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(name, optional, super.hashCode());
  }
}
