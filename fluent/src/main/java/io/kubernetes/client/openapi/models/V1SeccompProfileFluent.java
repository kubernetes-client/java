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
public class V1SeccompProfileFluent<A extends io.kubernetes.client.openapi.models.V1SeccompProfileFluent<A>> extends BaseFluent<A>{

  private String localhostProfile;
  private String type;

  public V1SeccompProfileFluent() {
  }
  
  public V1SeccompProfileFluent(V1SeccompProfile instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1SeccompProfile instance) {
    instance = instance != null ? instance : new V1SeccompProfile();
    if (instance != null) {
        this.withLocalhostProfile(instance.getLocalhostProfile());
        this.withType(instance.getType());
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
    V1SeccompProfileFluent that = (V1SeccompProfileFluent) o;
    if (!(Objects.equals(localhostProfile, that.localhostProfile))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getLocalhostProfile() {
    return this.localhostProfile;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasLocalhostProfile() {
    return this.localhostProfile != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(localhostProfile, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(localhostProfile == null)) {
        sb.append("localhostProfile:");
        sb.append(localhostProfile);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withLocalhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
}