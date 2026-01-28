package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1PodGroupPolicyFluent<A extends io.kubernetes.client.openapi.models.V1alpha1PodGroupPolicyFluent<A>> extends BaseFluent<A>{

  private Object basic;
  private V1alpha1GangSchedulingPolicyBuilder gang;

  public V1alpha1PodGroupPolicyFluent() {
  }
  
  public V1alpha1PodGroupPolicyFluent(V1alpha1PodGroupPolicy instance) {
    this.copyInstance(instance);
  }

  public V1alpha1GangSchedulingPolicy buildGang() {
    return this.gang != null ? this.gang.build() : null;
  }
  
  protected void copyInstance(V1alpha1PodGroupPolicy instance) {
    instance = instance != null ? instance : new V1alpha1PodGroupPolicy();
    if (instance != null) {
        this.withBasic(instance.getBasic());
        this.withGang(instance.getGang());
    }
  }
  
  public GangNested<A> editGang() {
    return this.withNewGangLike(Optional.ofNullable(this.buildGang()).orElse(null));
  }
  
  public GangNested<A> editOrNewGang() {
    return this.withNewGangLike(Optional.ofNullable(this.buildGang()).orElse(new V1alpha1GangSchedulingPolicyBuilder().build()));
  }
  
  public GangNested<A> editOrNewGangLike(V1alpha1GangSchedulingPolicy item) {
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
    V1alpha1PodGroupPolicyFluent that = (V1alpha1PodGroupPolicyFluent) o;
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
  
  public A withGang(V1alpha1GangSchedulingPolicy gang) {
    this._visitables.remove("gang");
    if (gang != null) {
        this.gang = new V1alpha1GangSchedulingPolicyBuilder(gang);
        this._visitables.get("gang").add(this.gang);
    } else {
        this.gang = null;
        this._visitables.get("gang").remove(this.gang);
    }
    return (A) this;
  }
  
  public GangNested<A> withNewGang() {
    return new GangNested(null);
  }
  
  public GangNested<A> withNewGangLike(V1alpha1GangSchedulingPolicy item) {
    return new GangNested(item);
  }
  public class GangNested<N> extends V1alpha1GangSchedulingPolicyFluent<GangNested<N>> implements Nested<N>{
  
    V1alpha1GangSchedulingPolicyBuilder builder;
  
    GangNested(V1alpha1GangSchedulingPolicy item) {
      this.builder = new V1alpha1GangSchedulingPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1PodGroupPolicyFluent.this.withGang(builder.build());
    }
    
    public N endGang() {
      return and();
    }
    
  }
}