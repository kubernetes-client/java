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
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ClusterRoleFluent<A extends V1ClusterRoleFluent<A>> extends BaseFluent<A>{
  public V1ClusterRoleFluent() {
  }
  
  public V1ClusterRoleFluent(V1ClusterRole instance) {
    this.copyInstance(instance);
  }
  private V1AggregationRuleBuilder aggregationRule;
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1PolicyRuleBuilder> rules;
  
  protected void copyInstance(V1ClusterRole instance) {
    instance = (instance != null ? instance : new V1ClusterRole());
    if (instance != null) {
          this.withAggregationRule(instance.getAggregationRule());
          this.withApiVersion(instance.getApiVersion());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withRules(instance.getRules());
        }
  }
  
  public V1AggregationRule buildAggregationRule() {
    return this.aggregationRule != null ? this.aggregationRule.build() : null;
  }
  
  public A withAggregationRule(V1AggregationRule aggregationRule) {
    this._visitables.remove("aggregationRule");
    if (aggregationRule != null) {
        this.aggregationRule = new V1AggregationRuleBuilder(aggregationRule);
        this._visitables.get("aggregationRule").add(this.aggregationRule);
    } else {
        this.aggregationRule = null;
        this._visitables.get("aggregationRule").remove(this.aggregationRule);
    }
    return (A) this;
  }
  
  public boolean hasAggregationRule() {
    return this.aggregationRule != null;
  }
  
  public AggregationRuleNested<A> withNewAggregationRule() {
    return new AggregationRuleNested(null);
  }
  
  public AggregationRuleNested<A> withNewAggregationRuleLike(V1AggregationRule item) {
    return new AggregationRuleNested(item);
  }
  
  public AggregationRuleNested<A> editAggregationRule() {
    return withNewAggregationRuleLike(java.util.Optional.ofNullable(buildAggregationRule()).orElse(null));
  }
  
  public AggregationRuleNested<A> editOrNewAggregationRule() {
    return withNewAggregationRuleLike(java.util.Optional.ofNullable(buildAggregationRule()).orElse(new V1AggregationRuleBuilder().build()));
  }
  
  public AggregationRuleNested<A> editOrNewAggregationRuleLike(V1AggregationRule item) {
    return withNewAggregationRuleLike(java.util.Optional.ofNullable(buildAggregationRule()).orElse(item));
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public A addToRules(int index,V1PolicyRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRuleBuilder>();}
    V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").add(index, builder); rules.add(index, builder);}
    return (A)this;
  }
  
  public A setToRules(int index,V1PolicyRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRuleBuilder>();}
    V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").set(index, builder); rules.set(index, builder);}
    return (A)this;
  }
  
  public A addToRules(io.kubernetes.client.openapi.models.V1PolicyRule... items) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRuleBuilder>();}
    for (V1PolicyRule item : items) {V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  
  public A addAllToRules(Collection<V1PolicyRule> items) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRuleBuilder>();}
    for (V1PolicyRule item : items) {V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  
  public A removeFromRules(io.kubernetes.client.openapi.models.V1PolicyRule... items) {
    if (this.rules == null) return (A)this;
    for (V1PolicyRule item : items) {V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRules(Collection<V1PolicyRule> items) {
    if (this.rules == null) return (A)this;
    for (V1PolicyRule item : items) {V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromRules(Predicate<V1PolicyRuleBuilder> predicate) {
    if (rules == null) return (A) this;
    final Iterator<V1PolicyRuleBuilder> each = rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      V1PolicyRuleBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1PolicyRule> buildRules() {
    return this.rules != null ? build(rules) : null;
  }
  
  public V1PolicyRule buildRule(int index) {
    return this.rules.get(index).build();
  }
  
  public V1PolicyRule buildFirstRule() {
    return this.rules.get(0).build();
  }
  
  public V1PolicyRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  
  public V1PolicyRule buildMatchingRule(Predicate<V1PolicyRuleBuilder> predicate) {
      for (V1PolicyRuleBuilder item : rules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRule(Predicate<V1PolicyRuleBuilder> predicate) {
      for (V1PolicyRuleBuilder item : rules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRules(List<V1PolicyRule> rules) {
    if (this.rules != null) {
      this._visitables.get("rules").clear();
    }
    if (rules != null) {
        this.rules = new ArrayList();
        for (V1PolicyRule item : rules) {
          this.addToRules(item);
        }
    } else {
      this.rules = null;
    }
    return (A) this;
  }
  
  public A withRules(io.kubernetes.client.openapi.models.V1PolicyRule... rules) {
    if (this.rules != null) {
        this.rules.clear();
        _visitables.remove("rules");
    }
    if (rules != null) {
      for (V1PolicyRule item : rules) {
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
  
  public RulesNested<A> addNewRuleLike(V1PolicyRule item) {
    return new RulesNested(-1, item);
  }
  
  public RulesNested<A> setNewRuleLike(int index,V1PolicyRule item) {
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
  
  public RulesNested<A> editMatchingRule(Predicate<V1PolicyRuleBuilder> predicate) {
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
    V1ClusterRoleFluent that = (V1ClusterRoleFluent) o;
    if (!java.util.Objects.equals(aggregationRule, that.aggregationRule)) return false;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(rules, that.rules)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(aggregationRule,  apiVersion,  kind,  metadata,  rules,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (aggregationRule != null) { sb.append("aggregationRule:"); sb.append(aggregationRule + ","); }
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (rules != null && !rules.isEmpty()) { sb.append("rules:"); sb.append(rules); }
    sb.append("}");
    return sb.toString();
  }
  public class AggregationRuleNested<N> extends V1AggregationRuleFluent<AggregationRuleNested<N>> implements Nested<N>{
    AggregationRuleNested(V1AggregationRule item) {
      this.builder = new V1AggregationRuleBuilder(this, item);
    }
    V1AggregationRuleBuilder builder;
    
    public N and() {
      return (N) V1ClusterRoleFluent.this.withAggregationRule(builder.build());
    }
    
    public N endAggregationRule() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1ClusterRoleFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class RulesNested<N> extends V1PolicyRuleFluent<RulesNested<N>> implements Nested<N>{
    RulesNested(int index,V1PolicyRule item) {
      this.index = index;
      this.builder = new V1PolicyRuleBuilder(this, item);
    }
    V1PolicyRuleBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ClusterRoleFluent.this.setToRules(index,builder.build());
    }
    
    public N endRule() {
      return and();
    }
    
  
  }

}