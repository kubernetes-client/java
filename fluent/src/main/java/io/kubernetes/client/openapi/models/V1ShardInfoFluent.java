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
public class V1ShardInfoFluent<A extends io.kubernetes.client.openapi.models.V1ShardInfoFluent<A>> extends BaseFluent<A>{

  private String selector;

  public V1ShardInfoFluent() {
  }
  
  public V1ShardInfoFluent(V1ShardInfo instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ShardInfo instance) {
    instance = instance != null ? instance : new V1ShardInfo();
    if (instance != null) {
      this.withSelector(instance.getSelector());
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
    V1ShardInfoFluent that = (V1ShardInfoFluent) o;
    if (!(Objects.equals(selector, that.selector))) {
      return false;
    }
    return true;
  }
  
  public String getSelector() {
    return this.selector;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public int hashCode() {
    return Objects.hash(selector);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(selector == null)) {
        sb.append("selector:");
        sb.append(selector);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withSelector(String selector) {
    this.selector = selector;
    return (A) this;
  }
  
}