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
public class V1CSINodeStatusFluent<A extends V1CSINodeStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1StorageHealthBuilder> storageHealth;

  public V1CSINodeStatusFluent() {
  }
  
  public V1CSINodeStatusFluent(V1CSINodeStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToStorageHealth(Collection<V1StorageHealth> items) {
    if (this.storageHealth == null) {
      this.storageHealth = new ArrayList<>();
    }
    for (V1StorageHealth item : items) {
        V1StorageHealthBuilder builder = new V1StorageHealthBuilder(item);
        this._visitables.get("storageHealth").add(builder);
        this.storageHealth.add(builder);
    }
    return (A) this;
  }
  
  public StorageHealthNested<A> addNewStorageHealth() {
    return new StorageHealthNested<>(-1, null);
  }
  
  public StorageHealthNested<A> addNewStorageHealthLike(V1StorageHealth item) {
    return new StorageHealthNested<>(-1, item);
  }
  
  public A addToStorageHealth(V1StorageHealth... items) {
    if (this.storageHealth == null) {
      this.storageHealth = new ArrayList<>();
    }
    for (V1StorageHealth item : items) {
        V1StorageHealthBuilder builder = new V1StorageHealthBuilder(item);
        this._visitables.get("storageHealth").add(builder);
        this.storageHealth.add(builder);
    }
    return (A) this;
  }
  
  public A addToStorageHealth(int index,V1StorageHealth item) {
    if (this.storageHealth == null) {
      this.storageHealth = new ArrayList<>();
    }
    V1StorageHealthBuilder builder = new V1StorageHealthBuilder(item);
    if (index < 0 || index >= this.storageHealth.size()) {
        this._visitables.get("storageHealth").add(builder);
        this.storageHealth.add(builder);
    } else {
        this._visitables.get("storageHealth").add(builder);
        this.storageHealth.add(index, builder);
    }
    return (A) this;
  }
  
  public V1StorageHealth buildFirstStorageHealth() {
    return this.storageHealth.get(0).build();
  }
  
  public V1StorageHealth buildLastStorageHealth() {
    return this.storageHealth.get(storageHealth.size() - 1).build();
  }
  
  public V1StorageHealth buildMatchingStorageHealth(Predicate<V1StorageHealthBuilder> predicate) {
      for (V1StorageHealthBuilder item : storageHealth) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public List<V1StorageHealth> buildStorageHealth() {
    return this.storageHealth != null ? build(storageHealth) : null;
  }
  
  public V1StorageHealth buildStorageHealth(int index) {
    return this.storageHealth.get(index).build();
  }
  
  protected void copyInstance(V1CSINodeStatus instance) {
    instance = instance != null ? instance : new V1CSINodeStatus();
    if (instance != null) {
      this.withStorageHealth(instance.getStorageHealth());
    }
  }
  
  public StorageHealthNested<A> editFirstStorageHealth() {
    if (storageHealth.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "storageHealth"));
    }
    return this.setNewStorageHealthLike(0, this.buildStorageHealth(0));
  }
  
  public StorageHealthNested<A> editLastStorageHealth() {
    int index = storageHealth.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "storageHealth"));
    }
    return this.setNewStorageHealthLike(index, this.buildStorageHealth(index));
  }
  
  public StorageHealthNested<A> editMatchingStorageHealth(Predicate<V1StorageHealthBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < storageHealth.size();i++) {
      if (predicate.test(storageHealth.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "storageHealth"));
    }
    return this.setNewStorageHealthLike(index, this.buildStorageHealth(index));
  }
  
  public StorageHealthNested<A> editStorageHealth(int index) {
    if (storageHealth.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "storageHealth"));
    }
    return this.setNewStorageHealthLike(index, this.buildStorageHealth(index));
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
    V1CSINodeStatusFluent<?> that = (V1CSINodeStatusFluent<?>) o;
    if (!(Objects.equals(storageHealth, that.storageHealth))) {
      return false;
    }
    return true;
  }
  
  public boolean hasMatchingStorageHealth(Predicate<V1StorageHealthBuilder> predicate) {
      for (V1StorageHealthBuilder item : storageHealth) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasStorageHealth() {
    return this.storageHealth != null && !(this.storageHealth.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(storageHealth);
  }
  
  public A removeAllFromStorageHealth(Collection<V1StorageHealth> items) {
    if (this.storageHealth == null) {
      return (A) this;
    }
    for (V1StorageHealth item : items) {
        V1StorageHealthBuilder builder = new V1StorageHealthBuilder(item);
        _visitables.get("storageHealth").remove(builder);
        this.storageHealth.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromStorageHealth(V1StorageHealth... items) {
    if (this.storageHealth == null) {
      return (A) this;
    }
    for (V1StorageHealth item : items) {
        V1StorageHealthBuilder builder = new V1StorageHealthBuilder(item);
        _visitables.get("storageHealth").remove(builder);
        this.storageHealth.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromStorageHealth(Predicate<V1StorageHealthBuilder> predicate) {
    if (storageHealth == null) {
      return (A) this;
    }
    Iterator<V1StorageHealthBuilder> each = storageHealth.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("storageHealth");
    while (each.hasNext()) {
        V1StorageHealthBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public StorageHealthNested<A> setNewStorageHealthLike(int index,V1StorageHealth item) {
    return new StorageHealthNested<>(index, item);
  }
  
  public A setToStorageHealth(int index,V1StorageHealth item) {
    if (this.storageHealth == null) {
      this.storageHealth = new ArrayList<>();
    }
    V1StorageHealthBuilder builder = new V1StorageHealthBuilder(item);
    if (index < 0 || index >= this.storageHealth.size()) {
        this._visitables.get("storageHealth").add(builder);
        this.storageHealth.add(builder);
    } else {
        this._visitables.get("storageHealth").add(builder);
        this.storageHealth.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(storageHealth == null) && !(storageHealth.isEmpty())) {
        sb.append("storageHealth:");
        sb.append(storageHealth);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withStorageHealth(List<V1StorageHealth> storageHealth) {
    if (this.storageHealth != null) {
      this._visitables.get("storageHealth").clear();
    }
    if (storageHealth != null) {
        this.storageHealth = new ArrayList<>();
        for (V1StorageHealth item : storageHealth) {
          this.addToStorageHealth(item);
        }
    } else {
      this.storageHealth = null;
    }
    return (A) this;
  }
  
  public A withStorageHealth(V1StorageHealth... storageHealth) {
    if (this.storageHealth != null) {
        this.storageHealth.clear();
        _visitables.remove("storageHealth");
    }
    if (storageHealth != null) {
      for (V1StorageHealth item : storageHealth) {
        this.addToStorageHealth(item);
      }
    }
    return (A) this;
  }
  public class StorageHealthNested<N> extends V1StorageHealthFluent<StorageHealthNested<N>> implements Nested<N>{
  
    V1StorageHealthBuilder builder;
    int index;
  
    StorageHealthNested(int index,V1StorageHealth item) {
      this.index = index;
      this.builder = new V1StorageHealthBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSINodeStatusFluent.this.setToStorageHealth(index, builder.build());
    }
    
    public N endStorageHealth() {
      return and();
    }
    
  }
}