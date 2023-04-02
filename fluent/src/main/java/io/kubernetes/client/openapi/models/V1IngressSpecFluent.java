package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressSpecFluent<A extends V1IngressSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildDefaultBackend instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressBackend getDefaultBackend();
  public V1IngressBackend buildDefaultBackend();
  public A withDefaultBackend(V1IngressBackend defaultBackend);
  public Boolean hasDefaultBackend();
  public V1IngressSpecFluent.DefaultBackendNested<A> withNewDefaultBackend();
  public V1IngressSpecFluent.DefaultBackendNested<A> withNewDefaultBackendLike(V1IngressBackend item);
  public V1IngressSpecFluent.DefaultBackendNested<A> editDefaultBackend();
  public V1IngressSpecFluent.DefaultBackendNested<A> editOrNewDefaultBackend();
  public V1IngressSpecFluent.DefaultBackendNested<A> editOrNewDefaultBackendLike(V1IngressBackend item);
  public String getIngressClassName();
  public A withIngressClassName(String ingressClassName);
  public Boolean hasIngressClassName();
  public A addToRules(Integer index,V1IngressRule item);
  public A setToRules(Integer index,V1IngressRule item);
  public A addToRules(io.kubernetes.client.openapi.models.V1IngressRule... items);
  public A addAllToRules(Collection<V1IngressRule> items);
  public A removeFromRules(io.kubernetes.client.openapi.models.V1IngressRule... items);
  public A removeAllFromRules(Collection<V1IngressRule> items);
  public A removeMatchingFromRules(Predicate<V1IngressRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1IngressRule> getRules();
  public List<V1IngressRule> buildRules();
  public V1IngressRule buildRule(Integer index);
  public V1IngressRule buildFirstRule();
  public V1IngressRule buildLastRule();
  public V1IngressRule buildMatchingRule(Predicate<V1IngressRuleBuilder> predicate);
  public Boolean hasMatchingRule(Predicate<V1IngressRuleBuilder> predicate);
  public A withRules(List<V1IngressRule> rules);
  public A withRules(io.kubernetes.client.openapi.models.V1IngressRule... rules);
  public Boolean hasRules();
  public V1IngressSpecFluent.RulesNested<A> addNewRule();
  public V1IngressSpecFluent.RulesNested<A> addNewRuleLike(V1IngressRule item);
  public V1IngressSpecFluent.RulesNested<A> setNewRuleLike(Integer index,V1IngressRule item);
  public V1IngressSpecFluent.RulesNested<A> editRule(Integer index);
  public V1IngressSpecFluent.RulesNested<A> editFirstRule();
  public V1IngressSpecFluent.RulesNested<A> editLastRule();
  public V1IngressSpecFluent.RulesNested<A> editMatchingRule(Predicate<V1IngressRuleBuilder> predicate);
  public A addToTls(Integer index,V1IngressTLS item);
  public A setToTls(Integer index,V1IngressTLS item);
  public A addToTls(io.kubernetes.client.openapi.models.V1IngressTLS... items);
  public A addAllToTls(Collection<V1IngressTLS> items);
  public A removeFromTls(io.kubernetes.client.openapi.models.V1IngressTLS... items);
  public A removeAllFromTls(Collection<V1IngressTLS> items);
  public A removeMatchingFromTls(Predicate<V1IngressTLSBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildTls instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1IngressTLS> getTls();
  public List<V1IngressTLS> buildTls();
  public V1IngressTLS buildTl(Integer index);
  public V1IngressTLS buildFirstTl();
  public V1IngressTLS buildLastTl();
  public V1IngressTLS buildMatchingTl(Predicate<V1IngressTLSBuilder> predicate);
  public Boolean hasMatchingTl(Predicate<V1IngressTLSBuilder> predicate);
  public A withTls(List<V1IngressTLS> tls);
  public A withTls(io.kubernetes.client.openapi.models.V1IngressTLS... tls);
  public Boolean hasTls();
  public V1IngressSpecFluent.TlsNested<A> addNewTl();
  public V1IngressSpecFluent.TlsNested<A> addNewTlLike(V1IngressTLS item);
  public V1IngressSpecFluent.TlsNested<A> setNewTlLike(Integer index,V1IngressTLS item);
  public V1IngressSpecFluent.TlsNested<A> editTl(Integer index);
  public V1IngressSpecFluent.TlsNested<A> editFirstTl();
  public V1IngressSpecFluent.TlsNested<A> editLastTl();
  public V1IngressSpecFluent.TlsNested<A> editMatchingTl(Predicate<V1IngressTLSBuilder> predicate);
  public interface DefaultBackendNested<N> extends Nested<N>,V1IngressBackendFluent<V1IngressSpecFluent.DefaultBackendNested<N>>{
    public N and();
    public N endDefaultBackend();
    
  }
  public interface RulesNested<N> extends Nested<N>,V1IngressRuleFluent<V1IngressSpecFluent.RulesNested<N>>{
    public N and();
    public N endRule();
    
  }
  public interface TlsNested<N> extends Nested<N>,V1IngressTLSFluent<V1IngressSpecFluent.TlsNested<N>>{
    public N and();
    public N endTl();
    
  }
  
}