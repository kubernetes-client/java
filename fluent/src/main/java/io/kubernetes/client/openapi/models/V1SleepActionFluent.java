/*
Copyright 2020 The Kubernetes Authors.
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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SleepActionFluent<A extends io.kubernetes.client.openapi.models.V1SleepActionFluent<A>> extends BaseFluent<A>{

  private Long seconds;

  public V1SleepActionFluent() {
  }
  
  public V1SleepActionFluent(V1SleepAction instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1SleepAction instance) {
    instance = instance != null ? instance : new V1SleepAction();
    if (instance != null) {
      this.withSeconds(instance.getSeconds());
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
    V1SleepActionFluent that = (V1SleepActionFluent) o;
    if (!(Objects.equals(seconds, that.seconds))) {
      return false;
    }
    return true;
  }
  
  public Long getSeconds() {
    return this.seconds;
  }
  
  public boolean hasSeconds() {
    return this.seconds != null;
  }
  
  public int hashCode() {
    return Objects.hash(seconds);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(seconds == null)) {
        sb.append("seconds:");
        sb.append(seconds);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withSeconds(Long seconds) {
    this.seconds = seconds;
    return (A) this;
  }
  
}