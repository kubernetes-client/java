package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2HPAScalingRulesFluent<A extends io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent<A>> extends BaseFluent<A>{
  public V2HPAScalingRulesFluent() {
  }
  
  public V2HPAScalingRulesFluent(V2HPAScalingRules instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V2HPAScalingPolicyBuilder> policies;
  private String selectPolicy;
  private Integer stabilizationWindowSeconds;
  private Quantity tolerance;
  
  protected void copyInstance(V2HPAScalingRules instance) {
    instance = instance != null ? instance : new V2HPAScalingRules();
    if (instance != null) {
        this.withPolicies(instance.getPolicies());
        this.withSelectPolicy(instance.getSelectPolicy());
        this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());
        this.withTolerance(instance.getTolerance());
    }
  }
  
  public A addToPolicies(int index,V2HPAScalingPolicy item) {
    if (this.policies == null) {
      this.policies = new ArrayList();
    }
    V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);
    if (index < 0 || index >= policies.size()) {
        _visitables.get("policies").add(builder);
        policies.add(builder);
    } else {
        _visitables.get("policies").add(builder);
        policies.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToPolicies(int index,V2HPAScalingPolicy item) {
    if (this.policies == null) {
      this.policies = new ArrayList();
    }
    V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);
    if (index < 0 || index >= policies.size()) {
        _visitables.get("policies").add(builder);
        policies.add(builder);
    } else {
        _visitables.get("policies").add(builder);
        policies.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToPolicies(V2HPAScalingPolicy... items) {
    if (this.policies == null) {
      this.policies = new ArrayList();
    }
    for (V2HPAScalingPolicy item : items) {
        V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);
        _visitables.get("policies").add(builder);
        this.policies.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToPolicies(Collection<V2HPAScalingPolicy> items) {
    if (this.policies == null) {
      this.policies = new ArrayList();
    }
    for (V2HPAScalingPolicy item : items) {
        V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);
        _visitables.get("policies").add(builder);
        this.policies.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromPolicies(V2HPAScalingPolicy... items) {
    if (this.policies == null) {
      return (A) this;
    }
    for (V2HPAScalingPolicy item : items) {
        V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);
        _visitables.get("policies").remove(builder);
        this.policies.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromPolicies(Collection<V2HPAScalingPolicy> items) {
    if (this.policies == null) {
      return (A) this;
    }
    for (V2HPAScalingPolicy item : items) {
        V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);
        _visitables.get("policies").remove(builder);
        this.policies.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPolicies(Predicate<V2HPAScalingPolicyBuilder> predicate) {
    if (policies == null) {
      return (A) this;
    }
    Iterator<V2HPAScalingPolicyBuilder> each = policies.iterator();
    List visitables = _visitables.get("policies");
    while (each.hasNext()) {
        V2HPAScalingPolicyBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V2HPAScalingPolicy> buildPolicies() {
    return this.policies != null ? build(policies) : null;
  }
  
  public V2HPAScalingPolicy buildPolicy(int index) {
    return this.policies.get(index).build();
  }
  
  public V2HPAScalingPolicy buildFirstPolicy() {
    return this.policies.get(0).build();
  }
  
  public V2HPAScalingPolicy buildLastPolicy() {
    return this.policies.get(policies.size() - 1).build();
  }
  
  public V2HPAScalingPolicy buildMatchingPolicy(Predicate<V2HPAScalingPolicyBuilder> predicate) {
      for (V2HPAScalingPolicyBuilder item : policies) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPolicy(Predicate<V2HPAScalingPolicyBuilder> predicate) {
      for (V2HPAScalingPolicyBuilder item : policies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPolicies(List<V2HPAScalingPolicy> policies) {
    if (this.policies != null) {
      this._visitables.get("policies").clear();
    }
    if (policies != null) {
        this.policies = new ArrayList();
        for (V2HPAScalingPolicy item : policies) {
          this.addToPolicies(item);
        }
    } else {
      this.policies = null;
    }
    return (A) this;
  }
  
  public A withPolicies(V2HPAScalingPolicy... policies) {
    if (this.policies != null) {
        this.policies.clear();
        _visitables.remove("policies");
    }
    if (policies != null) {
      for (V2HPAScalingPolicy item : policies) {
        this.addToPolicies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPolicies() {
    return this.policies != null && !(this.policies.isEmpty());
  }
  
  public PoliciesNested<A> addNewPolicy() {
    return new PoliciesNested(-1, null);
  }
  
  public PoliciesNested<A> addNewPolicyLike(V2HPAScalingPolicy item) {
    return new PoliciesNested(-1, item);
  }
  
  public PoliciesNested<A> setNewPolicyLike(int index,V2HPAScalingPolicy item) {
    return new PoliciesNested(index, item);
  }
  
  public PoliciesNested<A> editPolicy(int index) {
    if (index <= policies.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "policies"));
    }
    return this.setNewPolicyLike(index, this.buildPolicy(index));
  }
  
  public PoliciesNested<A> editFirstPolicy() {
    if (policies.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "policies"));
    }
    return this.setNewPolicyLike(0, this.buildPolicy(0));
  }
  
  public PoliciesNested<A> editLastPolicy() {
    int index = policies.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "policies"));
    }
    return this.setNewPolicyLike(index, this.buildPolicy(index));
  }
  
  public PoliciesNested<A> editMatchingPolicy(Predicate<V2HPAScalingPolicyBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < policies.size();i++) {
      if (predicate.test(policies.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "policies"));
    }
    return this.setNewPolicyLike(index, this.buildPolicy(index));
  }
  
  public String getSelectPolicy() {
    return this.selectPolicy;
  }
  
  public A withSelectPolicy(String selectPolicy) {
    this.selectPolicy = selectPolicy;
    return (A) this;
  }
  
  public boolean hasSelectPolicy() {
    return this.selectPolicy != null;
  }
  
  public Integer getStabilizationWindowSeconds() {
    return this.stabilizationWindowSeconds;
  }
  
  public A withStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    return (A) this;
  }
  
  public boolean hasStabilizationWindowSeconds() {
    return this.stabilizationWindowSeconds != null;
  }
  
  public Quantity getTolerance() {
    return this.tolerance;
  }
  
  public A withTolerance(Quantity tolerance) {
    this.tolerance = tolerance;
    return (A) this;
  }
  
  public boolean hasTolerance() {
    return this.tolerance != null;
  }
  
  public A withNewTolerance(String value) {
    return (A) this.withTolerance(new Quantity(value));
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
    V2HPAScalingRulesFluent that = (V2HPAScalingRulesFluent) o;
    if (!(Objects.equals(policies, that.policies))) {
      return false;
    }
    if (!(Objects.equals(selectPolicy, that.selectPolicy))) {
      return false;
    }
    if (!(Objects.equals(stabilizationWindowSeconds, that.stabilizationWindowSeconds))) {
      return false;
    }
    if (!(Objects.equals(tolerance, that.tolerance))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(policies, selectPolicy, stabilizationWindowSeconds, tolerance);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(policies == null) && !(policies.isEmpty())) {
        sb.append("policies:");
        sb.append(policies);
        sb.append(",");
    }
    if (!(selectPolicy == null)) {
        sb.append("selectPolicy:");
        sb.append(selectPolicy);
        sb.append(",");
    }
    if (!(stabilizationWindowSeconds == null)) {
        sb.append("stabilizationWindowSeconds:");
        sb.append(stabilizationWindowSeconds);
        sb.append(",");
    }
    if (!(tolerance == null)) {
        sb.append("tolerance:");
        sb.append(tolerance);
    }
    sb.append("}");
    return sb.toString();
  }
  public class PoliciesNested<N> extends V2HPAScalingPolicyFluent<PoliciesNested<N>> implements Nested<N>{
    PoliciesNested(int index,V2HPAScalingPolicy item) {
      this.index = index;
      this.builder = new V2HPAScalingPolicyBuilder(this, item);
    }
    V2HPAScalingPolicyBuilder builder;
    int index;
    
    public N and() {
      return (N) V2HPAScalingRulesFluent.this.setToPolicies(index, builder.build());
    }
    
    public N endPolicy() {
      return and();
    }
    
  
  }

}