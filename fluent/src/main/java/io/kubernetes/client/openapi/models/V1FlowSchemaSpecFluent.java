package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1FlowSchemaSpecFluent<A extends V1FlowSchemaSpecFluent<A>> extends BaseFluent<A>{
  public V1FlowSchemaSpecFluent() {
  }
  
  public V1FlowSchemaSpecFluent(V1FlowSchemaSpec instance) {
    this.copyInstance(instance);
  }
  private V1FlowDistinguisherMethodBuilder distinguisherMethod;
  private Integer matchingPrecedence;
  private V1PriorityLevelConfigurationReferenceBuilder priorityLevelConfiguration;
  private ArrayList<V1PolicyRulesWithSubjectsBuilder> rules;
  
  protected void copyInstance(V1FlowSchemaSpec instance) {
    instance = (instance != null ? instance : new V1FlowSchemaSpec());
    if (instance != null) {
          this.withDistinguisherMethod(instance.getDistinguisherMethod());
          this.withMatchingPrecedence(instance.getMatchingPrecedence());
          this.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());
          this.withRules(instance.getRules());
        }
  }
  
  public V1FlowDistinguisherMethod buildDistinguisherMethod() {
    return this.distinguisherMethod != null ? this.distinguisherMethod.build() : null;
  }
  
  public A withDistinguisherMethod(V1FlowDistinguisherMethod distinguisherMethod) {
    this._visitables.remove("distinguisherMethod");
    if (distinguisherMethod != null) {
        this.distinguisherMethod = new V1FlowDistinguisherMethodBuilder(distinguisherMethod);
        this._visitables.get("distinguisherMethod").add(this.distinguisherMethod);
    } else {
        this.distinguisherMethod = null;
        this._visitables.get("distinguisherMethod").remove(this.distinguisherMethod);
    }
    return (A) this;
  }
  
  public boolean hasDistinguisherMethod() {
    return this.distinguisherMethod != null;
  }
  
  public DistinguisherMethodNested<A> withNewDistinguisherMethod() {
    return new DistinguisherMethodNested(null);
  }
  
  public DistinguisherMethodNested<A> withNewDistinguisherMethodLike(V1FlowDistinguisherMethod item) {
    return new DistinguisherMethodNested(item);
  }
  
  public DistinguisherMethodNested<A> editDistinguisherMethod() {
    return withNewDistinguisherMethodLike(java.util.Optional.ofNullable(buildDistinguisherMethod()).orElse(null));
  }
  
  public DistinguisherMethodNested<A> editOrNewDistinguisherMethod() {
    return withNewDistinguisherMethodLike(java.util.Optional.ofNullable(buildDistinguisherMethod()).orElse(new V1FlowDistinguisherMethodBuilder().build()));
  }
  
  public DistinguisherMethodNested<A> editOrNewDistinguisherMethodLike(V1FlowDistinguisherMethod item) {
    return withNewDistinguisherMethodLike(java.util.Optional.ofNullable(buildDistinguisherMethod()).orElse(item));
  }
  
  public Integer getMatchingPrecedence() {
    return this.matchingPrecedence;
  }
  
  public A withMatchingPrecedence(Integer matchingPrecedence) {
    this.matchingPrecedence = matchingPrecedence;
    return (A) this;
  }
  
  public boolean hasMatchingPrecedence() {
    return this.matchingPrecedence != null;
  }
  
  public V1PriorityLevelConfigurationReference buildPriorityLevelConfiguration() {
    return this.priorityLevelConfiguration != null ? this.priorityLevelConfiguration.build() : null;
  }
  
  public A withPriorityLevelConfiguration(V1PriorityLevelConfigurationReference priorityLevelConfiguration) {
    this._visitables.remove("priorityLevelConfiguration");
    if (priorityLevelConfiguration != null) {
        this.priorityLevelConfiguration = new V1PriorityLevelConfigurationReferenceBuilder(priorityLevelConfiguration);
        this._visitables.get("priorityLevelConfiguration").add(this.priorityLevelConfiguration);
    } else {
        this.priorityLevelConfiguration = null;
        this._visitables.get("priorityLevelConfiguration").remove(this.priorityLevelConfiguration);
    }
    return (A) this;
  }
  
  public boolean hasPriorityLevelConfiguration() {
    return this.priorityLevelConfiguration != null;
  }
  
  public PriorityLevelConfigurationNested<A> withNewPriorityLevelConfiguration() {
    return new PriorityLevelConfigurationNested(null);
  }
  
  public PriorityLevelConfigurationNested<A> withNewPriorityLevelConfigurationLike(V1PriorityLevelConfigurationReference item) {
    return new PriorityLevelConfigurationNested(item);
  }
  
  public PriorityLevelConfigurationNested<A> editPriorityLevelConfiguration() {
    return withNewPriorityLevelConfigurationLike(java.util.Optional.ofNullable(buildPriorityLevelConfiguration()).orElse(null));
  }
  
  public PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfiguration() {
    return withNewPriorityLevelConfigurationLike(java.util.Optional.ofNullable(buildPriorityLevelConfiguration()).orElse(new V1PriorityLevelConfigurationReferenceBuilder().build()));
  }
  
  public PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfigurationLike(V1PriorityLevelConfigurationReference item) {
    return withNewPriorityLevelConfigurationLike(java.util.Optional.ofNullable(buildPriorityLevelConfiguration()).orElse(item));
  }
  
  public A addToRules(int index,V1PolicyRulesWithSubjects item) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRulesWithSubjectsBuilder>();}
    V1PolicyRulesWithSubjectsBuilder builder = new V1PolicyRulesWithSubjectsBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").add(index, builder); rules.add(index, builder);}
    return (A)this;
  }
  
  public A setToRules(int index,V1PolicyRulesWithSubjects item) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRulesWithSubjectsBuilder>();}
    V1PolicyRulesWithSubjectsBuilder builder = new V1PolicyRulesWithSubjectsBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").set(index, builder); rules.set(index, builder);}
    return (A)this;
  }
  
  public A addToRules(io.kubernetes.client.openapi.models.V1PolicyRulesWithSubjects... items) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRulesWithSubjectsBuilder>();}
    for (V1PolicyRulesWithSubjects item : items) {V1PolicyRulesWithSubjectsBuilder builder = new V1PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  
  public A addAllToRules(Collection<V1PolicyRulesWithSubjects> items) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRulesWithSubjectsBuilder>();}
    for (V1PolicyRulesWithSubjects item : items) {V1PolicyRulesWithSubjectsBuilder builder = new V1PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  
  public A removeFromRules(io.kubernetes.client.openapi.models.V1PolicyRulesWithSubjects... items) {
    if (this.rules == null) return (A)this;
    for (V1PolicyRulesWithSubjects item : items) {V1PolicyRulesWithSubjectsBuilder builder = new V1PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRules(Collection<V1PolicyRulesWithSubjects> items) {
    if (this.rules == null) return (A)this;
    for (V1PolicyRulesWithSubjects item : items) {V1PolicyRulesWithSubjectsBuilder builder = new V1PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromRules(Predicate<V1PolicyRulesWithSubjectsBuilder> predicate) {
    if (rules == null) return (A) this;
    final Iterator<V1PolicyRulesWithSubjectsBuilder> each = rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      V1PolicyRulesWithSubjectsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1PolicyRulesWithSubjects> buildRules() {
    return this.rules != null ? build(rules) : null;
  }
  
  public V1PolicyRulesWithSubjects buildRule(int index) {
    return this.rules.get(index).build();
  }
  
  public V1PolicyRulesWithSubjects buildFirstRule() {
    return this.rules.get(0).build();
  }
  
  public V1PolicyRulesWithSubjects buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  
  public V1PolicyRulesWithSubjects buildMatchingRule(Predicate<V1PolicyRulesWithSubjectsBuilder> predicate) {
      for (V1PolicyRulesWithSubjectsBuilder item : rules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRule(Predicate<V1PolicyRulesWithSubjectsBuilder> predicate) {
      for (V1PolicyRulesWithSubjectsBuilder item : rules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRules(List<V1PolicyRulesWithSubjects> rules) {
    if (this.rules != null) {
      this._visitables.get("rules").clear();
    }
    if (rules != null) {
        this.rules = new ArrayList();
        for (V1PolicyRulesWithSubjects item : rules) {
          this.addToRules(item);
        }
    } else {
      this.rules = null;
    }
    return (A) this;
  }
  
  public A withRules(io.kubernetes.client.openapi.models.V1PolicyRulesWithSubjects... rules) {
    if (this.rules != null) {
        this.rules.clear();
        _visitables.remove("rules");
    }
    if (rules != null) {
      for (V1PolicyRulesWithSubjects item : rules) {
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
  
  public RulesNested<A> addNewRuleLike(V1PolicyRulesWithSubjects item) {
    return new RulesNested(-1, item);
  }
  
  public RulesNested<A> setNewRuleLike(int index,V1PolicyRulesWithSubjects item) {
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
  
  public RulesNested<A> editMatchingRule(Predicate<V1PolicyRulesWithSubjectsBuilder> predicate) {
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
    V1FlowSchemaSpecFluent that = (V1FlowSchemaSpecFluent) o;
    if (!java.util.Objects.equals(distinguisherMethod, that.distinguisherMethod)) return false;
    if (!java.util.Objects.equals(matchingPrecedence, that.matchingPrecedence)) return false;
    if (!java.util.Objects.equals(priorityLevelConfiguration, that.priorityLevelConfiguration)) return false;
    if (!java.util.Objects.equals(rules, that.rules)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(distinguisherMethod,  matchingPrecedence,  priorityLevelConfiguration,  rules,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (distinguisherMethod != null) { sb.append("distinguisherMethod:"); sb.append(distinguisherMethod + ","); }
    if (matchingPrecedence != null) { sb.append("matchingPrecedence:"); sb.append(matchingPrecedence + ","); }
    if (priorityLevelConfiguration != null) { sb.append("priorityLevelConfiguration:"); sb.append(priorityLevelConfiguration + ","); }
    if (rules != null && !rules.isEmpty()) { sb.append("rules:"); sb.append(rules); }
    sb.append("}");
    return sb.toString();
  }
  public class DistinguisherMethodNested<N> extends V1FlowDistinguisherMethodFluent<DistinguisherMethodNested<N>> implements Nested<N>{
    DistinguisherMethodNested(V1FlowDistinguisherMethod item) {
      this.builder = new V1FlowDistinguisherMethodBuilder(this, item);
    }
    V1FlowDistinguisherMethodBuilder builder;
    
    public N and() {
      return (N) V1FlowSchemaSpecFluent.this.withDistinguisherMethod(builder.build());
    }
    
    public N endDistinguisherMethod() {
      return and();
    }
    
  
  }
  public class PriorityLevelConfigurationNested<N> extends V1PriorityLevelConfigurationReferenceFluent<PriorityLevelConfigurationNested<N>> implements Nested<N>{
    PriorityLevelConfigurationNested(V1PriorityLevelConfigurationReference item) {
      this.builder = new V1PriorityLevelConfigurationReferenceBuilder(this, item);
    }
    V1PriorityLevelConfigurationReferenceBuilder builder;
    
    public N and() {
      return (N) V1FlowSchemaSpecFluent.this.withPriorityLevelConfiguration(builder.build());
    }
    
    public N endPriorityLevelConfiguration() {
      return and();
    }
    
  
  }
  public class RulesNested<N> extends V1PolicyRulesWithSubjectsFluent<RulesNested<N>> implements Nested<N>{
    RulesNested(int index,V1PolicyRulesWithSubjects item) {
      this.index = index;
      this.builder = new V1PolicyRulesWithSubjectsBuilder(this, item);
    }
    V1PolicyRulesWithSubjectsBuilder builder;
    int index;
    
    public N and() {
      return (N) V1FlowSchemaSpecFluent.this.setToRules(index,builder.build());
    }
    
    public N endRule() {
      return and();
    }
    
  
  }

}