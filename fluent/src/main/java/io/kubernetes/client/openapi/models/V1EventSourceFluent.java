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
public class V1EventSourceFluent<A extends io.kubernetes.client.openapi.models.V1EventSourceFluent<A>> extends BaseFluent<A>{

  private String component;
  private String host;

  public V1EventSourceFluent() {
  }
  
  public V1EventSourceFluent(V1EventSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1EventSource instance) {
    instance = instance != null ? instance : new V1EventSource();
    if (instance != null) {
        this.withComponent(instance.getComponent());
        this.withHost(instance.getHost());
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
    V1EventSourceFluent that = (V1EventSourceFluent) o;
    if (!(Objects.equals(component, that.component))) {
      return false;
    }
    if (!(Objects.equals(host, that.host))) {
      return false;
    }
    return true;
  }
  
  public String getComponent() {
    return this.component;
  }
  
  public String getHost() {
    return this.host;
  }
  
  public boolean hasComponent() {
    return this.component != null;
  }
  
  public boolean hasHost() {
    return this.host != null;
  }
  
  public int hashCode() {
    return Objects.hash(component, host);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(component == null)) {
        sb.append("component:");
        sb.append(component);
        sb.append(",");
    }
    if (!(host == null)) {
        sb.append("host:");
        sb.append(host);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withComponent(String component) {
    this.component = component;
    return (A) this;
  }
  
  public A withHost(String host) {
    this.host = host;
    return (A) this;
  }
  
}