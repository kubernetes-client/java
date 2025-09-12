package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TokenRequestStatusFluent<A extends io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<A>> extends BaseFluent<A>{
  public V1TokenRequestStatusFluent() {
  }
  
  public V1TokenRequestStatusFluent(V1TokenRequestStatus instance) {
    this.copyInstance(instance);
  }
  private OffsetDateTime expirationTimestamp;
  private String token;
  
  protected void copyInstance(V1TokenRequestStatus instance) {
    instance = instance != null ? instance : new V1TokenRequestStatus();
    if (instance != null) {
        this.withExpirationTimestamp(instance.getExpirationTimestamp());
        this.withToken(instance.getToken());
    }
  }
  
  public OffsetDateTime getExpirationTimestamp() {
    return this.expirationTimestamp;
  }
  
  public A withExpirationTimestamp(OffsetDateTime expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return (A) this;
  }
  
  public boolean hasExpirationTimestamp() {
    return this.expirationTimestamp != null;
  }
  
  public String getToken() {
    return this.token;
  }
  
  public A withToken(String token) {
    this.token = token;
    return (A) this;
  }
  
  public boolean hasToken() {
    return this.token != null;
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
  

}