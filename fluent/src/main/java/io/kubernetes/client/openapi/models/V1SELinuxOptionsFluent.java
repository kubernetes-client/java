package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SELinuxOptionsFluent<A extends V1SELinuxOptionsFluent<A>> extends BaseFluent<A>{
  public V1SELinuxOptionsFluent() {
  }
  
  public V1SELinuxOptionsFluent(V1SELinuxOptions instance) {
    this.copyInstance(instance);
  }
  private String level;
  private String role;
  private String type;
  private String user;
  
  protected void copyInstance(V1SELinuxOptions instance) {
    instance = (instance != null ? instance : new V1SELinuxOptions());
    if (instance != null) {
          this.withLevel(instance.getLevel());
          this.withRole(instance.getRole());
          this.withType(instance.getType());
          this.withUser(instance.getUser());
        }
  }
  
  public String getLevel() {
    return this.level;
  }
  
  public A withLevel(String level) {
    this.level = level;
    return (A) this;
  }
  
  public boolean hasLevel() {
    return this.level != null;
  }
  
  public String getRole() {
    return this.role;
  }
  
  public A withRole(String role) {
    this.role = role;
    return (A) this;
  }
  
  public boolean hasRole() {
    return this.role != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SELinuxOptionsFluent that = (V1SELinuxOptionsFluent) o;
    if (!java.util.Objects.equals(level, that.level)) return false;
    if (!java.util.Objects.equals(role, that.role)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(user, that.user)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(level,  role,  type,  user,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (level != null) { sb.append("level:"); sb.append(level + ","); }
    if (role != null) { sb.append("role:"); sb.append(role + ","); }
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  

}