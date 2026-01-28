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
public class V1alpha1PodGroupFluent<A extends io.kubernetes.client.openapi.models.V1alpha1PodGroupFluent<A>> extends BaseFluent<A>{

  private String name;
  private V1alpha1PodGroupPolicyBuilder policy;

  public V1alpha1PodGroupFluent() {
  }
  
  public V1alpha1PodGroupFluent(V1alpha1PodGroup instance) {
    this.copyInstance(instance);
  }

  public V1alpha1PodGroupPolicy buildPolicy() {
    return this.policy != null ? this.policy.build() : null;
  }
  
  protected void copyInstance(V1alpha1PodGroup instance) {
    instance = instance != null ? instance : new V1alpha1PodGroup();
    if (instance != null) {
        this.withName(instance.getName());
        this.withPolicy(instance.getPolicy());
    }
  }
  
  public PolicyNested<A> editOrNewPolicy() {
    return this.withNewPolicyLike(Optional.ofNullable(this.buildPolicy()).orElse(new V1alpha1PodGroupPolicyBuilder().build()));
  }
  
  public PolicyNested<A> editOrNewPolicyLike(V1alpha1PodGroupPolicy item) {
    return this.withNewPolicyLike(Optional.ofNullable(this.buildPolicy()).orElse(item));
  }
  
  public PolicyNested<A> editPolicy() {
    return this.withNewPolicyLike(Optional.ofNullable(this.buildPolicy()).orElse(null));
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
    V1alpha1PodGroupFluent that = (V1alpha1PodGroupFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(policy, that.policy))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasPolicy() {
    return this.policy != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, policy);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(policy == null)) {
        sb.append("policy:");
        sb.append(policy);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public PolicyNested<A> withNewPolicy() {
    return new PolicyNested(null);
  }
  
  public PolicyNested<A> withNewPolicyLike(V1alpha1PodGroupPolicy item) {
    return new PolicyNested(item);
  }
  
  public A withPolicy(V1alpha1PodGroupPolicy policy) {
    this._visitables.remove("policy");
    if (policy != null) {
        this.policy = new V1alpha1PodGroupPolicyBuilder(policy);
        this._visitables.get("policy").add(this.policy);
    } else {
        this.policy = null;
        this._visitables.get("policy").remove(this.policy);
    }
    return (A) this;
  }
  public class PolicyNested<N> extends V1alpha1PodGroupPolicyFluent<PolicyNested<N>> implements Nested<N>{
  
    V1alpha1PodGroupPolicyBuilder builder;
  
    PolicyNested(V1alpha1PodGroupPolicy item) {
      this.builder = new V1alpha1PodGroupPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1PodGroupFluent.this.withPolicy(builder.build());
    }
    
    public N endPolicy() {
      return and();
    }
    
  }
}