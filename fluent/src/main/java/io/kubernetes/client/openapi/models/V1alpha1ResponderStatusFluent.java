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
public class V1alpha1ResponderStatusFluent<A extends V1alpha1ResponderStatusFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime completionTime;
  private OffsetDateTime expectedCompletionTime;
  private OffsetDateTime heartbeatTime;
  private String message;
  private String name;
  private OffsetDateTime startTime;

  public V1alpha1ResponderStatusFluent() {
  }
  
  public V1alpha1ResponderStatusFluent(V1alpha1ResponderStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha1ResponderStatus instance) {
    instance = instance != null ? instance : new V1alpha1ResponderStatus();
    if (instance != null) {
        this.withCompletionTime(instance.getCompletionTime());
        this.withExpectedCompletionTime(instance.getExpectedCompletionTime());
        this.withHeartbeatTime(instance.getHeartbeatTime());
        this.withMessage(instance.getMessage());
        this.withName(instance.getName());
        this.withStartTime(instance.getStartTime());
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
    V1alpha1ResponderStatusFluent<?> that = (V1alpha1ResponderStatusFluent<?>) o;
    if (!(Objects.equals(completionTime, that.completionTime))) {
      return false;
    }
    if (!(Objects.equals(expectedCompletionTime, that.expectedCompletionTime))) {
      return false;
    }
    if (!(Objects.equals(heartbeatTime, that.heartbeatTime))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(startTime, that.startTime))) {
      return false;
    }
    return true;
  }
  
  public OffsetDateTime getCompletionTime() {
    return this.completionTime;
  }
  
  public OffsetDateTime getExpectedCompletionTime() {
    return this.expectedCompletionTime;
  }
  
  public OffsetDateTime getHeartbeatTime() {
    return this.heartbeatTime;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public String getName() {
    return this.name;
  }
  
  public OffsetDateTime getStartTime() {
    return this.startTime;
  }
  
  public boolean hasCompletionTime() {
    return this.completionTime != null;
  }
  
  public boolean hasExpectedCompletionTime() {
    return this.expectedCompletionTime != null;
  }
  
  public boolean hasHeartbeatTime() {
    return this.heartbeatTime != null;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasStartTime() {
    return this.startTime != null;
  }
  
  public int hashCode() {
    return Objects.hash(completionTime, expectedCompletionTime, heartbeatTime, message, name, startTime);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(completionTime == null)) {
        sb.append("completionTime:");
        sb.append(completionTime);
        sb.append(",");
    }
    if (!(expectedCompletionTime == null)) {
        sb.append("expectedCompletionTime:");
        sb.append(expectedCompletionTime);
        sb.append(",");
    }
    if (!(heartbeatTime == null)) {
        sb.append("heartbeatTime:");
        sb.append(heartbeatTime);
        sb.append(",");
    }
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(startTime == null)) {
        sb.append("startTime:");
        sb.append(startTime);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCompletionTime(OffsetDateTime completionTime) {
    this.completionTime = completionTime;
    return (A) this;
  }
  
  public A withExpectedCompletionTime(OffsetDateTime expectedCompletionTime) {
    this.expectedCompletionTime = expectedCompletionTime;
    return (A) this;
  }
  
  public A withHeartbeatTime(OffsetDateTime heartbeatTime) {
    this.heartbeatTime = heartbeatTime;
    return (A) this;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return (A) this;
  }
  
}