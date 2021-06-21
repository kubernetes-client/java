package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class V1LabelSelectorFluentImpl<A extends io.kubernetes.client.openapi.models.V1LabelSelectorFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1LabelSelectorFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> matchExpressions;
    private java.util.Map<java.lang.String,java.lang.String> matchLabels;

    public V1LabelSelectorFluentImpl() {
    }

    public V1LabelSelectorFluentImpl(io.kubernetes.client.openapi.models.V1LabelSelector instance) {
        this.withMatchExpressions(instance.getMatchExpressions());
        
        this.withMatchLabels(instance.getMatchLabels());
    }

    public A addToMatchExpressions(int index,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item) {
        if (this.matchExpressions == null) {this.matchExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder>();}
        io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").add(index >= 0 ? index : _visitables.get("matchExpressions").size(), builder);this.matchExpressions.add(index >= 0 ? index : matchExpressions.size(), builder); return (A)this;
    }

    public A setToMatchExpressions(int index,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item) {
        if (this.matchExpressions == null) {this.matchExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder>();}
        io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder(item);
        if (index < 0 || index >= _visitables.get("matchExpressions").size()) { _visitables.get("matchExpressions").add(builder); } else { _visitables.get("matchExpressions").set(index, builder);}
        if (index < 0 || index >= matchExpressions.size()) { matchExpressions.add(builder); } else { matchExpressions.set(index, builder);}
         return (A)this;
    }

    public A addToMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items) {
        if (this.matchExpressions == null) {this.matchExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder>();}
        for (io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item : items) {io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
    }

    public A addAllToMatchExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> items) {
        if (this.matchExpressions == null) {this.matchExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder>();}
        for (io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item : items) {io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
    }

    public A removeFromMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items) {
        for (io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item : items) {io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
    }

    public A removeAllFromMatchExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> items) {
        for (io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item : items) {io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder(item);_visitables.get("matchExpressions").remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromMatchExpressions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> predicate) {
        if (matchExpressions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> each = matchExpressions.iterator();
        final List visitables = _visitables.get("matchExpressions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMatchExpressions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> getMatchExpressions() {
        return build(matchExpressions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> buildMatchExpressions() {
        return build(matchExpressions);
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildMatchExpression(int index) {
        return this.matchExpressions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildFirstMatchExpression() {
        return this.matchExpressions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildLastMatchExpression() {
        return this.matchExpressions.get(matchExpressions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder item: matchExpressions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder item: matchExpressions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withMatchExpressions(java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> matchExpressions) {
        if (this.matchExpressions != null) { _visitables.get("matchExpressions").removeAll(this.matchExpressions);}
        if (matchExpressions != null) {this.matchExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder>(); for (io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item : matchExpressions){this.addToMatchExpressions(item);}} else { this.matchExpressions = null;} return (A) this;
    }

    public A withMatchExpressions(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... matchExpressions) {
        if (this.matchExpressions != null) {this.matchExpressions.clear();}
        if (matchExpressions != null) {for (io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item :matchExpressions){ this.addToMatchExpressions(item);}} return (A) this;
    }

    public java.lang.Boolean hasMatchExpressions() {
        return matchExpressions != null && !matchExpressions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression() {
        return new io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl.MatchExpressionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item) {
        return new io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl.MatchExpressionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item) {
        return new io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl.MatchExpressionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> editMatchExpression(int index) {
        if (matchExpressions.size() <= index) throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
        return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression() {
        if (matchExpressions.size() == 0) throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
        return setNewMatchExpressionLike(0, buildMatchExpression(0));
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression() {
        int index = matchExpressions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
        return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> predicate) {
        int index = -1;
        for (int i=0;i<matchExpressions.size();i++) { 
        if (predicate.test(matchExpressions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
        return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public A addToMatchLabels(java.lang.String key,java.lang.String value) {
        if(this.matchLabels == null && key != null && value != null) { this.matchLabels = new java.util.LinkedHashMap<java.lang.String,java.lang.String>(); }
        if(key != null && value != null) {this.matchLabels.put(key, value);} return (A)this;
    }

    public A addToMatchLabels(java.util.Map<java.lang.String,java.lang.String> map) {
        if(this.matchLabels == null && map != null) { this.matchLabels = new java.util.LinkedHashMap<java.lang.String,java.lang.String>(); }
        if(map != null) { this.matchLabels.putAll(map);} return (A)this;
    }

    public A removeFromMatchLabels(java.lang.String key) {
        if(this.matchLabels == null) { return (A) this; }
        if(key != null && this.matchLabels != null) {this.matchLabels.remove(key);} return (A)this;
    }

    public A removeFromMatchLabels(java.util.Map<java.lang.String,java.lang.String> map) {
        if(this.matchLabels == null) { return (A) this; }
        if(map != null) { for(Object key : map.keySet()) {if (this.matchLabels != null){this.matchLabels.remove(key);}}} return (A)this;
    }

    public java.util.Map<java.lang.String,java.lang.String> getMatchLabels() {
        return this.matchLabels;
    }

    public <K,V>A withMatchLabels(java.util.Map<java.lang.String,java.lang.String> matchLabels) {
        if (matchLabels == null) { this.matchLabels =  null;} else {this.matchLabels = new java.util.LinkedHashMap<java.lang.String,java.lang.String>(matchLabels);} return (A) this;
    }

    public java.lang.Boolean hasMatchLabels() {
        return this.matchLabels != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1LabelSelectorFluentImpl that = (V1LabelSelectorFluentImpl) o;
        if (matchExpressions != null ? !matchExpressions.equals(that.matchExpressions) :that.matchExpressions != null) return false;
        if (matchLabels != null ? !matchLabels.equals(that.matchLabels) :that.matchLabels != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(matchExpressions,  matchLabels,  super.hashCode());
    }

    public class MatchExpressionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluentImpl<io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<N>> implements io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder builder;
        private final int index;

            MatchExpressionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder(this, item);
                        
            }

            MatchExpressionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder(this);
                        
            }

            public N and() {
                return (N) V1LabelSelectorFluentImpl.this.setToMatchExpressions(index,builder.build());
            }

            public N endMatchExpression() {
                return and();
            }
    }


}
