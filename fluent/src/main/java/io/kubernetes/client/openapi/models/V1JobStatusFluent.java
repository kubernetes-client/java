package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1JobStatusFluent<A extends V1JobStatusFluent<A>> extends Fluent<A>{
  public Integer getActive();
  public A withActive(Integer active);
  public Boolean hasActive();
  public String getCompletedIndexes();
  public A withCompletedIndexes(String completedIndexes);
  public Boolean hasCompletedIndexes();
  public OffsetDateTime getCompletionTime();
  public A withCompletionTime(OffsetDateTime completionTime);
  public Boolean hasCompletionTime();
  public A addToConditions(Integer index,V1JobCondition item);
  public A setToConditions(Integer index,V1JobCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1JobCondition... items);
  public A addAllToConditions(Collection<V1JobCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1JobCondition... items);
  public A removeAllFromConditions(Collection<V1JobCondition> items);
  public A removeMatchingFromConditions(Predicate<V1JobConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1JobCondition> getConditions();
  public List<V1JobCondition> buildConditions();
  public V1JobCondition buildCondition(Integer index);
  public V1JobCondition buildFirstCondition();
  public V1JobCondition buildLastCondition();
  public V1JobCondition buildMatchingCondition(Predicate<V1JobConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1JobConditionBuilder> predicate);
  public A withConditions(List<V1JobCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1JobCondition... conditions);
  public Boolean hasConditions();
  public V1JobStatusFluent.ConditionsNested<A> addNewCondition();
  public V1JobStatusFluent.ConditionsNested<A> addNewConditionLike(V1JobCondition item);
  public V1JobStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1JobCondition item);
  public V1JobStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1JobStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1JobStatusFluent.ConditionsNested<A> editLastCondition();
  public V1JobStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1JobConditionBuilder> predicate);
  public Integer getFailed();
  public A withFailed(Integer failed);
  public Boolean hasFailed();
  public Integer getReady();
  public A withReady(Integer ready);
  public Boolean hasReady();
  public OffsetDateTime getStartTime();
  public A withStartTime(OffsetDateTime startTime);
  public Boolean hasStartTime();
  public Integer getSucceeded();
  public A withSucceeded(Integer succeeded);
  public Boolean hasSucceeded();
  
  /**
   * This method has been deprecated, please use method buildUncountedTerminatedPods instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1UncountedTerminatedPods getUncountedTerminatedPods();
  public V1UncountedTerminatedPods buildUncountedTerminatedPods();
  public A withUncountedTerminatedPods(V1UncountedTerminatedPods uncountedTerminatedPods);
  public Boolean hasUncountedTerminatedPods();
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> withNewUncountedTerminatedPods();
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> withNewUncountedTerminatedPodsLike(V1UncountedTerminatedPods item);
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> editUncountedTerminatedPods();
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> editOrNewUncountedTerminatedPods();
  public V1JobStatusFluent.UncountedTerminatedPodsNested<A> editOrNewUncountedTerminatedPodsLike(V1UncountedTerminatedPods item);
  public interface ConditionsNested<N> extends Nested<N>,V1JobConditionFluent<V1JobStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface UncountedTerminatedPodsNested<N> extends Nested<N>,V1UncountedTerminatedPodsFluent<V1JobStatusFluent.UncountedTerminatedPodsNested<N>>{
    public N and();
    public N endUncountedTerminatedPods();
    
  }
  
}