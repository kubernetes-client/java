package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1TokenRequestStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<A>{
  public V1TokenRequestStatusFluentImpl() {
  }
  public V1TokenRequestStatusFluentImpl(io.kubernetes.client.openapi.models.V1TokenRequestStatus instance) {
    this.withExpirationTimestamp(instance.getExpirationTimestamp());

    this.withToken(instance.getToken());

  }
  private java.time.OffsetDateTime expirationTimestamp;
  private java.lang.String token;
  public java.time.OffsetDateTime getExpirationTimestamp() {
    return this.expirationTimestamp;
  }
  public A withExpirationTimestamp(java.time.OffsetDateTime expirationTimestamp) {
    this.expirationTimestamp=expirationTimestamp; return (A) this;
  }
  public java.lang.Boolean hasExpirationTimestamp() {
    return this.expirationTimestamp != null;
  }
  public java.lang.String getToken() {
    return this.token;
  }
  public A withToken(java.lang.String token) {
    this.token=token; return (A) this;
  }
  public java.lang.Boolean hasToken() {
    return this.token != null;
  }
  
  /**
   * Method is deprecated. use withToken instead.
   */
  @java.lang.Deprecated
  public A withNewToken(java.lang.String arg0) {
    return (A)withToken(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TokenRequestStatusFluentImpl that = (V1TokenRequestStatusFluentImpl) o;
    if (expirationTimestamp != null ? !expirationTimestamp.equals(that.expirationTimestamp) :that.expirationTimestamp != null) return false;
    if (token != null ? !token.equals(that.token) :that.token != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(expirationTimestamp,  token,  super.hashCode());
  }
  
}