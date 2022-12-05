package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ServiceAccountTokenProjectionFluentImpl<A extends V1ServiceAccountTokenProjectionFluent<A>> extends BaseFluent<A> implements V1ServiceAccountTokenProjectionFluent<A>{
  public V1ServiceAccountTokenProjectionFluentImpl() {
  }
  public V1ServiceAccountTokenProjectionFluentImpl(V1ServiceAccountTokenProjection instance) {
    this.withAudience(instance.getAudience());

    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.withPath(instance.getPath());

  }
  private String audience;
  private Long expirationSeconds;
  private String path;
  public String getAudience() {
    return this.audience;
  }
  public A withAudience(String audience) {
    this.audience=audience; return (A) this;
  }
  public Boolean hasAudience() {
    return this.audience != null;
  }
  public Long getExpirationSeconds() {
    return this.expirationSeconds;
  }
  public A withExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds=expirationSeconds; return (A) this;
  }
  public Boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  public String getPath() {
    return this.path;
  }
  public A withPath(String path) {
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServiceAccountTokenProjectionFluentImpl that = (V1ServiceAccountTokenProjectionFluentImpl) o;
    if (audience != null ? !audience.equals(that.audience) :that.audience != null) return false;
    if (expirationSeconds != null ? !expirationSeconds.equals(that.expirationSeconds) :that.expirationSeconds != null) return false;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(audience,  expirationSeconds,  path,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (audience != null) { sb.append("audience:"); sb.append(audience + ","); }
    if (expirationSeconds != null) { sb.append("expirationSeconds:"); sb.append(expirationSeconds + ","); }
    if (path != null) { sb.append("path:"); sb.append(path); }
    sb.append("}");
    return sb.toString();
  }
  
}