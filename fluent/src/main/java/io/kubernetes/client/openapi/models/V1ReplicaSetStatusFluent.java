package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ReplicaSetStatusFluent<A extends V1ReplicaSetStatusFluent<A>> extends Fluent<A>{
  public Integer getAvailableReplicas();
  public A withAvailableReplicas(Integer availableReplicas);
  public Boolean hasAvailableReplicas();
  public A addToConditions(Integer index,V1ReplicaSetCondition item);
  public A setToConditions(Integer index,V1ReplicaSetCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items);
  public A addAllToConditions(Collection<V1ReplicaSetCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items);
  public A removeAllFromConditions(Collection<V1ReplicaSetCondition> items);
  public A removeMatchingFromConditions(Predicate<V1ReplicaSetConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ReplicaSetCondition> getConditions();
  public List<V1ReplicaSetCondition> buildConditions();
  public V1ReplicaSetCondition buildCondition(Integer index);
  public V1ReplicaSetCondition buildFirstCondition();
  public V1ReplicaSetCondition buildLastCondition();
  public V1ReplicaSetCondition buildMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate);
  public A withConditions(List<V1ReplicaSetCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... conditions);
  public Boolean hasConditions();
  public V1ReplicaSetStatusFluent.ConditionsNested<A> addNewCondition();
  public V1ReplicaSetStatusFluent.ConditionsNested<A> addNewConditionLike(V1ReplicaSetCondition item);
  public V1ReplicaSetStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1ReplicaSetCondition item);
  public V1ReplicaSetStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1ReplicaSetStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1ReplicaSetStatusFluent.ConditionsNested<A> editLastCondition();
  public V1ReplicaSetStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate);
  public Integer getFullyLabeledReplicas();
  public A withFullyLabeledReplicas(Integer fullyLabeledReplicas);
  public Boolean hasFullyLabeledReplicas();
  public Long getObservedGeneration();
  public A withObservedGeneration(Long observedGeneration);
  public Boolean hasObservedGeneration();
  public Integer getReadyReplicas();
  public A withReadyReplicas(Integer readyReplicas);
  public Boolean hasReadyReplicas();
  public Integer getReplicas();
  public A withReplicas(Integer replicas);
  public Boolean hasReplicas();
  public interface ConditionsNested<N> extends Nested<N>,V1ReplicaSetConditionFluent<V1ReplicaSetStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}