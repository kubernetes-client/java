package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1ServiceStatusFluent<A extends V1ServiceStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(Integer index,V1Condition item);
  public A setToConditions(Integer index,V1Condition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items);
  public A addAllToConditions(Collection<V1Condition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items);
  public A removeAllFromConditions(Collection<V1Condition> items);
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Condition> getConditions();
  public List<V1Condition> buildConditions();
  public V1Condition buildCondition(Integer index);
  public V1Condition buildFirstCondition();
  public V1Condition buildLastCondition();
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate);
  public A withConditions(List<V1Condition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions);
  public Boolean hasConditions();
  public V1ServiceStatusFluent.ConditionsNested<A> addNewCondition();
  public V1ServiceStatusFluent.ConditionsNested<A> addNewConditionLike(V1Condition item);
  public V1ServiceStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1Condition item);
  public V1ServiceStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1ServiceStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1ServiceStatusFluent.ConditionsNested<A> editLastCondition();
  public V1ServiceStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildLoadBalancer instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LoadBalancerStatus getLoadBalancer();
  public V1LoadBalancerStatus buildLoadBalancer();
  public A withLoadBalancer(V1LoadBalancerStatus loadBalancer);
  public Boolean hasLoadBalancer();
  public V1ServiceStatusFluent.LoadBalancerNested<A> withNewLoadBalancer();
  public V1ServiceStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(V1LoadBalancerStatus item);
  public V1ServiceStatusFluent.LoadBalancerNested<A> editLoadBalancer();
  public V1ServiceStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer();
  public V1ServiceStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(V1LoadBalancerStatus item);
  public interface ConditionsNested<N> extends Nested<N>,V1ConditionFluent<V1ServiceStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface LoadBalancerNested<N> extends Nested<N>,V1LoadBalancerStatusFluent<V1ServiceStatusFluent.LoadBalancerNested<N>>{
    public N and();
    public N endLoadBalancer();
    
  }
  
}