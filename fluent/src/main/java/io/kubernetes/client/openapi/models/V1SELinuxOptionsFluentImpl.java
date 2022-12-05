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
  public class V1SELinuxOptionsFluentImpl<A extends V1SELinuxOptionsFluent<A>> extends BaseFluent<A> implements V1SELinuxOptionsFluent<A>{
  public V1SELinuxOptionsFluentImpl() {
  }
  public V1SELinuxOptionsFluentImpl(V1SELinuxOptions instance) {
    this.withLevel(instance.getLevel());

    this.withRole(instance.getRole());

    this.withType(instance.getType());

    this.withUser(instance.getUser());

  }
  private String level;
  private String role;
  private String type;
  private String user;
  public String getLevel() {
    return this.level;
  }
  public A withLevel(String level) {
    this.level=level; return (A) this;
  }
  public Boolean hasLevel() {
    return this.level != null;
  }
  public String getRole() {
    return this.role;
  }
  public A withRole(String role) {
    this.role=role; return (A) this;
  }
  public Boolean hasRole() {
    return this.role != null;
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SELinuxOptionsFluentImpl that = (V1SELinuxOptionsFluentImpl) o;
    if (level != null ? !level.equals(that.level) :that.level != null) return false;
    if (role != null ? !role.equals(that.role) :that.role != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    if (user != null ? !user.equals(that.user) :that.user != null) return false;
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