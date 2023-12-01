package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HostIPFluent<A extends V1HostIPFluent<A>> extends BaseFluent<A>{
  public V1HostIPFluent() {
  }
  
  public V1HostIPFluent(V1HostIP instance) {
    this.copyInstance(instance);
  }
  private String ip;
  
  protected void copyInstance(V1HostIP instance) {
    instance = (instance != null ? instance : new V1HostIP());
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HostIPFluent that = (V1HostIPFluent) o;
    if (!java.util.Objects.equals(ip, that.ip)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(ip,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ip != null) { sb.append("ip:"); sb.append(ip); }
    sb.append("}");
    return sb.toString();
  }
  

}