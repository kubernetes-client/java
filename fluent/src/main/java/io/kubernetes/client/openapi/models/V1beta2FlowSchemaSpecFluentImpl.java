package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta2FlowSchemaSpecFluentImpl<A extends V1beta2FlowSchemaSpecFluent<A>> extends BaseFluent<A> implements V1beta2FlowSchemaSpecFluent<A>{
  public V1beta2FlowSchemaSpecFluentImpl() {
  }
  public V1beta2FlowSchemaSpecFluentImpl(V1beta2FlowSchemaSpec instance) {
    this.withDistinguisherMethod(instance.getDistinguisherMethod());

    this.withMatchingPrecedence(instance.getMatchingPrecedence());

    this.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());

    this.withRules(instance.getRules());

  }
  private V1beta2FlowDistinguisherMethodBuilder distinguisherMethod;
  private Integer matchingPrecedence;
  private V1beta2PriorityLevelConfigurationReferenceBuilder priorityLevelConfiguration;
  private ArrayList<V1beta2PolicyRulesWithSubjectsBuilder> rules;
  
  /**
   * This method has been deprecated, please use method buildDistinguisherMethod instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2FlowDistinguisherMethod getDistinguisherMethod() {
    return this.distinguisherMethod!=null ?this.distinguisherMethod.build():null;
  }
  public V1beta2FlowDistinguisherMethod buildDistinguisherMethod() {
    return this.distinguisherMethod!=null ?this.distinguisherMethod.build():null;
  }
  public A withDistinguisherMethod(V1beta2FlowDistinguisherMethod distinguisherMethod) {
    _visitables.get("distinguisherMethod").remove(this.distinguisherMethod);
    if (distinguisherMethod!=null){ this.distinguisherMethod= new V1beta2FlowDistinguisherMethodBuilder(distinguisherMethod); _visitables.get("distinguisherMethod").add(this.distinguisherMethod);} else { this.distinguisherMethod = null; _visitables.get("distinguisherMethod").remove(this.distinguisherMethod); } return (A) this;
  }
  public Boolean hasDistinguisherMethod() {
    return this.distinguisherMethod != null;
  }
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethod() {
    return new V1beta2FlowSchemaSpecFluentImpl.DistinguisherMethodNestedImpl();
  }
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethodLike(V1beta2FlowDistinguisherMethod item) {
    return new V1beta2FlowSchemaSpecFluentImpl.DistinguisherMethodNestedImpl(item);
  }
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> editDistinguisherMethod() {
    return withNewDistinguisherMethodLike(getDistinguisherMethod());
  }
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethod() {
    return withNewDistinguisherMethodLike(getDistinguisherMethod() != null ? getDistinguisherMethod(): new V1beta2FlowDistinguisherMethodBuilder().build());
  }
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethodLike(V1beta2FlowDistinguisherMethod item) {
    return withNewDistinguisherMethodLike(getDistinguisherMethod() != null ? getDistinguisherMethod(): item);
  }
  public Integer getMatchingPrecedence() {
    return this.matchingPrecedence;
  }
  public A withMatchingPrecedence(Integer matchingPrecedence) {
    this.matchingPrecedence=matchingPrecedence; return (A) this;
  }
  public Boolean hasMatchingPrecedence() {
    return this.matchingPrecedence != null;
  }
  
  /**
   * This method has been deprecated, please use method buildPriorityLevelConfiguration instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2PriorityLevelConfigurationReference getPriorityLevelConfiguration() {
    return this.priorityLevelConfiguration!=null ?this.priorityLevelConfiguration.build():null;
  }
  public V1beta2PriorityLevelConfigurationReference buildPriorityLevelConfiguration() {
    return this.priorityLevelConfiguration!=null ?this.priorityLevelConfiguration.build():null;
  }
  public A withPriorityLevelConfiguration(V1beta2PriorityLevelConfigurationReference priorityLevelConfiguration) {
    _visitables.get("priorityLevelConfiguration").remove(this.priorityLevelConfiguration);
    if (priorityLevelConfiguration!=null){ this.priorityLevelConfiguration= new V1beta2PriorityLevelConfigurationReferenceBuilder(priorityLevelConfiguration); _visitables.get("priorityLevelConfiguration").add(this.priorityLevelConfiguration);} else { this.priorityLevelConfiguration = null; _visitables.get("priorityLevelConfiguration").remove(this.priorityLevelConfiguration); } return (A) this;
  }
  public Boolean hasPriorityLevelConfiguration() {
    return this.priorityLevelConfiguration != null;
  }
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfiguration() {
    return new V1beta2FlowSchemaSpecFluentImpl.PriorityLevelConfigurationNestedImpl();
  }
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfigurationLike(V1beta2PriorityLevelConfigurationReference item) {
    return new V1beta2FlowSchemaSpecFluentImpl.PriorityLevelConfigurationNestedImpl(item);
  }
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editPriorityLevelConfiguration() {
    return withNewPriorityLevelConfigurationLike(getPriorityLevelConfiguration());
  }
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfiguration() {
    return withNewPriorityLevelConfigurationLike(getPriorityLevelConfiguration() != null ? getPriorityLevelConfiguration(): new V1beta2PriorityLevelConfigurationReferenceBuilder().build());
  }
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfigurationLike(V1beta2PriorityLevelConfigurationReference item) {
    return withNewPriorityLevelConfigurationLike(getPriorityLevelConfiguration() != null ? getPriorityLevelConfiguration(): item);
  }
  public A addToRules(Integer index,V1beta2PolicyRulesWithSubjects item) {
    if (this.rules == null) {this.rules = new ArrayList<V1beta2PolicyRulesWithSubjectsBuilder>();}
    V1beta2PolicyRulesWithSubjectsBuilder builder = new V1beta2PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
  }
  public A setToRules(Integer index,V1beta2PolicyRulesWithSubjects item) {
    if (this.rules == null) {this.rules = new ArrayList<V1beta2PolicyRulesWithSubjectsBuilder>();}
    V1beta2PolicyRulesWithSubjectsBuilder builder = new V1beta2PolicyRulesWithSubjectsBuilder(item);
    if (index < 0 || index >= _visitables.get("rules").size()) { _visitables.get("rules").add(builder); } else { _visitables.get("rules").set(index, builder);}
    if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
     return (A)this;
  }
  public A addToRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... items) {
    if (this.rules == null) {this.rules = new ArrayList<V1beta2PolicyRulesWithSubjectsBuilder>();}
    for (V1beta2PolicyRulesWithSubjects item : items) {V1beta2PolicyRulesWithSubjectsBuilder builder = new V1beta2PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  public A addAllToRules(Collection<V1beta2PolicyRulesWithSubjects> items) {
    if (this.rules == null) {this.rules = new ArrayList<V1beta2PolicyRulesWithSubjectsBuilder>();}
    for (V1beta2PolicyRulesWithSubjects item : items) {V1beta2PolicyRulesWithSubjectsBuilder builder = new V1beta2PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  public A removeFromRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... items) {
    for (V1beta2PolicyRulesWithSubjects item : items) {V1beta2PolicyRulesWithSubjectsBuilder builder = new V1beta2PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
  }
  public A removeAllFromRules(Collection<V1beta2PolicyRulesWithSubjects> items) {
    for (V1beta2PolicyRulesWithSubjects item : items) {V1beta2PolicyRulesWithSubjectsBuilder builder = new V1beta2PolicyRulesWithSubjectsBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromRules(Predicate<V1beta2PolicyRulesWithSubjectsBuilder> predicate) {
    if (rules == null) return (A) this;
    final Iterator<V1beta2PolicyRulesWithSubjectsBuilder> each = rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      V1beta2PolicyRulesWithSubjectsBuilder builder = each.next();
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
  public List<V1beta2PolicyRulesWithSubjects> getRules() {
    return rules != null ? build(rules) : null;
  }
  public List<V1beta2PolicyRulesWithSubjects> buildRules() {
    return rules != null ? build(rules) : null;
  }
  public V1beta2PolicyRulesWithSubjects buildRule(Integer index) {
    return this.rules.get(index).build();
  }
  public V1beta2PolicyRulesWithSubjects buildFirstRule() {
    return this.rules.get(0).build();
  }
  public V1beta2PolicyRulesWithSubjects buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  public V1beta2PolicyRulesWithSubjects buildMatchingRule(Predicate<V1beta2PolicyRulesWithSubjectsBuilder> predicate) {
    for (V1beta2PolicyRulesWithSubjectsBuilder item: rules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingRule(Predicate<V1beta2PolicyRulesWithSubjectsBuilder> predicate) {
    for (V1beta2PolicyRulesWithSubjectsBuilder item: rules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withRules(List<V1beta2PolicyRulesWithSubjects> rules) {
    if (this.rules != null) { _visitables.get("rules").removeAll(this.rules);}
    if (rules != null) {this.rules = new ArrayList(); for (V1beta2PolicyRulesWithSubjects item : rules){this.addToRules(item);}} else { this.rules = null;} return (A) this;
  }
  public A withRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... rules) {
    if (this.rules != null) {this.rules.clear();}
    if (rules != null) {for (V1beta2PolicyRulesWithSubjects item :rules){ this.addToRules(item);}} return (A) this;
  }
  public Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> addNewRule() {
    return new V1beta2FlowSchemaSpecFluentImpl.RulesNestedImpl();
  }
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> addNewRuleLike(V1beta2PolicyRulesWithSubjects item) {
    return new V1beta2FlowSchemaSpecFluentImpl.RulesNestedImpl(-1, item);
  }
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> setNewRuleLike(Integer index,V1beta2PolicyRulesWithSubjects item) {
    return new V1beta2FlowSchemaSpecFluentImpl.RulesNestedImpl(index, item);
  }
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> editRule(Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> editMatchingRule(Predicate<V1beta2PolicyRulesWithSubjectsBuilder> predicate) {
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
    V1beta2FlowSchemaSpecFluentImpl that = (V1beta2FlowSchemaSpecFluentImpl) o;
    if (distinguisherMethod != null ? !distinguisherMethod.equals(that.distinguisherMethod) :that.distinguisherMethod != null) return false;
    if (matchingPrecedence != null ? !matchingPrecedence.equals(that.matchingPrecedence) :that.matchingPrecedence != null) return false;
    if (priorityLevelConfiguration != null ? !priorityLevelConfiguration.equals(that.priorityLevelConfiguration) :that.priorityLevelConfiguration != null) return false;
    if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
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
  class DistinguisherMethodNestedImpl<N> extends V1beta2FlowDistinguisherMethodFluentImpl<V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<N>> implements V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<N>,Nested<N>{
    DistinguisherMethodNestedImpl(V1beta2FlowDistinguisherMethod item) {
      this.builder = new V1beta2FlowDistinguisherMethodBuilder(this, item);
    }
    DistinguisherMethodNestedImpl() {
      this.builder = new V1beta2FlowDistinguisherMethodBuilder(this);
    }
    V1beta2FlowDistinguisherMethodBuilder builder;
    public N and() {
      return (N) V1beta2FlowSchemaSpecFluentImpl.this.withDistinguisherMethod(builder.build());
    }
    public N endDistinguisherMethod() {
      return and();
    }
    
  }
  class PriorityLevelConfigurationNestedImpl<N> extends V1beta2PriorityLevelConfigurationReferenceFluentImpl<V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<N>> implements V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<N>,Nested<N>{
    PriorityLevelConfigurationNestedImpl(V1beta2PriorityLevelConfigurationReference item) {
      this.builder = new V1beta2PriorityLevelConfigurationReferenceBuilder(this, item);
    }
    PriorityLevelConfigurationNestedImpl() {
      this.builder = new V1beta2PriorityLevelConfigurationReferenceBuilder(this);
    }
    V1beta2PriorityLevelConfigurationReferenceBuilder builder;
    public N and() {
      return (N) V1beta2FlowSchemaSpecFluentImpl.this.withPriorityLevelConfiguration(builder.build());
    }
    public N endPriorityLevelConfiguration() {
      return and();
    }
    
  }
  class RulesNestedImpl<N> extends V1beta2PolicyRulesWithSubjectsFluentImpl<V1beta2FlowSchemaSpecFluent.RulesNested<N>> implements V1beta2FlowSchemaSpecFluent.RulesNested<N>,Nested<N>{
    RulesNestedImpl(Integer index,V1beta2PolicyRulesWithSubjects item) {
      this.index = index;
      this.builder = new V1beta2PolicyRulesWithSubjectsBuilder(this, item);
    }
    RulesNestedImpl() {
      this.index = -1;
      this.builder = new V1beta2PolicyRulesWithSubjectsBuilder(this);
    }
    V1beta2PolicyRulesWithSubjectsBuilder builder;
    Integer index;
    public N and() {
      return (N) V1beta2FlowSchemaSpecFluentImpl.this.setToRules(index,builder.build());
    }
    public N endRule() {
      return and();
    }
    
  }
  
}