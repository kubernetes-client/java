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
public interface V1DaemonSetStatusFluent<A extends V1DaemonSetStatusFluent<A>> extends Fluent<A>{
  public Integer getCollisionCount();
  public A withCollisionCount(Integer collisionCount);
  public Boolean hasCollisionCount();
  public A addToConditions(Integer index,V1DaemonSetCondition item);
  public A setToConditions(Integer index,V1DaemonSetCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items);
  public A addAllToConditions(Collection<V1DaemonSetCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items);
  public A removeAllFromConditions(Collection<V1DaemonSetCondition> items);
  public A removeMatchingFromConditions(Predicate<V1DaemonSetConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1DaemonSetCondition> getConditions();
  public List<V1DaemonSetCondition> buildConditions();
  public V1DaemonSetCondition buildCondition(Integer index);
  public V1DaemonSetCondition buildFirstCondition();
  public V1DaemonSetCondition buildLastCondition();
  public V1DaemonSetCondition buildMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate);
  public A withConditions(List<V1DaemonSetCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... conditions);
  public Boolean hasConditions();
  public V1DaemonSetStatusFluent.ConditionsNested<A> addNewCondition();
  public V1DaemonSetStatusFluent.ConditionsNested<A> addNewConditionLike(V1DaemonSetCondition item);
  public V1DaemonSetStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1DaemonSetCondition item);
  public V1DaemonSetStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1DaemonSetStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1DaemonSetStatusFluent.ConditionsNested<A> editLastCondition();
  public V1DaemonSetStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate);
  public Integer getCurrentNumberScheduled();
  public A withCurrentNumberScheduled(Integer currentNumberScheduled);
  public Boolean hasCurrentNumberScheduled();
  public Integer getDesiredNumberScheduled();
  public A withDesiredNumberScheduled(Integer desiredNumberScheduled);
  public Boolean hasDesiredNumberScheduled();
  public Integer getNumberAvailable();
  public A withNumberAvailable(Integer numberAvailable);
  public Boolean hasNumberAvailable();
  public Integer getNumberMisscheduled();
  public A withNumberMisscheduled(Integer numberMisscheduled);
  public Boolean hasNumberMisscheduled();
  public Integer getNumberReady();
  public A withNumberReady(Integer numberReady);
  public Boolean hasNumberReady();
  public Integer getNumberUnavailable();
  public A withNumberUnavailable(Integer numberUnavailable);
  public Boolean hasNumberUnavailable();
  public Long getObservedGeneration();
  public A withObservedGeneration(Long observedGeneration);
  public Boolean hasObservedGeneration();
  public Integer getUpdatedNumberScheduled();
  public A withUpdatedNumberScheduled(Integer updatedNumberScheduled);
  public Boolean hasUpdatedNumberScheduled();
  public interface ConditionsNested<N> extends Nested<N>,V1DaemonSetConditionFluent<V1DaemonSetStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}