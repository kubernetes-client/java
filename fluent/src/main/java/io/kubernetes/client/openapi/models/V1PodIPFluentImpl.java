package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PodIPFluentImpl<A extends V1PodIPFluent<A>> extends BaseFluent<A> implements V1PodIPFluent<A>{
  public V1PodIPFluentImpl() {
  }
  public V1PodIPFluentImpl(V1PodIP instance) {
    if (instance != null) {
      this.withIp(instance.getIp());
    }
  }
  private String ip;
  public String getIp() {
    return this.ip;
  }
  public A withIp(String ip) {
    this.ip=ip; return (A) this;
  }
  public Boolean hasIp() {
    return this.ip != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodIPFluentImpl that = (V1PodIPFluentImpl) o;
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