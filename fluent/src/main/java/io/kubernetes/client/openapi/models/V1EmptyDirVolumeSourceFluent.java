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

import io.kubernetes.client.custom.Quantity;
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
public class V1EmptyDirVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String medium;
  private Quantity sizeLimit;

  public V1EmptyDirVolumeSourceFluent() {
  }
  
  public V1EmptyDirVolumeSourceFluent(V1EmptyDirVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1EmptyDirVolumeSource instance) {
    instance = instance != null ? instance : new V1EmptyDirVolumeSource();
    if (instance != null) {
        this.withMedium(instance.getMedium());
        this.withSizeLimit(instance.getSizeLimit());
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
    V1EmptyDirVolumeSourceFluent that = (V1EmptyDirVolumeSourceFluent) o;
    if (!(Objects.equals(medium, that.medium))) {
      return false;
    }
    if (!(Objects.equals(sizeLimit, that.sizeLimit))) {
      return false;
    }
    return true;
  }
  
  public String getMedium() {
    return this.medium;
  }
  
  public Quantity getSizeLimit() {
    return this.sizeLimit;
  }
  
  public boolean hasMedium() {
    return this.medium != null;
  }
  
  public boolean hasSizeLimit() {
    return this.sizeLimit != null;
  }
  
  public int hashCode() {
    return Objects.hash(medium, sizeLimit);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(medium == null)) {
        sb.append("medium:");
        sb.append(medium);
        sb.append(",");
    }
    if (!(sizeLimit == null)) {
        sb.append("sizeLimit:");
        sb.append(sizeLimit);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMedium(String medium) {
    this.medium = medium;
    return (A) this;
  }
  
  public A withNewSizeLimit(String value) {
    return (A) this.withSizeLimit(new Quantity(value));
  }
  
  public A withSizeLimit(Quantity sizeLimit) {
    this.sizeLimit = sizeLimit;
    return (A) this;
  }
  
}