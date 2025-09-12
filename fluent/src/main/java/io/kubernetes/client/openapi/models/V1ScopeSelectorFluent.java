package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
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
public class V1ScopeSelectorFluent<A extends io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<A>> extends BaseFluent<A>{
  public V1ScopeSelectorFluent() {
  }
  
  public V1ScopeSelectorFluent(V1ScopeSelector instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1ScopedResourceSelectorRequirementBuilder> matchExpressions;
  
  protected void copyInstance(V1ScopeSelector instance) {
    instance = instance != null ? instance : new V1ScopeSelector();
    if (instance != null) {
      this.withMatchExpressions(instance.getMatchExpressions());
    }
  }
  
  public A addToMatchExpressions(int index,V1ScopedResourceSelectorRequirement item) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList();
    }
    V1ScopedResourceSelectorRequirementBuilder builder = new V1ScopedResourceSelectorRequirementBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) {
        _visitables.get("matchExpressions").add(builder);
        matchExpressions.add(builder);
    } else {
        _visitables.get("matchExpressions").add(builder);
        matchExpressions.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToMatchExpressions(int index,V1ScopedResourceSelectorRequirement item) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList();
    }
    V1ScopedResourceSelectorRequirementBuilder builder = new V1ScopedResourceSelectorRequirementBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) {
        _visitables.get("matchExpressions").add(builder);
        matchExpressions.add(builder);
    } else {
        _visitables.get("matchExpressions").add(builder);
        matchExpressions.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToMatchExpressions(V1ScopedResourceSelectorRequirement... items) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList();
    }
    for (V1ScopedResourceSelectorRequirement item : items) {
        V1ScopedResourceSelectorRequirementBuilder builder = new V1ScopedResourceSelectorRequirementBuilder(item);
        _visitables.get("matchExpressions").add(builder);
        this.matchExpressions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToMatchExpressions(Collection<V1ScopedResourceSelectorRequirement> items) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList();
    }
    for (V1ScopedResourceSelectorRequirement item : items) {
        V1ScopedResourceSelectorRequirementBuilder builder = new V1ScopedResourceSelectorRequirementBuilder(item);
        _visitables.get("matchExpressions").add(builder);
        this.matchExpressions.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromMatchExpressions(V1ScopedResourceSelectorRequirement... items) {
    if (this.matchExpressions == null) {
      return (A) this;
    }
    for (V1ScopedResourceSelectorRequirement item : items) {
        V1ScopedResourceSelectorRequirementBuilder builder = new V1ScopedResourceSelectorRequirementBuilder(item);
        _visitables.get("matchExpressions").remove(builder);
        this.matchExpressions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromMatchExpressions(Collection<V1ScopedResourceSelectorRequirement> items) {
    if (this.matchExpressions == null) {
      return (A) this;
    }
    for (V1ScopedResourceSelectorRequirement item : items) {
        V1ScopedResourceSelectorRequirementBuilder builder = new V1ScopedResourceSelectorRequirementBuilder(item);
        _visitables.get("matchExpressions").remove(builder);
        this.matchExpressions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromMatchExpressions(Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate) {
    if (matchExpressions == null) {
      return (A) this;
    }
    Iterator<V1ScopedResourceSelectorRequirementBuilder> each = matchExpressions.iterator();
    List visitables = _visitables.get("matchExpressions");
    while (each.hasNext()) {
        V1ScopedResourceSelectorRequirementBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1ScopedResourceSelectorRequirement> buildMatchExpressions() {
    return this.matchExpressions != null ? build(matchExpressions) : null;
  }
  
  public V1ScopedResourceSelectorRequirement buildMatchExpression(int index) {
    return this.matchExpressions.get(index).build();
  }
  
  public V1ScopedResourceSelectorRequirement buildFirstMatchExpression() {
    return this.matchExpressions.get(0).build();
  }
  
  public V1ScopedResourceSelectorRequirement buildLastMatchExpression() {
    return this.matchExpressions.get(matchExpressions.size() - 1).build();
  }
  
  public V1ScopedResourceSelectorRequirement buildMatchingMatchExpression(Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate) {
      for (V1ScopedResourceSelectorRequirementBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchExpression(Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate) {
      for (V1ScopedResourceSelectorRequirementBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMatchExpressions(List<V1ScopedResourceSelectorRequirement> matchExpressions) {
    if (this.matchExpressions != null) {
      this._visitables.get("matchExpressions").clear();
    }
    if (matchExpressions != null) {
        this.matchExpressions = new ArrayList();
        for (V1ScopedResourceSelectorRequirement item : matchExpressions) {
          this.addToMatchExpressions(item);
        }
    } else {
      this.matchExpressions = null;
    }
    return (A) this;
  }
  
  public A withMatchExpressions(V1ScopedResourceSelectorRequirement... matchExpressions) {
    if (this.matchExpressions != null) {
        this.matchExpressions.clear();
        _visitables.remove("matchExpressions");
    }
    if (matchExpressions != null) {
      for (V1ScopedResourceSelectorRequirement item : matchExpressions) {
        this.addToMatchExpressions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMatchExpressions() {
    return this.matchExpressions != null && !(this.matchExpressions.isEmpty());
  }
  
  public MatchExpressionsNested<A> addNewMatchExpression() {
    return new MatchExpressionsNested(-1, null);
  }
  
  public MatchExpressionsNested<A> addNewMatchExpressionLike(V1ScopedResourceSelectorRequirement item) {
    return new MatchExpressionsNested(-1, item);
  }
  
  public MatchExpressionsNested<A> setNewMatchExpressionLike(int index,V1ScopedResourceSelectorRequirement item) {
    return new MatchExpressionsNested(index, item);
  }
  
  public MatchExpressionsNested<A> editMatchExpression(int index) {
    if (index <= matchExpressions.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "matchExpressions"));
    }
    return this.setNewMatchExpressionLike(index, this.buildMatchExpression(index));
  }
  
  public MatchExpressionsNested<A> editFirstMatchExpression() {
    if (matchExpressions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "matchExpressions"));
    }
    return this.setNewMatchExpressionLike(0, this.buildMatchExpression(0));
  }
  
  public MatchExpressionsNested<A> editLastMatchExpression() {
    int index = matchExpressions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "matchExpressions"));
    }
    return this.setNewMatchExpressionLike(index, this.buildMatchExpression(index));
  }
  
  public MatchExpressionsNested<A> editMatchingMatchExpression(Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < matchExpressions.size();i++) {
      if (predicate.test(matchExpressions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "matchExpressions"));
    }
    return this.setNewMatchExpressionLike(index, this.buildMatchExpression(index));
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
    V1ScopeSelectorFluent that = (V1ScopeSelectorFluent) o;
    if (!(Objects.equals(matchExpressions, that.matchExpressions))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(matchExpressions);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(matchExpressions == null) && !(matchExpressions.isEmpty())) {
        sb.append("matchExpressions:");
        sb.append(matchExpressions);
    }
    sb.append("}");
    return sb.toString();
  }
  public class MatchExpressionsNested<N> extends V1ScopedResourceSelectorRequirementFluent<MatchExpressionsNested<N>> implements Nested<N>{
    MatchExpressionsNested(int index,V1ScopedResourceSelectorRequirement item) {
      this.index = index;
      this.builder = new V1ScopedResourceSelectorRequirementBuilder(this, item);
    }
    V1ScopedResourceSelectorRequirementBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ScopeSelectorFluent.this.setToMatchExpressions(index, builder.build());
    }
    
    public N endMatchExpression() {
      return and();
    }
    
  
  }

}