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
public class V1NodeSelectorTermFluent<A extends io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1NodeSelectorRequirementBuilder> matchExpressions;
  private ArrayList<V1NodeSelectorRequirementBuilder> matchFields;

  public V1NodeSelectorTermFluent() {
  }
  
  public V1NodeSelectorTermFluent(V1NodeSelectorTerm instance) {
    this.copyInstance(instance);
  }

  public A addAllToMatchExpressions(Collection<V1NodeSelectorRequirement> items) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList();
    }
    for (V1NodeSelectorRequirement item : items) {
        V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
        _visitables.get("matchExpressions").add(builder);
        this.matchExpressions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToMatchFields(Collection<V1NodeSelectorRequirement> items) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList();
    }
    for (V1NodeSelectorRequirement item : items) {
        V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
        _visitables.get("matchFields").add(builder);
        this.matchFields.add(builder);
    }
    return (A) this;
  }
  
  public MatchExpressionsNested<A> addNewMatchExpression() {
    return new MatchExpressionsNested(-1, null);
  }
  
  public MatchExpressionsNested<A> addNewMatchExpressionLike(V1NodeSelectorRequirement item) {
    return new MatchExpressionsNested(-1, item);
  }
  
  public MatchFieldsNested<A> addNewMatchField() {
    return new MatchFieldsNested(-1, null);
  }
  
  public MatchFieldsNested<A> addNewMatchFieldLike(V1NodeSelectorRequirement item) {
    return new MatchFieldsNested(-1, item);
  }
  
  public A addToMatchExpressions(V1NodeSelectorRequirement... items) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList();
    }
    for (V1NodeSelectorRequirement item : items) {
        V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
        _visitables.get("matchExpressions").add(builder);
        this.matchExpressions.add(builder);
    }
    return (A) this;
  }
  
  public A addToMatchExpressions(int index,V1NodeSelectorRequirement item) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList();
    }
    V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) {
        _visitables.get("matchExpressions").add(builder);
        matchExpressions.add(builder);
    } else {
        _visitables.get("matchExpressions").add(builder);
        matchExpressions.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToMatchFields(V1NodeSelectorRequirement... items) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList();
    }
    for (V1NodeSelectorRequirement item : items) {
        V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
        _visitables.get("matchFields").add(builder);
        this.matchFields.add(builder);
    }
    return (A) this;
  }
  
  public A addToMatchFields(int index,V1NodeSelectorRequirement item) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList();
    }
    V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
    if (index < 0 || index >= matchFields.size()) {
        _visitables.get("matchFields").add(builder);
        matchFields.add(builder);
    } else {
        _visitables.get("matchFields").add(builder);
        matchFields.add(index, builder);
    }
    return (A) this;
  }
  
  public V1NodeSelectorRequirement buildFirstMatchExpression() {
    return this.matchExpressions.get(0).build();
  }
  
  public V1NodeSelectorRequirement buildFirstMatchField() {
    return this.matchFields.get(0).build();
  }
  
  public V1NodeSelectorRequirement buildLastMatchExpression() {
    return this.matchExpressions.get(matchExpressions.size() - 1).build();
  }
  
  public V1NodeSelectorRequirement buildLastMatchField() {
    return this.matchFields.get(matchFields.size() - 1).build();
  }
  
  public V1NodeSelectorRequirement buildMatchExpression(int index) {
    return this.matchExpressions.get(index).build();
  }
  
  public List<V1NodeSelectorRequirement> buildMatchExpressions() {
    return this.matchExpressions != null ? build(matchExpressions) : null;
  }
  
  public V1NodeSelectorRequirement buildMatchField(int index) {
    return this.matchFields.get(index).build();
  }
  
  public List<V1NodeSelectorRequirement> buildMatchFields() {
    return this.matchFields != null ? build(matchFields) : null;
  }
  
  public V1NodeSelectorRequirement buildMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
      for (V1NodeSelectorRequirementBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1NodeSelectorRequirement buildMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
      for (V1NodeSelectorRequirementBuilder item : matchFields) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1NodeSelectorTerm instance) {
    instance = instance != null ? instance : new V1NodeSelectorTerm();
    if (instance != null) {
        this.withMatchExpressions(instance.getMatchExpressions());
        this.withMatchFields(instance.getMatchFields());
    }
  }
  
  public MatchExpressionsNested<A> editFirstMatchExpression() {
    if (matchExpressions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "matchExpressions"));
    }
    return this.setNewMatchExpressionLike(0, this.buildMatchExpression(0));
  }
  
  public MatchFieldsNested<A> editFirstMatchField() {
    if (matchFields.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "matchFields"));
    }
    return this.setNewMatchFieldLike(0, this.buildMatchField(0));
  }
  
  public MatchExpressionsNested<A> editLastMatchExpression() {
    int index = matchExpressions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "matchExpressions"));
    }
    return this.setNewMatchExpressionLike(index, this.buildMatchExpression(index));
  }
  
  public MatchFieldsNested<A> editLastMatchField() {
    int index = matchFields.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "matchFields"));
    }
    return this.setNewMatchFieldLike(index, this.buildMatchField(index));
  }
  
  public MatchExpressionsNested<A> editMatchExpression(int index) {
    if (matchExpressions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "matchExpressions"));
    }
    return this.setNewMatchExpressionLike(index, this.buildMatchExpression(index));
  }
  
  public MatchFieldsNested<A> editMatchField(int index) {
    if (matchFields.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "matchFields"));
    }
    return this.setNewMatchFieldLike(index, this.buildMatchField(index));
  }
  
  public MatchExpressionsNested<A> editMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
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
  
  public MatchFieldsNested<A> editMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < matchFields.size();i++) {
      if (predicate.test(matchFields.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "matchFields"));
    }
    return this.setNewMatchFieldLike(index, this.buildMatchField(index));
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
    V1NodeSelectorTermFluent that = (V1NodeSelectorTermFluent) o;
    if (!(Objects.equals(matchExpressions, that.matchExpressions))) {
      return false;
    }
    if (!(Objects.equals(matchFields, that.matchFields))) {
      return false;
    }
    return true;
  }
  
  public boolean hasMatchExpressions() {
    return this.matchExpressions != null && !(this.matchExpressions.isEmpty());
  }
  
  public boolean hasMatchFields() {
    return this.matchFields != null && !(this.matchFields.isEmpty());
  }
  
  public boolean hasMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
      for (V1NodeSelectorRequirementBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
      for (V1NodeSelectorRequirementBuilder item : matchFields) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(matchExpressions, matchFields);
  }
  
  public A removeAllFromMatchExpressions(Collection<V1NodeSelectorRequirement> items) {
    if (this.matchExpressions == null) {
      return (A) this;
    }
    for (V1NodeSelectorRequirement item : items) {
        V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
        _visitables.get("matchExpressions").remove(builder);
        this.matchExpressions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromMatchFields(Collection<V1NodeSelectorRequirement> items) {
    if (this.matchFields == null) {
      return (A) this;
    }
    for (V1NodeSelectorRequirement item : items) {
        V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
        _visitables.get("matchFields").remove(builder);
        this.matchFields.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromMatchExpressions(V1NodeSelectorRequirement... items) {
    if (this.matchExpressions == null) {
      return (A) this;
    }
    for (V1NodeSelectorRequirement item : items) {
        V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
        _visitables.get("matchExpressions").remove(builder);
        this.matchExpressions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromMatchFields(V1NodeSelectorRequirement... items) {
    if (this.matchFields == null) {
      return (A) this;
    }
    for (V1NodeSelectorRequirement item : items) {
        V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
        _visitables.get("matchFields").remove(builder);
        this.matchFields.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromMatchExpressions(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    if (matchExpressions == null) {
      return (A) this;
    }
    Iterator<V1NodeSelectorRequirementBuilder> each = matchExpressions.iterator();
    List visitables = _visitables.get("matchExpressions");
    while (each.hasNext()) {
        V1NodeSelectorRequirementBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromMatchFields(Predicate<V1NodeSelectorRequirementBuilder> predicate) {
    if (matchFields == null) {
      return (A) this;
    }
    Iterator<V1NodeSelectorRequirementBuilder> each = matchFields.iterator();
    List visitables = _visitables.get("matchFields");
    while (each.hasNext()) {
        V1NodeSelectorRequirementBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public MatchExpressionsNested<A> setNewMatchExpressionLike(int index,V1NodeSelectorRequirement item) {
    return new MatchExpressionsNested(index, item);
  }
  
  public MatchFieldsNested<A> setNewMatchFieldLike(int index,V1NodeSelectorRequirement item) {
    return new MatchFieldsNested(index, item);
  }
  
  public A setToMatchExpressions(int index,V1NodeSelectorRequirement item) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList();
    }
    V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) {
        _visitables.get("matchExpressions").add(builder);
        matchExpressions.add(builder);
    } else {
        _visitables.get("matchExpressions").add(builder);
        matchExpressions.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToMatchFields(int index,V1NodeSelectorRequirement item) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList();
    }
    V1NodeSelectorRequirementBuilder builder = new V1NodeSelectorRequirementBuilder(item);
    if (index < 0 || index >= matchFields.size()) {
        _visitables.get("matchFields").add(builder);
        matchFields.add(builder);
    } else {
        _visitables.get("matchFields").add(builder);
        matchFields.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(matchExpressions == null) && !(matchExpressions.isEmpty())) {
        sb.append("matchExpressions:");
        sb.append(matchExpressions);
        sb.append(",");
    }
    if (!(matchFields == null) && !(matchFields.isEmpty())) {
        sb.append("matchFields:");
        sb.append(matchFields);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMatchExpressions(List<V1NodeSelectorRequirement> matchExpressions) {
    if (this.matchExpressions != null) {
      this._visitables.get("matchExpressions").clear();
    }
    if (matchExpressions != null) {
        this.matchExpressions = new ArrayList();
        for (V1NodeSelectorRequirement item : matchExpressions) {
          this.addToMatchExpressions(item);
        }
    } else {
      this.matchExpressions = null;
    }
    return (A) this;
  }
  
  public A withMatchExpressions(V1NodeSelectorRequirement... matchExpressions) {
    if (this.matchExpressions != null) {
        this.matchExpressions.clear();
        _visitables.remove("matchExpressions");
    }
    if (matchExpressions != null) {
      for (V1NodeSelectorRequirement item : matchExpressions) {
        this.addToMatchExpressions(item);
      }
    }
    return (A) this;
  }
  
  public A withMatchFields(List<V1NodeSelectorRequirement> matchFields) {
    if (this.matchFields != null) {
      this._visitables.get("matchFields").clear();
    }
    if (matchFields != null) {
        this.matchFields = new ArrayList();
        for (V1NodeSelectorRequirement item : matchFields) {
          this.addToMatchFields(item);
        }
    } else {
      this.matchFields = null;
    }
    return (A) this;
  }
  
  public A withMatchFields(V1NodeSelectorRequirement... matchFields) {
    if (this.matchFields != null) {
        this.matchFields.clear();
        _visitables.remove("matchFields");
    }
    if (matchFields != null) {
      for (V1NodeSelectorRequirement item : matchFields) {
        this.addToMatchFields(item);
      }
    }
    return (A) this;
  }
  public class MatchExpressionsNested<N> extends V1NodeSelectorRequirementFluent<MatchExpressionsNested<N>> implements Nested<N>{
  
    V1NodeSelectorRequirementBuilder builder;
    int index;
  
    MatchExpressionsNested(int index,V1NodeSelectorRequirement item) {
      this.index = index;
      this.builder = new V1NodeSelectorRequirementBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NodeSelectorTermFluent.this.setToMatchExpressions(index, builder.build());
    }
    
    public N endMatchExpression() {
      return and();
    }
    
  }
  public class MatchFieldsNested<N> extends V1NodeSelectorRequirementFluent<MatchFieldsNested<N>> implements Nested<N>{
  
    V1NodeSelectorRequirementBuilder builder;
    int index;
  
    MatchFieldsNested(int index,V1NodeSelectorRequirement item) {
      this.index = index;
      this.builder = new V1NodeSelectorRequirementBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NodeSelectorTermFluent.this.setToMatchFields(index, builder.build());
    }
    
    public N endMatchField() {
      return and();
    }
    
  }
}