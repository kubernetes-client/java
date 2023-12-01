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
public class V1TopologySelectorTermFluent<A extends V1TopologySelectorTermFluent<A>> extends BaseFluent<A>{
  public V1TopologySelectorTermFluent() {
  }
  
  public V1TopologySelectorTermFluent(V1TopologySelectorTerm instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1TopologySelectorLabelRequirementBuilder> matchLabelExpressions;
  
  protected void copyInstance(V1TopologySelectorTerm instance) {
    instance = (instance != null ? instance : new V1TopologySelectorTerm());
    if (instance != null) {
          this.withMatchLabelExpressions(instance.getMatchLabelExpressions());
        }
  }
  
  public A addToMatchLabelExpressions(int index,V1TopologySelectorLabelRequirement item) {
    if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<V1TopologySelectorLabelRequirementBuilder>();}
    V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);
    if (index < 0 || index >= matchLabelExpressions.size()) { _visitables.get("matchLabelExpressions").add(builder); matchLabelExpressions.add(builder); } else { _visitables.get("matchLabelExpressions").add(index, builder); matchLabelExpressions.add(index, builder);}
    return (A)this;
  }
  
  public A setToMatchLabelExpressions(int index,V1TopologySelectorLabelRequirement item) {
    if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<V1TopologySelectorLabelRequirementBuilder>();}
    V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);
    if (index < 0 || index >= matchLabelExpressions.size()) { _visitables.get("matchLabelExpressions").add(builder); matchLabelExpressions.add(builder); } else { _visitables.get("matchLabelExpressions").set(index, builder); matchLabelExpressions.set(index, builder);}
    return (A)this;
  }
  
  public A addToMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items) {
    if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<V1TopologySelectorLabelRequirementBuilder>();}
    for (V1TopologySelectorLabelRequirement item : items) {V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").add(builder);this.matchLabelExpressions.add(builder);} return (A)this;
  }
  
  public A addAllToMatchLabelExpressions(Collection<V1TopologySelectorLabelRequirement> items) {
    if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<V1TopologySelectorLabelRequirementBuilder>();}
    for (V1TopologySelectorLabelRequirement item : items) {V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").add(builder);this.matchLabelExpressions.add(builder);} return (A)this;
  }
  
  public A removeFromMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items) {
    if (this.matchLabelExpressions == null) return (A)this;
    for (V1TopologySelectorLabelRequirement item : items) {V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").remove(builder); this.matchLabelExpressions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromMatchLabelExpressions(Collection<V1TopologySelectorLabelRequirement> items) {
    if (this.matchLabelExpressions == null) return (A)this;
    for (V1TopologySelectorLabelRequirement item : items) {V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").remove(builder); this.matchLabelExpressions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromMatchLabelExpressions(Predicate<V1TopologySelectorLabelRequirementBuilder> predicate) {
    if (matchLabelExpressions == null) return (A) this;
    final Iterator<V1TopologySelectorLabelRequirementBuilder> each = matchLabelExpressions.iterator();
    final List visitables = _visitables.get("matchLabelExpressions");
    while (each.hasNext()) {
      V1TopologySelectorLabelRequirementBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1TopologySelectorLabelRequirement> buildMatchLabelExpressions() {
    return this.matchLabelExpressions != null ? build(matchLabelExpressions) : null;
  }
  
  public V1TopologySelectorLabelRequirement buildMatchLabelExpression(int index) {
    return this.matchLabelExpressions.get(index).build();
  }
  
  public V1TopologySelectorLabelRequirement buildFirstMatchLabelExpression() {
    return this.matchLabelExpressions.get(0).build();
  }
  
  public V1TopologySelectorLabelRequirement buildLastMatchLabelExpression() {
    return this.matchLabelExpressions.get(matchLabelExpressions.size() - 1).build();
  }
  
  public V1TopologySelectorLabelRequirement buildMatchingMatchLabelExpression(Predicate<V1TopologySelectorLabelRequirementBuilder> predicate) {
      for (V1TopologySelectorLabelRequirementBuilder item : matchLabelExpressions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchLabelExpression(Predicate<V1TopologySelectorLabelRequirementBuilder> predicate) {
      for (V1TopologySelectorLabelRequirementBuilder item : matchLabelExpressions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMatchLabelExpressions(List<V1TopologySelectorLabelRequirement> matchLabelExpressions) {
    if (this.matchLabelExpressions != null) {
      this._visitables.get("matchLabelExpressions").clear();
    }
    if (matchLabelExpressions != null) {
        this.matchLabelExpressions = new ArrayList();
        for (V1TopologySelectorLabelRequirement item : matchLabelExpressions) {
          this.addToMatchLabelExpressions(item);
        }
    } else {
      this.matchLabelExpressions = null;
    }
    return (A) this;
  }
  
  public A withMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... matchLabelExpressions) {
    if (this.matchLabelExpressions != null) {
        this.matchLabelExpressions.clear();
        _visitables.remove("matchLabelExpressions");
    }
    if (matchLabelExpressions != null) {
      for (V1TopologySelectorLabelRequirement item : matchLabelExpressions) {
        this.addToMatchLabelExpressions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMatchLabelExpressions() {
    return this.matchLabelExpressions != null && !this.matchLabelExpressions.isEmpty();
  }
  
  public MatchLabelExpressionsNested<A> addNewMatchLabelExpression() {
    return new MatchLabelExpressionsNested(-1, null);
  }
  
  public MatchLabelExpressionsNested<A> addNewMatchLabelExpressionLike(V1TopologySelectorLabelRequirement item) {
    return new MatchLabelExpressionsNested(-1, item);
  }
  
  public MatchLabelExpressionsNested<A> setNewMatchLabelExpressionLike(int index,V1TopologySelectorLabelRequirement item) {
    return new MatchLabelExpressionsNested(index, item);
  }
  
  public MatchLabelExpressionsNested<A> editMatchLabelExpression(int index) {
    if (matchLabelExpressions.size() <= index) throw new RuntimeException("Can't edit matchLabelExpressions. Index exceeds size.");
    return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
  }
  
  public MatchLabelExpressionsNested<A> editFirstMatchLabelExpression() {
    if (matchLabelExpressions.size() == 0) throw new RuntimeException("Can't edit first matchLabelExpressions. The list is empty.");
    return setNewMatchLabelExpressionLike(0, buildMatchLabelExpression(0));
  }
  
  public MatchLabelExpressionsNested<A> editLastMatchLabelExpression() {
    int index = matchLabelExpressions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchLabelExpressions. The list is empty.");
    return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
  }
  
  public MatchLabelExpressionsNested<A> editMatchingMatchLabelExpression(Predicate<V1TopologySelectorLabelRequirementBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchLabelExpressions.size();i++) { 
    if (predicate.test(matchLabelExpressions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchLabelExpressions. No match found.");
    return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TopologySelectorTermFluent that = (V1TopologySelectorTermFluent) o;
    if (!java.util.Objects.equals(matchLabelExpressions, that.matchLabelExpressions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(matchLabelExpressions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (matchLabelExpressions != null && !matchLabelExpressions.isEmpty()) { sb.append("matchLabelExpressions:"); sb.append(matchLabelExpressions); }
    sb.append("}");
    return sb.toString();
  }
  public class MatchLabelExpressionsNested<N> extends V1TopologySelectorLabelRequirementFluent<MatchLabelExpressionsNested<N>> implements Nested<N>{
    MatchLabelExpressionsNested(int index,V1TopologySelectorLabelRequirement item) {
      this.index = index;
      this.builder = new V1TopologySelectorLabelRequirementBuilder(this, item);
    }
    V1TopologySelectorLabelRequirementBuilder builder;
    int index;
    
    public N and() {
      return (N) V1TopologySelectorTermFluent.this.setToMatchLabelExpressions(index,builder.build());
    }
    
    public N endMatchLabelExpression() {
      return and();
    }
    
  
  }

}