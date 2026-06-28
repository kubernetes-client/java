/*
Copyright 2026 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
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
public class V1ServerAddressByClientCIDRFluent<A extends io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<A>> extends BaseFluent<A>{

  private String clientCIDR;
  private String serverAddress;

  public V1ServerAddressByClientCIDRFluent() {
  }
  
  public V1ServerAddressByClientCIDRFluent(V1ServerAddressByClientCIDR instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ServerAddressByClientCIDR instance) {
    instance = instance != null ? instance : new V1ServerAddressByClientCIDR();
    if (instance != null) {
        this.withClientCIDR(instance.getClientCIDR());
        this.withServerAddress(instance.getServerAddress());
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
    V1ServerAddressByClientCIDRFluent that = (V1ServerAddressByClientCIDRFluent) o;
    if (!(Objects.equals(clientCIDR, that.clientCIDR))) {
      return false;
    }
    if (!(Objects.equals(serverAddress, that.serverAddress))) {
      return false;
    }
    return true;
  }
  
  public String getClientCIDR() {
    return this.clientCIDR;
  }
  
  public String getServerAddress() {
    return this.serverAddress;
  }
  
  public boolean hasClientCIDR() {
    return this.clientCIDR != null;
  }
  
  public boolean hasServerAddress() {
    return this.serverAddress != null;
  }
  
  public int hashCode() {
    return Objects.hash(clientCIDR, serverAddress);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(clientCIDR == null)) {
        sb.append("clientCIDR:");
        sb.append(clientCIDR);
        sb.append(",");
    }
    if (!(serverAddress == null)) {
        sb.append("serverAddress:");
        sb.append(serverAddress);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withClientCIDR(String clientCIDR) {
    this.clientCIDR = clientCIDR;
    return (A) this;
  }
  
  public A withServerAddress(String serverAddress) {
    this.serverAddress = serverAddress;
    return (A) this;
  }
  
}