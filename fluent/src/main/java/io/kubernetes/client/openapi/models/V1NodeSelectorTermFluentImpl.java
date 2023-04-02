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
  public class V1NodeSelectorTermFluentImpl<A extends V1NodeSelectorTermFluent<A>> extends BaseFluent<A> implements V1NodeSelectorTermFluent<A>{
  public V1NodeSelectorTermFluentImpl() {
  }
  public V1NodeSelectorTermFluentImpl(V1NodeSelectorTerm instance) {
    this.withMatchExpressions(instance.getMatchExpressions());

    this.withMatchFields(instance.getMatchFields());

  }
  private ArrayList<V1NodeSelectorRequirementBuilder> matchExpressions;
  private ArrayList<V1NodeSelectorRequirementBuilder> matchFields;
  public A addToMatchExpressions(Integer index,V1NodeSelectorRequirement item) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<V1NodeSelectorRequirementBuilder>();}
    V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchExpressions").add(index >= 0 ? index : _visitables.get("matchExpressions").size(), builder);this.matchExpressions.add(index >= 0 ? index : matchExpressions.size(), builder); return (A)this;
  }
  public A setToMatchExpressions(Integer index,V1NodeSelectorRequirement item) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<V1NodeSelectorRequirementBuilder>();}
    V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
    if (index < 0 || index >= _visitables.get("matchExpressions").size()) { _visitables.get("matchExpressions").add(builder); } else { _visitables.get("matchExpressions").set(index, builder);}
    if (index < 0 || index >= matchExpressions.size()) { matchExpressions.add(builder); } else { matchExpressions.set(index, builder);}
     return (A)this;
  }
  public A addToMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<V1NodeSelectorRequirementBuilder>();}
    for (V1NodeSelectorRequirement item : items) {V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  public A addAllToMatchExpressions(Collection<V1NodeSelectorRequirement> items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<V1NodeSelectorRequirementBuilder>();}
    for (V1NodeSelectorRequirement item : items) {V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  public A removeFromMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items) {
    for (V1NodeSelectorRequirement item : items) {V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchExpressions").remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
  }
  public A removeAllFromMatchExpressions(Collection<V1NodeSelectorRequirement> items) {
    for (V1NodeSelectorRequirement item : items) {V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchExpressions").remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromMatchExpressions(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    if (matchExpressions == null) return (A) this;
    final Iterator<V1NodeSelectorRequirementBuilder> each = matchExpressions.iterator();
    final List visitables = _visitables.get("matchExpressions");
    while (each.hasNext()) {
      V1NodeSelectorRequirementBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildMatchExpressions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeSelectorRequirement> getMatchExpressions() {
    return matchExpressions != null ? build(matchExpressions) : null;
  }
  public List<V1NodeSelectorRequirement> buildMatchExpressions() {
    return matchExpressions != null ? build(matchExpressions) : null;
  }
  public V1NodeSelectorRequirement buildMatchExpression(Integer index) {
    return this.matchExpressions.get(index).build();
  }
  public V1NodeSelectorRequirement buildFirstMatchExpression() {
    return this.matchExpressions.get(0).build();
  }
  public V1NodeSelectorRequirement buildLastMatchExpression() {
    return this.matchExpressions.get(matchExpressions.size() - 1).build();
  }
  public V1NodeSelectorRequirement buildMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    for (V1NodeSelectorRequirementBuilder item: matchExpressions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    for (V1NodeSelectorRequirementBuilder item: matchExpressions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMatchExpressions(List<V1NodeSelectorRequirement> matchExpressions) {
    if (this.matchExpressions != null) { _visitables.get("matchExpressions").removeAll(this.matchExpressions);}
    if (matchExpressions != null) {this.matchExpressions = new ArrayList(); for (V1NodeSelectorRequirement item : matchExpressions){this.addToMatchExpressions(item);}} else { this.matchExpressions = null;} return (A) this;
  }
  public A withMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... matchExpressions) {
    if (this.matchExpressions != null) {this.matchExpressions.clear();}
    if (matchExpressions != null) {for (V1NodeSelectorRequirement item :matchExpressions){ this.addToMatchExpressions(item);}} return (A) this;
  }
  public Boolean hasMatchExpressions() {
    return matchExpressions != null && !matchExpressions.isEmpty();
  }
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpression() {
    return new V1NodeSelectorTermFluentImpl.MatchExpressionsNestedImpl();
  }
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(V1NodeSelectorRequirement item) {
    return new V1NodeSelectorTermFluentImpl.MatchExpressionsNestedImpl(-1, item);
  }
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(Integer index,V1NodeSelectorRequirement item) {
    return new V1NodeSelectorTermFluentImpl.MatchExpressionsNestedImpl(index, item);
  }
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchExpression(Integer index) {
    if (matchExpressions.size() <= index) throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> editFirstMatchExpression() {
    if (matchExpressions.size() == 0) throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(0, buildMatchExpression(0));
  }
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> editLastMatchExpression() {
    int index = matchExpressions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchExpressions.size();i++) { 
    if (predicate.test(matchExpressions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  public A addToMatchFields(Integer index,V1NodeSelectorRequirement item) {
    if (this.matchFields == null) {this.matchFields = new ArrayList<V1NodeSelectorRequirementBuilder>();}
    V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchFields").add(index >= 0 ? index : _visitables.get("matchFields").size(), builder);this.matchFields.add(index >= 0 ? index : matchFields.size(), builder); return (A)this;
  }
  public A setToMatchFields(Integer index,V1NodeSelectorRequirement item) {
    if (this.matchFields == null) {this.matchFields = new ArrayList<V1NodeSelectorRequirementBuilder>();}
    V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
    if (index < 0 || index >= _visitables.get("matchFields").size()) { _visitables.get("matchFields").add(builder); } else { _visitables.get("matchFields").set(index, builder);}
    if (index < 0 || index >= matchFields.size()) { matchFields.add(builder); } else { matchFields.set(index, builder);}
     return (A)this;
  }
  public A addToMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items) {
    if (this.matchFields == null) {this.matchFields = new ArrayList<V1NodeSelectorRequirementBuilder>();}
    for (V1NodeSelectorRequirement item : items) {V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchFields").add(builder);this.matchFields.add(builder);} return (A)this;
  }
  public A addAllToMatchFields(Collection<V1NodeSelectorRequirement> items) {
    if (this.matchFields == null) {this.matchFields = new ArrayList<V1NodeSelectorRequirementBuilder>();}
    for (V1NodeSelectorRequirement item : items) {V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchFields").add(builder);this.matchFields.add(builder);} return (A)this;
  }
  public A removeFromMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items) {
    for (V1NodeSelectorRequirement item : items) {V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchFields").remove(builder);if (this.matchFields != null) {this.matchFields.remove(builder);}} return (A)this;
  }
  public A removeAllFromMatchFields(Collection<V1NodeSelectorRequirement> items) {
    for (V1NodeSelectorRequirement item : items) {V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);_visitables.get("matchFields").remove(builder);if (this.matchFields != null) {this.matchFields.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromMatchFields(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    if (matchFields == null) return (A) this;
    final Iterator<V1NodeSelectorRequirementBuilder> each = matchFields.iterator();
    final List visitables = _visitables.get("matchFields");
    while (each.hasNext()) {
      V1NodeSelectorRequirementBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildMatchFields instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeSelectorRequirement> getMatchFields() {
    return matchFields != null ? build(matchFields) : null;
  }
  public List<V1NodeSelectorRequirement> buildMatchFields() {
    return matchFields != null ? build(matchFields) : null;
  }
  public V1NodeSelectorRequirement buildMatchField(Integer index) {
    return this.matchFields.get(index).build();
  }
  public V1NodeSelectorRequirement buildFirstMatchField() {
    return this.matchFields.get(0).build();
  }
  public V1NodeSelectorRequirement buildLastMatchField() {
    return this.matchFields.get(matchFields.size() - 1).build();
  }
  public V1NodeSelectorRequirement buildMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    for (V1NodeSelectorRequirementBuilder item: matchFields) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    for (V1NodeSelectorRequirementBuilder item: matchFields) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMatchFields(List<V1NodeSelectorRequirement> matchFields) {
    if (this.matchFields != null) { _visitables.get("matchFields").removeAll(this.matchFields);}
    if (matchFields != null) {this.matchFields = new ArrayList(); for (V1NodeSelectorRequirement item : matchFields){this.addToMatchFields(item);}} else { this.matchFields = null;} return (A) this;
  }
  public A withMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... matchFields) {
    if (this.matchFields != null) {this.matchFields.clear();}
    if (matchFields != null) {for (V1NodeSelectorRequirement item :matchFields){ this.addToMatchFields(item);}} return (A) this;
  }
  public Boolean hasMatchFields() {
    return matchFields != null && !matchFields.isEmpty();
  }
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchField() {
    return new V1NodeSelectorTermFluentImpl.MatchFieldsNestedImpl();
  }
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchFieldLike(V1NodeSelectorRequirement item) {
    return new V1NodeSelectorTermFluentImpl.MatchFieldsNestedImpl(-1, item);
  }
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> setNewMatchFieldLike(Integer index,V1NodeSelectorRequirement item) {
    return new V1NodeSelectorTermFluentImpl.MatchFieldsNestedImpl(index, item);
  }
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> editMatchField(Integer index) {
    if (matchFields.size() <= index) throw new RuntimeException("Can't edit matchFields. Index exceeds size.");
    return setNewMatchFieldLike(index, buildMatchField(index));
  }
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> editFirstMatchField() {
    if (matchFields.size() == 0) throw new RuntimeException("Can't edit first matchFields. The list is empty.");
    return setNewMatchFieldLike(0, buildMatchField(0));
  }
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> editLastMatchField() {
    int index = matchFields.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchFields. The list is empty.");
    return setNewMatchFieldLike(index, buildMatchField(index));
  }
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> editMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchFields.size();i++) { 
    if (predicate.test(matchFields.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchFields. No match found.");
    return setNewMatchFieldLike(index, buildMatchField(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeSelectorTermFluentImpl that = (V1NodeSelectorTermFluentImpl) o;
    if (matchExpressions != null ? !matchExpressions.equals(that.matchExpressions) :that.matchExpressions != null) return false;
    if (matchFields != null ? !matchFields.equals(that.matchFields) :that.matchFields != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(matchExpressions,  matchFields,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (matchExpressions != null && !matchExpressions.isEmpty()) { sb.append("matchExpressions:"); sb.append(matchExpressions + ","); }
    if (matchFields != null && !matchFields.isEmpty()) { sb.append("matchFields:"); sb.append(matchFields); }
    sb.append("}");
    return sb.toString();
  }
  class MatchExpressionsNestedImpl<N> extends V1NodeSelectorRequirementFluentImpl<V1NodeSelectorTermFluent.MatchExpressionsNested<N>> implements V1NodeSelectorTermFluent.MatchExpressionsNested<N>,Nested<N>{
    MatchExpressionsNestedImpl(Integer index,V1NodeSelectorRequirement item) {
      this.index = index;
      this.builder = new V1NodeSelectorRequirementBuilder(this, item);
    }
    MatchExpressionsNestedImpl() {
      this.index = -1;
      this.builder = new V1NodeSelectorRequirementBuilder(this);
    }
    V1NodeSelectorRequirementBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeSelectorTermFluentImpl.this.setToMatchExpressions(index,builder.build());
    }
    public N endMatchExpression() {
      return and();
    }
    
  }
  class MatchFieldsNestedImpl<N> extends V1NodeSelectorRequirementFluentImpl<V1NodeSelectorTermFluent.MatchFieldsNested<N>> implements V1NodeSelectorTermFluent.MatchFieldsNested<N>,Nested<N>{
    MatchFieldsNestedImpl(Integer index,V1NodeSelectorRequirement item) {
      this.index = index;
      this.builder = new V1NodeSelectorRequirementBuilder(this, item);
    }
    MatchFieldsNestedImpl() {
      this.index = -1;
      this.builder = new V1NodeSelectorRequirementBuilder(this);
    }
    V1NodeSelectorRequirementBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeSelectorTermFluentImpl.this.setToMatchFields(index,builder.build());
    }
    public N endMatchField() {
      return and();
    }
    
  }
  
}