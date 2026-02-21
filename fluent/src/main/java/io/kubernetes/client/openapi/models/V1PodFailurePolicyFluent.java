package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodFailurePolicyFluent<A extends io.kubernetes.client.openapi.models.V1PodFailurePolicyFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1PodFailurePolicyRuleBuilder> rules;

  public V1PodFailurePolicyFluent() {
  }
  
  public V1PodFailurePolicyFluent(V1PodFailurePolicy instance) {
    this.copyInstance(instance);
  }

  public A addAllToRules(Collection<V1PodFailurePolicyRule> items) {
    if (this.rules == null) {
      this.rules = new ArrayList();
    }
    for (V1PodFailurePolicyRule item : items) {
        V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);
        _visitables.get("rules").add(builder);
        this.rules.add(builder);
    }
    return (A) this;
  }
  
  public RulesNested<A> addNewRule() {
    return new RulesNested(-1, null);
  }
  
  public RulesNested<A> addNewRuleLike(V1PodFailurePolicyRule item) {
    return new RulesNested(-1, item);
  }
  
  public A addToRules(V1PodFailurePolicyRule... items) {
    if (this.rules == null) {
      this.rules = new ArrayList();
    }
    for (V1PodFailurePolicyRule item : items) {
        V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);
        _visitables.get("rules").add(builder);
        this.rules.add(builder);
    }
    return (A) this;
  }
  
  public A addToRules(int index,V1PodFailurePolicyRule item) {
    if (this.rules == null) {
      this.rules = new ArrayList();
    }
    V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);
    if (index < 0 || index >= rules.size()) {
        _visitables.get("rules").add(builder);
        rules.add(builder);
    } else {
        _visitables.get("rules").add(builder);
        rules.add(index, builder);
    }
    return (A) this;
  }
  
  public V1PodFailurePolicyRule buildFirstRule() {
    return this.rules.get(0).build();
  }
  
  public V1PodFailurePolicyRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  
  public V1PodFailurePolicyRule buildMatchingRule(Predicate<V1PodFailurePolicyRuleBuilder> predicate) {
      for (V1PodFailurePolicyRuleBuilder item : rules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1PodFailurePolicyRule buildRule(int index) {
    return this.rules.get(index).build();
  }
  
  public List<V1PodFailurePolicyRule> buildRules() {
    return this.rules != null ? build(rules) : null;
  }
  
  protected void copyInstance(V1PodFailurePolicy instance) {
    instance = instance != null ? instance : new V1PodFailurePolicy();
    if (instance != null) {
      this.withRules(instance.getRules());
    }
  }
  
  public RulesNested<A> editFirstRule() {
    if (rules.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "rules"));
    }
    return this.setNewRuleLike(0, this.buildRule(0));
  }
  
  public RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "rules"));
    }
    return this.setNewRuleLike(index, this.buildRule(index));
  }
  
  public RulesNested<A> editMatchingRule(Predicate<V1PodFailurePolicyRuleBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < rules.size();i++) {
      if (predicate.test(rules.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "rules"));
    }
    return this.setNewRuleLike(index, this.buildRule(index));
  }
  
  public RulesNested<A> editRule(int index) {
    if (rules.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "rules"));
    }
    return this.setNewRuleLike(index, this.buildRule(index));
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
    V1PodFailurePolicyFluent that = (V1PodFailurePolicyFluent) o;
    if (!(Objects.equals(rules, that.rules))) {
      return false;
    }
    return true;
  }
  
  public boolean hasMatchingRule(Predicate<V1PodFailurePolicyRuleBuilder> predicate) {
      for (V1PodFailurePolicyRuleBuilder item : rules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasRules() {
    return this.rules != null && !(this.rules.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(rules);
  }
  
  public A removeAllFromRules(Collection<V1PodFailurePolicyRule> items) {
    if (this.rules == null) {
      return (A) this;
    }
    for (V1PodFailurePolicyRule item : items) {
        V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);
        _visitables.get("rules").remove(builder);
        this.rules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromRules(V1PodFailurePolicyRule... items) {
    if (this.rules == null) {
      return (A) this;
    }
    for (V1PodFailurePolicyRule item : items) {
        V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);
        _visitables.get("rules").remove(builder);
        this.rules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromRules(Predicate<V1PodFailurePolicyRuleBuilder> predicate) {
    if (rules == null) {
      return (A) this;
    }
    Iterator<V1PodFailurePolicyRuleBuilder> each = rules.iterator();
    List visitables = _visitables.get("rules");
    while (each.hasNext()) {
        V1PodFailurePolicyRuleBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public RulesNested<A> setNewRuleLike(int index,V1PodFailurePolicyRule item) {
    return new RulesNested(index, item);
  }
  
  public A setToRules(int index,V1PodFailurePolicyRule item) {
    if (this.rules == null) {
      this.rules = new ArrayList();
    }
    V1PodFailurePolicyRuleBuilder builder = new V1PodFailurePolicyRuleBuilder(item);
    if (index < 0 || index >= rules.size()) {
        _visitables.get("rules").add(builder);
        rules.add(builder);
    } else {
        _visitables.get("rules").add(builder);
        rules.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(rules == null) && !(rules.isEmpty())) {
        sb.append("rules:");
        sb.append(rules);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withRules(List<V1PodFailurePolicyRule> rules) {
    if (this.rules != null) {
      this._visitables.get("rules").clear();
    }
    if (rules != null) {
        this.rules = new ArrayList();
        for (V1PodFailurePolicyRule item : rules) {
          this.addToRules(item);
        }
    } else {
      this.rules = null;
    }
    return (A) this;
  }
  
  public A withRules(V1PodFailurePolicyRule... rules) {
    if (this.rules != null) {
        this.rules.clear();
        _visitables.remove("rules");
    }
    if (rules != null) {
      for (V1PodFailurePolicyRule item : rules) {
        this.addToRules(item);
      }
    }
    return (A) this;
  }
  public class RulesNested<N> extends V1PodFailurePolicyRuleFluent<RulesNested<N>> implements Nested<N>{
  
    V1PodFailurePolicyRuleBuilder builder;
    int index;
  
    RulesNested(int index,V1PodFailurePolicyRule item) {
      this.index = index;
      this.builder = new V1PodFailurePolicyRuleBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PodFailurePolicyFluent.this.setToRules(index, builder.build());
    }
    
    public N endRule() {
      return and();
    }
    
  }
}