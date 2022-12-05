package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
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
public interface V1StatefulSetStatusFluent<A extends V1StatefulSetStatusFluent<A>> extends Fluent<A>{
  public Integer getAvailableReplicas();
  public A withAvailableReplicas(Integer availableReplicas);
  public Boolean hasAvailableReplicas();
  public Integer getCollisionCount();
  public A withCollisionCount(Integer collisionCount);
  public Boolean hasCollisionCount();
  public A addToConditions(Integer index,V1StatefulSetCondition item);
  public A setToConditions(Integer index,V1StatefulSetCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... items);
  public A addAllToConditions(Collection<V1StatefulSetCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... items);
  public A removeAllFromConditions(Collection<V1StatefulSetCondition> items);
  public A removeMatchingFromConditions(Predicate<V1StatefulSetConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1StatefulSetCondition> getConditions();
  public List<V1StatefulSetCondition> buildConditions();
  public V1StatefulSetCondition buildCondition(Integer index);
  public V1StatefulSetCondition buildFirstCondition();
  public V1StatefulSetCondition buildLastCondition();
  public V1StatefulSetCondition buildMatchingCondition(Predicate<V1StatefulSetConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1StatefulSetConditionBuilder> predicate);
  public A withConditions(List<V1StatefulSetCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... conditions);
  public Boolean hasConditions();
  public V1StatefulSetStatusFluent.ConditionsNested<A> addNewCondition();
  public V1StatefulSetStatusFluent.ConditionsNested<A> addNewConditionLike(V1StatefulSetCondition item);
  public V1StatefulSetStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1StatefulSetCondition item);
  public V1StatefulSetStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1StatefulSetStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1StatefulSetStatusFluent.ConditionsNested<A> editLastCondition();
  public V1StatefulSetStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1StatefulSetConditionBuilder> predicate);
  public Integer getCurrentReplicas();
  public A withCurrentReplicas(Integer currentReplicas);
  public Boolean hasCurrentReplicas();
  public String getCurrentRevision();
  public A withCurrentRevision(String currentRevision);
  public Boolean hasCurrentRevision();
  public Long getObservedGeneration();
  public A withObservedGeneration(Long observedGeneration);
  public Boolean hasObservedGeneration();
  public Integer getReadyReplicas();
  public A withReadyReplicas(Integer readyReplicas);
  public Boolean hasReadyReplicas();
  public Integer getReplicas();
  public A withReplicas(Integer replicas);
  public Boolean hasReplicas();
  public String getUpdateRevision();
  public A withUpdateRevision(String updateRevision);
  public Boolean hasUpdateRevision();
  public Integer getUpdatedReplicas();
  public A withUpdatedReplicas(Integer updatedReplicas);
  public Boolean hasUpdatedReplicas();
  public interface ConditionsNested<N> extends Nested<N>,V1StatefulSetConditionFluent<V1StatefulSetStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}