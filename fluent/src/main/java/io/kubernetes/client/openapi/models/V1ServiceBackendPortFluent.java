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
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ServiceBackendPortFluent<A extends io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<A>> extends BaseFluent<A>{

  private String name;
  private Integer number;

  public V1ServiceBackendPortFluent() {
  }
  
  public V1ServiceBackendPortFluent(V1ServiceBackendPort instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ServiceBackendPort instance) {
    instance = instance != null ? instance : new V1ServiceBackendPort();
    if (instance != null) {
        this.withName(instance.getName());
        this.withNumber(instance.getNumber());
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
    V1ServiceBackendPortFluent that = (V1ServiceBackendPortFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(number, that.number))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Integer getNumber() {
    return this.number;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNumber() {
    return this.number != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, number);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(number == null)) {
        sb.append("number:");
        sb.append(number);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withNumber(Integer number) {
    this.number = number;
    return (A) this;
  }
  
}