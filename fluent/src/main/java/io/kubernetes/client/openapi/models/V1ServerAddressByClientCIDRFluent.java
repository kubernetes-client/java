package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ServerAddressByClientCIDRFluent<A extends V1ServerAddressByClientCIDRFluent<A>> extends BaseFluent<A>{
  public V1ServerAddressByClientCIDRFluent() {
  }
  
  public V1ServerAddressByClientCIDRFluent(V1ServerAddressByClientCIDR instance) {
    this.copyInstance(instance);
  }
  private String clientCIDR;
  private String serverAddress;
  
  protected void copyInstance(V1ServerAddressByClientCIDR instance) {
    instance = (instance != null ? instance : new V1ServerAddressByClientCIDR());
    if (instance != null) {
          this.withClientCIDR(instance.getClientCIDR());
          this.withServerAddress(instance.getServerAddress());
        }
  }
  
  public String getClientCIDR() {
    return this.clientCIDR;
  }
  
  public A withClientCIDR(String clientCIDR) {
    this.clientCIDR = clientCIDR;
    return (A) this;
  }
  
  public boolean hasClientCIDR() {
    return this.clientCIDR != null;
  }
  
  public String getServerAddress() {
    return this.serverAddress;
  }
  
  public A withServerAddress(String serverAddress) {
    this.serverAddress = serverAddress;
    return (A) this;
  }
  
  public boolean hasServerAddress() {
    return this.serverAddress != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServerAddressByClientCIDRFluent that = (V1ServerAddressByClientCIDRFluent) o;
    if (!java.util.Objects.equals(clientCIDR, that.clientCIDR)) return false;
    if (!java.util.Objects.equals(serverAddress, that.serverAddress)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(clientCIDR,  serverAddress,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (clientCIDR != null) { sb.append("clientCIDR:"); sb.append(clientCIDR + ","); }
    if (serverAddress != null) { sb.append("serverAddress:"); sb.append(serverAddress); }
    sb.append("}");
    return sb.toString();
  }
  

}