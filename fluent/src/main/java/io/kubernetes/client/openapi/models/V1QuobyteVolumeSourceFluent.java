package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1QuobyteVolumeSourceFluent<A extends V1QuobyteVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1QuobyteVolumeSourceFluent() {
  }
  
  public V1QuobyteVolumeSourceFluent(V1QuobyteVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String group;
  private Boolean readOnly;
  private String registry;
  private String tenant;
  private String user;
  private String volume;
  
  protected void copyInstance(V1QuobyteVolumeSource instance) {
    instance = (instance != null ? instance : new V1QuobyteVolumeSource());
    if (instance != null) {
          this.withGroup(instance.getGroup());
          this.withReadOnly(instance.getReadOnly());
          this.withRegistry(instance.getRegistry());
          this.withTenant(instance.getTenant());
          this.withUser(instance.getUser());
          this.withVolume(instance.getVolume());
        }
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public String getRegistry() {
    return this.registry;
  }
  
  public A withRegistry(String registry) {
    this.registry = registry;
    return (A) this;
  }
  
  public boolean hasRegistry() {
    return this.registry != null;
  }
  
  public String getTenant() {
    return this.tenant;
  }
  
  public A withTenant(String tenant) {
    this.tenant = tenant;
    return (A) this;
  }
  
  public boolean hasTenant() {
    return this.tenant != null;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public String getVolume() {
    return this.volume;
  }
  
  public A withVolume(String volume) {
    this.volume = volume;
    return (A) this;
  }
  
  public boolean hasVolume() {
    return this.volume != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1QuobyteVolumeSourceFluent that = (V1QuobyteVolumeSourceFluent) o;
    if (!java.util.Objects.equals(group, that.group)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(registry, that.registry)) return false;
    if (!java.util.Objects.equals(tenant, that.tenant)) return false;
    if (!java.util.Objects.equals(user, that.user)) return false;
    if (!java.util.Objects.equals(volume, that.volume)) return false;
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