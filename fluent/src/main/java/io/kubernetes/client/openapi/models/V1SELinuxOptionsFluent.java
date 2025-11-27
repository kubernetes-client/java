package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SELinuxOptionsFluent<A extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<A>> extends BaseFluent<A>{

  private String level;
  private String role;
  private String type;
  private String user;

  public V1SELinuxOptionsFluent() {
  }
  
  public V1SELinuxOptionsFluent(V1SELinuxOptions instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1SELinuxOptions instance) {
    instance = instance != null ? instance : new V1SELinuxOptions();
    if (instance != null) {
        this.withLevel(instance.getLevel());
        this.withRole(instance.getRole());
        this.withType(instance.getType());
        this.withUser(instance.getUser());
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
    V1SELinuxOptionsFluent that = (V1SELinuxOptionsFluent) o;
    if (!(Objects.equals(level, that.level))) {
      return false;
    }
    if (!(Objects.equals(role, that.role))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    if (!(Objects.equals(user, that.user))) {
      return false;
    }
    return true;
  }
  
  public String getLevel() {
    return this.level;
  }
  
  public String getRole() {
    return this.role;
  }
  
  public String getType() {
    return this.type;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public boolean hasLevel() {
    return this.level != null;
  }
  
  public boolean hasRole() {
    return this.role != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public int hashCode() {
    return Objects.hash(level, role, type, user);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(level == null)) {
        sb.append("level:");
        sb.append(level);
        sb.append(",");
    }
    if (!(role == null)) {
        sb.append("role:");
        sb.append(role);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
        sb.append(",");
    }
    if (!(user == null)) {
        sb.append("user:");
        sb.append(user);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withLevel(String level) {
    this.level = level;
    return (A) this;
  }
  
  public A withRole(String role) {
    this.role = role;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }
  
}