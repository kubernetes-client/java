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

import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1QuobyteVolumeSourceFluentImpl<A extends V1QuobyteVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1QuobyteVolumeSourceFluent<A> {
  public V1QuobyteVolumeSourceFluentImpl() {}

  public V1QuobyteVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource instance) {
    this.withGroup(instance.getGroup());

    this.withReadOnly(instance.getReadOnly());

    this.withRegistry(instance.getRegistry());

    this.withTenant(instance.getTenant());

    this.withUser(instance.getUser());

    this.withVolume(instance.getVolume());
  }

  private String group;
  private Boolean readOnly;
  private java.lang.String registry;
  private java.lang.String tenant;
  private java.lang.String user;
  private java.lang.String volume;

  public java.lang.String getGroup() {
    return this.group;
  }

  public A withGroup(java.lang.String group) {
    this.group = group;
    return (A) this;
  }

  public java.lang.Boolean hasGroup() {
    return this.group != null;
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

  public java.lang.String getRegistry() {
    return this.registry;
  }

  public A withRegistry(java.lang.String registry) {
    this.registry = registry;
    return (A) this;
  }

  public java.lang.Boolean hasRegistry() {
    return this.registry != null;
  }

  public java.lang.String getTenant() {
    return this.tenant;
  }

  public A withTenant(java.lang.String tenant) {
    this.tenant = tenant;
    return (A) this;
  }

  public java.lang.Boolean hasTenant() {
    return this.tenant != null;
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

  public java.lang.String getVolume() {
    return this.volume;
  }

  public A withVolume(java.lang.String volume) {
    this.volume = volume;
    return (A) this;
  }

  public java.lang.Boolean hasVolume() {
    return this.volume != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1QuobyteVolumeSourceFluentImpl that = (V1QuobyteVolumeSourceFluentImpl) o;
    if (group != null ? !group.equals(that.group) : that.group != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (registry != null ? !registry.equals(that.registry) : that.registry != null) return false;
    if (tenant != null ? !tenant.equals(that.tenant) : that.tenant != null) return false;
    if (user != null ? !user.equals(that.user) : that.user != null) return false;
    if (volume != null ? !volume.equals(that.volume) : that.volume != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        group, readOnly, registry, tenant, user, volume, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (group != null) {
      sb.append("group:");
      sb.append(group + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (registry != null) {
      sb.append("registry:");
      sb.append(registry + ",");
    }
    if (tenant != null) {
      sb.append("tenant:");
      sb.append(tenant + ",");
    }
    if (user != null) {
      sb.append("user:");
      sb.append(user + ",");
    }
    if (volume != null) {
      sb.append("volume:");
      sb.append(volume);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }
}
