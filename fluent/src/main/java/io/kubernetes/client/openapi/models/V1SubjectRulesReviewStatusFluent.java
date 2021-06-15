package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1SubjectRulesReviewStatusFluent<A extends io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getEvaluationError();
    public A withEvaluationError(java.lang.String evaluationError);
    public java.lang.Boolean hasEvaluationError();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEvaluationError instead.
     */
        public A withNewEvaluationError(java.lang.String original);
    public java.lang.Boolean getIncomplete();
    public A withIncomplete(java.lang.Boolean incomplete);
    public java.lang.Boolean hasIncomplete();
    public A addToNonResourceRules(int index,io.kubernetes.client.openapi.models.V1NonResourceRule item);
    public A setToNonResourceRules(int index,io.kubernetes.client.openapi.models.V1NonResourceRule item);
    public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... items);
    public A addAllToNonResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1NonResourceRule> items);
    public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... items);
    public A removeAllFromNonResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1NonResourceRule> items);
    public A removeMatchingFromNonResourceRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNonResourceRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1NonResourceRule> getNonResourceRules();
    public java.util.List<io.kubernetes.client.openapi.models.V1NonResourceRule> buildNonResourceRules();
    public io.kubernetes.client.openapi.models.V1NonResourceRule buildNonResourceRule(int index);
    public io.kubernetes.client.openapi.models.V1NonResourceRule buildFirstNonResourceRule();
    public io.kubernetes.client.openapi.models.V1NonResourceRule buildLastNonResourceRule();
    public io.kubernetes.client.openapi.models.V1NonResourceRule buildMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder> predicate);
    public java.lang.Boolean hasMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder> predicate);
    public A withNonResourceRules(java.util.List<io.kubernetes.client.openapi.models.V1NonResourceRule> nonResourceRules);
    public A withNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... nonResourceRules);
    public java.lang.Boolean hasNonResourceRules();
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRule();
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(io.kubernetes.client.openapi.models.V1NonResourceRule item);
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(int index,io.kubernetes.client.openapi.models.V1NonResourceRule item);
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editNonResourceRule(int index);
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editFirstNonResourceRule();
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editLastNonResourceRule();
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder> predicate);
    public A addToResourceRules(int index,io.kubernetes.client.openapi.models.V1ResourceRule item);
    public A setToResourceRules(int index,io.kubernetes.client.openapi.models.V1ResourceRule item);
    public A addToResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items);
    public A addAllToResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1ResourceRule> items);
    public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items);
    public A removeAllFromResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1ResourceRule> items);
    public A removeMatchingFromResourceRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResourceRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> getResourceRules();
    public java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> buildResourceRules();
    public io.kubernetes.client.openapi.models.V1ResourceRule buildResourceRule(int index);
    public io.kubernetes.client.openapi.models.V1ResourceRule buildFirstResourceRule();
    public io.kubernetes.client.openapi.models.V1ResourceRule buildLastResourceRule();
    public io.kubernetes.client.openapi.models.V1ResourceRule buildMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder> predicate);
    public java.lang.Boolean hasMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder> predicate);
    public A withResourceRules(java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> resourceRules);
    public A withResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... resourceRules);
    public java.lang.Boolean hasResourceRules();
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRule();
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRuleLike(io.kubernetes.client.openapi.models.V1ResourceRule item);
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> setNewResourceRuleLike(int index,io.kubernetes.client.openapi.models.V1ResourceRule item);
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editResourceRule(int index);
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editFirstResourceRule();
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editLastResourceRule();
    public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder> predicate);
    public interface NonResourceRulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<N>> {

            public N and();
            public N endNonResourceRule();    }


    public interface ResourceRulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ResourceRuleFluent<io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<N>> {

            public N and();
            public N endResourceRule();    }


}
