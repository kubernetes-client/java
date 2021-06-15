package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.util.Collection;

public interface V1alpha1PolicyRulesWithSubjectsFluent<A extends io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToNonResourceRules(int index,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item);
    public A setToNonResourceRules(int index,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item);
    public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule... items);
    public A addAllToNonResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> items);
    public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule... items);
    public A removeAllFromNonResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> items);
    public A removeMatchingFromNonResourceRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNonResourceRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> getNonResourceRules();
    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> buildNonResourceRules();
    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule buildNonResourceRule(int index);
    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule buildFirstNonResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule buildLastNonResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule buildMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> predicate);
    public java.lang.Boolean hasMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> predicate);
    public A withNonResourceRules(java.util.List<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> nonResourceRules);
    public A withNonResourceRules(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule... nonResourceRules);
    public java.lang.Boolean hasNonResourceRules();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(int index,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editNonResourceRule(int index);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editFirstNonResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editLastNonResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> predicate);
    public A addToResourceRules(int index,io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item);
    public A setToResourceRules(int index,io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item);
    public A addToResourceRules(io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule... items);
    public A addAllToResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> items);
    public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule... items);
    public A removeAllFromResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> items);
    public A removeMatchingFromResourceRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResourceRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> getResourceRules();
    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> buildResourceRules();
    public io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule buildResourceRule(int index);
    public io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule buildFirstResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule buildLastResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule buildMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> predicate);
    public java.lang.Boolean hasMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> predicate);
    public A withResourceRules(java.util.List<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> resourceRules);
    public A withResourceRules(io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule... resourceRules);
    public java.lang.Boolean hasResourceRules();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRuleLike(io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> setNewResourceRuleLike(int index,io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editResourceRule(int index);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editFirstResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editLastResourceRule();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> predicate);
    public A addToSubjects(int index,io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item);
    public A setToSubjects(int index,io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item);
    public A addToSubjects(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject... items);
    public A addAllToSubjects(java.util.Collection<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> items);
    public A removeFromSubjects(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject... items);
    public A removeAllFromSubjects(java.util.Collection<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> items);
    public A removeMatchingFromSubjects(java.util.function.Predicate<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSubjects instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> getSubjects();
    public java.util.List<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> buildSubjects();
    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject buildSubject(int index);
    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject buildFirstSubject();
    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject buildLastSubject();
    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject buildMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> predicate);
    public java.lang.Boolean hasMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> predicate);
    public A withSubjects(java.util.List<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> subjects);
    public A withSubjects(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject... subjects);
    public java.lang.Boolean hasSubjects();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubject();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubjectLike(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> setNewSubjectLike(int index,io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editSubject(int index);
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editFirstSubject();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editLastSubject();
    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> predicate);
    public interface NonResourceRulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleFluent<io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<N>> {

            public N and();
            public N endNonResourceRule();    }


    public interface ResourceRulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleFluent<io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<N>> {

            public N and();
            public N endResourceRule();    }


    public interface SubjectsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluent<io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<N>> {

            public N and();
            public N endSubject();    }


}
