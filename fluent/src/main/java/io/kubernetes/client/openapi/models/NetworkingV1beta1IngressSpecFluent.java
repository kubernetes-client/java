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

public interface NetworkingV1beta1IngressSpecFluent<A extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildBackend instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend getBackend();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend buildBackend();
    public A withBackend(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend backend);
    public java.lang.Boolean hasBackend();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> withNewBackend();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> withNewBackendLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend item);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> editBackend();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> editOrNewBackend();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> editOrNewBackendLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend item);
    public java.lang.String getIngressClassName();
    public A withIngressClassName(java.lang.String ingressClassName);
    public java.lang.Boolean hasIngressClassName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withIngressClassName instead.
     */
        public A withNewIngressClassName(java.lang.String original);
    public A addToRules(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item);
    public A setToRules(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item);
    public A addToRules(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule... items);
    public A addAllToRules(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> items);
    public A removeFromRules(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule... items);
    public A removeAllFromRules(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> items);
    public A removeMatchingFromRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> getRules();
    public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> buildRules();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule buildRule(int index);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule buildFirstRule();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule buildLastRule();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule buildMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> predicate);
    public java.lang.Boolean hasMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> predicate);
    public A withRules(java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> rules);
    public A withRules(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule... rules);
    public java.lang.Boolean hasRules();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> addNewRule();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> addNewRuleLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> setNewRuleLike(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> editRule(int index);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> editFirstRule();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> editLastRule();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> editMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> predicate);
    public A addToTls(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item);
    public A setToTls(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item);
    public A addToTls(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS... items);
    public A addAllToTls(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> items);
    public A removeFromTls(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS... items);
    public A removeAllFromTls(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> items);
    public A removeMatchingFromTls(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTls instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> getTls();
    public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> buildTls();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS buildTl(int index);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS buildFirstTl();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS buildLastTl();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS buildMatchingTl(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> predicate);
    public java.lang.Boolean hasMatchingTl(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> predicate);
    public A withTls(java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> tls);
    public A withTls(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS... tls);
    public java.lang.Boolean hasTls();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> addNewTl();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> addNewTlLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> setNewTlLike(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> editTl(int index);
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> editFirstTl();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> editLastTl();
    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> editMatchingTl(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> predicate);
    public interface BackendNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<N>> {

            public N and();
            public N endBackend();    }


    public interface RulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluent<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<N>> {

            public N and();
            public N endRule();    }


    public interface TlsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSFluent<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<N>> {

            public N and();
            public N endTl();    }


}
