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
  public class V1SubjectRulesReviewStatusFluentImpl<A extends V1SubjectRulesReviewStatusFluent<A>> extends BaseFluent<A> implements V1SubjectRulesReviewStatusFluent<A>{
  public V1SubjectRulesReviewStatusFluentImpl() {
  }
  public V1SubjectRulesReviewStatusFluentImpl(V1SubjectRulesReviewStatus instance) {
    this.withEvaluationError(instance.getEvaluationError());

    this.withIncomplete(instance.getIncomplete());

    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());

  }
  private String evaluationError;
  private Boolean incomplete;
  private ArrayList<V1NonResourceRuleBuilder> nonResourceRules;
  private ArrayList<V1ResourceRuleBuilder> resourceRules;
  public String getEvaluationError() {
    return this.evaluationError;
  }
  public A withEvaluationError(String evaluationError) {
    this.evaluationError=evaluationError; return (A) this;
  }
  public Boolean hasEvaluationError() {
    return this.evaluationError != null;
  }
  public Boolean getIncomplete() {
    return this.incomplete;
  }
  public A withIncomplete(Boolean incomplete) {
    this.incomplete=incomplete; return (A) this;
  }
  public Boolean hasIncomplete() {
    return this.incomplete != null;
  }
  public A addToNonResourceRules(Integer index,V1NonResourceRule item) {
    if (this.nonResourceRules == null) {this.nonResourceRules = new ArrayList<V1NonResourceRuleBuilder>();}
    V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").add(index >= 0 ? index : _visitables.get("nonResourceRules").size(), builder);this.nonResourceRules.add(index >= 0 ? index : nonResourceRules.size(), builder); return (A)this;
  }
  public A setToNonResourceRules(Integer index,V1NonResourceRule item) {
    if (this.nonResourceRules == null) {this.nonResourceRules = new ArrayList<V1NonResourceRuleBuilder>();}
    V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("nonResourceRules").size()) { _visitables.get("nonResourceRules").add(builder); } else { _visitables.get("nonResourceRules").set(index, builder);}
    if (index < 0 || index >= nonResourceRules.size()) { nonResourceRules.add(builder); } else { nonResourceRules.set(index, builder);}
     return (A)this;
  }
  public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... items) {
    if (this.nonResourceRules == null) {this.nonResourceRules = new ArrayList<V1NonResourceRuleBuilder>();}
    for (V1NonResourceRule item : items) {V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").add(builder);this.nonResourceRules.add(builder);} return (A)this;
  }
  public A addAllToNonResourceRules(Collection<V1NonResourceRule> items) {
    if (this.nonResourceRules == null) {this.nonResourceRules = new ArrayList<V1NonResourceRuleBuilder>();}
    for (V1NonResourceRule item : items) {V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").add(builder);this.nonResourceRules.add(builder);} return (A)this;
  }
  public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... items) {
    for (V1NonResourceRule item : items) {V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").remove(builder);if (this.nonResourceRules != null) {this.nonResourceRules.remove(builder);}} return (A)this;
  }
  public A removeAllFromNonResourceRules(Collection<V1NonResourceRule> items) {
    for (V1NonResourceRule item : items) {V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").remove(builder);if (this.nonResourceRules != null) {this.nonResourceRules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromNonResourceRules(Predicate<V1NonResourceRuleBuilder> predicate) {
    if (nonResourceRules == null) return (A) this;
    final Iterator<V1NonResourceRuleBuilder> each = nonResourceRules.iterator();
    final List visitables = _visitables.get("nonResourceRules");
    while (each.hasNext()) {
      V1NonResourceRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildNonResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NonResourceRule> getNonResourceRules() {
    return nonResourceRules != null ? build(nonResourceRules) : null;
  }
  public List<V1NonResourceRule> buildNonResourceRules() {
    return nonResourceRules != null ? build(nonResourceRules) : null;
  }
  public V1NonResourceRule buildNonResourceRule(Integer index) {
    return this.nonResourceRules.get(index).build();
  }
  public V1NonResourceRule buildFirstNonResourceRule() {
    return this.nonResourceRules.get(0).build();
  }
  public V1NonResourceRule buildLastNonResourceRule() {
    return this.nonResourceRules.get(nonResourceRules.size() - 1).build();
  }
  public V1NonResourceRule buildMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate) {
    for (V1NonResourceRuleBuilder item: nonResourceRules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate) {
    for (V1NonResourceRuleBuilder item: nonResourceRules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNonResourceRules(List<V1NonResourceRule> nonResourceRules) {
    if (this.nonResourceRules != null) { _visitables.get("nonResourceRules").removeAll(this.nonResourceRules);}
    if (nonResourceRules != null) {this.nonResourceRules = new ArrayList(); for (V1NonResourceRule item : nonResourceRules){this.addToNonResourceRules(item);}} else { this.nonResourceRules = null;} return (A) this;
  }
  public A withNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... nonResourceRules) {
    if (this.nonResourceRules != null) {this.nonResourceRules.clear();}
    if (nonResourceRules != null) {for (V1NonResourceRule item :nonResourceRules){ this.addToNonResourceRules(item);}} return (A) this;
  }
  public Boolean hasNonResourceRules() {
    return nonResourceRules != null && !nonResourceRules.isEmpty();
  }
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRule() {
    return new V1SubjectRulesReviewStatusFluentImpl.NonResourceRulesNestedImpl();
  }
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(V1NonResourceRule item) {
    return new V1SubjectRulesReviewStatusFluentImpl.NonResourceRulesNestedImpl(-1, item);
  }
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(Integer index,V1NonResourceRule item) {
    return new V1SubjectRulesReviewStatusFluentImpl.NonResourceRulesNestedImpl(index, item);
  }
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editNonResourceRule(Integer index) {
    if (nonResourceRules.size() <= index) throw new RuntimeException("Can't edit nonResourceRules. Index exceeds size.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editFirstNonResourceRule() {
    if (nonResourceRules.size() == 0) throw new RuntimeException("Can't edit first nonResourceRules. The list is empty.");
    return setNewNonResourceRuleLike(0, buildNonResourceRule(0));
  }
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editLastNonResourceRule() {
    int index = nonResourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last nonResourceRules. The list is empty.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<nonResourceRules.size();i++) { 
    if (predicate.test(nonResourceRules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching nonResourceRules. No match found.");
    return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
  }
  public A addToResourceRules(Integer index,V1ResourceRule item) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1ResourceRuleBuilder>();}
    V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);_visitables.get("resourceRules").add(index >= 0 ? index : _visitables.get("resourceRules").size(), builder);this.resourceRules.add(index >= 0 ? index : resourceRules.size(), builder); return (A)this;
  }
  public A setToResourceRules(Integer index,V1ResourceRule item) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1ResourceRuleBuilder>();}
    V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("resourceRules").size()) { _visitables.get("resourceRules").add(builder); } else { _visitables.get("resourceRules").set(index, builder);}
    if (index < 0 || index >= resourceRules.size()) { resourceRules.add(builder); } else { resourceRules.set(index, builder);}
     return (A)this;
  }
  public A addToResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1ResourceRuleBuilder>();}
    for (V1ResourceRule item : items) {V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
  }
  public A addAllToResourceRules(Collection<V1ResourceRule> items) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1ResourceRuleBuilder>();}
    for (V1ResourceRule item : items) {V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
  }
  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items) {
    for (V1ResourceRule item : items) {V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
  }
  public A removeAllFromResourceRules(Collection<V1ResourceRule> items) {
    for (V1ResourceRule item : items) {V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromResourceRules(Predicate<V1ResourceRuleBuilder> predicate) {
    if (resourceRules == null) return (A) this;
    final Iterator<V1ResourceRuleBuilder> each = resourceRules.iterator();
    final List visitables = _visitables.get("resourceRules");
    while (each.hasNext()) {
      V1ResourceRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ResourceRule> getResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }
  public List<V1ResourceRule> buildResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }
  public V1ResourceRule buildResourceRule(Integer index) {
    return this.resourceRules.get(index).build();
  }
  public V1ResourceRule buildFirstResourceRule() {
    return this.resourceRules.get(0).build();
  }
  public V1ResourceRule buildLastResourceRule() {
    return this.resourceRules.get(resourceRules.size() - 1).build();
  }
  public V1ResourceRule buildMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate) {
    for (V1ResourceRuleBuilder item: resourceRules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate) {
    for (V1ResourceRuleBuilder item: resourceRules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResourceRules(List<V1ResourceRule> resourceRules) {
    if (this.resourceRules != null) { _visitables.get("resourceRules").removeAll(this.resourceRules);}
    if (resourceRules != null) {this.resourceRules = new ArrayList(); for (V1ResourceRule item : resourceRules){this.addToResourceRules(item);}} else { this.resourceRules = null;} return (A) this;
  }
  public A withResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... resourceRules) {
    if (this.resourceRules != null) {this.resourceRules.clear();}
    if (resourceRules != null) {for (V1ResourceRule item :resourceRules){ this.addToResourceRules(item);}} return (A) this;
  }
  public Boolean hasResourceRules() {
    return resourceRules != null && !resourceRules.isEmpty();
  }
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRule() {
    return new V1SubjectRulesReviewStatusFluentImpl.ResourceRulesNestedImpl();
  }
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRuleLike(V1ResourceRule item) {
    return new V1SubjectRulesReviewStatusFluentImpl.ResourceRulesNestedImpl(-1, item);
  }
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> setNewResourceRuleLike(Integer index,V1ResourceRule item) {
    return new V1SubjectRulesReviewStatusFluentImpl.ResourceRulesNestedImpl(index, item);
  }
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editResourceRule(Integer index) {
    if (resourceRules.size() <= index) throw new RuntimeException("Can't edit resourceRules. Index exceeds size.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editFirstResourceRule() {
    if (resourceRules.size() == 0) throw new RuntimeException("Can't edit first resourceRules. The list is empty.");
    return setNewResourceRuleLike(0, buildResourceRule(0));
  }
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editLastResourceRule() {
    int index = resourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceRules. The list is empty.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resourceRules.size();i++) { 
    if (predicate.test(resourceRules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resourceRules. No match found.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SubjectRulesReviewStatusFluentImpl that = (V1SubjectRulesReviewStatusFluentImpl) o;
    if (evaluationError != null ? !evaluationError.equals(that.evaluationError) :that.evaluationError != null) return false;
    if (incomplete != null ? !incomplete.equals(that.incomplete) :that.incomplete != null) return false;
    if (nonResourceRules != null ? !nonResourceRules.equals(that.nonResourceRules) :that.nonResourceRules != null) return false;
    if (resourceRules != null ? !resourceRules.equals(that.resourceRules) :that.resourceRules != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(evaluationError,  incomplete,  nonResourceRules,  resourceRules,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (evaluationError != null) { sb.append("evaluationError:"); sb.append(evaluationError + ","); }
    if (incomplete != null) { sb.append("incomplete:"); sb.append(incomplete + ","); }
    if (nonResourceRules != null && !nonResourceRules.isEmpty()) { sb.append("nonResourceRules:"); sb.append(nonResourceRules + ","); }
    if (resourceRules != null && !resourceRules.isEmpty()) { sb.append("resourceRules:"); sb.append(resourceRules); }
    sb.append("}");
    return sb.toString();
  }
  public A withIncomplete() {
    return withIncomplete(true);
  }
  class NonResourceRulesNestedImpl<N> extends V1NonResourceRuleFluentImpl<V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<N>> implements V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<N>,Nested<N>{
    NonResourceRulesNestedImpl(Integer index,V1NonResourceRule item) {
      this.index = index;
      this.builder = new V1NonResourceRuleBuilder(this, item);
    }
    NonResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new V1NonResourceRuleBuilder(this);
    }
    V1NonResourceRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1SubjectRulesReviewStatusFluentImpl.this.setToNonResourceRules(index,builder.build());
    }
    public N endNonResourceRule() {
      return and();
    }
    
  }
  class ResourceRulesNestedImpl<N> extends V1ResourceRuleFluentImpl<V1SubjectRulesReviewStatusFluent.ResourceRulesNested<N>> implements V1SubjectRulesReviewStatusFluent.ResourceRulesNested<N>,Nested<N>{
    ResourceRulesNestedImpl(Integer index,V1ResourceRule item) {
      this.index = index;
      this.builder = new V1ResourceRuleBuilder(this, item);
    }
    ResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new V1ResourceRuleBuilder(this);
    }
    V1ResourceRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1SubjectRulesReviewStatusFluentImpl.this.setToResourceRules(index,builder.build());
    }
    public N endResourceRule() {
      return and();
    }
    
  }
  
}