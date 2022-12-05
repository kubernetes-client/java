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
  public class V2HPAScalingRulesFluentImpl<A extends V2HPAScalingRulesFluent<A>> extends BaseFluent<A> implements V2HPAScalingRulesFluent<A>{
  public V2HPAScalingRulesFluentImpl() {
  }
  public V2HPAScalingRulesFluentImpl(V2HPAScalingRules instance) {
    this.withPolicies(instance.getPolicies());

    this.withSelectPolicy(instance.getSelectPolicy());

    this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

  }
  private ArrayList<V2HPAScalingPolicyBuilder> policies;
  private String selectPolicy;
  private Integer stabilizationWindowSeconds;
  public A addToPolicies(Integer index,V2HPAScalingPolicy item) {
    if (this.policies == null) {this.policies = new ArrayList<V2HPAScalingPolicyBuilder>();}
    V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);_visitables.get("policies").add(index >= 0 ? index : _visitables.get("policies").size(), builder);this.policies.add(index >= 0 ? index : policies.size(), builder); return (A)this;
  }
  public A setToPolicies(Integer index,V2HPAScalingPolicy item) {
    if (this.policies == null) {this.policies = new ArrayList<V2HPAScalingPolicyBuilder>();}
    V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);
    if (index < 0 || index >= _visitables.get("policies").size()) { _visitables.get("policies").add(builder); } else { _visitables.get("policies").set(index, builder);}
    if (index < 0 || index >= policies.size()) { policies.add(builder); } else { policies.set(index, builder);}
     return (A)this;
  }
  public A addToPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... items) {
    if (this.policies == null) {this.policies = new ArrayList<V2HPAScalingPolicyBuilder>();}
    for (V2HPAScalingPolicy item : items) {V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);_visitables.get("policies").add(builder);this.policies.add(builder);} return (A)this;
  }
  public A addAllToPolicies(Collection<V2HPAScalingPolicy> items) {
    if (this.policies == null) {this.policies = new ArrayList<V2HPAScalingPolicyBuilder>();}
    for (V2HPAScalingPolicy item : items) {V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);_visitables.get("policies").add(builder);this.policies.add(builder);} return (A)this;
  }
  public A removeFromPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... items) {
    for (V2HPAScalingPolicy item : items) {V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);_visitables.get("policies").remove(builder);if (this.policies != null) {this.policies.remove(builder);}} return (A)this;
  }
  public A removeAllFromPolicies(Collection<V2HPAScalingPolicy> items) {
    for (V2HPAScalingPolicy item : items) {V2HPAScalingPolicyBuilder builder = new V2HPAScalingPolicyBuilder(item);_visitables.get("policies").remove(builder);if (this.policies != null) {this.policies.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPolicies(Predicate<V2HPAScalingPolicyBuilder> predicate) {
    if (policies == null) return (A) this;
    final Iterator<V2HPAScalingPolicyBuilder> each = policies.iterator();
    final List visitables = _visitables.get("policies");
    while (each.hasNext()) {
      V2HPAScalingPolicyBuilder builder = each.next();
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
  public List<V2HPAScalingPolicy> getPolicies() {
    return policies != null ? build(policies) : null;
  }
  public List<V2HPAScalingPolicy> buildPolicies() {
    return policies != null ? build(policies) : null;
  }
  public V2HPAScalingPolicy buildPolicy(Integer index) {
    return this.policies.get(index).build();
  }
  public V2HPAScalingPolicy buildFirstPolicy() {
    return this.policies.get(0).build();
  }
  public V2HPAScalingPolicy buildLastPolicy() {
    return this.policies.get(policies.size() - 1).build();
  }
  public V2HPAScalingPolicy buildMatchingPolicy(Predicate<V2HPAScalingPolicyBuilder> predicate) {
    for (V2HPAScalingPolicyBuilder item: policies) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPolicy(Predicate<V2HPAScalingPolicyBuilder> predicate) {
    for (V2HPAScalingPolicyBuilder item: policies) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPolicies(List<V2HPAScalingPolicy> policies) {
    if (this.policies != null) { _visitables.get("policies").removeAll(this.policies);}
    if (policies != null) {this.policies = new ArrayList(); for (V2HPAScalingPolicy item : policies){this.addToPolicies(item);}} else { this.policies = null;} return (A) this;
  }
  public A withPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... policies) {
    if (this.policies != null) {this.policies.clear();}
    if (policies != null) {for (V2HPAScalingPolicy item :policies){ this.addToPolicies(item);}} return (A) this;
  }
  public Boolean hasPolicies() {
    return policies != null && !policies.isEmpty();
  }
  public V2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicy() {
    return new V2HPAScalingRulesFluentImpl.PoliciesNestedImpl();
  }
  public V2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicyLike(V2HPAScalingPolicy item) {
    return new V2HPAScalingRulesFluentImpl.PoliciesNestedImpl(-1, item);
  }
  public V2HPAScalingRulesFluent.PoliciesNested<A> setNewPolicyLike(Integer index,V2HPAScalingPolicy item) {
    return new V2HPAScalingRulesFluentImpl.PoliciesNestedImpl(index, item);
  }
  public V2HPAScalingRulesFluent.PoliciesNested<A> editPolicy(Integer index) {
    if (policies.size() <= index) throw new RuntimeException("Can't edit policies. Index exceeds size.");
    return setNewPolicyLike(index, buildPolicy(index));
  }
  public V2HPAScalingRulesFluent.PoliciesNested<A> editFirstPolicy() {
    if (policies.size() == 0) throw new RuntimeException("Can't edit first policies. The list is empty.");
    return setNewPolicyLike(0, buildPolicy(0));
  }
  public V2HPAScalingRulesFluent.PoliciesNested<A> editLastPolicy() {
    int index = policies.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last policies. The list is empty.");
    return setNewPolicyLike(index, buildPolicy(index));
  }
  public V2HPAScalingRulesFluent.PoliciesNested<A> editMatchingPolicy(Predicate<V2HPAScalingPolicyBuilder> predicate) {
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
    V2HPAScalingRulesFluentImpl that = (V2HPAScalingRulesFluentImpl) o;
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
  class PoliciesNestedImpl<N> extends V2HPAScalingPolicyFluentImpl<V2HPAScalingRulesFluent.PoliciesNested<N>> implements V2HPAScalingRulesFluent.PoliciesNested<N>,Nested<N>{
    PoliciesNestedImpl(Integer index,V2HPAScalingPolicy item) {
      this.index = index;
      this.builder = new V2HPAScalingPolicyBuilder(this, item);
    }
    PoliciesNestedImpl() {
      this.index = -1;
      this.builder = new V2HPAScalingPolicyBuilder(this);
    }
    V2HPAScalingPolicyBuilder builder;
    Integer index;
    public N and() {
      return (N) V2HPAScalingRulesFluentImpl.this.setToPolicies(index,builder.build());
    }
    public N endPolicy() {
      return and();
    }
    
  }
  
}