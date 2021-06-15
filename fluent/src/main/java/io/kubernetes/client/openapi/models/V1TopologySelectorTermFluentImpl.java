package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1TopologySelectorTermFluentImpl<A extends io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> matchLabelExpressions;

    public V1TopologySelectorTermFluentImpl() {
    }

    public V1TopologySelectorTermFluentImpl(io.kubernetes.client.openapi.models.V1TopologySelectorTerm instance) {
        this.withMatchLabelExpressions(instance.getMatchLabelExpressions());
    }

    public A addToMatchLabelExpressions(int index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item) {
        if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>();}
        io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").add(index >= 0 ? index : _visitables.get("matchLabelExpressions").size(), builder);this.matchLabelExpressions.add(index >= 0 ? index : matchLabelExpressions.size(), builder); return (A)this;
    }

    public A setToMatchLabelExpressions(int index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item) {
        if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>();}
        io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder(item);
        if (index < 0 || index >= _visitables.get("matchLabelExpressions").size()) { _visitables.get("matchLabelExpressions").add(builder); } else { _visitables.get("matchLabelExpressions").set(index, builder);}
        if (index < 0 || index >= matchLabelExpressions.size()) { matchLabelExpressions.add(builder); } else { matchLabelExpressions.set(index, builder);}
         return (A)this;
    }

    public A addToMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items) {
        if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>();}
        for (io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item : items) {io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").add(builder);this.matchLabelExpressions.add(builder);} return (A)this;
    }

    public A addAllToMatchLabelExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> items) {
        if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>();}
        for (io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item : items) {io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").add(builder);this.matchLabelExpressions.add(builder);} return (A)this;
    }

    public A removeFromMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items) {
        for (io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item : items) {io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").remove(builder);if (this.matchLabelExpressions != null) {this.matchLabelExpressions.remove(builder);}} return (A)this;
    }

    public A removeAllFromMatchLabelExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> items) {
        for (io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item : items) {io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder builder = new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder(item);_visitables.get("matchLabelExpressions").remove(builder);if (this.matchLabelExpressions != null) {this.matchLabelExpressions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromMatchLabelExpressions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate) {
        if (matchLabelExpressions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> each = matchLabelExpressions.iterator();
        final List visitables = _visitables.get("matchLabelExpressions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMatchLabelExpressions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> getMatchLabelExpressions() {
        return build(matchLabelExpressions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> buildMatchLabelExpressions() {
        return build(matchLabelExpressions);
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildMatchLabelExpression(int index) {
        return this.matchLabelExpressions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildFirstMatchLabelExpression() {
        return this.matchLabelExpressions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildLastMatchLabelExpression() {
        return this.matchLabelExpressions.get(matchLabelExpressions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder item: matchLabelExpressions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder item: matchLabelExpressions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withMatchLabelExpressions(java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> matchLabelExpressions) {
        if (this.matchLabelExpressions != null) { _visitables.get("matchLabelExpressions").removeAll(this.matchLabelExpressions);}
        if (matchLabelExpressions != null) {this.matchLabelExpressions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>(); for (io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item : matchLabelExpressions){this.addToMatchLabelExpressions(item);}} else { this.matchLabelExpressions = null;} return (A) this;
    }

    public A withMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... matchLabelExpressions) {
        if (this.matchLabelExpressions != null) {this.matchLabelExpressions.clear();}
        if (matchLabelExpressions != null) {for (io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item :matchLabelExpressions){ this.addToMatchLabelExpressions(item);}} return (A) this;
    }

    public java.lang.Boolean hasMatchLabelExpressions() {
        return matchLabelExpressions != null && !matchLabelExpressions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpression() {
        return new io.kubernetes.client.openapi.models.V1TopologySelectorTermFluentImpl.MatchLabelExpressionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpressionLike(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item) {
        return new io.kubernetes.client.openapi.models.V1TopologySelectorTermFluentImpl.MatchLabelExpressionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> setNewMatchLabelExpressionLike(int index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item) {
        return new io.kubernetes.client.openapi.models.V1TopologySelectorTermFluentImpl.MatchLabelExpressionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchLabelExpression(int index) {
        if (matchLabelExpressions.size() <= index) throw new RuntimeException("Can't edit matchLabelExpressions. Index exceeds size.");
        return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editFirstMatchLabelExpression() {
        if (matchLabelExpressions.size() == 0) throw new RuntimeException("Can't edit first matchLabelExpressions. The list is empty.");
        return setNewMatchLabelExpressionLike(0, buildMatchLabelExpression(0));
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editLastMatchLabelExpression() {
        int index = matchLabelExpressions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last matchLabelExpressions. The list is empty.");
        return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate) {
        int index = -1;
        for (int i=0;i<matchLabelExpressions.size();i++) { 
        if (predicate.test(matchLabelExpressions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching matchLabelExpressions. No match found.");
        return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1TopologySelectorTermFluentImpl that = (V1TopologySelectorTermFluentImpl) o;
        if (matchLabelExpressions != null ? !matchLabelExpressions.equals(that.matchLabelExpressions) :that.matchLabelExpressions != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(matchLabelExpressions,  super.hashCode());
    }

    public class MatchLabelExpressionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluentImpl<io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<N>> implements io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder builder;
        private final int index;

            MatchLabelExpressionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder(this, item);
                        
            }

            MatchLabelExpressionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder(this);
                        
            }

            public N and() {
                return (N) V1TopologySelectorTermFluentImpl.this.setToMatchLabelExpressions(index,builder.build());
            }

            public N endMatchLabelExpression() {
                return and();
            }
    }


}
