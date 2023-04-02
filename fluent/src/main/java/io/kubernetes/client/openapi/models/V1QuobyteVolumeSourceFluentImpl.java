package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1QuobyteVolumeSourceFluentImpl<A extends V1QuobyteVolumeSourceFluent<A>> extends BaseFluent<A> implements V1QuobyteVolumeSourceFluent<A>{
  public V1QuobyteVolumeSourceFluentImpl() {
  }
  public V1QuobyteVolumeSourceFluentImpl(V1QuobyteVolumeSource instance) {
    this.withGroup(instance.getGroup());

    this.withReadOnly(instance.getReadOnly());

    this.withRegistry(instance.getRegistry());

    this.withTenant(instance.getTenant());

    this.withUser(instance.getUser());

    this.withVolume(instance.getVolume());

  }
  private String group;
  private Boolean readOnly;
  private String registry;
  private String tenant;
  private String user;
  private String volume;
  public String getGroup() {
    return this.group;
  }
  public A withGroup(String group) {
    this.group=group; return (A) this;
  }
  public Boolean hasGroup() {
    return this.group != null;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public String getRegistry() {
    return this.registry;
  }
  public A withRegistry(String registry) {
    this.registry=registry; return (A) this;
  }
  public Boolean hasRegistry() {
    return this.registry != null;
  }
  public String getTenant() {
    return this.tenant;
  }
  public A withTenant(String tenant) {
    this.tenant=tenant; return (A) this;
  }
  public Boolean hasTenant() {
    return this.tenant != null;
  }
  public String getUser() {
    return this.user;
  }
  public A withUser(String user) {
    this.user=user; return (A) this;
  }
  public Boolean hasUser() {
    return this.user != null;
  }
  public String getVolume() {
    return this.volume;
  }
  public A withVolume(String volume) {
    this.volume=volume; return (A) this;
  }
  public Boolean hasVolume() {
    return this.volume != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1QuobyteVolumeSourceFluentImpl that = (V1QuobyteVolumeSourceFluentImpl) o;
    if (group != null ? !group.equals(that.group) :that.group != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (registry != null ? !registry.equals(that.registry) :that.registry != null) return false;
    if (tenant != null ? !tenant.equals(that.tenant) :that.tenant != null) return false;
    if (user != null ? !user.equals(that.user) :that.user != null) return false;
    if (volume != null ? !volume.equals(that.volume) :that.volume != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(group,  readOnly,  registry,  tenant,  user,  volume,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (registry != null) { sb.append("registry:"); sb.append(registry + ","); }
    if (tenant != null) { sb.append("tenant:"); sb.append(tenant + ","); }
    if (user != null) { sb.append("user:"); sb.append(user + ","); }
    if (volume != null) { sb.append("volume:"); sb.append(volume); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
}