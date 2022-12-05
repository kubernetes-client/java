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
  public class V1SeccompProfileFluentImpl<A extends V1SeccompProfileFluent<A>> extends BaseFluent<A> implements V1SeccompProfileFluent<A>{
  public V1SeccompProfileFluentImpl() {
  }
  public V1SeccompProfileFluentImpl(V1SeccompProfile instance) {
    this.withLocalhostProfile(instance.getLocalhostProfile());

    this.withType(instance.getType());

  }
  private String localhostProfile;
  private String type;
  public String getLocalhostProfile() {
    return this.localhostProfile;
  }
  public A withLocalhostProfile(String localhostProfile) {
    this.localhostProfile=localhostProfile; return (A) this;
  }
  public Boolean hasLocalhostProfile() {
    return this.localhostProfile != null;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SeccompProfileFluentImpl that = (V1SeccompProfileFluentImpl) o;
    if (localhostProfile != null ? !localhostProfile.equals(that.localhostProfile) :that.localhostProfile != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(localhostProfile,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (localhostProfile != null) { sb.append("localhostProfile:"); sb.append(localhostProfile + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}