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
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceClaimConsumerReferenceFluent<A extends io.kubernetes.client.openapi.models.V1ResourceClaimConsumerReferenceFluent<A>> extends BaseFluent<A>{

  private String apiGroup;
  private String name;
  private String resource;
  private String uid;

  public V1ResourceClaimConsumerReferenceFluent() {
  }
  
  public V1ResourceClaimConsumerReferenceFluent(V1ResourceClaimConsumerReference instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ResourceClaimConsumerReference instance) {
    instance = instance != null ? instance : new V1ResourceClaimConsumerReference();
    if (instance != null) {
        this.withApiGroup(instance.getApiGroup());
        this.withName(instance.getName());
        this.withResource(instance.getResource());
        this.withUid(instance.getUid());
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
    V1ResourceClaimConsumerReferenceFluent that = (V1ResourceClaimConsumerReferenceFluent) o;
    if (!(Objects.equals(apiGroup, that.apiGroup))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    return true;
  }
  
  public String getApiGroup() {
    return this.apiGroup;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public boolean hasApiGroup() {
    return this.apiGroup != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiGroup, name, resource, uid);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiGroup == null)) {
        sb.append("apiGroup:");
        sb.append(apiGroup);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
}