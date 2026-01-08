package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
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
public class V1SubjectRulesReviewStatusFluent<A extends io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<A>> extends BaseFluent<A>{

  private String evaluationError;
  private Boolean incomplete;
  private ArrayList<V1NonResourceRuleBuilder> nonResourceRules;
  private ArrayList<V1ResourceRuleBuilder> resourceRules;

  public V1SubjectRulesReviewStatusFluent() {
  }
  
  public V1SubjectRulesReviewStatusFluent(V1SubjectRulesReviewStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToNonResourceRules(Collection<V1NonResourceRule> items) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules = new ArrayList();
    }
    for (V1NonResourceRule item : items) {
        V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);
        _visitables.get("nonResourceRules").add(builder);
        this.nonResourceRules.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToResourceRules(Collection<V1ResourceRule> items) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList();
    }
    for (V1ResourceRule item : items) {
        V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);
        _visitables.get("resourceRules").add(builder);
        this.resourceRules.add(builder);
    }
    return (A) this;
  }
  
  public NonResourceRulesNested<A> addNewNonResourceRule() {
    return new NonResourceRulesNested(-1, null);
  }
  
  public NonResourceRulesNested<A> addNewNonResourceRuleLike(V1NonResourceRule item) {
    return new NonResourceRulesNested(-1, item);
  }
  
  public ResourceRulesNested<A> addNewResourceRule() {
    return new ResourceRulesNested(-1, null);
  }
  
  public ResourceRulesNested<A> addNewResourceRuleLike(V1ResourceRule item) {
    return new ResourceRulesNested(-1, item);
  }
  
  public A addToNonResourceRules(V1NonResourceRule... items) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules = new ArrayList();
    }
    for (V1NonResourceRule item : items) {
        V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);
        _visitables.get("nonResourceRules").add(builder);
        this.nonResourceRules.add(builder);
    }
    return (A) this;
  }
  
  public A addToNonResourceRules(int index,V1NonResourceRule item) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules = new ArrayList();
    }
    V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);
    if (index < 0 || index >= nonResourceRules.size()) {
        _visitables.get("nonResourceRules").add(builder);
        nonResourceRules.add(builder);
    } else {
        _visitables.get("nonResourceRules").add(builder);
        nonResourceRules.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToResourceRules(V1ResourceRule... items) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList();
    }
    for (V1ResourceRule item : items) {
        V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);
        _visitables.get("resourceRules").add(builder);
        this.resourceRules.add(builder);
    }
    return (A) this;
  }
  
  public A addToResourceRules(int index,V1ResourceRule item) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList();
    }
    V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);
    if (index < 0 || index >= resourceRules.size()) {
        _visitables.get("resourceRules").add(builder);
        resourceRules.add(builder);
    } else {
        _visitables.get("resourceRules").add(builder);
        resourceRules.add(index, builder);
    }
    return (A) this;
  }
  
  public V1NonResourceRule buildFirstNonResourceRule() {
    return this.nonResourceRules.get(0).build();
  }
  
  public V1ResourceRule buildFirstResourceRule() {
    return this.resourceRules.get(0).build();
  }
  
  public V1NonResourceRule buildLastNonResourceRule() {
    return this.nonResourceRules.get(nonResourceRules.size() - 1).build();
  }
  
  public V1ResourceRule buildLastResourceRule() {
    return this.resourceRules.get(resourceRules.size() - 1).build();
  }
  
  public V1NonResourceRule buildMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate) {
      for (V1NonResourceRuleBuilder item : nonResourceRules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ResourceRule buildMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate) {
      for (V1ResourceRuleBuilder item : resourceRules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1NonResourceRule buildNonResourceRule(int index) {
    return this.nonResourceRules.get(index).build();
  }
  
  public List<V1NonResourceRule> buildNonResourceRules() {
    return this.nonResourceRules != null ? build(nonResourceRules) : null;
  }
  
  public V1ResourceRule buildResourceRule(int index) {
    return this.resourceRules.get(index).build();
  }
  
  public List<V1ResourceRule> buildResourceRules() {
    return this.resourceRules != null ? build(resourceRules) : null;
  }
  
  protected void copyInstance(V1SubjectRulesReviewStatus instance) {
    instance = instance != null ? instance : new V1SubjectRulesReviewStatus();
    if (instance != null) {
        this.withEvaluationError(instance.getEvaluationError());
        this.withIncomplete(instance.getIncomplete());
        this.withNonResourceRules(instance.getNonResourceRules());
        this.withResourceRules(instance.getResourceRules());
    }
  }
  
  public NonResourceRulesNested<A> editFirstNonResourceRule() {
    if (nonResourceRules.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "nonResourceRules"));
    }
    return this.setNewNonResourceRuleLike(0, this.buildNonResourceRule(0));
  }
  
  public ResourceRulesNested<A> editFirstResourceRule() {
    if (resourceRules.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "resourceRules"));
    }
    return this.setNewResourceRuleLike(0, this.buildResourceRule(0));
  }
  
  public NonResourceRulesNested<A> editLastNonResourceRule() {
    int index = nonResourceRules.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "nonResourceRules"));
    }
    return this.setNewNonResourceRuleLike(index, this.buildNonResourceRule(index));
  }
  
  public ResourceRulesNested<A> editLastResourceRule() {
    int index = resourceRules.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "resourceRules"));
    }
    return this.setNewResourceRuleLike(index, this.buildResourceRule(index));
  }
  
  public NonResourceRulesNested<A> editMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < nonResourceRules.size();i++) {
      if (predicate.test(nonResourceRules.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "nonResourceRules"));
    }
    return this.setNewNonResourceRuleLike(index, this.buildNonResourceRule(index));
  }
  
  public ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < resourceRules.size();i++) {
      if (predicate.test(resourceRules.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "resourceRules"));
    }
    return this.setNewResourceRuleLike(index, this.buildResourceRule(index));
  }
  
  public NonResourceRulesNested<A> editNonResourceRule(int index) {
    if (nonResourceRules.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "nonResourceRules"));
    }
    return this.setNewNonResourceRuleLike(index, this.buildNonResourceRule(index));
  }
  
  public ResourceRulesNested<A> editResourceRule(int index) {
    if (resourceRules.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "resourceRules"));
    }
    return this.setNewResourceRuleLike(index, this.buildResourceRule(index));
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
    V1SubjectRulesReviewStatusFluent that = (V1SubjectRulesReviewStatusFluent) o;
    if (!(Objects.equals(evaluationError, that.evaluationError))) {
      return false;
    }
    if (!(Objects.equals(incomplete, that.incomplete))) {
      return false;
    }
    if (!(Objects.equals(nonResourceRules, that.nonResourceRules))) {
      return false;
    }
    if (!(Objects.equals(resourceRules, that.resourceRules))) {
      return false;
    }
    return true;
  }
  
  public String getEvaluationError() {
    return this.evaluationError;
  }
  
  public Boolean getIncomplete() {
    return this.incomplete;
  }
  
  public boolean hasEvaluationError() {
    return this.evaluationError != null;
  }
  
  public boolean hasIncomplete() {
    return this.incomplete != null;
  }
  
  public boolean hasMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate) {
      for (V1NonResourceRuleBuilder item : nonResourceRules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate) {
      for (V1ResourceRuleBuilder item : resourceRules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNonResourceRules() {
    return this.nonResourceRules != null && !(this.nonResourceRules.isEmpty());
  }
  
  public boolean hasResourceRules() {
    return this.resourceRules != null && !(this.resourceRules.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(evaluationError, incomplete, nonResourceRules, resourceRules);
  }
  
  public A removeAllFromNonResourceRules(Collection<V1NonResourceRule> items) {
    if (this.nonResourceRules == null) {
      return (A) this;
    }
    for (V1NonResourceRule item : items) {
        V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);
        _visitables.get("nonResourceRules").remove(builder);
        this.nonResourceRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromResourceRules(Collection<V1ResourceRule> items) {
    if (this.resourceRules == null) {
      return (A) this;
    }
    for (V1ResourceRule item : items) {
        V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);
        _visitables.get("resourceRules").remove(builder);
        this.resourceRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromNonResourceRules(V1NonResourceRule... items) {
    if (this.nonResourceRules == null) {
      return (A) this;
    }
    for (V1NonResourceRule item : items) {
        V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);
        _visitables.get("nonResourceRules").remove(builder);
        this.nonResourceRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromResourceRules(V1ResourceRule... items) {
    if (this.resourceRules == null) {
      return (A) this;
    }
    for (V1ResourceRule item : items) {
        V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);
        _visitables.get("resourceRules").remove(builder);
        this.resourceRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromNonResourceRules(Predicate<V1NonResourceRuleBuilder> predicate) {
    if (nonResourceRules == null) {
      return (A) this;
    }
    Iterator<V1NonResourceRuleBuilder> each = nonResourceRules.iterator();
    List visitables = _visitables.get("nonResourceRules");
    while (each.hasNext()) {
        V1NonResourceRuleBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromResourceRules(Predicate<V1ResourceRuleBuilder> predicate) {
    if (resourceRules == null) {
      return (A) this;
    }
    Iterator<V1ResourceRuleBuilder> each = resourceRules.iterator();
    List visitables = _visitables.get("resourceRules");
    while (each.hasNext()) {
        V1ResourceRuleBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public NonResourceRulesNested<A> setNewNonResourceRuleLike(int index,V1NonResourceRule item) {
    return new NonResourceRulesNested(index, item);
  }
  
  public ResourceRulesNested<A> setNewResourceRuleLike(int index,V1ResourceRule item) {
    return new ResourceRulesNested(index, item);
  }
  
  public A setToNonResourceRules(int index,V1NonResourceRule item) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules = new ArrayList();
    }
    V1NonResourceRuleBuilder builder = new V1NonResourceRuleBuilder(item);
    if (index < 0 || index >= nonResourceRules.size()) {
        _visitables.get("nonResourceRules").add(builder);
        nonResourceRules.add(builder);
    } else {
        _visitables.get("nonResourceRules").add(builder);
        nonResourceRules.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToResourceRules(int index,V1ResourceRule item) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList();
    }
    V1ResourceRuleBuilder builder = new V1ResourceRuleBuilder(item);
    if (index < 0 || index >= resourceRules.size()) {
        _visitables.get("resourceRules").add(builder);
        resourceRules.add(builder);
    } else {
        _visitables.get("resourceRules").add(builder);
        resourceRules.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(evaluationError == null)) {
        sb.append("evaluationError:");
        sb.append(evaluationError);
        sb.append(",");
    }
    if (!(incomplete == null)) {
        sb.append("incomplete:");
        sb.append(incomplete);
        sb.append(",");
    }
    if (!(nonResourceRules == null) && !(nonResourceRules.isEmpty())) {
        sb.append("nonResourceRules:");
        sb.append(nonResourceRules);
        sb.append(",");
    }
    if (!(resourceRules == null) && !(resourceRules.isEmpty())) {
        sb.append("resourceRules:");
        sb.append(resourceRules);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
    return (A) this;
  }
  
  public A withIncomplete() {
    return withIncomplete(true);
  }
  
  public A withIncomplete(Boolean incomplete) {
    this.incomplete = incomplete;
    return (A) this;
  }
  
  public A withNonResourceRules(List<V1NonResourceRule> nonResourceRules) {
    if (this.nonResourceRules != null) {
      this._visitables.get("nonResourceRules").clear();
    }
    if (nonResourceRules != null) {
        this.nonResourceRules = new ArrayList();
        for (V1NonResourceRule item : nonResourceRules) {
          this.addToNonResourceRules(item);
        }
    } else {
      this.nonResourceRules = null;
    }
    return (A) this;
  }
  
  public A withNonResourceRules(V1NonResourceRule... nonResourceRules) {
    if (this.nonResourceRules != null) {
        this.nonResourceRules.clear();
        _visitables.remove("nonResourceRules");
    }
    if (nonResourceRules != null) {
      for (V1NonResourceRule item : nonResourceRules) {
        this.addToNonResourceRules(item);
      }
    }
    return (A) this;
  }
  
  public A withResourceRules(List<V1ResourceRule> resourceRules) {
    if (this.resourceRules != null) {
      this._visitables.get("resourceRules").clear();
    }
    if (resourceRules != null) {
        this.resourceRules = new ArrayList();
        for (V1ResourceRule item : resourceRules) {
          this.addToResourceRules(item);
        }
    } else {
      this.resourceRules = null;
    }
    return (A) this;
  }
  
  public A withResourceRules(V1ResourceRule... resourceRules) {
    if (this.resourceRules != null) {
        this.resourceRules.clear();
        _visitables.remove("resourceRules");
    }
    if (resourceRules != null) {
      for (V1ResourceRule item : resourceRules) {
        this.addToResourceRules(item);
      }
    }
    return (A) this;
  }
  public class NonResourceRulesNested<N> extends V1NonResourceRuleFluent<NonResourceRulesNested<N>> implements Nested<N>{
  
    V1NonResourceRuleBuilder builder;
    int index;
  
    NonResourceRulesNested(int index,V1NonResourceRule item) {
      this.index = index;
      this.builder = new V1NonResourceRuleBuilder(this, item);
    }
  
    public N and() {
      return (N) V1SubjectRulesReviewStatusFluent.this.setToNonResourceRules(index, builder.build());
    }
    
    public N endNonResourceRule() {
      return and();
    }
    
  }
  public class ResourceRulesNested<N> extends V1ResourceRuleFluent<ResourceRulesNested<N>> implements Nested<N>{
  
    V1ResourceRuleBuilder builder;
    int index;
  
    ResourceRulesNested(int index,V1ResourceRule item) {
      this.index = index;
      this.builder = new V1ResourceRuleBuilder(this, item);
    }
  
    public N and() {
      return (N) V1SubjectRulesReviewStatusFluent.this.setToResourceRules(index, builder.build());
    }
    
    public N endResourceRule() {
      return and();
    }
    
  }
}