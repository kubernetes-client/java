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
public class V1EndpointConditionsFluent<A extends io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<A>> extends BaseFluent<A>{

  private Boolean ready;
  private Boolean serving;
  private Boolean terminating;

  public V1EndpointConditionsFluent() {
  }
  
  public V1EndpointConditionsFluent(V1EndpointConditions instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1EndpointConditions instance) {
    instance = instance != null ? instance : new V1EndpointConditions();
    if (instance != null) {
        this.withReady(instance.getReady());
        this.withServing(instance.getServing());
        this.withTerminating(instance.getTerminating());
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
    V1EndpointConditionsFluent that = (V1EndpointConditionsFluent) o;
    if (!(Objects.equals(ready, that.ready))) {
      return false;
    }
    if (!(Objects.equals(serving, that.serving))) {
      return false;
    }
    if (!(Objects.equals(terminating, that.terminating))) {
      return false;
    }
    return true;
  }
  
  public Boolean getReady() {
    return this.ready;
  }
  
  public Boolean getServing() {
    return this.serving;
  }
  
  public Boolean getTerminating() {
    return this.terminating;
  }
  
  public boolean hasReady() {
    return this.ready != null;
  }
  
  public boolean hasServing() {
    return this.serving != null;
  }
  
  public boolean hasTerminating() {
    return this.terminating != null;
  }
  
  public int hashCode() {
    return Objects.hash(ready, serving, terminating);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(ready == null)) {
        sb.append("ready:");
        sb.append(ready);
        sb.append(",");
    }
    if (!(serving == null)) {
        sb.append("serving:");
        sb.append(serving);
        sb.append(",");
    }
    if (!(terminating == null)) {
        sb.append("terminating:");
        sb.append(terminating);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReady() {
    return withReady(true);
  }
  
  public A withReady(Boolean ready) {
    this.ready = ready;
    return (A) this;
  }
  
  public A withServing() {
    return withServing(true);
  }
  
  public A withServing(Boolean serving) {
    this.serving = serving;
    return (A) this;
  }
  
  public A withTerminating() {
    return withTerminating(true);
  }
  
  public A withTerminating(Boolean terminating) {
    this.terminating = terminating;
    return (A) this;
  }
  
}