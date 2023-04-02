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
  public class V1ClusterRoleFluentImpl<A extends V1ClusterRoleFluent<A>> extends BaseFluent<A> implements V1ClusterRoleFluent<A>{
  public V1ClusterRoleFluentImpl() {
  }
  public V1ClusterRoleFluentImpl(V1ClusterRole instance) {
    this.withAggregationRule(instance.getAggregationRule());

    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRules(instance.getRules());

  }
  private V1AggregationRuleBuilder aggregationRule;
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1PolicyRuleBuilder> rules;
  
  /**
   * This method has been deprecated, please use method buildAggregationRule instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AggregationRule getAggregationRule() {
    return this.aggregationRule!=null ?this.aggregationRule.build():null;
  }
  public V1AggregationRule buildAggregationRule() {
    return this.aggregationRule!=null ?this.aggregationRule.build():null;
  }
  public A withAggregationRule(V1AggregationRule aggregationRule) {
    _visitables.get("aggregationRule").remove(this.aggregationRule);
    if (aggregationRule!=null){ this.aggregationRule= new V1AggregationRuleBuilder(aggregationRule); _visitables.get("aggregationRule").add(this.aggregationRule);} else { this.aggregationRule = null; _visitables.get("aggregationRule").remove(this.aggregationRule); } return (A) this;
  }
  public Boolean hasAggregationRule() {
    return this.aggregationRule != null;
  }
  public V1ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRule() {
    return new V1ClusterRoleFluentImpl.AggregationRuleNestedImpl();
  }
  public V1ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRuleLike(V1AggregationRule item) {
    return new V1ClusterRoleFluentImpl.AggregationRuleNestedImpl(item);
  }
  public V1ClusterRoleFluent.AggregationRuleNested<A> editAggregationRule() {
    return withNewAggregationRuleLike(getAggregationRule());
  }
  public V1ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRule() {
    return withNewAggregationRuleLike(getAggregationRule() != null ? getAggregationRule(): new V1AggregationRuleBuilder().build());
  }
  public V1ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRuleLike(V1AggregationRule item) {
    return withNewAggregationRuleLike(getAggregationRule() != null ? getAggregationRule(): item);
  }
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1ClusterRoleFluent.MetadataNested<A> withNewMetadata() {
    return new V1ClusterRoleFluentImpl.MetadataNestedImpl();
  }
  public V1ClusterRoleFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1ClusterRoleFluentImpl.MetadataNestedImpl(item);
  }
  public V1ClusterRoleFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1ClusterRoleFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1ClusterRoleFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public A addToRules(Integer index,V1PolicyRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRuleBuilder>();}
    V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);_visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
  }
  public A setToRules(Integer index,V1PolicyRule item) {
    if (this.rules == null) {this.rules = new ArrayList<V1PolicyRuleBuilder>();}
    V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);
    if (index < 0 || index >= _visitables.get("rules").size()) { _visitables.get("rules").add(builder); } else { _visitables.get("rules").set(index, builder);}
    if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
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
    for (V1PolicyRule item : items) {V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
  }
  public A removeAllFromRules(Collection<V1PolicyRule> items) {
    for (V1PolicyRule item : items) {V1PolicyRuleBuilder builder = new V1PolicyRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PolicyRule> getRules() {
    return rules != null ? build(rules) : null;
  }
  public List<V1PolicyRule> buildRules() {
    return rules != null ? build(rules) : null;
  }
  public V1PolicyRule buildRule(Integer index) {
    return this.rules.get(index).build();
  }
  public V1PolicyRule buildFirstRule() {
    return this.rules.get(0).build();
  }
  public V1PolicyRule buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  public V1PolicyRule buildMatchingRule(Predicate<V1PolicyRuleBuilder> predicate) {
    for (V1PolicyRuleBuilder item: rules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingRule(Predicate<V1PolicyRuleBuilder> predicate) {
    for (V1PolicyRuleBuilder item: rules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withRules(List<V1PolicyRule> rules) {
    if (this.rules != null) { _visitables.get("rules").removeAll(this.rules);}
    if (rules != null) {this.rules = new ArrayList(); for (V1PolicyRule item : rules){this.addToRules(item);}} else { this.rules = null;} return (A) this;
  }
  public A withRules(io.kubernetes.client.openapi.models.V1PolicyRule... rules) {
    if (this.rules != null) {this.rules.clear();}
    if (rules != null) {for (V1PolicyRule item :rules){ this.addToRules(item);}} return (A) this;
  }
  public Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }
  public V1ClusterRoleFluent.RulesNested<A> addNewRule() {
    return new V1ClusterRoleFluentImpl.RulesNestedImpl();
  }
  public V1ClusterRoleFluent.RulesNested<A> addNewRuleLike(V1PolicyRule item) {
    return new V1ClusterRoleFluentImpl.RulesNestedImpl(-1, item);
  }
  public V1ClusterRoleFluent.RulesNested<A> setNewRuleLike(Integer index,V1PolicyRule item) {
    return new V1ClusterRoleFluentImpl.RulesNestedImpl(index, item);
  }
  public V1ClusterRoleFluent.RulesNested<A> editRule(Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1ClusterRoleFluent.RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }
  public V1ClusterRoleFluent.RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1ClusterRoleFluent.RulesNested<A> editMatchingRule(Predicate<V1PolicyRuleBuilder> predicate) {
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
    V1ClusterRoleFluentImpl that = (V1ClusterRoleFluentImpl) o;
    if (aggregationRule != null ? !aggregationRule.equals(that.aggregationRule) :that.aggregationRule != null) return false;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
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
  class AggregationRuleNestedImpl<N> extends V1AggregationRuleFluentImpl<V1ClusterRoleFluent.AggregationRuleNested<N>> implements V1ClusterRoleFluent.AggregationRuleNested<N>,Nested<N>{
    AggregationRuleNestedImpl(V1AggregationRule item) {
      this.builder = new V1AggregationRuleBuilder(this, item);
    }
    AggregationRuleNestedImpl() {
      this.builder = new V1AggregationRuleBuilder(this);
    }
    V1AggregationRuleBuilder builder;
    public N and() {
      return (N) V1ClusterRoleFluentImpl.this.withAggregationRule(builder.build());
    }
    public N endAggregationRule() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1ClusterRoleFluent.MetadataNested<N>> implements V1ClusterRoleFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1ClusterRoleFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class RulesNestedImpl<N> extends V1PolicyRuleFluentImpl<V1ClusterRoleFluent.RulesNested<N>> implements V1ClusterRoleFluent.RulesNested<N>,Nested<N>{
    RulesNestedImpl(Integer index,V1PolicyRule item) {
      this.index = index;
      this.builder = new V1PolicyRuleBuilder(this, item);
    }
    RulesNestedImpl() {
      this.index = -1;
      this.builder = new V1PolicyRuleBuilder(this);
    }
    V1PolicyRuleBuilder builder;
    Integer index;
    public N and() {
      return (N) V1ClusterRoleFluentImpl.this.setToRules(index,builder.build());
    }
    public N endRule() {
      return and();
    }
    
  }
  
}