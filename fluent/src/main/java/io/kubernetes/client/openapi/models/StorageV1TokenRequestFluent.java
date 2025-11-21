package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class StorageV1TokenRequestFluent<A extends io.kubernetes.client.openapi.models.StorageV1TokenRequestFluent<A>> extends BaseFluent<A>{

  private String audience;
  private Long expirationSeconds;

  public StorageV1TokenRequestFluent() {
  }
  
  public StorageV1TokenRequestFluent(StorageV1TokenRequest instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(StorageV1TokenRequest instance) {
    instance = instance != null ? instance : new StorageV1TokenRequest();
    if (instance != null) {
        this.withAudience(instance.getAudience());
        this.withExpirationSeconds(instance.getExpirationSeconds());
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
    StorageV1TokenRequestFluent that = (StorageV1TokenRequestFluent) o;
    if (!(Objects.equals(audience, that.audience))) {
      return false;
    }
    if (!(Objects.equals(expirationSeconds, that.expirationSeconds))) {
      return false;
    }
    return true;
  }
  
  public String getAudience() {
    return this.audience;
  }
  
  public Long getExpirationSeconds() {
    return this.expirationSeconds;
  }
  
  public boolean hasAudience() {
    return this.audience != null;
  }
  
  public boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  
  public int hashCode() {
    return Objects.hash(audience, expirationSeconds);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(audience == null)) {
        sb.append("audience:");
        sb.append(audience);
        sb.append(",");
    }
    if (!(expirationSeconds == null)) {
        sb.append("expirationSeconds:");
        sb.append(expirationSeconds);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAudience(String audience) {
    this.audience = audience;
    return (A) this;
  }
  
  public A withExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return (A) this;
  }
  
}