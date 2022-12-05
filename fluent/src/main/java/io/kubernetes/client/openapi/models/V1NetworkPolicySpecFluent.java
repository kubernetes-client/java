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
public interface V1NetworkPolicySpecFluent<A extends V1NetworkPolicySpecFluent<A>> extends Fluent<A>{
  public A addToEgress(Integer index,V1NetworkPolicyEgressRule item);
  public A setToEgress(Integer index,V1NetworkPolicyEgressRule item);
  public A addToEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... items);
  public A addAllToEgress(Collection<V1NetworkPolicyEgressRule> items);
  public A removeFromEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... items);
  public A removeAllFromEgress(Collection<V1NetworkPolicyEgressRule> items);
  public A removeMatchingFromEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildEgress instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyEgressRule> getEgress();
  public List<V1NetworkPolicyEgressRule> buildEgress();
  public V1NetworkPolicyEgressRule buildEgress(Integer index);
  public V1NetworkPolicyEgressRule buildFirstEgress();
  public V1NetworkPolicyEgressRule buildLastEgress();
  public V1NetworkPolicyEgressRule buildMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate);
  public Boolean hasMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate);
  public A withEgress(List<V1NetworkPolicyEgressRule> egress);
  public A withEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... egress);
  public Boolean hasEgress();
  public V1NetworkPolicySpecFluent.EgressNested<A> addNewEgress();
  public V1NetworkPolicySpecFluent.EgressNested<A> addNewEgressLike(V1NetworkPolicyEgressRule item);
  public V1NetworkPolicySpecFluent.EgressNested<A> setNewEgressLike(Integer index,V1NetworkPolicyEgressRule item);
  public V1NetworkPolicySpecFluent.EgressNested<A> editEgress(Integer index);
  public V1NetworkPolicySpecFluent.EgressNested<A> editFirstEgress();
  public V1NetworkPolicySpecFluent.EgressNested<A> editLastEgress();
  public V1NetworkPolicySpecFluent.EgressNested<A> editMatchingEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate);
  public A addToIngress(Integer index,V1NetworkPolicyIngressRule item);
  public A setToIngress(Integer index,V1NetworkPolicyIngressRule item);
  public A addToIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... items);
  public A addAllToIngress(Collection<V1NetworkPolicyIngressRule> items);
  public A removeFromIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... items);
  public A removeAllFromIngress(Collection<V1NetworkPolicyIngressRule> items);
  public A removeMatchingFromIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildIngress instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyIngressRule> getIngress();
  public List<V1NetworkPolicyIngressRule> buildIngress();
  public V1NetworkPolicyIngressRule buildIngress(Integer index);
  public V1NetworkPolicyIngressRule buildFirstIngress();
  public V1NetworkPolicyIngressRule buildLastIngress();
  public V1NetworkPolicyIngressRule buildMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate);
  public Boolean hasMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate);
  public A withIngress(List<V1NetworkPolicyIngressRule> ingress);
  public A withIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... ingress);
  public Boolean hasIngress();
  public V1NetworkPolicySpecFluent.IngressNested<A> addNewIngress();
  public V1NetworkPolicySpecFluent.IngressNested<A> addNewIngressLike(V1NetworkPolicyIngressRule item);
  public V1NetworkPolicySpecFluent.IngressNested<A> setNewIngressLike(Integer index,V1NetworkPolicyIngressRule item);
  public V1NetworkPolicySpecFluent.IngressNested<A> editIngress(Integer index);
  public V1NetworkPolicySpecFluent.IngressNested<A> editFirstIngress();
  public V1NetworkPolicySpecFluent.IngressNested<A> editLastIngress();
  public V1NetworkPolicySpecFluent.IngressNested<A> editMatchingIngress(Predicate<V1NetworkPolicyIngressRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPodSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getPodSelector();
  public V1LabelSelector buildPodSelector();
  public A withPodSelector(V1LabelSelector podSelector);
  public Boolean hasPodSelector();
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelector();
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelectorLike(V1LabelSelector item);
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> editPodSelector();
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> editOrNewPodSelector();
  public V1NetworkPolicySpecFluent.PodSelectorNested<A> editOrNewPodSelectorLike(V1LabelSelector item);
  public A addToPolicyTypes(Integer index,String item);
  public A setToPolicyTypes(Integer index,String item);
  public A addToPolicyTypes(java.lang.String... items);
  public A addAllToPolicyTypes(Collection<String> items);
  public A removeFromPolicyTypes(java.lang.String... items);
  public A removeAllFromPolicyTypes(Collection<String> items);
  public List<String> getPolicyTypes();
  public String getPolicyType(Integer index);
  public String getFirstPolicyType();
  public String getLastPolicyType();
  public String getMatchingPolicyType(Predicate<String> predicate);
  public Boolean hasMatchingPolicyType(Predicate<String> predicate);
  public A withPolicyTypes(List<String> policyTypes);
  public A withPolicyTypes(java.lang.String... policyTypes);
  public Boolean hasPolicyTypes();
  public interface EgressNested<N> extends Nested<N>,V1NetworkPolicyEgressRuleFluent<V1NetworkPolicySpecFluent.EgressNested<N>>{
    public N and();
    public N endEgress();
    
  }
  public interface IngressNested<N> extends Nested<N>,V1NetworkPolicyIngressRuleFluent<V1NetworkPolicySpecFluent.IngressNested<N>>{
    public N and();
    public N endIngress();
    
  }
  public interface PodSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1NetworkPolicySpecFluent.PodSelectorNested<N>>{
    public N and();
    public N endPodSelector();
    
  }
  
}