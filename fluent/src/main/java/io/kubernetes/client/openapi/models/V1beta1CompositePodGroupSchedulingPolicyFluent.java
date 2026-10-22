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
public class V1beta1CompositePodGroupSchedulingPolicyFluent<A extends V1beta1CompositePodGroupSchedulingPolicyFluent<A>> extends BaseFluent<A>{

  private Object basic;
  private V1beta1CompositeGangSchedulingPolicyBuilder gang;

  public V1beta1CompositePodGroupSchedulingPolicyFluent() {
  }
  
  public V1beta1CompositePodGroupSchedulingPolicyFluent(V1beta1CompositePodGroupSchedulingPolicy instance) {
    this.copyInstance(instance);
  }

  public V1beta1CompositeGangSchedulingPolicy buildGang() {
    return this.gang != null ? this.gang.build() : null;
  }
  
  protected void copyInstance(V1beta1CompositePodGroupSchedulingPolicy instance) {
    instance = instance != null ? instance : new V1beta1CompositePodGroupSchedulingPolicy();
    if (instance != null) {
        this.withBasic(instance.getBasic());
        this.withGang(instance.getGang());
    }
  }
  
  public GangNested<A> editGang() {
    return this.withNewGangLike(Optional.ofNullable(this.buildGang()).orElse(null));
  }
  
  public GangNested<A> editOrNewGang() {
    return this.withNewGangLike(Optional.ofNullable(this.buildGang()).orElse(new V1beta1CompositeGangSchedulingPolicyBuilder().build()));
  }
  
  public GangNested<A> editOrNewGangLike(V1beta1CompositeGangSchedulingPolicy item) {
    return this.withNewGangLike(Optional.ofNullable(this.buildGang()).orElse(item));
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
    V1beta1CompositePodGroupSchedulingPolicyFluent<?> that = (V1beta1CompositePodGroupSchedulingPolicyFluent<?>) o;
    if (!(Objects.equals(basic, that.basic))) {
      return false;
    }
    if (!(Objects.equals(gang, that.gang))) {
      return false;
    }
    return true;
  }
  
  public Object getBasic() {
    return this.basic;
  }
  
  public boolean hasBasic() {
    return this.basic != null;
  }
  
  public boolean hasGang() {
    return this.gang != null;
  }
  
  public int hashCode() {
    return Objects.hash(basic, gang);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(basic == null)) {
        sb.append("basic:");
        sb.append(basic);
        sb.append(",");
    }
    if (!(gang == null)) {
        sb.append("gang:");
        sb.append(gang);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withBasic(Object basic) {
    this.basic = basic;
    return (A) this;
  }
  
  public A withGang(V1beta1CompositeGangSchedulingPolicy gang) {
    this._visitables.remove("gang");
    if (gang != null) {
        this.gang = new V1beta1CompositeGangSchedulingPolicyBuilder(gang);
        this._visitables.get("gang").add(this.gang);
    } else {
        this._visitables.get("gang").remove(this.gang);
        this.gang = null;
    }
    return (A) this;
  }
  
  public GangNested<A> withNewGang() {
    return new GangNested<>(null);
  }
  
  public GangNested<A> withNewGangLike(V1beta1CompositeGangSchedulingPolicy item) {
    return new GangNested<>(item);
  }
  public class GangNested<N> extends V1beta1CompositeGangSchedulingPolicyFluent<GangNested<N>> implements Nested<N>{
  
    V1beta1CompositeGangSchedulingPolicyBuilder builder;
  
    GangNested(V1beta1CompositeGangSchedulingPolicy item) {
      this.builder = new V1beta1CompositeGangSchedulingPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1CompositePodGroupSchedulingPolicyFluent.this.withGang(builder.build());
    }
    
    public N endGang() {
      return and();
    }
    
  }
}