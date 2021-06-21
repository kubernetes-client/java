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

public interface V1ClusterRoleFluent<A extends io.kubernetes.client.openapi.models.V1ClusterRoleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAggregationRule instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1AggregationRule getAggregationRule();
    public io.kubernetes.client.openapi.models.V1AggregationRule buildAggregationRule();
    public A withAggregationRule(io.kubernetes.client.openapi.models.V1AggregationRule aggregationRule);
    public java.lang.Boolean hasAggregationRule();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRule();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRuleLike(io.kubernetes.client.openapi.models.V1AggregationRule item);
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A> editAggregationRule();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRule();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A> editOrNewAggregationRuleLike(io.kubernetes.client.openapi.models.V1AggregationRule item);
    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public A addToRules(int index,io.kubernetes.client.openapi.models.V1PolicyRule item);
    public A setToRules(int index,io.kubernetes.client.openapi.models.V1PolicyRule item);
    public A addToRules(io.kubernetes.client.openapi.models.V1PolicyRule... items);
    public A addAllToRules(java.util.Collection<io.kubernetes.client.openapi.models.V1PolicyRule> items);
    public A removeFromRules(io.kubernetes.client.openapi.models.V1PolicyRule... items);
    public A removeAllFromRules(java.util.Collection<io.kubernetes.client.openapi.models.V1PolicyRule> items);
    public A removeMatchingFromRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1PolicyRule> getRules();
    public java.util.List<io.kubernetes.client.openapi.models.V1PolicyRule> buildRules();
    public io.kubernetes.client.openapi.models.V1PolicyRule buildRule(int index);
    public io.kubernetes.client.openapi.models.V1PolicyRule buildFirstRule();
    public io.kubernetes.client.openapi.models.V1PolicyRule buildLastRule();
    public io.kubernetes.client.openapi.models.V1PolicyRule buildMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder> predicate);
    public java.lang.Boolean hasMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder> predicate);
    public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1PolicyRule> rules);
    public A withRules(io.kubernetes.client.openapi.models.V1PolicyRule... rules);
    public java.lang.Boolean hasRules();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> addNewRule();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> addNewRuleLike(io.kubernetes.client.openapi.models.V1PolicyRule item);
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> setNewRuleLike(int index,io.kubernetes.client.openapi.models.V1PolicyRule item);
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> editRule(int index);
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> editFirstRule();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> editLastRule();
    public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> editMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder> predicate);
    public interface AggregationRuleNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1AggregationRuleFluent<io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<N>> {

            public N and();
            public N endAggregationRule();    }


    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface RulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PolicyRuleFluent<io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<N>> {

            public N and();
            public N endRule();    }


}
