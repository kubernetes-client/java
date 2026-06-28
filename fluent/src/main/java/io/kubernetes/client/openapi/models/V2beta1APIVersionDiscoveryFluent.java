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
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2beta1APIVersionDiscoveryFluent<A extends io.kubernetes.client.openapi.models.V2beta1APIVersionDiscoveryFluent<A>> extends BaseFluent<A>{

  private String freshness;
  private ArrayList<V2beta1APIResourceDiscoveryBuilder> resources;
  private String version;

  public V2beta1APIVersionDiscoveryFluent() {
  }
  
  public V2beta1APIVersionDiscoveryFluent(V2beta1APIVersionDiscovery instance) {
    this.copyInstance(instance);
  }

  public A addAllToResources(Collection<V2beta1APIResourceDiscovery> items) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    for (V2beta1APIResourceDiscovery item : items) {
        V2beta1APIResourceDiscoveryBuilder builder = new V2beta1APIResourceDiscoveryBuilder(item);
        this._visitables.get("resources").add(builder);
        this.resources.add(builder);
    }
    return (A) this;
  }
  
  public ResourcesNested<A> addNewResource() {
    return new ResourcesNested(-1, null);
  }
  
  public ResourcesNested<A> addNewResourceLike(V2beta1APIResourceDiscovery item) {
    return new ResourcesNested(-1, item);
  }
  
  public A addToResources(V2beta1APIResourceDiscovery... items) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    for (V2beta1APIResourceDiscovery item : items) {
        V2beta1APIResourceDiscoveryBuilder builder = new V2beta1APIResourceDiscoveryBuilder(item);
        this._visitables.get("resources").add(builder);
        this.resources.add(builder);
    }
    return (A) this;
  }
  
  public A addToResources(int index,V2beta1APIResourceDiscovery item) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    V2beta1APIResourceDiscoveryBuilder builder = new V2beta1APIResourceDiscoveryBuilder(item);
    if (index < 0 || index >= this.resources.size()) {
        this._visitables.get("resources").add(builder);
        this.resources.add(builder);
    } else {
        this._visitables.get("resources").add(builder);
        this.resources.add(index, builder);
    }
    return (A) this;
  }
  
  public V2beta1APIResourceDiscovery buildFirstResource() {
    return this.resources.get(0).build();
  }
  
  public V2beta1APIResourceDiscovery buildLastResource() {
    return this.resources.get(resources.size() - 1).build();
  }
  
  public V2beta1APIResourceDiscovery buildMatchingResource(Predicate<V2beta1APIResourceDiscoveryBuilder> predicate) {
      for (V2beta1APIResourceDiscoveryBuilder item : resources) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V2beta1APIResourceDiscovery buildResource(int index) {
    return this.resources.get(index).build();
  }
  
  public List<V2beta1APIResourceDiscovery> buildResources() {
    return this.resources != null ? build(resources) : null;
  }
  
  protected void copyInstance(V2beta1APIVersionDiscovery instance) {
    instance = instance != null ? instance : new V2beta1APIVersionDiscovery();
    if (instance != null) {
        this.withVersion(instance.getVersion());
        this.withResources(instance.getResources());
        this.withFreshness(instance.getFreshness());
    }
  }
  
  public ResourcesNested<A> editFirstResource() {
    if (resources.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "resources"));
    }
    return this.setNewResourceLike(0, this.buildResource(0));
  }
  
  public ResourcesNested<A> editLastResource() {
    int index = resources.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "resources"));
    }
    return this.setNewResourceLike(index, this.buildResource(index));
  }
  
  public ResourcesNested<A> editMatchingResource(Predicate<V2beta1APIResourceDiscoveryBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < resources.size();i++) {
      if (predicate.test(resources.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "resources"));
    }
    return this.setNewResourceLike(index, this.buildResource(index));
  }
  
  public ResourcesNested<A> editResource(int index) {
    if (resources.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "resources"));
    }
    return this.setNewResourceLike(index, this.buildResource(index));
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
    V2beta1APIVersionDiscoveryFluent that = (V2beta1APIVersionDiscoveryFluent) o;
    if (!(Objects.equals(version, that.version))) {
      return false;
    }
    if (!(Objects.equals(resources, that.resources))) {
      return false;
    }
    if (!(Objects.equals(freshness, that.freshness))) {
      return false;
    }
    return true;
  }
  
  public String getFreshness() {
    return this.freshness;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public boolean hasFreshness() {
    return this.freshness != null;
  }
  
  public boolean hasMatchingResource(Predicate<V2beta1APIResourceDiscoveryBuilder> predicate) {
      for (V2beta1APIResourceDiscoveryBuilder item : resources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasResources() {
    return this.resources != null && !(this.resources.isEmpty());
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public int hashCode() {
    return Objects.hash(version, resources, freshness);
  }
  
  public A removeAllFromResources(Collection<V2beta1APIResourceDiscovery> items) {
    if (this.resources == null) {
      return (A) this;
    }
    for (V2beta1APIResourceDiscovery item : items) {
        V2beta1APIResourceDiscoveryBuilder builder = new V2beta1APIResourceDiscoveryBuilder(item);
        _visitables.get("resources").remove(builder);
        this.resources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromResources(V2beta1APIResourceDiscovery... items) {
    if (this.resources == null) {
      return (A) this;
    }
    for (V2beta1APIResourceDiscovery item : items) {
        V2beta1APIResourceDiscoveryBuilder builder = new V2beta1APIResourceDiscoveryBuilder(item);
        _visitables.get("resources").remove(builder);
        this.resources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromResources(Predicate<V2beta1APIResourceDiscoveryBuilder> predicate) {
    if (resources == null) {
      return (A) this;
    }
    Iterator<V2beta1APIResourceDiscoveryBuilder> each = resources.iterator();
    List visitables = this._visitables.get("resources");
    while (each.hasNext()) {
        V2beta1APIResourceDiscoveryBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ResourcesNested<A> setNewResourceLike(int index,V2beta1APIResourceDiscovery item) {
    return new ResourcesNested(index, item);
  }
  
  public A setToResources(int index,V2beta1APIResourceDiscovery item) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    V2beta1APIResourceDiscoveryBuilder builder = new V2beta1APIResourceDiscoveryBuilder(item);
    if (index < 0 || index >= this.resources.size()) {
        this._visitables.get("resources").add(builder);
        this.resources.add(builder);
    } else {
        this._visitables.get("resources").add(builder);
        this.resources.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(version == null)) {
        sb.append("version:");
        sb.append(version);
        sb.append(",");
    }
    if (!(resources == null) && !(resources.isEmpty())) {
        sb.append("resources:");
        sb.append(resources);
        sb.append(",");
    }
    if (!(freshness == null)) {
        sb.append("freshness:");
        sb.append(freshness);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withFreshness(String freshness) {
    this.freshness = freshness;
    return (A) this;
  }
  
  public A withResources(List<V2beta1APIResourceDiscovery> resources) {
    if (this.resources != null) {
      this._visitables.get("resources").clear();
    }
    if (resources != null) {
        this.resources = new ArrayList();
        for (V2beta1APIResourceDiscovery item : resources) {
          this.addToResources(item);
        }
    } else {
      this.resources = null;
    }
    return (A) this;
  }
  
  public A withResources(V2beta1APIResourceDiscovery... resources) {
    if (this.resources != null) {
        this.resources.clear();
        _visitables.remove("resources");
    }
    if (resources != null) {
      for (V2beta1APIResourceDiscovery item : resources) {
        this.addToResources(item);
      }
    }
    return (A) this;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  public class ResourcesNested<N> extends V2beta1APIResourceDiscoveryFluent<ResourcesNested<N>> implements Nested<N>{
  
    V2beta1APIResourceDiscoveryBuilder builder;
    int index;
  
    ResourcesNested(int index,V2beta1APIResourceDiscovery item) {
      this.index = index;
      this.builder = new V2beta1APIResourceDiscoveryBuilder(this, item);
    }
  
    public N and() {
      return (N) V2beta1APIVersionDiscoveryFluent.this.setToResources(index, builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  }
}