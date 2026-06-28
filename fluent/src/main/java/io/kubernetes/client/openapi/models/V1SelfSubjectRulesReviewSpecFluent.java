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
public class V1SelfSubjectRulesReviewSpecFluent<A extends io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpecFluent<A>> extends BaseFluent<A>{

  private String namespace;

  public V1SelfSubjectRulesReviewSpecFluent() {
  }
  
  public V1SelfSubjectRulesReviewSpecFluent(V1SelfSubjectRulesReviewSpec instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1SelfSubjectRulesReviewSpec instance) {
    instance = instance != null ? instance : new V1SelfSubjectRulesReviewSpec();
    if (instance != null) {
      this.withNamespace(instance.getNamespace());
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
    V1SelfSubjectRulesReviewSpecFluent that = (V1SelfSubjectRulesReviewSpecFluent) o;
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    return true;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public int hashCode() {
    return Objects.hash(namespace);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(namespace == null)) {
        sb.append("namespace:");
        sb.append(namespace);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
}