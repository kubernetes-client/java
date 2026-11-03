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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1VolumeHealthConditionFluent<A extends V1VolumeHealthConditionFluent<A>> extends BaseFluent<A>{

  private String message;
  private String reason;
  private String status;

  public V1VolumeHealthConditionFluent() {
  }
  
  public V1VolumeHealthConditionFluent(V1VolumeHealthCondition instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1VolumeHealthCondition instance) {
    instance = instance != null ? instance : new V1VolumeHealthCondition();
    if (instance != null) {
        this.withMessage(instance.getMessage());
        this.withReason(instance.getReason());
        this.withStatus(instance.getStatus());
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
    V1VolumeHealthConditionFluent<?> that = (V1VolumeHealthConditionFluent<?>) o;
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    if (!(Objects.equals(status, that.status))) {
      return false;
    }
    return true;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public int hashCode() {
    return Objects.hash(message, reason, status);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(reason == null)) {
        sb.append("reason:");
        sb.append(reason);
        sb.append(",");
    }
    if (!(status == null)) {
        sb.append("status:");
        sb.append(status);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
}