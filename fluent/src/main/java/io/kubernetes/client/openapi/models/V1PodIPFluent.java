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
public class V1PodIPFluent<A extends io.kubernetes.client.openapi.models.V1PodIPFluent<A>> extends BaseFluent<A>{

  private String ip;

  public V1PodIPFluent() {
  }
  
  public V1PodIPFluent(V1PodIP instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PodIP instance) {
    instance = instance != null ? instance : new V1PodIP();
    if (instance != null) {
      this.withIp(instance.getIp());
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
    V1PodIPFluent that = (V1PodIPFluent) o;
    if (!(Objects.equals(ip, that.ip))) {
      return false;
    }
    return true;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public boolean hasIp() {
    return this.ip != null;
  }
  
  public int hashCode() {
    return Objects.hash(ip);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(ip == null)) {
        sb.append("ip:");
        sb.append(ip);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }
  
}