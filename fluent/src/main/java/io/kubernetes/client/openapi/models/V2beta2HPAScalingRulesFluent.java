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
public interface V2beta2HPAScalingRulesFluent<A extends V2beta2HPAScalingRulesFluent<A>> extends Fluent<A>{
  public A addToPolicies(Integer index,V2beta2HPAScalingPolicy item);
  public A setToPolicies(Integer index,V2beta2HPAScalingPolicy item);
  public A addToPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... items);
  public A addAllToPolicies(Collection<V2beta2HPAScalingPolicy> items);
  public A removeFromPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... items);
  public A removeAllFromPolicies(Collection<V2beta2HPAScalingPolicy> items);
  public A removeMatchingFromPolicies(Predicate<V2beta2HPAScalingPolicyBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPolicies instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2beta2HPAScalingPolicy> getPolicies();
  public List<V2beta2HPAScalingPolicy> buildPolicies();
  public V2beta2HPAScalingPolicy buildPolicy(Integer index);
  public V2beta2HPAScalingPolicy buildFirstPolicy();
  public V2beta2HPAScalingPolicy buildLastPolicy();
  public V2beta2HPAScalingPolicy buildMatchingPolicy(Predicate<V2beta2HPAScalingPolicyBuilder> predicate);
  public Boolean hasMatchingPolicy(Predicate<V2beta2HPAScalingPolicyBuilder> predicate);
  public A withPolicies(List<V2beta2HPAScalingPolicy> policies);
  public A withPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... policies);
  public Boolean hasPolicies();
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicy();
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicyLike(V2beta2HPAScalingPolicy item);
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> setNewPolicyLike(Integer index,V2beta2HPAScalingPolicy item);
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> editPolicy(Integer index);
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> editFirstPolicy();
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> editLastPolicy();
  public V2beta2HPAScalingRulesFluent.PoliciesNested<A> editMatchingPolicy(Predicate<V2beta2HPAScalingPolicyBuilder> predicate);
  public String getSelectPolicy();
  public A withSelectPolicy(String selectPolicy);
  public Boolean hasSelectPolicy();
  public Integer getStabilizationWindowSeconds();
  public A withStabilizationWindowSeconds(Integer stabilizationWindowSeconds);
  public Boolean hasStabilizationWindowSeconds();
  public interface PoliciesNested<N> extends Nested<N>,V2beta2HPAScalingPolicyFluent<V2beta2HPAScalingRulesFluent.PoliciesNested<N>>{
    public N and();
    public N endPolicy();
    
  }
  
}