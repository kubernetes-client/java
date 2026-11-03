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
import java.lang.Long;
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
public class V1KeyToPathFluent<A extends V1KeyToPathFluent<A>> extends BaseFluent<A>{

  private String key;
  private Integer mode;
  private String path;
  private Long user;

  public V1KeyToPathFluent() {
  }
  
  public V1KeyToPathFluent(V1KeyToPath instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1KeyToPath instance) {
    instance = instance != null ? instance : new V1KeyToPath();
    if (instance != null) {
        this.withKey(instance.getKey());
        this.withMode(instance.getMode());
        this.withPath(instance.getPath());
        this.withUser(instance.getUser());
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
    V1KeyToPathFluent<?> that = (V1KeyToPathFluent<?>) o;
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(mode, that.mode))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(user, that.user))) {
      return false;
    }
    return true;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public Integer getMode() {
    return this.mode;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public Long getUser() {
    return this.user;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public boolean hasMode() {
    return this.mode != null;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public int hashCode() {
    return Objects.hash(key, mode, path, user);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
        sb.append(",");
    }
    if (!(mode == null)) {
        sb.append("mode:");
        sb.append(mode);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(user == null)) {
        sb.append("user:");
        sb.append(user);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public A withMode(Integer mode) {
    this.mode = mode;
    return (A) this;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public A withUser(Long user) {
    this.user = user;
    return (A) this;
  }
  
}