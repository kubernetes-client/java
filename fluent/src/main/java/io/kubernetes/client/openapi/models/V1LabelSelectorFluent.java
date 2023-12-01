package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LabelSelectorFluent<A extends V1LabelSelectorFluent<A>> extends BaseFluent<A>{
  public V1LabelSelectorFluent() {
  }
  
  public V1LabelSelectorFluent(V1LabelSelector instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1LabelSelectorRequirementBuilder> matchExpressions;
  private Map<String,String> matchLabels;
  
  protected void copyInstance(V1LabelSelector instance) {
    instance = (instance != null ? instance : new V1LabelSelector());
    if (instance != null) {
          this.withMatchExpressions(instance.getMatchExpressions());
          this.withMatchLabels(instance.getMatchLabels());
        }
  }
  
  public A addToMatchExpressions(int index,V1LabelSelectorRequirement item) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<V1LabelSelectorRequirementBuilder>();}
    V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) { _visitables.get("matchExpressions").add(builder); matchExpressions.add(builder); } else { _visitables.get("matchExpressions").add(index, builder); matchExpressions.add(index, builder);}
    return (A)this;
  }
  
  public A setToMatchExpressions(int index,V1LabelSelectorRequirement item) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<V1LabelSelectorRequirementBuilder>();}
    V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) { _visitables.get("matchExpressions").add(builder); matchExpressions.add(builder); } else { _visitables.get("matchExpressions").set(index, builder); matchExpressions.set(index, builder);}
    return (A)this;
  }
  
  public A addToMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<V1LabelSelectorRequirementBuilder>();}
    for (V1LabelSelectorRequirement item : items) {V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  
  public A addAllToMatchExpressions(Collection<V1LabelSelectorRequirement> items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<V1LabelSelectorRequirementBuilder>();}
    for (V1LabelSelectorRequirement item : items) {V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  
  public A removeFromMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items) {
    if (this.matchExpressions == null) return (A)this;
    for (V1LabelSelectorRequirement item : items) {V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").remove(builder); this.matchExpressions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromMatchExpressions(Collection<V1LabelSelectorRequirement> items) {
    if (this.matchExpressions == null) return (A)this;
    for (V1LabelSelectorRequirement item : items) {V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").remove(builder); this.matchExpressions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromMatchExpressions(Predicate<V1LabelSelectorRequirementBuilder> predicate) {
    if (matchExpressions == null) return (A) this;
    final Iterator<V1LabelSelectorRequirementBuilder> each = matchExpressions.iterator();
    final List visitables = _visitables.get("matchExpressions");
    while (each.hasNext()) {
      V1LabelSelectorRequirementBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1LabelSelectorRequirement> buildMatchExpressions() {
    return this.matchExpressions != null ? build(matchExpressions) : null;
  }
  
  public V1LabelSelectorRequirement buildMatchExpression(int index) {
    return this.matchExpressions.get(index).build();
  }
  
  public V1LabelSelectorRequirement buildFirstMatchExpression() {
    return this.matchExpressions.get(0).build();
  }
  
  public V1LabelSelectorRequirement buildLastMatchExpression() {
    return this.matchExpressions.get(matchExpressions.size() - 1).build();
  }
  
  public V1LabelSelectorRequirement buildMatchingMatchExpression(Predicate<V1LabelSelectorRequirementBuilder> predicate) {
      for (V1LabelSelectorRequirementBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchExpression(Predicate<V1LabelSelectorRequirementBuilder> predicate) {
      for (V1LabelSelectorRequirementBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMatchExpressions(List<V1LabelSelectorRequirement> matchExpressions) {
    if (this.matchExpressions != null) {
      this._visitables.get("matchExpressions").clear();
    }
    if (matchExpressions != null) {
        this.matchExpressions = new ArrayList();
        for (V1LabelSelectorRequirement item : matchExpressions) {
          this.addToMatchExpressions(item);
        }
    } else {
      this.matchExpressions = null;
    }
    return (A) this;
  }
  
  public A withMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... matchExpressions) {
    if (this.matchExpressions != null) {
        this.matchExpressions.clear();
        _visitables.remove("matchExpressions");
    }
    if (matchExpressions != null) {
      for (V1LabelSelectorRequirement item : matchExpressions) {
        this.addToMatchExpressions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMatchExpressions() {
    return this.matchExpressions != null && !this.matchExpressions.isEmpty();
  }
  
  public MatchExpressionsNested<A> addNewMatchExpression() {
    return new MatchExpressionsNested(-1, null);
  }
  
  public MatchExpressionsNested<A> addNewMatchExpressionLike(V1LabelSelectorRequirement item) {
    return new MatchExpressionsNested(-1, item);
  }
  
  public MatchExpressionsNested<A> setNewMatchExpressionLike(int index,V1LabelSelectorRequirement item) {
    return new MatchExpressionsNested(index, item);
  }
  
  public MatchExpressionsNested<A> editMatchExpression(int index) {
    if (matchExpressions.size() <= index) throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public MatchExpressionsNested<A> editFirstMatchExpression() {
    if (matchExpressions.size() == 0) throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(0, buildMatchExpression(0));
  }
  
  public MatchExpressionsNested<A> editLastMatchExpression() {
    int index = matchExpressions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public MatchExpressionsNested<A> editMatchingMatchExpression(Predicate<V1LabelSelectorRequirementBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchExpressions.size();i++) { 
    if (predicate.test(matchExpressions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public A addToMatchLabels(String key,String value) {
    if(this.matchLabels == null && key != null && value != null) { this.matchLabels = new LinkedHashMap(); }
    if(key != null && value != null) {this.matchLabels.put(key, value);} return (A)this;
  }
  
  public A addToMatchLabels(Map<String,String> map) {
    if(this.matchLabels == null && map != null) { this.matchLabels = new LinkedHashMap(); }
    if(map != null) { this.matchLabels.putAll(map);} return (A)this;
  }
  
  public A removeFromMatchLabels(String key) {
    if(this.matchLabels == null) { return (A) this; }
    if(key != null && this.matchLabels != null) {this.matchLabels.remove(key);} return (A)this;
  }
  
  public A removeFromMatchLabels(Map<String,String> map) {
    if(this.matchLabels == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.matchLabels != null){this.matchLabels.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getMatchLabels() {
    return this.matchLabels;
  }
  
  public <K,V>A withMatchLabels(Map<String,String> matchLabels) {
    if (matchLabels == null) {
      this.matchLabels = null;
    } else {
      this.matchLabels = new LinkedHashMap(matchLabels);
    }
    return (A) this;
  }
  
  public boolean hasMatchLabels() {
    return this.matchLabels != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LabelSelectorFluent that = (V1LabelSelectorFluent) o;
    if (!java.util.Objects.equals(matchExpressions, that.matchExpressions)) return false;
    if (!java.util.Objects.equals(matchLabels, that.matchLabels)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(matchExpressions,  matchLabels,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (matchExpressions != null && !matchExpressions.isEmpty()) { sb.append("matchExpressions:"); sb.append(matchExpressions + ","); }
    if (matchLabels != null && !matchLabels.isEmpty()) { sb.append("matchLabels:"); sb.append(matchLabels); }
    sb.append("}");
    return sb.toString();
  }
  public class MatchExpressionsNested<N> extends V1LabelSelectorRequirementFluent<MatchExpressionsNested<N>> implements Nested<N>{
    MatchExpressionsNested(int index,V1LabelSelectorRequirement item) {
      this.index = index;
      this.builder = new V1LabelSelectorRequirementBuilder(this, item);
    }
    V1LabelSelectorRequirementBuilder builder;
    int index;
    
    public N and() {
      return (N) V1LabelSelectorFluent.this.setToMatchExpressions(index,builder.build());
    }
    
    public N endMatchExpression() {
      return and();
    }
    
  
  }

}