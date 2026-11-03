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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1VolumeMountFluent<A extends V1VolumeMountFluent<A>> extends BaseFluent<A>{

  private List<String> bindMountOptions;
  private String mountPath;
  private String mountPropagation;
  private String name;
  private Boolean readOnly;
  private String recursiveReadOnly;
  private String subPath;
  private String subPathExpr;

  public V1VolumeMountFluent() {
  }
  
  public V1VolumeMountFluent(V1VolumeMount instance) {
    this.copyInstance(instance);
  }

  public A addAllToBindMountOptions(Collection<String> items) {
    if (this.bindMountOptions == null) {
      this.bindMountOptions = new ArrayList<>();
    }
    for (String item : items) {
      this.bindMountOptions.add(item);
    }
    return (A) this;
  }
  
  public A addToBindMountOptions(String... items) {
    if (this.bindMountOptions == null) {
      this.bindMountOptions = new ArrayList<>();
    }
    for (String item : items) {
      this.bindMountOptions.add(item);
    }
    return (A) this;
  }
  
  public A addToBindMountOptions(int index,String item) {
    if (this.bindMountOptions == null) {
      this.bindMountOptions = new ArrayList<>();
    }
    this.bindMountOptions.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1VolumeMount instance) {
    instance = instance != null ? instance : new V1VolumeMount();
    if (instance != null) {
        this.withBindMountOptions(instance.getBindMountOptions());
        this.withMountPath(instance.getMountPath());
        this.withMountPropagation(instance.getMountPropagation());
        this.withName(instance.getName());
        this.withReadOnly(instance.getReadOnly());
        this.withRecursiveReadOnly(instance.getRecursiveReadOnly());
        this.withSubPath(instance.getSubPath());
        this.withSubPathExpr(instance.getSubPathExpr());
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
    V1VolumeMountFluent<?> that = (V1VolumeMountFluent<?>) o;
    if (!(Objects.equals(bindMountOptions, that.bindMountOptions))) {
      return false;
    }
    if (!(Objects.equals(mountPath, that.mountPath))) {
      return false;
    }
    if (!(Objects.equals(mountPropagation, that.mountPropagation))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(recursiveReadOnly, that.recursiveReadOnly))) {
      return false;
    }
    if (!(Objects.equals(subPath, that.subPath))) {
      return false;
    }
    if (!(Objects.equals(subPathExpr, that.subPathExpr))) {
      return false;
    }
    return true;
  }
  
  public String getBindMountOption(int index) {
    return this.bindMountOptions.get(index);
  }
  
  public List<String> getBindMountOptions() {
    return this.bindMountOptions;
  }
  
  public String getFirstBindMountOption() {
    return this.bindMountOptions.get(0);
  }
  
  public String getLastBindMountOption() {
    return this.bindMountOptions.get(bindMountOptions.size() - 1);
  }
  
  public String getMatchingBindMountOption(Predicate<String> predicate) {
      for (String item : bindMountOptions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMountPath() {
    return this.mountPath;
  }
  
  public String getMountPropagation() {
    return this.mountPropagation;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getRecursiveReadOnly() {
    return this.recursiveReadOnly;
  }
  
  public String getSubPath() {
    return this.subPath;
  }
  
  public String getSubPathExpr() {
    return this.subPathExpr;
  }
  
  public boolean hasBindMountOptions() {
    return this.bindMountOptions != null && !(this.bindMountOptions.isEmpty());
  }
  
  public boolean hasMatchingBindMountOption(Predicate<String> predicate) {
      for (String item : bindMountOptions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMountPath() {
    return this.mountPath != null;
  }
  
  public boolean hasMountPropagation() {
    return this.mountPropagation != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasRecursiveReadOnly() {
    return this.recursiveReadOnly != null;
  }
  
  public boolean hasSubPath() {
    return this.subPath != null;
  }
  
  public boolean hasSubPathExpr() {
    return this.subPathExpr != null;
  }
  
  public int hashCode() {
    return Objects.hash(bindMountOptions, mountPath, mountPropagation, name, readOnly, recursiveReadOnly, subPath, subPathExpr);
  }
  
  public A removeAllFromBindMountOptions(Collection<String> items) {
    if (this.bindMountOptions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.bindMountOptions.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromBindMountOptions(String... items) {
    if (this.bindMountOptions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.bindMountOptions.remove(item);
    }
    return (A) this;
  }
  
  public A setToBindMountOptions(int index,String item) {
    if (this.bindMountOptions == null) {
      this.bindMountOptions = new ArrayList<>();
    }
    this.bindMountOptions.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(bindMountOptions == null) && !(bindMountOptions.isEmpty())) {
        sb.append("bindMountOptions:");
        sb.append(bindMountOptions);
        sb.append(",");
    }
    if (!(mountPath == null)) {
        sb.append("mountPath:");
        sb.append(mountPath);
        sb.append(",");
    }
    if (!(mountPropagation == null)) {
        sb.append("mountPropagation:");
        sb.append(mountPropagation);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(recursiveReadOnly == null)) {
        sb.append("recursiveReadOnly:");
        sb.append(recursiveReadOnly);
        sb.append(",");
    }
    if (!(subPath == null)) {
        sb.append("subPath:");
        sb.append(subPath);
        sb.append(",");
    }
    if (!(subPathExpr == null)) {
        sb.append("subPathExpr:");
        sb.append(subPathExpr);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withBindMountOptions(List<String> bindMountOptions) {
    if (bindMountOptions != null) {
        this.bindMountOptions = new ArrayList<>();
        for (String item : bindMountOptions) {
          this.addToBindMountOptions(item);
        }
    } else {
      this.bindMountOptions = null;
    }
    return (A) this;
  }
  
  public A withBindMountOptions(String... bindMountOptions) {
    if (this.bindMountOptions != null) {
        this.bindMountOptions.clear();
        _visitables.remove("bindMountOptions");
    }
    if (bindMountOptions != null) {
      for (String item : bindMountOptions) {
        this.addToBindMountOptions(item);
      }
    }
    return (A) this;
  }
  
  public A withMountPath(String mountPath) {
    this.mountPath = mountPath;
    return (A) this;
  }
  
  public A withMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withRecursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
    return (A) this;
  }
  
  public A withSubPath(String subPath) {
    this.subPath = subPath;
    return (A) this;
  }
  
  public A withSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
    return (A) this;
  }
  
}