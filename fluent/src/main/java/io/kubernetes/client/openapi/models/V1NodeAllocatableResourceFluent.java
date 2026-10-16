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
public class V1NodeAllocatableResourceFluent<A extends V1NodeAllocatableResourceFluent<A>> extends BaseFluent<A>{

  private V1NodeAllocatableMappingBuilder mapping;
  private V1NodeAllocatableOverheadBuilder overhead;

  public V1NodeAllocatableResourceFluent() {
  }
  
  public V1NodeAllocatableResourceFluent(V1NodeAllocatableResource instance) {
    this.copyInstance(instance);
  }

  public V1NodeAllocatableMapping buildMapping() {
    return this.mapping != null ? this.mapping.build() : null;
  }
  
  public V1NodeAllocatableOverhead buildOverhead() {
    return this.overhead != null ? this.overhead.build() : null;
  }
  
  protected void copyInstance(V1NodeAllocatableResource instance) {
    instance = instance != null ? instance : new V1NodeAllocatableResource();
    if (instance != null) {
        this.withMapping(instance.getMapping());
        this.withOverhead(instance.getOverhead());
    }
  }
  
  public MappingNested<A> editMapping() {
    return this.withNewMappingLike(Optional.ofNullable(this.buildMapping()).orElse(null));
  }
  
  public MappingNested<A> editOrNewMapping() {
    return this.withNewMappingLike(Optional.ofNullable(this.buildMapping()).orElse(new V1NodeAllocatableMappingBuilder().build()));
  }
  
  public MappingNested<A> editOrNewMappingLike(V1NodeAllocatableMapping item) {
    return this.withNewMappingLike(Optional.ofNullable(this.buildMapping()).orElse(item));
  }
  
  public OverheadNested<A> editOrNewOverhead() {
    return this.withNewOverheadLike(Optional.ofNullable(this.buildOverhead()).orElse(new V1NodeAllocatableOverheadBuilder().build()));
  }
  
  public OverheadNested<A> editOrNewOverheadLike(V1NodeAllocatableOverhead item) {
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
    V1NodeAllocatableResourceFluent<?> that = (V1NodeAllocatableResourceFluent<?>) o;
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
  
  public A withMapping(V1NodeAllocatableMapping mapping) {
    this._visitables.remove("mapping");
    if (mapping != null) {
        this.mapping = new V1NodeAllocatableMappingBuilder(mapping);
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
  
  public MappingNested<A> withNewMappingLike(V1NodeAllocatableMapping item) {
    return new MappingNested<>(item);
  }
  
  public OverheadNested<A> withNewOverhead() {
    return new OverheadNested<>(null);
  }
  
  public OverheadNested<A> withNewOverheadLike(V1NodeAllocatableOverhead item) {
    return new OverheadNested<>(item);
  }
  
  public A withOverhead(V1NodeAllocatableOverhead overhead) {
    this._visitables.remove("overhead");
    if (overhead != null) {
        this.overhead = new V1NodeAllocatableOverheadBuilder(overhead);
        this._visitables.get("overhead").add(this.overhead);
    } else {
        this._visitables.get("overhead").remove(this.overhead);
        this.overhead = null;
    }
    return (A) this;
  }
  public class MappingNested<N> extends V1NodeAllocatableMappingFluent<MappingNested<N>> implements Nested<N>{
  
    V1NodeAllocatableMappingBuilder builder;
  
    MappingNested(V1NodeAllocatableMapping item) {
      this.builder = new V1NodeAllocatableMappingBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NodeAllocatableResourceFluent.this.withMapping(builder.build());
    }
    
    public N endMapping() {
      return and();
    }
    
  }
  public class OverheadNested<N> extends V1NodeAllocatableOverheadFluent<OverheadNested<N>> implements Nested<N>{
  
    V1NodeAllocatableOverheadBuilder builder;
  
    OverheadNested(V1NodeAllocatableOverhead item) {
      this.builder = new V1NodeAllocatableOverheadBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NodeAllocatableResourceFluent.this.withOverhead(builder.build());
    }
    
    public N endOverhead() {
      return and();
    }
    
  }
}