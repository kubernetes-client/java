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

import io.kubernetes.client.custom.IntOrString;
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
public class V1RollingUpdateDeploymentFluent<A extends io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<A>> extends BaseFluent<A>{

  private IntOrString maxSurge;
  private IntOrString maxUnavailable;

  public V1RollingUpdateDeploymentFluent() {
  }
  
  public V1RollingUpdateDeploymentFluent(V1RollingUpdateDeployment instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1RollingUpdateDeployment instance) {
    instance = instance != null ? instance : new V1RollingUpdateDeployment();
    if (instance != null) {
        this.withMaxSurge(instance.getMaxSurge());
        this.withMaxUnavailable(instance.getMaxUnavailable());
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
    V1RollingUpdateDeploymentFluent that = (V1RollingUpdateDeploymentFluent) o;
    if (!(Objects.equals(maxSurge, that.maxSurge))) {
      return false;
    }
    if (!(Objects.equals(maxUnavailable, that.maxUnavailable))) {
      return false;
    }
    return true;
  }
  
  public IntOrString getMaxSurge() {
    return this.maxSurge;
  }
  
  public IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }
  
  public boolean hasMaxSurge() {
    return this.maxSurge != null;
  }
  
  public boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }
  
  public int hashCode() {
    return Objects.hash(maxSurge, maxUnavailable);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(maxSurge == null)) {
        sb.append("maxSurge:");
        sb.append(maxSurge);
        sb.append(",");
    }
    if (!(maxUnavailable == null)) {
        sb.append("maxUnavailable:");
        sb.append(maxUnavailable);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMaxSurge(IntOrString maxSurge) {
    this.maxSurge = maxSurge;
    return (A) this;
  }
  
  public A withMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return (A) this;
  }
  
  public A withNewMaxSurge(int value) {
    return (A) this.withMaxSurge(new IntOrString(value));
  }
  
  public A withNewMaxSurge(String value) {
    return (A) this.withMaxSurge(new IntOrString(value));
  }
  
  public A withNewMaxUnavailable(int value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
  public A withNewMaxUnavailable(String value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
}