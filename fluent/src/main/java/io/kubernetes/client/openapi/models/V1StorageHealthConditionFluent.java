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
import java.time.OffsetDateTime;
import java.util.Objects;
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1StorageHealthConditionFluent<A extends V1StorageHealthConditionFluent<A>> extends BaseFluent<A>{

  private String accessMode;
  private OffsetDateTime lastTransitionTime;
  private String message;
  private String reason;
  private String status;
  private String volumeMode;

  public V1StorageHealthConditionFluent() {
  }
  
  public V1StorageHealthConditionFluent(V1StorageHealthCondition instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1StorageHealthCondition instance) {
    instance = instance != null ? instance : new V1StorageHealthCondition();
    if (instance != null) {
        this.withAccessMode(instance.getAccessMode());
        this.withLastTransitionTime(instance.getLastTransitionTime());
        this.withMessage(instance.getMessage());
        this.withReason(instance.getReason());
        this.withStatus(instance.getStatus());
        this.withVolumeMode(instance.getVolumeMode());
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
    V1StorageHealthConditionFluent<?> that = (V1StorageHealthConditionFluent<?>) o;
    if (!(Objects.equals(accessMode, that.accessMode))) {
      return false;
    }
    if (!(Objects.equals(lastTransitionTime, that.lastTransitionTime))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    if (!(Objects.equals(status, that.status))) {
      return false;
    }
    if (!(Objects.equals(volumeMode, that.volumeMode))) {
      return false;
    }
    return true;
  }
  
  public String getAccessMode() {
    return this.accessMode;
  }
  
  public OffsetDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
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
  
  public String getVolumeMode() {
    return this.volumeMode;
  }
  
  public boolean hasAccessMode() {
    return this.accessMode != null;
  }
  
  public boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
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
  
  public boolean hasVolumeMode() {
    return this.volumeMode != null;
  }
  
  public int hashCode() {
    return Objects.hash(accessMode, lastTransitionTime, message, reason, status, volumeMode);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(accessMode == null)) {
        sb.append("accessMode:");
        sb.append(accessMode);
        sb.append(",");
    }
    if (!(lastTransitionTime == null)) {
        sb.append("lastTransitionTime:");
        sb.append(lastTransitionTime);
        sb.append(",");
    }
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
        sb.append(",");
    }
    if (!(volumeMode == null)) {
        sb.append("volumeMode:");
        sb.append(volumeMode);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAccessMode(String accessMode) {
    this.accessMode = accessMode;
    return (A) this;
  }
  
  public A withLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return (A) this;
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
  
  public A withVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return (A) this;
  }
  
}