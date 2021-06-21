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

public interface V1beta1RoleFluent<A extends io.kubernetes.client.openapi.models.V1beta1RoleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public A addToRules(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRule item);
    public A setToRules(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRule item);
    public A addToRules(io.kubernetes.client.openapi.models.V1beta1PolicyRule... items);
    public A addAllToRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PolicyRule> items);
    public A removeFromRules(io.kubernetes.client.openapi.models.V1beta1PolicyRule... items);
    public A removeAllFromRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PolicyRule> items);
    public A removeMatchingFromRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRule> getRules();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRule> buildRules();
    public io.kubernetes.client.openapi.models.V1beta1PolicyRule buildRule(int index);
    public io.kubernetes.client.openapi.models.V1beta1PolicyRule buildFirstRule();
    public io.kubernetes.client.openapi.models.V1beta1PolicyRule buildLastRule();
    public io.kubernetes.client.openapi.models.V1beta1PolicyRule buildMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> predicate);
    public java.lang.Boolean hasMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> predicate);
    public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1beta1PolicyRule> rules);
    public A withRules(io.kubernetes.client.openapi.models.V1beta1PolicyRule... rules);
    public java.lang.Boolean hasRules();
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.RulesNested<A> addNewRule();
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.RulesNested<A> addNewRuleLike(io.kubernetes.client.openapi.models.V1beta1PolicyRule item);
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.RulesNested<A> setNewRuleLike(int index,io.kubernetes.client.openapi.models.V1beta1PolicyRule item);
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.RulesNested<A> editRule(int index);
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.RulesNested<A> editFirstRule();
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.RulesNested<A> editLastRule();
    public io.kubernetes.client.openapi.models.V1beta1RoleFluent.RulesNested<A> editMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PolicyRuleBuilder> predicate);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1beta1RoleFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface RulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1PolicyRuleFluent<io.kubernetes.client.openapi.models.V1beta1RoleFluent.RulesNested<N>> {

            public N and();
            public N endRule();    }


}
