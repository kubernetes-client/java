package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TokenRequestStatusFluent<A extends io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime expirationTimestamp;
  private String token;

  public V1TokenRequestStatusFluent() {
  }
  
  public V1TokenRequestStatusFluent(V1TokenRequestStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1TokenRequestStatus instance) {
    instance = instance != null ? instance : new V1TokenRequestStatus();
    if (instance != null) {
        this.withExpirationTimestamp(instance.getExpirationTimestamp());
        this.withToken(instance.getToken());
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
    V1TokenRequestStatusFluent that = (V1TokenRequestStatusFluent) o;
    if (!(Objects.equals(expirationTimestamp, that.expirationTimestamp))) {
      return false;
    }
    if (!(Objects.equals(token, that.token))) {
      return false;
    }
    return true;
  }
  
  public OffsetDateTime getExpirationTimestamp() {
    return this.expirationTimestamp;
  }
  
  public String getToken() {
    return this.token;
  }
  
  public boolean hasExpirationTimestamp() {
    return this.expirationTimestamp != null;
  }
  
  public boolean hasToken() {
    return this.token != null;
  }
  
  public int hashCode() {
    return Objects.hash(expirationTimestamp, token);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(expirationTimestamp == null)) {
        sb.append("expirationTimestamp:");
        sb.append(expirationTimestamp);
        sb.append(",");
    }
    if (!(token == null)) {
        sb.append("token:");
        sb.append(token);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withExpirationTimestamp(OffsetDateTime expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return (A) this;
  }
  
  public A withToken(String token) {
    this.token = token;
    return (A) this;
  }
  
}