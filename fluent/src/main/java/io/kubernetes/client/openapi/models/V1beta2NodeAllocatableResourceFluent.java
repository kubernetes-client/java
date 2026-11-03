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
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1beta2NodeAllocatableResourceFluent<A extends V1beta2NodeAllocatableResourceFluent<A>> extends BaseFluent<A>{

  private V1beta2NodeAllocatableMappingBuilder mapping;
  private V1beta2NodeAllocatableOverheadBuilder overhead;

  public V1beta2NodeAllocatableResourceFluent() {
  }
  
  public V1beta2NodeAllocatableResourceFluent(V1beta2NodeAllocatableResource instance) {
    this.copyInstance(instance);
  }

  public V1beta2NodeAllocatableMapping buildMapping() {
    return this.mapping != null ? this.mapping.build() : null;
  }
  
  public V1beta2NodeAllocatableOverhead buildOverhead() {
    return this.overhead != null ? this.overhead.build() : null;
  }
  
  protected void copyInstance(V1beta2NodeAllocatableResource instance) {
    instance = instance != null ? instance : new V1beta2NodeAllocatableResource();
    if (instance != null) {
        this.withMapping(instance.getMapping());
        this.withOverhead(instance.getOverhead());
    }
  }
  
  public MappingNested<A> editMapping() {
    return this.withNewMappingLike(Optional.ofNullable(this.buildMapping()).orElse(null));
  }
  
  public MappingNested<A> editOrNewMapping() {
    return this.withNewMappingLike(Optional.ofNullable(this.buildMapping()).orElse(new V1beta2NodeAllocatableMappingBuilder().build()));
  }
  
  public MappingNested<A> editOrNewMappingLike(V1beta2NodeAllocatableMapping item) {
    return this.withNewMappingLike(Optional.ofNullable(this.buildMapping()).orElse(item));
  }
  
  public OverheadNested<A> editOrNewOverhead() {
    return this.withNewOverheadLike(Optional.ofNullable(this.buildOverhead()).orElse(new V1beta2NodeAllocatableOverheadBuilder().build()));
  }
  
  public OverheadNested<A> editOrNewOverheadLike(V1beta2NodeAllocatableOverhead item) {
    return this.withNewOverheadLike(Optional.ofNullable(this.buildOverhead()).orElse(item));
  }
  
  public OverheadNested<A> editOverhead() {
    return this.withNewOverheadLike(Optional.ofNullable(this.buildOverhead()).orElse(null));
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
    V1beta2NodeAllocatableResourceFluent<?> that = (V1beta2NodeAllocatableResourceFluent<?>) o;
    if (!(Objects.equals(mapping, that.mapping))) {
      return false;
    }
    if (!(Objects.equals(overhead, that.overhead))) {
      return false;
    }
    return true;
  }
  
  public boolean hasMapping() {
    return this.mapping != null;
  }
  
  public boolean hasOverhead() {
    return this.overhead != null;
  }
  
  public int hashCode() {
    return Objects.hash(mapping, overhead);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(mapping == null)) {
        sb.append("mapping:");
        sb.append(mapping);
        sb.append(",");
    }
    if (!(overhead == null)) {
        sb.append("overhead:");
        sb.append(overhead);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMapping(V1beta2NodeAllocatableMapping mapping) {
    this._visitables.remove("mapping");
    if (mapping != null) {
        this.mapping = new V1beta2NodeAllocatableMappingBuilder(mapping);
        this._visitables.get("mapping").add(this.mapping);
    } else {
        this._visitables.get("mapping").remove(this.mapping);
        this.mapping = null;
    }
    return (A) this;
  }
  
  public MappingNested<A> withNewMapping() {
    return new MappingNested<>(null);
  }
  
  public MappingNested<A> withNewMappingLike(V1beta2NodeAllocatableMapping item) {
    return new MappingNested<>(item);
  }
  
  public OverheadNested<A> withNewOverhead() {
    return new OverheadNested<>(null);
  }
  
  public OverheadNested<A> withNewOverheadLike(V1beta2NodeAllocatableOverhead item) {
    return new OverheadNested<>(item);
  }
  
  public A withOverhead(V1beta2NodeAllocatableOverhead overhead) {
    this._visitables.remove("overhead");
    if (overhead != null) {
        this.overhead = new V1beta2NodeAllocatableOverheadBuilder(overhead);
        this._visitables.get("overhead").add(this.overhead);
    } else {
        this._visitables.get("overhead").remove(this.overhead);
        this.overhead = null;
    }
    return (A) this;
  }
  public class MappingNested<N> extends V1beta2NodeAllocatableMappingFluent<MappingNested<N>> implements Nested<N>{
  
    V1beta2NodeAllocatableMappingBuilder builder;
  
    MappingNested(V1beta2NodeAllocatableMapping item) {
      this.builder = new V1beta2NodeAllocatableMappingBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta2NodeAllocatableResourceFluent.this.withMapping(builder.build());
    }
    
    public N endMapping() {
      return and();
    }
    
  }
  public class OverheadNested<N> extends V1beta2NodeAllocatableOverheadFluent<OverheadNested<N>> implements Nested<N>{
  
    V1beta2NodeAllocatableOverheadBuilder builder;
  
    OverheadNested(V1beta2NodeAllocatableOverhead item) {
      this.builder = new V1beta2NodeAllocatableOverheadBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta2NodeAllocatableResourceFluent.this.withOverhead(builder.build());
    }
    
    public N endOverhead() {
      return and();
    }
    
  }
}