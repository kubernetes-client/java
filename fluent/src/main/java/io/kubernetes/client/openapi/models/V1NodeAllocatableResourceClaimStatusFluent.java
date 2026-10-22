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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1NodeAllocatableResourceClaimStatusFluent<A extends V1NodeAllocatableResourceClaimStatusFluent<A>> extends BaseFluent<A>{

  private List<String> containers;
  private ArrayList<V1NodeAllocatableMappedResourcesBuilder> mapping;
  private ArrayList<V1NodeAllocatableOverheadResourcesBuilder> overhead;
  private String resourceClaimName;

  public V1NodeAllocatableResourceClaimStatusFluent() {
  }
  
  public V1NodeAllocatableResourceClaimStatusFluent(V1NodeAllocatableResourceClaimStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToContainers(Collection<String> items) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    for (String item : items) {
      this.containers.add(item);
    }
    return (A) this;
  }
  
  public A addAllToMapping(Collection<V1NodeAllocatableMappedResources> items) {
    if (this.mapping == null) {
      this.mapping = new ArrayList<>();
    }
    for (V1NodeAllocatableMappedResources item : items) {
        V1NodeAllocatableMappedResourcesBuilder builder = new V1NodeAllocatableMappedResourcesBuilder(item);
        this._visitables.get("mapping").add(builder);
        this.mapping.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToOverhead(Collection<V1NodeAllocatableOverheadResources> items) {
    if (this.overhead == null) {
      this.overhead = new ArrayList<>();
    }
    for (V1NodeAllocatableOverheadResources item : items) {
        V1NodeAllocatableOverheadResourcesBuilder builder = new V1NodeAllocatableOverheadResourcesBuilder(item);
        this._visitables.get("overhead").add(builder);
        this.overhead.add(builder);
    }
    return (A) this;
  }
  
  public MappingNested<A> addNewMapping() {
    return new MappingNested<>(-1, null);
  }
  
  public MappingNested<A> addNewMappingLike(V1NodeAllocatableMappedResources item) {
    return new MappingNested<>(-1, item);
  }
  
  public OverheadNested<A> addNewOverhead() {
    return new OverheadNested<>(-1, null);
  }
  
  public OverheadNested<A> addNewOverheadLike(V1NodeAllocatableOverheadResources item) {
    return new OverheadNested<>(-1, item);
  }
  
  public A addToContainers(String... items) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    for (String item : items) {
      this.containers.add(item);
    }
    return (A) this;
  }
  
  public A addToContainers(int index,String item) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(index, item);
    return (A) this;
  }
  
  public A addToMapping(V1NodeAllocatableMappedResources... items) {
    if (this.mapping == null) {
      this.mapping = new ArrayList<>();
    }
    for (V1NodeAllocatableMappedResources item : items) {
        V1NodeAllocatableMappedResourcesBuilder builder = new V1NodeAllocatableMappedResourcesBuilder(item);
        this._visitables.get("mapping").add(builder);
        this.mapping.add(builder);
    }
    return (A) this;
  }
  
  public A addToMapping(int index,V1NodeAllocatableMappedResources item) {
    if (this.mapping == null) {
      this.mapping = new ArrayList<>();
    }
    V1NodeAllocatableMappedResourcesBuilder builder = new V1NodeAllocatableMappedResourcesBuilder(item);
    if (index < 0 || index >= this.mapping.size()) {
        this._visitables.get("mapping").add(builder);
        this.mapping.add(builder);
    } else {
        this._visitables.get("mapping").add(builder);
        this.mapping.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToOverhead(V1NodeAllocatableOverheadResources... items) {
    if (this.overhead == null) {
      this.overhead = new ArrayList<>();
    }
    for (V1NodeAllocatableOverheadResources item : items) {
        V1NodeAllocatableOverheadResourcesBuilder builder = new V1NodeAllocatableOverheadResourcesBuilder(item);
        this._visitables.get("overhead").add(builder);
        this.overhead.add(builder);
    }
    return (A) this;
  }
  
  public A addToOverhead(int index,V1NodeAllocatableOverheadResources item) {
    if (this.overhead == null) {
      this.overhead = new ArrayList<>();
    }
    V1NodeAllocatableOverheadResourcesBuilder builder = new V1NodeAllocatableOverheadResourcesBuilder(item);
    if (index < 0 || index >= this.overhead.size()) {
        this._visitables.get("overhead").add(builder);
        this.overhead.add(builder);
    } else {
        this._visitables.get("overhead").add(builder);
        this.overhead.add(index, builder);
    }
    return (A) this;
  }
  
  public V1NodeAllocatableMappedResources buildFirstMapping() {
    return this.mapping.get(0).build();
  }
  
  public V1NodeAllocatableOverheadResources buildFirstOverhead() {
    return this.overhead.get(0).build();
  }
  
  public V1NodeAllocatableMappedResources buildLastMapping() {
    return this.mapping.get(mapping.size() - 1).build();
  }
  
  public V1NodeAllocatableOverheadResources buildLastOverhead() {
    return this.overhead.get(overhead.size() - 1).build();
  }
  
  public List<V1NodeAllocatableMappedResources> buildMapping() {
    return this.mapping != null ? build(mapping) : null;
  }
  
  public V1NodeAllocatableMappedResources buildMapping(int index) {
    return this.mapping.get(index).build();
  }
  
  public V1NodeAllocatableMappedResources buildMatchingMapping(Predicate<V1NodeAllocatableMappedResourcesBuilder> predicate) {
      for (V1NodeAllocatableMappedResourcesBuilder item : mapping) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1NodeAllocatableOverheadResources buildMatchingOverhead(Predicate<V1NodeAllocatableOverheadResourcesBuilder> predicate) {
      for (V1NodeAllocatableOverheadResourcesBuilder item : overhead) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public List<V1NodeAllocatableOverheadResources> buildOverhead() {
    return this.overhead != null ? build(overhead) : null;
  }
  
  public V1NodeAllocatableOverheadResources buildOverhead(int index) {
    return this.overhead.get(index).build();
  }
  
  protected void copyInstance(V1NodeAllocatableResourceClaimStatus instance) {
    instance = instance != null ? instance : new V1NodeAllocatableResourceClaimStatus();
    if (instance != null) {
        this.withContainers(instance.getContainers());
        this.withMapping(instance.getMapping());
        this.withOverhead(instance.getOverhead());
        this.withResourceClaimName(instance.getResourceClaimName());
    }
  }
  
  public MappingNested<A> editFirstMapping() {
    if (mapping.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "mapping"));
    }
    return this.setNewMappingLike(0, this.buildMapping(0));
  }
  
  public OverheadNested<A> editFirstOverhead() {
    if (overhead.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "overhead"));
    }
    return this.setNewOverheadLike(0, this.buildOverhead(0));
  }
  
  public MappingNested<A> editLastMapping() {
    int index = mapping.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "mapping"));
    }
    return this.setNewMappingLike(index, this.buildMapping(index));
  }
  
  public OverheadNested<A> editLastOverhead() {
    int index = overhead.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "overhead"));
    }
    return this.setNewOverheadLike(index, this.buildOverhead(index));
  }
  
  public MappingNested<A> editMapping(int index) {
    if (mapping.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "mapping"));
    }
    return this.setNewMappingLike(index, this.buildMapping(index));
  }
  
  public MappingNested<A> editMatchingMapping(Predicate<V1NodeAllocatableMappedResourcesBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < mapping.size();i++) {
      if (predicate.test(mapping.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "mapping"));
    }
    return this.setNewMappingLike(index, this.buildMapping(index));
  }
  
  public OverheadNested<A> editMatchingOverhead(Predicate<V1NodeAllocatableOverheadResourcesBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < overhead.size();i++) {
      if (predicate.test(overhead.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "overhead"));
    }
    return this.setNewOverheadLike(index, this.buildOverhead(index));
  }
  
  public OverheadNested<A> editOverhead(int index) {
    if (overhead.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "overhead"));
    }
    return this.setNewOverheadLike(index, this.buildOverhead(index));
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
    V1NodeAllocatableResourceClaimStatusFluent<?> that = (V1NodeAllocatableResourceClaimStatusFluent<?>) o;
    if (!(Objects.equals(containers, that.containers))) {
      return false;
    }
    if (!(Objects.equals(mapping, that.mapping))) {
      return false;
    }
    if (!(Objects.equals(overhead, that.overhead))) {
      return false;
    }
    if (!(Objects.equals(resourceClaimName, that.resourceClaimName))) {
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
  
  public boolean hasContainers() {
    return this.containers != null && !(this.containers.isEmpty());
  }
  
  public boolean hasMapping() {
    return this.mapping != null && !(this.mapping.isEmpty());
  }
  
  public boolean hasMatchingContainer(Predicate<String> predicate) {
      for (String item : containers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingMapping(Predicate<V1NodeAllocatableMappedResourcesBuilder> predicate) {
      for (V1NodeAllocatableMappedResourcesBuilder item : mapping) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingOverhead(Predicate<V1NodeAllocatableOverheadResourcesBuilder> predicate) {
      for (V1NodeAllocatableOverheadResourcesBuilder item : overhead) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasOverhead() {
    return this.overhead != null && !(this.overhead.isEmpty());
  }
  
  public boolean hasResourceClaimName() {
    return this.resourceClaimName != null;
  }
  
  public int hashCode() {
    return Objects.hash(containers, mapping, overhead, resourceClaimName);
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
  
  public A removeAllFromMapping(Collection<V1NodeAllocatableMappedResources> items) {
    if (this.mapping == null) {
      return (A) this;
    }
    for (V1NodeAllocatableMappedResources item : items) {
        V1NodeAllocatableMappedResourcesBuilder builder = new V1NodeAllocatableMappedResourcesBuilder(item);
        _visitables.get("mapping").remove(builder);
        this.mapping.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromOverhead(Collection<V1NodeAllocatableOverheadResources> items) {
    if (this.overhead == null) {
      return (A) this;
    }
    for (V1NodeAllocatableOverheadResources item : items) {
        V1NodeAllocatableOverheadResourcesBuilder builder = new V1NodeAllocatableOverheadResourcesBuilder(item);
        _visitables.get("overhead").remove(builder);
        this.overhead.remove(builder);
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
  
  public A removeFromMapping(V1NodeAllocatableMappedResources... items) {
    if (this.mapping == null) {
      return (A) this;
    }
    for (V1NodeAllocatableMappedResources item : items) {
        V1NodeAllocatableMappedResourcesBuilder builder = new V1NodeAllocatableMappedResourcesBuilder(item);
        _visitables.get("mapping").remove(builder);
        this.mapping.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromOverhead(V1NodeAllocatableOverheadResources... items) {
    if (this.overhead == null) {
      return (A) this;
    }
    for (V1NodeAllocatableOverheadResources item : items) {
        V1NodeAllocatableOverheadResourcesBuilder builder = new V1NodeAllocatableOverheadResourcesBuilder(item);
        _visitables.get("overhead").remove(builder);
        this.overhead.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromMapping(Predicate<V1NodeAllocatableMappedResourcesBuilder> predicate) {
    if (mapping == null) {
      return (A) this;
    }
    Iterator<V1NodeAllocatableMappedResourcesBuilder> each = mapping.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("mapping");
    while (each.hasNext()) {
        V1NodeAllocatableMappedResourcesBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromOverhead(Predicate<V1NodeAllocatableOverheadResourcesBuilder> predicate) {
    if (overhead == null) {
      return (A) this;
    }
    Iterator<V1NodeAllocatableOverheadResourcesBuilder> each = overhead.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("overhead");
    while (each.hasNext()) {
        V1NodeAllocatableOverheadResourcesBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public MappingNested<A> setNewMappingLike(int index,V1NodeAllocatableMappedResources item) {
    return new MappingNested<>(index, item);
  }
  
  public OverheadNested<A> setNewOverheadLike(int index,V1NodeAllocatableOverheadResources item) {
    return new OverheadNested<>(index, item);
  }
  
  public A setToContainers(int index,String item) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.set(index, item);
    return (A) this;
  }
  
  public A setToMapping(int index,V1NodeAllocatableMappedResources item) {
    if (this.mapping == null) {
      this.mapping = new ArrayList<>();
    }
    V1NodeAllocatableMappedResourcesBuilder builder = new V1NodeAllocatableMappedResourcesBuilder(item);
    if (index < 0 || index >= this.mapping.size()) {
        this._visitables.get("mapping").add(builder);
        this.mapping.add(builder);
    } else {
        this._visitables.get("mapping").add(builder);
        this.mapping.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToOverhead(int index,V1NodeAllocatableOverheadResources item) {
    if (this.overhead == null) {
      this.overhead = new ArrayList<>();
    }
    V1NodeAllocatableOverheadResourcesBuilder builder = new V1NodeAllocatableOverheadResourcesBuilder(item);
    if (index < 0 || index >= this.overhead.size()) {
        this._visitables.get("overhead").add(builder);
        this.overhead.add(builder);
    } else {
        this._visitables.get("overhead").add(builder);
        this.overhead.set(index, builder);
    }
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
    if (!(mapping == null) && !(mapping.isEmpty())) {
        sb.append("mapping:");
        sb.append(mapping);
        sb.append(",");
    }
    if (!(overhead == null) && !(overhead.isEmpty())) {
        sb.append("overhead:");
        sb.append(overhead);
        sb.append(",");
    }
    if (!(resourceClaimName == null)) {
        sb.append("resourceClaimName:");
        sb.append(resourceClaimName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainers(List<String> containers) {
    if (containers != null) {
        this.containers = new ArrayList<>();
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
  
  public A withMapping(List<V1NodeAllocatableMappedResources> mapping) {
    if (this.mapping != null) {
      this._visitables.get("mapping").clear();
    }
    if (mapping != null) {
        this.mapping = new ArrayList<>();
        for (V1NodeAllocatableMappedResources item : mapping) {
          this.addToMapping(item);
        }
    } else {
      this.mapping = null;
    }
    return (A) this;
  }
  
  public A withMapping(V1NodeAllocatableMappedResources... mapping) {
    if (this.mapping != null) {
        this.mapping.clear();
        _visitables.remove("mapping");
    }
    if (mapping != null) {
      for (V1NodeAllocatableMappedResources item : mapping) {
        this.addToMapping(item);
      }
    }
    return (A) this;
  }
  
  public A withOverhead(List<V1NodeAllocatableOverheadResources> overhead) {
    if (this.overhead != null) {
      this._visitables.get("overhead").clear();
    }
    if (overhead != null) {
        this.overhead = new ArrayList<>();
        for (V1NodeAllocatableOverheadResources item : overhead) {
          this.addToOverhead(item);
        }
    } else {
      this.overhead = null;
    }
    return (A) this;
  }
  
  public A withOverhead(V1NodeAllocatableOverheadResources... overhead) {
    if (this.overhead != null) {
        this.overhead.clear();
        _visitables.remove("overhead");
    }
    if (overhead != null) {
      for (V1NodeAllocatableOverheadResources item : overhead) {
        this.addToOverhead(item);
      }
    }
    return (A) this;
  }
  
  public A withResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return (A) this;
  }
  public class MappingNested<N> extends V1NodeAllocatableMappedResourcesFluent<MappingNested<N>> implements Nested<N>{
  
    V1NodeAllocatableMappedResourcesBuilder builder;
    int index;
  
    MappingNested(int index,V1NodeAllocatableMappedResources item) {
      this.index = index;
      this.builder = new V1NodeAllocatableMappedResourcesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NodeAllocatableResourceClaimStatusFluent.this.setToMapping(index, builder.build());
    }
    
    public N endMapping() {
      return and();
    }
    
  }
  public class OverheadNested<N> extends V1NodeAllocatableOverheadResourcesFluent<OverheadNested<N>> implements Nested<N>{
  
    V1NodeAllocatableOverheadResourcesBuilder builder;
    int index;
  
    OverheadNested(int index,V1NodeAllocatableOverheadResources item) {
      this.index = index;
      this.builder = new V1NodeAllocatableOverheadResourcesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NodeAllocatableResourceClaimStatusFluent.this.setToOverhead(index, builder.build());
    }
    
    public N endOverhead() {
      return and();
    }
    
  }
}