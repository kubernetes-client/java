package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class StorageV1TokenRequestFluent<A extends StorageV1TokenRequestFluent<A>> extends BaseFluent<A>{
  public StorageV1TokenRequestFluent() {
  }
  
  public StorageV1TokenRequestFluent(StorageV1TokenRequest instance) {
    this.copyInstance(instance);
  }
  private String audience;
  private Long expirationSeconds;
  
  protected void copyInstance(StorageV1TokenRequest instance) {
    instance = (instance != null ? instance : new StorageV1TokenRequest());
    if (instance != null) {
          this.withAudience(instance.getAudience());
          this.withExpirationSeconds(instance.getExpirationSeconds());
        }
  }
  
  public String getAudience() {
    return this.audience;
  }
  
  public A withAudience(String audience) {
    this.audience = audience;
    return (A) this;
  }
  
  public boolean hasAudience() {
    return this.audience != null;
  }
  
  public Long getExpirationSeconds() {
    return this.expirationSeconds;
  }
  
  public A withExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return (A) this;
  }
  
  public boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    StorageV1TokenRequestFluent that = (StorageV1TokenRequestFluent) o;
    if (!java.util.Objects.equals(audience, that.audience)) return false;
    if (!java.util.Objects.equals(expirationSeconds, that.expirationSeconds)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(audience,  expirationSeconds,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (audience != null) { sb.append("audience:"); sb.append(audience + ","); }
    if (expirationSeconds != null) { sb.append("expirationSeconds:"); sb.append(expirationSeconds); }
    sb.append("}");
    return sb.toString();
  }
  

}