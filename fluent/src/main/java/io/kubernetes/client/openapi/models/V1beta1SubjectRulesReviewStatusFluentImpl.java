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

public class V1beta1SubjectRulesReviewStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent<A> {

    private java.lang.String evaluationError;
    private java.lang.Boolean incomplete;
    private java.util.List<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder> nonResourceRules;
    private java.util.List<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder> resourceRules;

    public V1beta1SubjectRulesReviewStatusFluentImpl() {
    }

    public V1beta1SubjectRulesReviewStatusFluentImpl(io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatus instance) {
        this.withEvaluationError(instance.getEvaluationError());
        
        this.withIncomplete(instance.getIncomplete());
        
        this.withNonResourceRules(instance.getNonResourceRules());
        
        this.withResourceRules(instance.getResourceRules());
    }

    public java.lang.String getEvaluationError() {
        return this.evaluationError;
    }

    public A withEvaluationError(java.lang.String evaluationError) {
        this.evaluationError=evaluationError; return (A) this;
    }

    public java.lang.Boolean hasEvaluationError() {
        return this.evaluationError != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEvaluationError instead.
     */
        public A withNewEvaluationError(java.lang.String original) {
        return (A)withEvaluationError(new String(original));
    }

    public java.lang.Boolean getIncomplete() {
        return this.incomplete;
    }

    public A withIncomplete(java.lang.Boolean incomplete) {
        this.incomplete=incomplete; return (A) this;
    }

    public java.lang.Boolean hasIncomplete() {
        return this.incomplete != null;
    }

    public A addToNonResourceRules(int index,io.kubernetes.client.openapi.models.V1beta1NonResourceRule item) {
        if (this.nonResourceRules == null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").add(index >= 0 ? index : _visitables.get("nonResourceRules").size(), builder);this.nonResourceRules.add(index >= 0 ? index : nonResourceRules.size(), builder); return (A)this;
    }

    public A setToNonResourceRules(int index,io.kubernetes.client.openapi.models.V1beta1NonResourceRule item) {
        if (this.nonResourceRules == null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder(item);
        if (index < 0 || index >= _visitables.get("nonResourceRules").size()) { _visitables.get("nonResourceRules").add(builder); } else { _visitables.get("nonResourceRules").set(index, builder);}
        if (index < 0 || index >= nonResourceRules.size()) { nonResourceRules.add(builder); } else { nonResourceRules.set(index, builder);}
         return (A)this;
    }

    public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourceRule... items) {
        if (this.nonResourceRules == null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1NonResourceRule item : items) {io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").add(builder);this.nonResourceRules.add(builder);} return (A)this;
    }

    public A addAllToNonResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1NonResourceRule> items) {
        if (this.nonResourceRules == null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1NonResourceRule item : items) {io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").add(builder);this.nonResourceRules.add(builder);} return (A)this;
    }

    public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourceRule... items) {
        for (io.kubernetes.client.openapi.models.V1beta1NonResourceRule item : items) {io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").remove(builder);if (this.nonResourceRules != null) {this.nonResourceRules.remove(builder);}} return (A)this;
    }

    public A removeAllFromNonResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1NonResourceRule> items) {
        for (io.kubernetes.client.openapi.models.V1beta1NonResourceRule item : items) {io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder(item);_visitables.get("nonResourceRules").remove(builder);if (this.nonResourceRules != null) {this.nonResourceRules.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromNonResourceRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder> predicate) {
        if (nonResourceRules == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder> each = nonResourceRules.iterator();
        final List visitables = _visitables.get("nonResourceRules");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNonResourceRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1NonResourceRule> getNonResourceRules() {
        return build(nonResourceRules);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1beta1NonResourceRule> buildNonResourceRules() {
        return build(nonResourceRules);
    }

    public io.kubernetes.client.openapi.models.V1beta1NonResourceRule buildNonResourceRule(int index) {
        return this.nonResourceRules.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1NonResourceRule buildFirstNonResourceRule() {
        return this.nonResourceRules.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1NonResourceRule buildLastNonResourceRule() {
        return this.nonResourceRules.get(nonResourceRules.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1NonResourceRule buildMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder item: nonResourceRules) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder item: nonResourceRules) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withNonResourceRules(java.util.List<io.kubernetes.client.openapi.models.V1beta1NonResourceRule> nonResourceRules) {
        if (this.nonResourceRules != null) { _visitables.get("nonResourceRules").removeAll(this.nonResourceRules);}
        if (nonResourceRules != null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder>(); for (io.kubernetes.client.openapi.models.V1beta1NonResourceRule item : nonResourceRules){this.addToNonResourceRules(item);}} else { this.nonResourceRules = null;} return (A) this;
    }

    public A withNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourceRule... nonResourceRules) {
        if (this.nonResourceRules != null) {this.nonResourceRules.clear();}
        if (nonResourceRules != null) {for (io.kubernetes.client.openapi.models.V1beta1NonResourceRule item :nonResourceRules){ this.addToNonResourceRules(item);}} return (A) this;
    }

    public java.lang.Boolean hasNonResourceRules() {
        return nonResourceRules != null && !nonResourceRules.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRule() {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluentImpl.NonResourceRulesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(io.kubernetes.client.openapi.models.V1beta1NonResourceRule item) {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluentImpl.NonResourceRulesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(int index,io.kubernetes.client.openapi.models.V1beta1NonResourceRule item) {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluentImpl.NonResourceRulesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editNonResourceRule(int index) {
        if (nonResourceRules.size() <= index) throw new RuntimeException("Can't edit nonResourceRules. Index exceeds size.");
        return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editFirstNonResourceRule() {
        if (nonResourceRules.size() == 0) throw new RuntimeException("Can't edit first nonResourceRules. The list is empty.");
        return setNewNonResourceRuleLike(0, buildNonResourceRule(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editLastNonResourceRule() {
        int index = nonResourceRules.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last nonResourceRules. The list is empty.");
        return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder> predicate) {
        int index = -1;
        for (int i=0;i<nonResourceRules.size();i++) { 
        if (predicate.test(nonResourceRules.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching nonResourceRules. No match found.");
        return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
    }

    public A addToResourceRules(int index,io.kubernetes.client.openapi.models.V1beta1ResourceRule item) {
        if (this.resourceRules == null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder(item);_visitables.get("resourceRules").add(index >= 0 ? index : _visitables.get("resourceRules").size(), builder);this.resourceRules.add(index >= 0 ? index : resourceRules.size(), builder); return (A)this;
    }

    public A setToResourceRules(int index,io.kubernetes.client.openapi.models.V1beta1ResourceRule item) {
        if (this.resourceRules == null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder(item);
        if (index < 0 || index >= _visitables.get("resourceRules").size()) { _visitables.get("resourceRules").add(builder); } else { _visitables.get("resourceRules").set(index, builder);}
        if (index < 0 || index >= resourceRules.size()) { resourceRules.add(builder); } else { resourceRules.set(index, builder);}
         return (A)this;
    }

    public A addToResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourceRule... items) {
        if (this.resourceRules == null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1ResourceRule item : items) {io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
    }

    public A addAllToResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ResourceRule> items) {
        if (this.resourceRules == null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1ResourceRule item : items) {io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
    }

    public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourceRule... items) {
        for (io.kubernetes.client.openapi.models.V1beta1ResourceRule item : items) {io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
    }

    public A removeAllFromResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ResourceRule> items) {
        for (io.kubernetes.client.openapi.models.V1beta1ResourceRule item : items) {io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder builder = new io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromResourceRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder> predicate) {
        if (resourceRules == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder> each = resourceRules.iterator();
        final List visitables = _visitables.get("resourceRules");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResourceRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1ResourceRule> getResourceRules() {
        return build(resourceRules);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1beta1ResourceRule> buildResourceRules() {
        return build(resourceRules);
    }

    public io.kubernetes.client.openapi.models.V1beta1ResourceRule buildResourceRule(int index) {
        return this.resourceRules.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1ResourceRule buildFirstResourceRule() {
        return this.resourceRules.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1ResourceRule buildLastResourceRule() {
        return this.resourceRules.get(resourceRules.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1ResourceRule buildMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder item: resourceRules) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder item: resourceRules) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withResourceRules(java.util.List<io.kubernetes.client.openapi.models.V1beta1ResourceRule> resourceRules) {
        if (this.resourceRules != null) { _visitables.get("resourceRules").removeAll(this.resourceRules);}
        if (resourceRules != null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder>(); for (io.kubernetes.client.openapi.models.V1beta1ResourceRule item : resourceRules){this.addToResourceRules(item);}} else { this.resourceRules = null;} return (A) this;
    }

    public A withResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourceRule... resourceRules) {
        if (this.resourceRules != null) {this.resourceRules.clear();}
        if (resourceRules != null) {for (io.kubernetes.client.openapi.models.V1beta1ResourceRule item :resourceRules){ this.addToResourceRules(item);}} return (A) this;
    }

    public java.lang.Boolean hasResourceRules() {
        return resourceRules != null && !resourceRules.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRule() {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluentImpl.ResourceRulesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRuleLike(io.kubernetes.client.openapi.models.V1beta1ResourceRule item) {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluentImpl.ResourceRulesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> setNewResourceRuleLike(int index,io.kubernetes.client.openapi.models.V1beta1ResourceRule item) {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluentImpl.ResourceRulesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editResourceRule(int index) {
        if (resourceRules.size() <= index) throw new RuntimeException("Can't edit resourceRules. Index exceeds size.");
        return setNewResourceRuleLike(index, buildResourceRule(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editFirstResourceRule() {
        if (resourceRules.size() == 0) throw new RuntimeException("Can't edit first resourceRules. The list is empty.");
        return setNewResourceRuleLike(0, buildResourceRule(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editLastResourceRule() {
        int index = resourceRules.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last resourceRules. The list is empty.");
        return setNewResourceRuleLike(index, buildResourceRule(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder> predicate) {
        int index = -1;
        for (int i=0;i<resourceRules.size();i++) { 
        if (predicate.test(resourceRules.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching resourceRules. No match found.");
        return setNewResourceRuleLike(index, buildResourceRule(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1SubjectRulesReviewStatusFluentImpl that = (V1beta1SubjectRulesReviewStatusFluentImpl) o;
        if (evaluationError != null ? !evaluationError.equals(that.evaluationError) :that.evaluationError != null) return false;
        if (incomplete != null ? !incomplete.equals(that.incomplete) :that.incomplete != null) return false;
        if (nonResourceRules != null ? !nonResourceRules.equals(that.nonResourceRules) :that.nonResourceRules != null) return false;
        if (resourceRules != null ? !resourceRules.equals(that.resourceRules) :that.resourceRules != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(evaluationError,  incomplete,  nonResourceRules,  resourceRules,  super.hashCode());
    }

    public class NonResourceRulesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1NonResourceRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.NonResourceRulesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder builder;
        private final int index;

            NonResourceRulesNestedImpl(int index,io.kubernetes.client.openapi.models.V1beta1NonResourceRule item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder(this, item);
                        
            }

            NonResourceRulesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceRuleBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1SubjectRulesReviewStatusFluentImpl.this.setToNonResourceRules(index,builder.build());
            }

            public N endNonResourceRule() {
                return and();
            }
    }


    public class ResourceRulesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1ResourceRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1SubjectRulesReviewStatusFluent.ResourceRulesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder builder;
        private final int index;

            ResourceRulesNestedImpl(int index,io.kubernetes.client.openapi.models.V1beta1ResourceRule item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder(this, item);
                        
            }

            ResourceRulesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1ResourceRuleBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1SubjectRulesReviewStatusFluentImpl.this.setToResourceRules(index,builder.build());
            }

            public N endResourceRule() {
                return and();
            }
    }


}
