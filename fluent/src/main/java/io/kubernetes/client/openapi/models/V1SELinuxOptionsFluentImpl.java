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
public class V1SELinuxOptionsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<A> {
  public V1SELinuxOptionsFluentImpl() {}

  public V1SELinuxOptionsFluentImpl(io.kubernetes.client.openapi.models.V1SELinuxOptions instance) {
    this.withLevel(instance.getLevel());

    this.withRole(instance.getRole());

    this.withType(instance.getType());

    this.withUser(instance.getUser());
  }

  private java.lang.String level;
  private java.lang.String role;
  private java.lang.String type;
  private java.lang.String user;

  public java.lang.String getLevel() {
    return this.level;
  }

  public A withLevel(java.lang.String level) {
    this.level = level;
    return (A) this;
  }

  public java.lang.Boolean hasLevel() {
    return this.level != null;
  }

  /** Method is deprecated. use withLevel instead. */
  @java.lang.Deprecated
  public A withNewLevel(java.lang.String original) {
    return (A) withLevel(new String(original));
  }

  public java.lang.String getRole() {
    return this.role;
  }

  public A withRole(java.lang.String role) {
    this.role = role;
    return (A) this;
  }

  public java.lang.Boolean hasRole() {
    return this.role != null;
  }

  /** Method is deprecated. use withRole instead. */
  @java.lang.Deprecated
  public A withNewRole(java.lang.String original) {
    return (A) withRole(new String(original));
  }

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  /** Method is deprecated. use withType instead. */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original) {
    return (A) withType(new String(original));
  }

  public java.lang.String getUser() {
    return this.user;
  }

  public A withUser(java.lang.String user) {
    this.user = user;
    return (A) this;
  }

  public java.lang.Boolean hasUser() {
    return this.user != null;
  }

  /** Method is deprecated. use withUser instead. */
  @java.lang.Deprecated
  public A withNewUser(java.lang.String original) {
    return (A) withUser(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SELinuxOptionsFluentImpl that = (V1SELinuxOptionsFluentImpl) o;
    if (level != null ? !level.equals(that.level) : that.level != null) return false;
    if (role != null ? !role.equals(that.role) : that.role != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    if (user != null ? !user.equals(that.user) : that.user != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(level, role, type, user, super.hashCode());
  }
}
