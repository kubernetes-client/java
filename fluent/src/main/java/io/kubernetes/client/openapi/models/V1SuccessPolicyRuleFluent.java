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
public class V1SuccessPolicyRuleFluent<A extends io.kubernetes.client.openapi.models.V1SuccessPolicyRuleFluent<A>> extends BaseFluent<A>{

  private Integer succeededCount;
  private String succeededIndexes;

  public V1SuccessPolicyRuleFluent() {
  }
  
  public V1SuccessPolicyRuleFluent(V1SuccessPolicyRule instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1SuccessPolicyRule instance) {
    instance = instance != null ? instance : new V1SuccessPolicyRule();
    if (instance != null) {
        this.withSucceededCount(instance.getSucceededCount());
        this.withSucceededIndexes(instance.getSucceededIndexes());
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
    V1SuccessPolicyRuleFluent that = (V1SuccessPolicyRuleFluent) o;
    if (!(Objects.equals(succeededCount, that.succeededCount))) {
      return false;
    }
    if (!(Objects.equals(succeededIndexes, that.succeededIndexes))) {
      return false;
    }
    return true;
  }
  
  public Integer getSucceededCount() {
    return this.succeededCount;
  }
  
  public String getSucceededIndexes() {
    return this.succeededIndexes;
  }
  
  public boolean hasSucceededCount() {
    return this.succeededCount != null;
  }
  
  public boolean hasSucceededIndexes() {
    return this.succeededIndexes != null;
  }
  
  public int hashCode() {
    return Objects.hash(succeededCount, succeededIndexes);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(succeededCount == null)) {
        sb.append("succeededCount:");
        sb.append(succeededCount);
        sb.append(",");
    }
    if (!(succeededIndexes == null)) {
        sb.append("succeededIndexes:");
        sb.append(succeededIndexes);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withSucceededCount(Integer succeededCount) {
    this.succeededCount = succeededCount;
    return (A) this;
  }
  
  public A withSucceededIndexes(String succeededIndexes) {
    this.succeededIndexes = succeededIndexes;
    return (A) this;
  }
  
}