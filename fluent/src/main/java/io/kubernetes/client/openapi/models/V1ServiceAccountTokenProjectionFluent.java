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
public class V1ServiceAccountTokenProjectionFluent<A extends io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<A>> extends BaseFluent<A>{

  private String audience;
  private Long expirationSeconds;
  private String path;

  public V1ServiceAccountTokenProjectionFluent() {
  }
  
  public V1ServiceAccountTokenProjectionFluent(V1ServiceAccountTokenProjection instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ServiceAccountTokenProjection instance) {
    instance = instance != null ? instance : new V1ServiceAccountTokenProjection();
    if (instance != null) {
        this.withAudience(instance.getAudience());
        this.withExpirationSeconds(instance.getExpirationSeconds());
        this.withPath(instance.getPath());
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
    V1ServiceAccountTokenProjectionFluent that = (V1ServiceAccountTokenProjectionFluent) o;
    if (!(Objects.equals(audience, that.audience))) {
      return false;
    }
    if (!(Objects.equals(expirationSeconds, that.expirationSeconds))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
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
  
  public String getPath() {
    return this.path;
  }
  
  public boolean hasAudience() {
    return this.audience != null;
  }
  
  public boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public int hashCode() {
    return Objects.hash(audience, expirationSeconds, path);
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
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
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
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
}