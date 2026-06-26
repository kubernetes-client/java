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
public class V1CELDeviceSelectorFluent<A extends io.kubernetes.client.openapi.models.V1CELDeviceSelectorFluent<A>> extends BaseFluent<A>{

  private String expression;

  public V1CELDeviceSelectorFluent() {
  }
  
  public V1CELDeviceSelectorFluent(V1CELDeviceSelector instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1CELDeviceSelector instance) {
    instance = instance != null ? instance : new V1CELDeviceSelector();
    if (instance != null) {
      this.withExpression(instance.getExpression());
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
    V1CELDeviceSelectorFluent that = (V1CELDeviceSelectorFluent) o;
    if (!(Objects.equals(expression, that.expression))) {
      return false;
    }
    return true;
  }
  
  public String getExpression() {
    return this.expression;
  }
  
  public boolean hasExpression() {
    return this.expression != null;
  }
  
  public int hashCode() {
    return Objects.hash(expression);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(expression == null)) {
        sb.append("expression:");
        sb.append(expression);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withExpression(String expression) {
    this.expression = expression;
    return (A) this;
  }
  
}