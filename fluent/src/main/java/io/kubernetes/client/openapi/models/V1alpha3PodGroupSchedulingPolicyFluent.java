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
public class V1alpha3PodGroupSchedulingPolicyFluent<A extends V1alpha3PodGroupSchedulingPolicyFluent<A>> extends BaseFluent<A>{

  private Object basic;
  private V1alpha3GangSchedulingPolicyBuilder gang;

  public V1alpha3PodGroupSchedulingPolicyFluent() {
  }
  
  public V1alpha3PodGroupSchedulingPolicyFluent(V1alpha3PodGroupSchedulingPolicy instance) {
    this.copyInstance(instance);
  }

  public V1alpha3GangSchedulingPolicy buildGang() {
    return this.gang != null ? this.gang.build() : null;
  }
  
  protected void copyInstance(V1alpha3PodGroupSchedulingPolicy instance) {
    instance = instance != null ? instance : new V1alpha3PodGroupSchedulingPolicy();
    if (instance != null) {
        this.withBasic(instance.getBasic());
        this.withGang(instance.getGang());
    }
  }
  
  public GangNested<A> editGang() {
    return this.withNewGangLike(Optional.ofNullable(this.buildGang()).orElse(null));
  }
  
  public GangNested<A> editOrNewGang() {
    return this.withNewGangLike(Optional.ofNullable(this.buildGang()).orElse(new V1alpha3GangSchedulingPolicyBuilder().build()));
  }
  
  public GangNested<A> editOrNewGangLike(V1alpha3GangSchedulingPolicy item) {
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
    V1alpha3PodGroupSchedulingPolicyFluent<?> that = (V1alpha3PodGroupSchedulingPolicyFluent<?>) o;
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
  
  public A withGang(V1alpha3GangSchedulingPolicy gang) {
    this._visitables.remove("gang");
    if (gang != null) {
        this.gang = new V1alpha3GangSchedulingPolicyBuilder(gang);
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
  
  public GangNested<A> withNewGangLike(V1alpha3GangSchedulingPolicy item) {
    return new GangNested<>(item);
  }
  public class GangNested<N> extends V1alpha3GangSchedulingPolicyFluent<GangNested<N>> implements Nested<N>{
  
    V1alpha3GangSchedulingPolicyBuilder builder;
  
    GangNested(V1alpha3GangSchedulingPolicy item) {
      this.builder = new V1alpha3GangSchedulingPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3PodGroupSchedulingPolicyFluent.this.withGang(builder.build());
    }
    
    public N endGang() {
      return and();
    }
    
  }
}