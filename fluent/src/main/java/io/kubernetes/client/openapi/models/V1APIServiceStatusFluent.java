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
public interface V1APIServiceStatusFluent<A extends V1APIServiceStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(Integer index,V1APIServiceCondition item);
  public A setToConditions(Integer index,V1APIServiceCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items);
  public A addAllToConditions(Collection<V1APIServiceCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items);
  public A removeAllFromConditions(Collection<V1APIServiceCondition> items);
  public A removeMatchingFromConditions(Predicate<V1APIServiceConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1APIServiceCondition> getConditions();
  public List<V1APIServiceCondition> buildConditions();
  public V1APIServiceCondition buildCondition(Integer index);
  public V1APIServiceCondition buildFirstCondition();
  public V1APIServiceCondition buildLastCondition();
  public V1APIServiceCondition buildMatchingCondition(Predicate<V1APIServiceConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1APIServiceConditionBuilder> predicate);
  public A withConditions(List<V1APIServiceCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... conditions);
  public Boolean hasConditions();
  public V1APIServiceStatusFluent.ConditionsNested<A> addNewCondition();
  public V1APIServiceStatusFluent.ConditionsNested<A> addNewConditionLike(V1APIServiceCondition item);
  public V1APIServiceStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1APIServiceCondition item);
  public V1APIServiceStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1APIServiceStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1APIServiceStatusFluent.ConditionsNested<A> editLastCondition();
  public V1APIServiceStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1APIServiceConditionBuilder> predicate);
  public interface ConditionsNested<N> extends Nested<N>,V1APIServiceConditionFluent<V1APIServiceStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}