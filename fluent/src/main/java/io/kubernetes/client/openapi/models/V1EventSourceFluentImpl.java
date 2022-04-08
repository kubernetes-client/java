/*
Copyright 2022 The Kubernetes Authors.
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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1EventSourceFluentImpl<A extends V1EventSourceFluent<A>> extends BaseFluent<A>
    implements V1EventSourceFluent<A> {
  public V1EventSourceFluentImpl() {}

  public V1EventSourceFluentImpl(io.kubernetes.client.openapi.models.V1EventSource instance) {
    this.withComponent(instance.getComponent());

    this.withHost(instance.getHost());
  }

  private String component;
  private java.lang.String host;

  public java.lang.String getComponent() {
    return this.component;
  }

  public A withComponent(java.lang.String component) {
    this.component = component;
    return (A) this;
  }

  public Boolean hasComponent() {
    return this.component != null;
  }

  public java.lang.String getHost() {
    return this.host;
  }

  public A withHost(java.lang.String host) {
    this.host = host;
    return (A) this;
  }

  public java.lang.Boolean hasHost() {
    return this.host != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EventSourceFluentImpl that = (V1EventSourceFluentImpl) o;
    if (component != null ? !component.equals(that.component) : that.component != null)
      return false;
    if (host != null ? !host.equals(that.host) : that.host != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(component, host, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (component != null) {
      sb.append("component:");
      sb.append(component + ",");
    }
    if (host != null) {
      sb.append("host:");
      sb.append(host);
    }
    sb.append("}");
    return sb.toString();
  }
}
