package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta3PriorityLevelConfigurationStatusFluent<A extends V1beta3PriorityLevelConfigurationStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(int index,V1beta3PriorityLevelConfigurationCondition item);
  public A setToConditions(int index,V1beta3PriorityLevelConfigurationCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationCondition... items);
  public A addAllToConditions(Collection<V1beta3PriorityLevelConfigurationCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationCondition... items);
  public A removeAllFromConditions(Collection<V1beta3PriorityLevelConfigurationCondition> items);
  public A removeMatchingFromConditions(Predicate<V1beta3PriorityLevelConfigurationConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta3PriorityLevelConfigurationCondition> getConditions();
  public List<V1beta3PriorityLevelConfigurationCondition> buildConditions();
  public V1beta3PriorityLevelConfigurationCondition buildCondition(int index);
  public V1beta3PriorityLevelConfigurationCondition buildFirstCondition();
  public V1beta3PriorityLevelConfigurationCondition buildLastCondition();
  public V1beta3PriorityLevelConfigurationCondition buildMatchingCondition(Predicate<V1beta3PriorityLevelConfigurationConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1beta3PriorityLevelConfigurationConditionBuilder> predicate);
  public A withConditions(List<V1beta3PriorityLevelConfigurationCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationCondition... conditions);
  public Boolean hasConditions();
  public V1beta3PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewCondition();
  public V1beta3PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewConditionLike(V1beta3PriorityLevelConfigurationCondition item);
  public V1beta3PriorityLevelConfigurationStatusFluent.ConditionsNested<A> setNewConditionLike(int index,V1beta3PriorityLevelConfigurationCondition item);
  public V1beta3PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editCondition(int index);
  public V1beta3PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1beta3PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editLastCondition();
  public V1beta3PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1beta3PriorityLevelConfigurationConditionBuilder> predicate);
  public interface ConditionsNested<N> extends Nested<N>,V1beta3PriorityLevelConfigurationConditionFluent<V1beta3PriorityLevelConfigurationStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}