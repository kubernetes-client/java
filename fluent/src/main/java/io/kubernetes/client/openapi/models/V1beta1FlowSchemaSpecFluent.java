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
import java.lang.Integer;
import java.util.Collection;

public interface V1beta1FlowSchemaSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildDistinguisherMethod instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod getDistinguisherMethod();
    public io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod buildDistinguisherMethod();
    public A withDistinguisherMethod(io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod distinguisherMethod);
    public java.lang.Boolean hasDistinguisherMethod();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethod();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethodLike(io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod item);
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> editDistinguisherMethod();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethod();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethodLike(io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod item);
    public java.lang.Integer getMatchingPrecedence();
    public A withMatchingPrecedence(java.lang.Integer matchingPrecedence);
    public java.lang.Boolean hasMatchingPrecedence();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPriorityLevelConfiguration instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference getPriorityLevelConfiguration();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference buildPriorityLevelConfiguration();
    public A withPriorityLevelConfiguration(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference priorityLevelConfiguration);
    public java.lang.Boolean hasPriorityLevelConfiguration();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfiguration();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfigurationLike(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference item);
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editPriorityLevelConfiguration();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfiguration();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfigurationLike(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReference item);
    public A addToRules(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects item);
    public A setToRules(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects item);
    public A addToRules(io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects... items);
    public A addAllToRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects> items);
    public A removeFromRules(io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects... items);
    public A removeAllFromRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects> items);
    public A removeMatchingFromRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects> getRules();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects> buildRules();
    public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects buildRule(int index);
    public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects buildFirstRule();
    public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects buildLastRule();
    public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects buildMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsBuilder> predicate);
    public java.lang.Boolean hasMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsBuilder> predicate);
    public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects> rules);
    public A withRules(io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects... rules);
    public java.lang.Boolean hasRules();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.RulesNested<A> addNewRule();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.RulesNested<A> addNewRuleLike(io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects item);
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.RulesNested<A> setNewRuleLike(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects item);
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.RulesNested<A> editRule(int index);
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.RulesNested<A> editFirstRule();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.RulesNested<A> editLastRule();
    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.RulesNested<A> editMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsBuilder> predicate);
    public interface DistinguisherMethodNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<N>> {

            public N and();
            public N endDistinguisherMethod();    }


    public interface PriorityLevelConfigurationNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationReferenceFluent<io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<N>> {

            public N and();
            public N endPriorityLevelConfiguration();    }


    public interface RulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent<io.kubernetes.client.openapi.models.V1beta1FlowSchemaSpecFluent.RulesNested<N>> {

            public N and();
            public N endRule();    }


}
