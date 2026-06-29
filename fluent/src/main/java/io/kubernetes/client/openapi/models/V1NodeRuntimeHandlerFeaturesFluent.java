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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeRuntimeHandlerFeaturesFluent<A extends io.kubernetes.client.openapi.models.V1NodeRuntimeHandlerFeaturesFluent<A>> extends BaseFluent<A>{

  private Boolean recursiveReadOnlyMounts;
  private Boolean userNamespaces;

  public V1NodeRuntimeHandlerFeaturesFluent() {
  }
  
  public V1NodeRuntimeHandlerFeaturesFluent(V1NodeRuntimeHandlerFeatures instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1NodeRuntimeHandlerFeatures instance) {
    instance = instance != null ? instance : new V1NodeRuntimeHandlerFeatures();
    if (instance != null) {
        this.withRecursiveReadOnlyMounts(instance.getRecursiveReadOnlyMounts());
        this.withUserNamespaces(instance.getUserNamespaces());
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
    V1NodeRuntimeHandlerFeaturesFluent that = (V1NodeRuntimeHandlerFeaturesFluent) o;
    if (!(Objects.equals(recursiveReadOnlyMounts, that.recursiveReadOnlyMounts))) {
      return false;
    }
    if (!(Objects.equals(userNamespaces, that.userNamespaces))) {
      return false;
    }
    return true;
  }
  
  public Boolean getRecursiveReadOnlyMounts() {
    return this.recursiveReadOnlyMounts;
  }
  
  public Boolean getUserNamespaces() {
    return this.userNamespaces;
  }
  
  public boolean hasRecursiveReadOnlyMounts() {
    return this.recursiveReadOnlyMounts != null;
  }
  
  public boolean hasUserNamespaces() {
    return this.userNamespaces != null;
  }
  
  public int hashCode() {
    return Objects.hash(recursiveReadOnlyMounts, userNamespaces);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(recursiveReadOnlyMounts == null)) {
        sb.append("recursiveReadOnlyMounts:");
        sb.append(recursiveReadOnlyMounts);
        sb.append(",");
    }
    if (!(userNamespaces == null)) {
        sb.append("userNamespaces:");
        sb.append(userNamespaces);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withRecursiveReadOnlyMounts() {
    return withRecursiveReadOnlyMounts(true);
  }
  
  public A withRecursiveReadOnlyMounts(Boolean recursiveReadOnlyMounts) {
    this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    return (A) this;
  }
  
  public A withUserNamespaces() {
    return withUserNamespaces(true);
  }
  
  public A withUserNamespaces(Boolean userNamespaces) {
    this.userNamespaces = userNamespaces;
    return (A) this;
  }
  
}