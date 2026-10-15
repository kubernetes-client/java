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
public class V1alpha1RequesterFluent<A extends V1alpha1RequesterFluent<A>> extends BaseFluent<A>{

  private String intent;
  private String name;

  public V1alpha1RequesterFluent() {
  }
  
  public V1alpha1RequesterFluent(V1alpha1Requester instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha1Requester instance) {
    instance = instance != null ? instance : new V1alpha1Requester();
    if (instance != null) {
        this.withIntent(instance.getIntent());
        this.withName(instance.getName());
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
    V1alpha1RequesterFluent<?> that = (V1alpha1RequesterFluent<?>) o;
    if (!(Objects.equals(intent, that.intent))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public String getIntent() {
    return this.intent;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasIntent() {
    return this.intent != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(intent, name);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(intent == null)) {
        sb.append("intent:");
        sb.append(intent);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withIntent(String intent) {
    this.intent = intent;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
}