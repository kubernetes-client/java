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
public class V1FlowDistinguisherMethodFluent<A extends io.kubernetes.client.openapi.models.V1FlowDistinguisherMethodFluent<A>> extends BaseFluent<A>{

  private String type;

  public V1FlowDistinguisherMethodFluent() {
  }
  
  public V1FlowDistinguisherMethodFluent(V1FlowDistinguisherMethod instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1FlowDistinguisherMethod instance) {
    instance = instance != null ? instance : new V1FlowDistinguisherMethod();
    if (instance != null) {
      this.withType(instance.getType());
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
    V1FlowDistinguisherMethodFluent that = (V1FlowDistinguisherMethodFluent) o;
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
}