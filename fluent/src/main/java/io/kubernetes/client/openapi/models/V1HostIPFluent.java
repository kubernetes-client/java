package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HostIPFluent<A extends io.kubernetes.client.openapi.models.V1HostIPFluent<A>> extends BaseFluent<A>{
  public V1HostIPFluent() {
  }
  
  public V1HostIPFluent(V1HostIP instance) {
    this.copyInstance(instance);
  }
  private String ip;
  
  protected void copyInstance(V1HostIP instance) {
    instance = instance != null ? instance : new V1HostIP();
    if (instance != null) {
      this.withIp(instance.getIp());
    }
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }
  
  public boolean hasIp() {
    return this.ip != null;
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
    V1HostIPFluent that = (V1HostIPFluent) o;
    if (!(Objects.equals(ip, that.ip))) {
      return false;
    }
    return true;
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
  

}