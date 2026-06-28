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
public class V1ImageVolumeStatusFluent<A extends io.kubernetes.client.openapi.models.V1ImageVolumeStatusFluent<A>> extends BaseFluent<A>{

  private String imageRef;

  public V1ImageVolumeStatusFluent() {
  }
  
  public V1ImageVolumeStatusFluent(V1ImageVolumeStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ImageVolumeStatus instance) {
    instance = instance != null ? instance : new V1ImageVolumeStatus();
    if (instance != null) {
      this.withImageRef(instance.getImageRef());
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
    V1ImageVolumeStatusFluent that = (V1ImageVolumeStatusFluent) o;
    if (!(Objects.equals(imageRef, that.imageRef))) {
      return false;
    }
    return true;
  }
  
  public String getImageRef() {
    return this.imageRef;
  }
  
  public boolean hasImageRef() {
    return this.imageRef != null;
  }
  
  public int hashCode() {
    return Objects.hash(imageRef);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(imageRef == null)) {
        sb.append("imageRef:");
        sb.append(imageRef);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withImageRef(String imageRef) {
    this.imageRef = imageRef;
    return (A) this;
  }
  
}