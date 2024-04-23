package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SuccessPolicyFluent<A extends V1SuccessPolicyFluent<A>> extends BaseFluent<A>{
  public V1SuccessPolicyFluent() {
  }
  
  public V1SuccessPolicyFluent(V1SuccessPolicy instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1SuccessPolicyRuleBuilder> rules;
  
  protected void copyInstance(V1SuccessPolicy instance) {
    instance = (instance != null ? instance : new V1SuccessPolicy());
    if (instance != null) {
          this.withRules(instance.getRules());
        }
  }
  
  public A addToRules(int index,V1SuccessPolicyRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1SuccessPolicyRuleBuilder>();}
    V1SuccessPolicyRuleBuilder builder = new V1SuccessPolicyRuleBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").add(index, builder); rules.add(index, builder);}
    return (A)this;
  }
  
  public A setToRules(int index,V1SuccessPolicyRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1SuccessPolicyRuleBuilder>();}
    V1SuccessPolicyRuleBuilder builder = new V1SuccessPolicyRuleBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").set(index, builder); rules.set(index, builder);}
    return (A)this;
  }
  
  public A addToRules(io.kubernetes.client.openapi.models.V1SuccessPolicyRule... items) {
    if (this.rules == null) {this.rules = new ArrayList<V1SuccessPolicyRuleBuilder>();}
    for (V1SuccessPolicyRule item : items) {V1SuccessPolicyRuleBuilder builder = new V1SuccessPolicyRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  
  public A addAllToRules(Collection<V1SuccessPolicyRule> items) {
    if (this.rules == null) {this.rules = new ArrayList<V1SuccessPolicyRuleBuilder>();}
    for (V1SuccessPolicyRule item : items) {V1SuccessPolicyRuleBuilder builder = new V1SuccessPolicyRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  
  public A removeFromRules(io.kubernetes.client.openapi.models.V1SuccessPolicyRule... items) {
    if (this.rules == null) return (A)this;
    for (V1SuccessPolicyRule item : items) {V1SuccessPolicyRuleBuilder builder = new V1SuccessPolicyRuleBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRules(Collection<V1SuccessPolicyRule> items) {
    if (this.rules == null) return (A)this;
    for (V1SuccessPolicyRule item : items) {V1SuccessPolicyRuleBuilder builder = new V1SuccessPolicyRuleBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromRules(Predicate<V1SuccessPolicyRuleBuilder> predicate) {
    if (rules == null) return (A) this;
    final Iterator<V1SuccessPolicyRuleBuilder> each = rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      V1SuccessPolicyRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1SuccessPolicyRule> buildRules() {
    return this.rules != null ? build(rules) : null;
  }
  
  public V1SuccessPolicyRule buildRule(int index) {
    return this.rules.get(index).build();
  }
  
  public V1SuccessPolicyRule buildFirstRule() {
    return this.rules.get(0).build();
  }
  
  public V1SuccessPolicyRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  
  public V1SuccessPolicyRule buildMatchingRule(Predicate<V1SuccessPolicyRuleBuilder> predicate) {
      for (V1SuccessPolicyRuleBuilder item : rules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRule(Predicate<V1SuccessPolicyRuleBuilder> predicate) {
      for (V1SuccessPolicyRuleBuilder item : rules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRules(List<V1SuccessPolicyRule> rules) {
    if (this.rules != null) {
      this._visitables.get("rules").clear();
    }
    if (rules != null) {
        this.rules = new ArrayList();
        for (V1SuccessPolicyRule item : rules) {
          this.addToRules(item);
        }
    } else {
      this.rules = null;
    }
    return (A) this;
  }
  
  public A withRules(io.kubernetes.client.openapi.models.V1SuccessPolicyRule... rules) {
    if (this.rules != null) {
        this.rules.clear();
        _visitables.remove("rules");
    }
    if (rules != null) {
      for (V1SuccessPolicyRule item : rules) {
        this.addToRules(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRules() {
    return this.rules != null && !this.rules.isEmpty();
  }
  
  public RulesNested<A> addNewRule() {
    return new RulesNested(-1, null);
  }
  
  public RulesNested<A> addNewRuleLike(V1SuccessPolicyRule item) {
    return new RulesNested(-1, item);
  }
  
  public RulesNested<A> setNewRuleLike(int index,V1SuccessPolicyRule item) {
    return new RulesNested(index, item);
  }
  
  public RulesNested<A> editRule(int index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }
  
  public RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }
  
  public RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }
  
  public RulesNested<A> editMatchingRule(Predicate<V1SuccessPolicyRuleBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1SuccessPolicyFluent that = (V1SuccessPolicyFluent) o;
    if (!java.util.Objects.equals(rules, that.rules)) return false;
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
  public class RulesNested<N> extends V1SuccessPolicyRuleFluent<RulesNested<N>> implements Nested<N>{
    RulesNested(int index,V1SuccessPolicyRule item) {
      this.index = index;
      this.builder = new V1SuccessPolicyRuleBuilder(this, item);
    }
    V1SuccessPolicyRuleBuilder builder;
    int index;
    
    public N and() {
      return (N) V1SuccessPolicyFluent.this.setToRules(index,builder.build());
    }
    
    public N endRule() {
      return and();
    }
    
  
  }

}