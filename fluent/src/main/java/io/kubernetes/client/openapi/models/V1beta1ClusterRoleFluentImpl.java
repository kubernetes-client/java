package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

public class V1beta1ClusterRoleFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent<A> {

    private io.kubernetes.client.openapi.models.V1beta1AggregationRuleBuilder aggregationRule;
    private java.lang.String apiVersion;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
    private java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> rules;

    public V1beta1ClusterRoleFluentImpl() {
    }

    public V1beta1ClusterRoleFluentImpl(io.kubernetes.client.openapi.models.V1beta1ClusterRole instance) {
        this.withAggregationRule(instance.getAggregationRule());
        
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withRules(instance.getRules());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAggregationRule instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1AggregationRule getAggregationRule() {
        return this.aggregationRule!=null?this.aggregationRule.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1AggregationRule buildAggregationRule() {
        return this.aggregationRule!=null?this.aggregationRule.build():null;
    }

    public A withAggregationRule(io.kubernetes.client.openapi.models.V1beta1AggregationRule aggregationRule) {
        _visitables.get("aggregationRule").remove(this.aggregationRule);
        if (aggregationRule!=null){ this.aggregationRule= new io.kubernetes.client.openapi.models.V1beta1AggregationRuleBuilder(aggregationRule); _visitables.get("aggregationRule").add(this.aggregationRule);} return (A) this;
    }

    public java.lang.Boolean hasAggregationRule() {
        return this.aggregationRule != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRule() {
        return new io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluentImpl.AggregationRuleNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRuleLike(io.kubernetes.client.openapi.models.V1beta1AggregationRule item) {
        return new io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluentImpl.AggregationRuleNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.AggregationRuleNested<A> editAggregationRule() {
        return withNewAggregationRuleLike(getAggregationRule());
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRule() {
        return withNewAggregationRuleLike(getAggregationRule() != null ? getAggregationRule(): new io.kubernetes.client.openapi.models.V1beta1AggregationRuleBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRuleLike(io.kubernetes.client.openapi.models.V1beta1AggregationRule item) {
        return withNewAggregationRuleLike(getAggregationRule() != null ? getAggregationRule(): item);
    }

    public java.lang.String getApiVersion() {
        return this.apiVersion;
    }

    public A withApiVersion(java.lang.String apiVersion) {
        this.apiVersion=apiVersion; return (A) this;
    }

    public java.lang.Boolean hasApiVersion() {
        return this.apiVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original) {
        return (A)withApiVersion(new String(original));
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
        _visitables.get("metadata").remove(this.metadata);
        if (metadata!=null){ this.metadata= new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} return (A) this;
    }

    public java.lang.Boolean hasMetadata() {
        return this.metadata != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.MetadataNested<A> withNewMetadata() {
        return new io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluentImpl.MetadataNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return new io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluentImpl.MetadataNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.MetadataNested<A> editMetadata() {
        return withNewMetadataLike(getMetadata());
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.MetadataNested<A> editOrNewMetadata() {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToRules(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRule item) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder(item);_visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
    }

    public A setToRules(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRule item) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder(item);
        if (index < 0 || index >= _visitables.get("rules").size()) { _visitables.get("rules").add(builder); } else { _visitables.get("rules").set(index, builder);}
        if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
         return (A)this;
    }

    public A addToRules(io.kubernetes.client.openapi.models.V1beta1PolicyRule... items) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1PolicyRule item : items) {io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
    }

    public A addAllToRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PolicyRule> items) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1PolicyRule item : items) {io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
    }

    public A removeFromRules(io.kubernetes.client.openapi.models.V1beta1PolicyRule... items) {
        for (io.kubernetes.client.openapi.models.V1beta1PolicyRule item : items) {io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeAllFromRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PolicyRule> items) {
        for (io.kubernetes.client.openapi.models.V1beta1PolicyRule item : items) {io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> predicate) {
        if (rules == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> each = rules.iterator();
        final List visitables = _visitables.get("rules");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRule> getRules() {
        return build(rules);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRule> buildRules() {
        return build(rules);
    }

    public io.kubernetes.client.openapi.models.V1beta1PolicyRule buildRule(int index) {
        return this.rules.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1PolicyRule buildFirstRule() {
        return this.rules.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1PolicyRule buildLastRule() {
        return this.rules.get(rules.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1PolicyRule buildMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder item: rules) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder item: rules) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRule> rules) {
        if (this.rules != null) { _visitables.get("rules").removeAll(this.rules);}
        if (rules != null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder>(); for (io.kubernetes.client.openapi.models.V1beta1PolicyRule item : rules){this.addToRules(item);}} else { this.rules = null;} return (A) this;
    }

    public A withRules(io.kubernetes.client.openapi.models.V1beta1PolicyRule... rules) {
        if (this.rules != null) {this.rules.clear();}
        if (rules != null) {for (io.kubernetes.client.openapi.models.V1beta1PolicyRule item :rules){ this.addToRules(item);}} return (A) this;
    }

    public java.lang.Boolean hasRules() {
        return rules != null && !rules.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<A> addNewRule() {
        return new io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluentImpl.RulesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<A> addNewRuleLike(io.kubernetes.client.openapi.models.V1beta1PolicyRule item) {
        return new io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluentImpl.RulesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<A> setNewRuleLike(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRule item) {
        return new io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluentImpl.RulesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<A> editRule(int index) {
        if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
        return setNewRuleLike(index, buildRule(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<A> editFirstRule() {
        if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
        return setNewRuleLike(0, buildRule(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<A> editLastRule() {
        int index = rules.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
        return setNewRuleLike(index, buildRule(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<A> editMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> predicate) {
        int index = -1;
        for (int i=0;i<rules.size();i++) { 
        if (predicate.test(rules.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
        return setNewRuleLike(index, buildRule(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1ClusterRoleFluentImpl that = (V1beta1ClusterRoleFluentImpl) o;
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

    public class AggregationRuleNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1AggregationRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.AggregationRuleNested<N>> implements io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.AggregationRuleNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1AggregationRuleBuilder builder;

            AggregationRuleNestedImpl(io.kubernetes.client.openapi.models.V1beta1AggregationRule item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1AggregationRuleBuilder(this, item);
                        
            }

            AggregationRuleNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1AggregationRuleBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1ClusterRoleFluentImpl.this.withAggregationRule(builder.build());
            }

            public N endAggregationRule() {
                return and();
            }
    }


    public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

            MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
                        
            }

            MetadataNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1ClusterRoleFluentImpl.this.withMetadata(builder.build());
            }

            public N endMetadata() {
                return and();
            }
    }


    public class RulesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1PolicyRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent.RulesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder builder;
        private final int index;

            RulesNestedImpl(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRule item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder(this, item);
                        
            }

            RulesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1ClusterRoleFluentImpl.this.setToRules(index,builder.build());
            }

            public N endRule() {
                return and();
            }
    }


}
