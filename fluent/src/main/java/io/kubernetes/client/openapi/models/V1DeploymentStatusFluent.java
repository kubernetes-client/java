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
public interface V1DeploymentStatusFluent<A extends V1DeploymentStatusFluent<A>> extends Fluent<A>{
  public Integer getAvailableReplicas();
  public A withAvailableReplicas(Integer availableReplicas);
  public Boolean hasAvailableReplicas();
  public Integer getCollisionCount();
  public A withCollisionCount(Integer collisionCount);
  public Boolean hasCollisionCount();
  public A addToConditions(Integer index,V1DeploymentCondition item);
  public A setToConditions(Integer index,V1DeploymentCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1DeploymentCondition... items);
  public A addAllToConditions(Collection<V1DeploymentCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1DeploymentCondition... items);
  public A removeAllFromConditions(Collection<V1DeploymentCondition> items);
  public A removeMatchingFromConditions(Predicate<V1DeploymentConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1DeploymentCondition> getConditions();
  public List<V1DeploymentCondition> buildConditions();
  public V1DeploymentCondition buildCondition(Integer index);
  public V1DeploymentCondition buildFirstCondition();
  public V1DeploymentCondition buildLastCondition();
  public V1DeploymentCondition buildMatchingCondition(Predicate<V1DeploymentConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1DeploymentConditionBuilder> predicate);
  public A withConditions(List<V1DeploymentCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1DeploymentCondition... conditions);
  public Boolean hasConditions();
  public V1DeploymentStatusFluent.ConditionsNested<A> addNewCondition();
  public V1DeploymentStatusFluent.ConditionsNested<A> addNewConditionLike(V1DeploymentCondition item);
  public V1DeploymentStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1DeploymentCondition item);
  public V1DeploymentStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1DeploymentStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1DeploymentStatusFluent.ConditionsNested<A> editLastCondition();
  public V1DeploymentStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1DeploymentConditionBuilder> predicate);
  public Long getObservedGeneration();
  public A withObservedGeneration(Long observedGeneration);
  public Boolean hasObservedGeneration();
  public Integer getReadyReplicas();
  public A withReadyReplicas(Integer readyReplicas);
  public Boolean hasReadyReplicas();
  public Integer getReplicas();
  public A withReplicas(Integer replicas);
  public Boolean hasReplicas();
  public Integer getUnavailableReplicas();
  public A withUnavailableReplicas(Integer unavailableReplicas);
  public Boolean hasUnavailableReplicas();
  public Integer getUpdatedReplicas();
  public A withUpdatedReplicas(Integer updatedReplicas);
  public Boolean hasUpdatedReplicas();
  public interface ConditionsNested<N> extends Nested<N>,V1DeploymentConditionFluent<V1DeploymentStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}