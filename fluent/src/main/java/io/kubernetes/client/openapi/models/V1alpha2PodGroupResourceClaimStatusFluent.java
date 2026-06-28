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
public class V1alpha2PodGroupResourceClaimStatusFluent<A extends io.kubernetes.client.openapi.models.V1alpha2PodGroupResourceClaimStatusFluent<A>> extends BaseFluent<A>{

  private String name;
  private String resourceClaimName;

  public V1alpha2PodGroupResourceClaimStatusFluent() {
  }
  
  public V1alpha2PodGroupResourceClaimStatusFluent(V1alpha2PodGroupResourceClaimStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha2PodGroupResourceClaimStatus instance) {
    instance = instance != null ? instance : new V1alpha2PodGroupResourceClaimStatus();
    if (instance != null) {
        this.withName(instance.getName());
        this.withResourceClaimName(instance.getResourceClaimName());
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
    V1alpha2PodGroupResourceClaimStatusFluent that = (V1alpha2PodGroupResourceClaimStatusFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(resourceClaimName, that.resourceClaimName))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getResourceClaimName() {
    return this.resourceClaimName;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasResourceClaimName() {
    return this.resourceClaimName != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, resourceClaimName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(resourceClaimName == null)) {
        sb.append("resourceClaimName:");
        sb.append(resourceClaimName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return (A) this;
  }
  
}