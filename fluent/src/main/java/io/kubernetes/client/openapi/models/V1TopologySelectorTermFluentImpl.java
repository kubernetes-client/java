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
  public class V1TopologySelectorTermFluentImpl<A extends V1TopologySelectorTermFluent<A>> extends BaseFluent<A> implements V1TopologySelectorTermFluent<A>{
  public V1TopologySelectorTermFluentImpl() {
  }
  public V1TopologySelectorTermFluentImpl(V1TopologySelectorTerm instance) {
    this.withMatchLabelExpressions(instance.getMatchLabelExpressions());

  }
  private ArrayList<V1TopologySelectorLabelRequirementBuilder> matchLabelExpressions;
  public A addToMatchLabelExpressions(Integer index,V1TopologySelectorLabelRequirement item) {
    if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<V1TopologySelectorLabelRequirementBuilder>();}
    V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").add(index >= 0 ? index : _visitables.get("matchLabelExpressions").size(), builder);this.matchLabelExpressions.add(index >= 0 ? index : matchLabelExpressions.size(), builder); return (A)this;
  }
  public A setToMatchLabelExpressions(Integer index,V1TopologySelectorLabelRequirement item) {
    if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<V1TopologySelectorLabelRequirementBuilder>();}
    V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);
    if (index < 0 || index >= _visitables.get("matchLabelExpressions").size()) { _visitables.get("matchLabelExpressions").add(builder); } else { _visitables.get("matchLabelExpressions").set(index, builder);}
    if (index < 0 || index >= matchLabelExpressions.size()) { matchLabelExpressions.add(builder); } else { matchLabelExpressions.set(index, builder);}
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
    for (V1TopologySelectorLabelRequirement item : items) {V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").remove(builder);if (this.matchLabelExpressions != null) {this.matchLabelExpressions.remove(builder);}} return (A)this;
  }
  public A removeAllFromMatchLabelExpressions(Collection<V1TopologySelectorLabelRequirement> items) {
    for (V1TopologySelectorLabelRequirement item : items) {V1TopologySelectorLabelRequirementBuilder builder = new V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").remove(builder);if (this.matchLabelExpressions != null) {this.matchLabelExpressions.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildMatchLabelExpressions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1TopologySelectorLabelRequirement> getMatchLabelExpressions() {
    return matchLabelExpressions != null ? build(matchLabelExpressions) : null;
  }
  public List<V1TopologySelectorLabelRequirement> buildMatchLabelExpressions() {
    return matchLabelExpressions != null ? build(matchLabelExpressions) : null;
  }
  public V1TopologySelectorLabelRequirement buildMatchLabelExpression(Integer index) {
    return this.matchLabelExpressions.get(index).build();
  }
  public V1TopologySelectorLabelRequirement buildFirstMatchLabelExpression() {
    return this.matchLabelExpressions.get(0).build();
  }
  public V1TopologySelectorLabelRequirement buildLastMatchLabelExpression() {
    return this.matchLabelExpressions.get(matchLabelExpressions.size() - 1).build();
  }
  public V1TopologySelectorLabelRequirement buildMatchingMatchLabelExpression(Predicate<V1TopologySelectorLabelRequirementBuilder> predicate) {
    for (V1TopologySelectorLabelRequirementBuilder item: matchLabelExpressions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingMatchLabelExpression(Predicate<V1TopologySelectorLabelRequirementBuilder> predicate) {
    for (V1TopologySelectorLabelRequirementBuilder item: matchLabelExpressions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMatchLabelExpressions(List<V1TopologySelectorLabelRequirement> matchLabelExpressions) {
    if (this.matchLabelExpressions != null) { _visitables.get("matchLabelExpressions").removeAll(this.matchLabelExpressions);}
    if (matchLabelExpressions != null) {this.matchLabelExpressions = new ArrayList(); for (V1TopologySelectorLabelRequirement item : matchLabelExpressions){this.addToMatchLabelExpressions(item);}} else { this.matchLabelExpressions = null;} return (A) this;
  }
  public A withMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... matchLabelExpressions) {
    if (this.matchLabelExpressions != null) {this.matchLabelExpressions.clear();}
    if (matchLabelExpressions != null) {for (V1TopologySelectorLabelRequirement item :matchLabelExpressions){ this.addToMatchLabelExpressions(item);}} return (A) this;
  }
  public Boolean hasMatchLabelExpressions() {
    return matchLabelExpressions != null && !matchLabelExpressions.isEmpty();
  }
  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpression() {
    return new V1TopologySelectorTermFluentImpl.MatchLabelExpressionsNestedImpl();
  }
  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpressionLike(V1TopologySelectorLabelRequirement item) {
    return new V1TopologySelectorTermFluentImpl.MatchLabelExpressionsNestedImpl(-1, item);
  }
  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> setNewMatchLabelExpressionLike(Integer index,V1TopologySelectorLabelRequirement item) {
    return new V1TopologySelectorTermFluentImpl.MatchLabelExpressionsNestedImpl(index, item);
  }
  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchLabelExpression(Integer index) {
    if (matchLabelExpressions.size() <= index) throw new RuntimeException("Can't edit matchLabelExpressions. Index exceeds size.");
    return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
  }
  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editFirstMatchLabelExpression() {
    if (matchLabelExpressions.size() == 0) throw new RuntimeException("Can't edit first matchLabelExpressions. The list is empty.");
    return setNewMatchLabelExpressionLike(0, buildMatchLabelExpression(0));
  }
  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editLastMatchLabelExpression() {
    int index = matchLabelExpressions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchLabelExpressions. The list is empty.");
    return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
  }
  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchingMatchLabelExpression(Predicate<V1TopologySelectorLabelRequirementBuilder> predicate) {
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
    V1TopologySelectorTermFluentImpl that = (V1TopologySelectorTermFluentImpl) o;
    if (matchLabelExpressions != null ? !matchLabelExpressions.equals(that.matchLabelExpressions) :that.matchLabelExpressions != null) return false;
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
  class MatchLabelExpressionsNestedImpl<N> extends V1TopologySelectorLabelRequirementFluentImpl<V1TopologySelectorTermFluent.MatchLabelExpressionsNested<N>> implements V1TopologySelectorTermFluent.MatchLabelExpressionsNested<N>,Nested<N>{
    MatchLabelExpressionsNestedImpl(Integer index,V1TopologySelectorLabelRequirement item) {
      this.index = index;
      this.builder = new V1TopologySelectorLabelRequirementBuilder(this, item);
    }
    MatchLabelExpressionsNestedImpl() {
      this.index = -1;
      this.builder = new V1TopologySelectorLabelRequirementBuilder(this);
    }
    V1TopologySelectorLabelRequirementBuilder builder;
    Integer index;
    public N and() {
      return (N) V1TopologySelectorTermFluentImpl.this.setToMatchLabelExpressions(index,builder.build());
    }
    public N endMatchLabelExpression() {
      return and();
    }
    
  }
  
}