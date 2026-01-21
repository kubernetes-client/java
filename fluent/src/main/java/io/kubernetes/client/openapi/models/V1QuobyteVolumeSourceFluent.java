package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1QuobyteVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String group;
  private Boolean readOnly;
  private String registry;
  private String tenant;
  private String user;
  private String volume;

  public V1QuobyteVolumeSourceFluent() {
  }
  
  public V1QuobyteVolumeSourceFluent(V1QuobyteVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1QuobyteVolumeSource instance) {
    instance = instance != null ? instance : new V1QuobyteVolumeSource();
    if (instance != null) {
        this.withGroup(instance.getGroup());
        this.withReadOnly(instance.getReadOnly());
        this.withRegistry(instance.getRegistry());
        this.withTenant(instance.getTenant());
        this.withUser(instance.getUser());
        this.withVolume(instance.getVolume());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1QuobyteVolumeSourceFluent that = (V1QuobyteVolumeSourceFluent) o;
    if (!(Objects.equals(group, that.group))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(registry, that.registry))) {
      return false;
    }
    if (!(Objects.equals(tenant, that.tenant))) {
      return false;
    }
    if (!(Objects.equals(user, that.user))) {
      return false;
    }
    if (!(Objects.equals(volume, that.volume))) {
      return false;
    }
    return true;
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getRegistry() {
    return this.registry;
  }
  
  public String getTenant() {
    return this.tenant;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public String getVolume() {
    return this.volume;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasRegistry() {
    return this.registry != null;
  }
  
  public boolean hasTenant() {
    return this.tenant != null;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public boolean hasVolume() {
    return this.volume != null;
  }
  
  public int hashCode() {
    return Objects.hash(group, readOnly, registry, tenant, user, volume);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(group == null)) {
        sb.append("group:");
        sb.append(group);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(registry == null)) {
        sb.append("registry:");
        sb.append(registry);
        sb.append(",");
    }
    if (!(tenant == null)) {
        sb.append("tenant:");
        sb.append(tenant);
        sb.append(",");
    }
    if (!(user == null)) {
        sb.append("user:");
        sb.append(user);
        sb.append(",");
    }
    if (!(volume == null)) {
        sb.append("volume:");
        sb.append(volume);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withRegistry(String registry) {
    this.registry = registry;
    return (A) this;
  }
  
  public A withTenant(String tenant) {
    this.tenant = tenant;
    return (A) this;
  }
  
  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }
  
  public A withVolume(String volume) {
    this.volume = volume;
    return (A) this;
  }
  
}