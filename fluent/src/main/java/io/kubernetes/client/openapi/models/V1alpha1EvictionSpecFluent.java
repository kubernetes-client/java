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
public class V1alpha1EvictionSpecFluent<A extends V1alpha1EvictionSpecFluent<A>> extends BaseFluent<A>{

  private V1alpha1EvictionTargetBuilder target;

  public V1alpha1EvictionSpecFluent() {
  }
  
  public V1alpha1EvictionSpecFluent(V1alpha1EvictionSpec instance) {
    this.copyInstance(instance);
  }

  public V1alpha1EvictionTarget buildTarget() {
    return this.target != null ? this.target.build() : null;
  }
  
  protected void copyInstance(V1alpha1EvictionSpec instance) {
    instance = instance != null ? instance : new V1alpha1EvictionSpec();
    if (instance != null) {
      this.withTarget(instance.getTarget());
    }
  }
  
  public TargetNested<A> editOrNewTarget() {
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(new V1alpha1EvictionTargetBuilder().build()));
  }
  
  public TargetNested<A> editOrNewTargetLike(V1alpha1EvictionTarget item) {
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(item));
  }
  
  public TargetNested<A> editTarget() {
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(null));
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
    V1alpha1EvictionSpecFluent<?> that = (V1alpha1EvictionSpecFluent<?>) o;
    if (!(Objects.equals(target, that.target))) {
      return false;
    }
    return true;
  }
  
  public boolean hasTarget() {
    return this.target != null;
  }
  
  public int hashCode() {
    return Objects.hash(target);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(target == null)) {
        sb.append("target:");
        sb.append(target);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public TargetNested<A> withNewTarget() {
    return new TargetNested<>(null);
  }
  
  public TargetNested<A> withNewTargetLike(V1alpha1EvictionTarget item) {
    return new TargetNested<>(item);
  }
  
  public A withTarget(V1alpha1EvictionTarget target) {
    this._visitables.remove("target");
    if (target != null) {
        this.target = new V1alpha1EvictionTargetBuilder(target);
        this._visitables.get("target").add(this.target);
    } else {
        this._visitables.get("target").remove(this.target);
        this.target = null;
    }
    return (A) this;
  }
  public class TargetNested<N> extends V1alpha1EvictionTargetFluent<TargetNested<N>> implements Nested<N>{
  
    V1alpha1EvictionTargetBuilder builder;
  
    TargetNested(V1alpha1EvictionTarget item) {
      this.builder = new V1alpha1EvictionTargetBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1EvictionSpecFluent.this.withTarget(builder.build());
    }
    
    public N endTarget() {
      return and();
    }
    
  }
}