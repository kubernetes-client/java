package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2beta2HPAScalingRulesFluentImpl<A extends V2beta2HPAScalingRulesFluent<A>> extends BaseFluent<A> implements V2beta2HPAScalingRulesFluent<A>{
  public V2beta2HPAScalingRulesFluentImpl() {
  }
  public V2beta2HPAScalingRulesFluentImpl(V2beta2HPAScalingRules instance) {
    this.withPolicies(instance.getPolicies());

    this.withSelectPolicy(instance.getSelectPolicy());

    this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

  }
  private ArrayList<V2beta2HPAScalingPolicyBuilder> policies;
  private String selectPolicy;
  private Integer stabilizationWindowSeconds;
  public A addToPolicies(Integer index,V2beta2HPAScalingPolicy item) {
    if (this.policies == null) {this.policies = new ArrayList<V2beta2HPAScalingPolicyBuilder>();}
    V2beta2HPAScalingPolicyBuilder builder = new V2beta2HPAScalingPolicyBuilder(item);_visitables.get("policies").add(index >= 0 ? index : _visitables.get("policies").size(), builder);this.policies.add(index >= 0 ? index : policies.size(), builder); return (A)this;
  }
  public A setToPolicies(Integer index,V2beta2HPAScalingPolicy item) {
    if (this.policies == null) {this.policies = new ArrayList<V2beta2HPAScalingPolicyBuilder>();}
    V2beta2HPAScalingPolicyBuilder builder = new V2beta2HPAScalingPolicyBuilder(item);
    if (index < 0 || index >= _visitables.get("policies").size()) { _visitables.get("policies").add(builder); } else { _visitables.get("policies").set(index, builder);}
    if (index < 0 || index >= policies.size()) { policies.add(builder); } else { policies.set(index, builder);}
     return (A)this;
  }
  public A addToPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... items) {
    if (this.policies == null) {this.policies = new ArrayList<V2beta2HPAScalingPolicyBuilder>();}
    for (V2beta2HPAScalingPolicy item : items) {V2beta2HPAScalingPolicyBuilder builder = new V2beta2HPAScalingPolicyBuilder(item);_visitables.get("policies").add(builder);this.policies.add(builder);} return (A)this;
  }
  public A addAllToPolicies(Collection<V2beta2HPAScalingPolicy> items) {
    if (this.policies == null) {this.policies = new ArrayList<V2beta2HPAScalingPolicyBuilder>();}
    for (V2beta2HPAScalingPolicy item : items) {V2beta2HPAScalingPolicyBuilder builder = new V2beta2HPAScalingPolicyBuilder(item);_visitables.get("policies").add(builder);this.policies.add(builder);} return (A)this;
  }
  public A removeFromPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... items) {
    for (V2beta2HPAScalingPolicy item : items) {V2beta2HPAScalingPolicyBuilder builder = new V2beta2HPAScalingPolicyBuilder(item);_visitables.get("policies").remove(builder);if (this.policies != null) {this.policies.remove(builder);}} return (A)this;
  }
  public A removeAllFromPolicies(Collection<V2beta2HPAScalingPolicy> items) {
    for (V2beta2HPAScalingPolicy item : items) {V2beta2HPAScalingPolicyBuilder builder = new V2beta2HPAScalingPolicyBuilder(item);_visitables.get("policies").remove(builder);if (this.policies != null) {this.policies.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPolicies(Predicate<V2beta2HPAScalingPolicyBuilder> predicate) {
    if (policies == null) return (A) this;
    final Iterator<V2beta2HPAScalingPolicyBuilder> each = policies.iterator();
    final List visitables = _visitables.get("policies");
    while (each.hasNext()) {
      V2beta2HPAScalingPolicyBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildPolicies instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2beta2HPAScalingPolicy> getPolicies() {
    return policies != null ? build(policies) : null;
  }
  public List<V2beta2HPAScalingPolicy> buildPolicies() {
    return policies != null ? build(policies) : null;
  }
  public V2beta2HPAScalingPolicy buildPolicy(Integer index) {
    return this.policies.get(index).build();
  }
  public V2beta2HPAScalingPolicy buildFirstPolicy() {
    return this.policies.get(0).build();
  }
  public V2beta2HPAScalingPolicy buildLastPolicy() {
    return this.policies.get(policies.size() - 1).build();
  }
  public V2beta2HPAScalingPolicy buildMatchingPolicy(Predicate<V2beta2HPAScalingPolicyBuilder> predicate) {
    for (V2beta2HPAScalingPolicyBuilder item: policies) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPolicy(Predicate<V2beta2HPAScalingPolicyBuilder> predicate) {
    for (V2beta2HPAScalingPolicyBuilder item: policies) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPolicies(List<V2beta2HPAScalingPolicy> policies) {
    if (this.policies != null) { _visitables.get("policies").removeAll(this.policies);}
    if (policies != null) {this.policies = new ArrayList(); for (V2beta2HPAScalingPolicy item : policies){this.addToPolicies(item);}} else { this.policies = null;} return (A) this;
  }
  public A withPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... policies) {
    if (this.policies != null) {this.policies.clear();}
    if (policies != null) {for (V2beta2HPAScalingPolicy item :policies){ this.addToPolicies(item);}} return (A) this;
  }
  public Boolean hasPolicies() {
    return policies != null && !policies.isEmpty();
  }
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicy() {
    return new V2beta2HPAScalingRulesFluentImpl.PoliciesNestedImpl();
  }
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicyLike(V2beta2HPAScalingPolicy item) {
    return new V2beta2HPAScalingRulesFluentImpl.PoliciesNestedImpl(-1, item);
  }
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> setNewPolicyLike(Integer index,V2beta2HPAScalingPolicy item) {
    return new V2beta2HPAScalingRulesFluentImpl.PoliciesNestedImpl(index, item);
  }
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> editPolicy(Integer index) {
    if (policies.size() <= index) throw new RuntimeException("Can't edit policies. Index exceeds size.");
    return setNewPolicyLike(index, buildPolicy(index));
  }
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> editFirstPolicy() {
    if (policies.size() == 0) throw new RuntimeException("Can't edit first policies. The list is empty.");
    return setNewPolicyLike(0, buildPolicy(0));
  }
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> editLastPolicy() {
    int index = policies.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last policies. The list is empty.");
    return setNewPolicyLike(index, buildPolicy(index));
  }
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> editMatchingPolicy(Predicate<V2beta2HPAScalingPolicyBuilder> predicate) {
    int index = -1;
    for (int i=0;i<policies.size();i++) { 
    if (predicate.test(policies.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching policies. No match found.");
    return setNewPolicyLike(index, buildPolicy(index));
  }
  public String getSelectPolicy() {
    return this.selectPolicy;
  }
  public A withSelectPolicy(String selectPolicy) {
    this.selectPolicy=selectPolicy; return (A) this;
  }
  public Boolean hasSelectPolicy() {
    return this.selectPolicy != null;
  }
  public Integer getStabilizationWindowSeconds() {
    return this.stabilizationWindowSeconds;
  }
  public A withStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds=stabilizationWindowSeconds; return (A) this;
  }
  public Boolean hasStabilizationWindowSeconds() {
    return this.stabilizationWindowSeconds != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2HPAScalingRulesFluentImpl that = (V2beta2HPAScalingRulesFluentImpl) o;
    if (policies != null ? !policies.equals(that.policies) :that.policies != null) return false;
    if (selectPolicy != null ? !selectPolicy.equals(that.selectPolicy) :that.selectPolicy != null) return false;
    if (stabilizationWindowSeconds != null ? !stabilizationWindowSeconds.equals(that.stabilizationWindowSeconds) :that.stabilizationWindowSeconds != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(policies,  selectPolicy,  stabilizationWindowSeconds,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (policies != null && !policies.isEmpty()) { sb.append("policies:"); sb.append(policies + ","); }
    if (selectPolicy != null) { sb.append("selectPolicy:"); sb.append(selectPolicy + ","); }
    if (stabilizationWindowSeconds != null) { sb.append("stabilizationWindowSeconds:"); sb.append(stabilizationWindowSeconds); }
    sb.append("}");
    return sb.toString();
  }
  class PoliciesNestedImpl<N> extends V2beta2HPAScalingPolicyFluentImpl<V2beta2HPAScalingRulesFluent.PoliciesNested<N>> implements V2beta2HPAScalingRulesFluent.PoliciesNested<N>,Nested<N>{
    PoliciesNestedImpl(Integer index,V2beta2HPAScalingPolicy item) {
      this.index = index;
      this.builder = new V2beta2HPAScalingPolicyBuilder(this, item);
    }
    PoliciesNestedImpl() {
      this.index = -1;
      this.builder = new V2beta2HPAScalingPolicyBuilder(this);
    }
    V2beta2HPAScalingPolicyBuilder builder;
    Integer index;
    public N and() {
      return (N) V2beta2HPAScalingRulesFluentImpl.this.setToPolicies(index,builder.build());
    }
    public N endPolicy() {
      return and();
    }
    
  }
  
}