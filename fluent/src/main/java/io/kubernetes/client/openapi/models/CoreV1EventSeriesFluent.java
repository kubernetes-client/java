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
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CoreV1EventSeriesFluent<A extends io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<A>> extends BaseFluent<A>{

  private Integer count;
  private OffsetDateTime lastObservedTime;

  public CoreV1EventSeriesFluent() {
  }
  
  public CoreV1EventSeriesFluent(CoreV1EventSeries instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(CoreV1EventSeries instance) {
    instance = instance != null ? instance : new CoreV1EventSeries();
    if (instance != null) {
        this.withCount(instance.getCount());
        this.withLastObservedTime(instance.getLastObservedTime());
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
    CoreV1EventSeriesFluent that = (CoreV1EventSeriesFluent) o;
    if (!(Objects.equals(count, that.count))) {
      return false;
    }
    if (!(Objects.equals(lastObservedTime, that.lastObservedTime))) {
      return false;
    }
    return true;
  }
  
  public Integer getCount() {
    return this.count;
  }
  
  public OffsetDateTime getLastObservedTime() {
    return this.lastObservedTime;
  }
  
  public boolean hasCount() {
    return this.count != null;
  }
  
  public boolean hasLastObservedTime() {
    return this.lastObservedTime != null;
  }
  
  public int hashCode() {
    return Objects.hash(count, lastObservedTime);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(count == null)) {
        sb.append("count:");
        sb.append(count);
        sb.append(",");
    }
    if (!(lastObservedTime == null)) {
        sb.append("lastObservedTime:");
        sb.append(lastObservedTime);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCount(Integer count) {
    this.count = count;
    return (A) this;
  }
  
  public A withLastObservedTime(OffsetDateTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return (A) this;
  }
  
}