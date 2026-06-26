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

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeAllocatableResourceClaimStatusFluent<A extends io.kubernetes.client.openapi.models.V1NodeAllocatableResourceClaimStatusFluent<A>> extends BaseFluent<A>{

  private List<String> containers;
  private String resourceClaimName;
  private Map<String,Quantity> resources;

  public V1NodeAllocatableResourceClaimStatusFluent() {
  }
  
  public V1NodeAllocatableResourceClaimStatusFluent(V1NodeAllocatableResourceClaimStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToContainers(Collection<String> items) {
    if (this.containers == null) {
      this.containers = new ArrayList();
    }
    for (String item : items) {
      this.containers.add(item);
    }
    return (A) this;
  }
  
  public A addToContainers(String... items) {
    if (this.containers == null) {
      this.containers = new ArrayList();
    }
    for (String item : items) {
      this.containers.add(item);
    }
    return (A) this;
  }
  
  public A addToContainers(int index,String item) {
    if (this.containers == null) {
      this.containers = new ArrayList();
    }
    this.containers.add(index, item);
    return (A) this;
  }
  
  public A addToResources(Map<String,Quantity> map) {
    if (this.resources == null && map != null) {
      this.resources = new LinkedHashMap();
    }
    if (map != null) {
      this.resources.putAll(map);
    }
    return (A) this;
  }
  
  public A addToResources(String key,Quantity value) {
    if (this.resources == null && key != null && value != null) {
      this.resources = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.resources.put(key, value);
    }
    return (A) this;
  }
  
  protected void copyInstance(V1NodeAllocatableResourceClaimStatus instance) {
    instance = instance != null ? instance : new V1NodeAllocatableResourceClaimStatus();
    if (instance != null) {
        this.withContainers(instance.getContainers());
        this.withResourceClaimName(instance.getResourceClaimName());
        this.withResources(instance.getResources());
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
    V1NodeAllocatableResourceClaimStatusFluent that = (V1NodeAllocatableResourceClaimStatusFluent) o;
    if (!(Objects.equals(containers, that.containers))) {
      return false;
    }
    if (!(Objects.equals(resourceClaimName, that.resourceClaimName))) {
      return false;
    }
    if (!(Objects.equals(resources, that.resources))) {
      return false;
    }
    return true;
  }
  
  public String getContainer(int index) {
    return this.containers.get(index);
  }
  
  public List<String> getContainers() {
    return this.containers;
  }
  
  public String getFirstContainer() {
    return this.containers.get(0);
  }
  
  public String getLastContainer() {
    return this.containers.get(containers.size() - 1);
  }
  
  public String getMatchingContainer(Predicate<String> predicate) {
      for (String item : containers) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getResourceClaimName() {
    return this.resourceClaimName;
  }
  
  public Map<String,Quantity> getResources() {
    return this.resources;
  }
  
  public boolean hasContainers() {
    return this.containers != null && !(this.containers.isEmpty());
  }
  
  public boolean hasMatchingContainer(Predicate<String> predicate) {
      for (String item : containers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasResourceClaimName() {
    return this.resourceClaimName != null;
  }
  
  public boolean hasResources() {
    return this.resources != null;
  }
  
  public int hashCode() {
    return Objects.hash(containers, resourceClaimName, resources);
  }
  
  public A removeAllFromContainers(Collection<String> items) {
    if (this.containers == null) {
      return (A) this;
    }
    for (String item : items) {
      this.containers.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromContainers(String... items) {
    if (this.containers == null) {
      return (A) this;
    }
    for (String item : items) {
      this.containers.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromResources(String key) {
    if (this.resources == null) {
      return (A) this;
    }
    if (key != null && this.resources != null) {
      this.resources.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromResources(Map<String,Quantity> map) {
    if (this.resources == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.resources != null) {
          this.resources.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A setToContainers(int index,String item) {
    if (this.containers == null) {
      this.containers = new ArrayList();
    }
    this.containers.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(containers == null) && !(containers.isEmpty())) {
        sb.append("containers:");
        sb.append(containers);
        sb.append(",");
    }
    if (!(resourceClaimName == null)) {
        sb.append("resourceClaimName:");
        sb.append(resourceClaimName);
        sb.append(",");
    }
    if (!(resources == null) && !(resources.isEmpty())) {
        sb.append("resources:");
        sb.append(resources);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainers(List<String> containers) {
    if (containers != null) {
        this.containers = new ArrayList();
        for (String item : containers) {
          this.addToContainers(item);
        }
    } else {
      this.containers = null;
    }
    return (A) this;
  }
  
  public A withContainers(String... containers) {
    if (this.containers != null) {
        this.containers.clear();
        _visitables.remove("containers");
    }
    if (containers != null) {
      for (String item : containers) {
        this.addToContainers(item);
      }
    }
    return (A) this;
  }
  
  public A withResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return (A) this;
  }
  
  public <K,V>A withResources(Map<String,Quantity> resources) {
    if (resources == null) {
      this.resources = null;
    } else {
      this.resources = new LinkedHashMap(resources);
    }
    return (A) this;
  }
  
}