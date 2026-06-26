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
public class V1AuditAnnotationFluent<A extends io.kubernetes.client.openapi.models.V1AuditAnnotationFluent<A>> extends BaseFluent<A>{

  private String key;
  private String valueExpression;

  public V1AuditAnnotationFluent() {
  }
  
  public V1AuditAnnotationFluent(V1AuditAnnotation instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1AuditAnnotation instance) {
    instance = instance != null ? instance : new V1AuditAnnotation();
    if (instance != null) {
        this.withKey(instance.getKey());
        this.withValueExpression(instance.getValueExpression());
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
    V1AuditAnnotationFluent that = (V1AuditAnnotationFluent) o;
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(valueExpression, that.valueExpression))) {
      return false;
    }
    return true;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public String getValueExpression() {
    return this.valueExpression;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public boolean hasValueExpression() {
    return this.valueExpression != null;
  }
  
  public int hashCode() {
    return Objects.hash(key, valueExpression);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
        sb.append(",");
    }
    if (!(valueExpression == null)) {
        sb.append("valueExpression:");
        sb.append(valueExpression);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public A withValueExpression(String valueExpression) {
    this.valueExpression = valueExpression;
    return (A) this;
  }
  
}