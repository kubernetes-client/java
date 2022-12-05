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
  public class V1PodFailurePolicyFluentImpl<A extends V1PodFailurePolicyFluent<A>> extends BaseFluent<A> implements V1PodFailurePolicyFluent<A>{
  public V1PodFailurePolicyFluentImpl() {
  }
  public V1PodFailurePolicyFluentImpl(V1PodFailurePolicy instance) {
    this.withRules(instance.getRules());

  }
  private ArrayList<V1PodFailurePolicyRuleBuilder> rules;
  public A addToRules(Integer index,V1PodFailurePolicyRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1PodFailurePolicyRuleBuilder>();}
    V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);_visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
  }
  public A setToRules(Integer index,V1PodFailurePolicyRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1PodFailurePolicyRuleBuilder>();}
    V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("rules").size()) { _visitables.get("rules").add(builder); } else { _visitables.get("rules").set(index, builder);}
    if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
     return (A)this;
  }
  public A addToRules(io.kubernetes.client.openapi.models.V1PodFailurePolicyRule... items) {
    if (this.rules == null) {this.rules = new ArrayList<V1PodFailurePolicyRuleBuilder>();}
    for (V1PodFailurePolicyRule item : items) {V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  public A addAllToRules(Collection<V1PodFailurePolicyRule> items) {
    if (this.rules == null) {this.rules = new ArrayList<V1PodFailurePolicyRuleBuilder>();}
    for (V1PodFailurePolicyRule item : items) {V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  public A removeFromRules(io.kubernetes.client.openapi.models.V1PodFailurePolicyRule... items) {
    for (V1PodFailurePolicyRule item : items) {V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
  }
  public A removeAllFromRules(Collection<V1PodFailurePolicyRule> items) {
    for (V1PodFailurePolicyRule item : items) {V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromRules(Predicate<V1PodFailurePolicyRuleBuilder> predicate) {
    if (rules == null) return (A) this;
    final Iterator<V1PodFailurePolicyRuleBuilder> each = rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      V1PodFailurePolicyRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodFailurePolicyRule> getRules() {
    return rules != null ? build(rules) : null;
  }
  public List<V1PodFailurePolicyRule> buildRules() {
    return rules != null ? build(rules) : null;
  }
  public V1PodFailurePolicyRule buildRule(Integer index) {
    return this.rules.get(index).build();
  }
  public V1PodFailurePolicyRule buildFirstRule() {
    return this.rules.get(0).build();
  }
  public V1PodFailurePolicyRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  public V1PodFailurePolicyRule buildMatchingRule(Predicate<V1PodFailurePolicyRuleBuilder> predicate) {
    for (V1PodFailurePolicyRuleBuilder item: rules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingRule(Predicate<V1PodFailurePolicyRuleBuilder> predicate) {
    for (V1PodFailurePolicyRuleBuilder item: rules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withRules(List<V1PodFailurePolicyRule> rules) {
    if (this.rules != null) { _visitables.get("rules").removeAll(this.rules);}
    if (rules != null) {this.rules = new ArrayList(); for (V1PodFailurePolicyRule item : rules){this.addToRules(item);}} else { this.rules = null;} return (A) this;
  }
  public A withRules(io.kubernetes.client.openapi.models.V1PodFailurePolicyRule... rules) {
    if (this.rules != null) {this.rules.clear();}
    if (rules != null) {for (V1PodFailurePolicyRule item :rules){ this.addToRules(item);}} return (A) this;
  }
  public Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }
  public V1PodFailurePolicyFluent.RulesNested<A> addNewRule() {
    return new V1PodFailurePolicyFluentImpl.RulesNestedImpl();
  }
  public V1PodFailurePolicyFluent.RulesNested<A> addNewRuleLike(V1PodFailurePolicyRule item) {
    return new V1PodFailurePolicyFluentImpl.RulesNestedImpl(-1, item);
  }
  public V1PodFailurePolicyFluent.RulesNested<A> setNewRuleLike(Integer index,V1PodFailurePolicyRule item) {
    return new V1PodFailurePolicyFluentImpl.RulesNestedImpl(index, item);
  }
  public V1PodFailurePolicyFluent.RulesNested<A> editRule(Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1PodFailurePolicyFluent.RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }
  public V1PodFailurePolicyFluent.RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1PodFailurePolicyFluent.RulesNested<A> editMatchingRule(Predicate<V1PodFailurePolicyRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<rules.size();i++) { 
    if (predicate.test(rules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
    return setNewRuleLike(index, buildRule(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodFailurePolicyFluentImpl that = (V1PodFailurePolicyFluentImpl) o;
    if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(rules,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (rules != null && !rules.isEmpty()) { sb.append("rules:"); sb.append(rules); }
    sb.append("}");
    return sb.toString();
  }
  class RulesNestedImpl<N> extends V1PodFailurePolicyRuleFluentImpl<V1PodFailurePolicyFluent.RulesNested<N>> implements V1PodFailurePolicyFluent.RulesNested<N>,Nested<N>{
    RulesNestedImpl(Integer index,V1PodFailurePolicyRule item) {
      this.index = index;
      this.builder = new V1PodFailurePolicyRuleBuilder(this, item);
    }
    RulesNestedImpl() {
      this.index = -1;
      this.builder = new V1PodFailurePolicyRuleBuilder(this);
    }
    V1PodFailurePolicyRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodFailurePolicyFluentImpl.this.setToRules(index,builder.build());
    }
    public N endRule() {
      return and();
    }
    
  }
  
}