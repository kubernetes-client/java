package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1SeccompProfileFluentImpl<A extends io.kubernetes.client.openapi.models.V1SeccompProfileFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1SeccompProfileFluent<A>{
  public V1SeccompProfileFluentImpl() {
  }
  public V1SeccompProfileFluentImpl(io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
    this.withLocalhostProfile(instance.getLocalhostProfile());

    this.withType(instance.getType());

  }
  private java.lang.String localhostProfile;
  private io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum type;
  public java.lang.String getLocalhostProfile() {
    return this.localhostProfile;
  }
  public A withLocalhostProfile(java.lang.String localhostProfile) {
    this.localhostProfile=localhostProfile; return (A) this;
  }
  public java.lang.Boolean hasLocalhostProfile() {
    return this.localhostProfile != null;
  }
  
  /**
   * Method is deprecated. use withLocalhostProfile instead.
   */
  @java.lang.Deprecated
  public A withNewLocalhostProfile(java.lang.String original) {
    return (A)withLocalhostProfile(new String(original));
  }
  public io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum getType() {
    return this.type;
  }
  public A withType(io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(java.lang.Object o) {
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
  
}