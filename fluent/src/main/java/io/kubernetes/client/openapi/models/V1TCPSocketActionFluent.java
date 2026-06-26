/*
Copyright 2020 The Kubernetes Authors.
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

import io.kubernetes.client.custom.IntOrString;
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
public class V1TCPSocketActionFluent<A extends io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<A>> extends BaseFluent<A>{

  private String host;
  private IntOrString port;

  public V1TCPSocketActionFluent() {
  }
  
  public V1TCPSocketActionFluent(V1TCPSocketAction instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1TCPSocketAction instance) {
    instance = instance != null ? instance : new V1TCPSocketAction();
    if (instance != null) {
        this.withHost(instance.getHost());
        this.withPort(instance.getPort());
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
    V1TCPSocketActionFluent that = (V1TCPSocketActionFluent) o;
    if (!(Objects.equals(host, that.host))) {
      return false;
    }
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    return true;
  }
  
  public String getHost() {
    return this.host;
  }
  
  public IntOrString getPort() {
    return this.port;
  }
  
  public boolean hasHost() {
    return this.host != null;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public int hashCode() {
    return Objects.hash(host, port);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(host == null)) {
        sb.append("host:");
        sb.append(host);
        sb.append(",");
    }
    if (!(port == null)) {
        sb.append("port:");
        sb.append(port);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHost(String host) {
    this.host = host;
    return (A) this;
  }
  
  public A withNewPort(int value) {
    return (A) this.withPort(new IntOrString(value));
  }
  
  public A withNewPort(String value) {
    return (A) this.withPort(new IntOrString(value));
  }
  
  public A withPort(IntOrString port) {
    this.port = port;
    return (A) this;
  }
  
}