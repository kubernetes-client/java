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
public interface V1beta2FlowSchemaStatusFluent<A extends V1beta2FlowSchemaStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(Integer index,V1beta2FlowSchemaCondition item);
  public A setToConditions(Integer index,V1beta2FlowSchemaCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... items);
  public A addAllToConditions(Collection<V1beta2FlowSchemaCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... items);
  public A removeAllFromConditions(Collection<V1beta2FlowSchemaCondition> items);
  public A removeMatchingFromConditions(Predicate<V1beta2FlowSchemaConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta2FlowSchemaCondition> getConditions();
  public List<V1beta2FlowSchemaCondition> buildConditions();
  public V1beta2FlowSchemaCondition buildCondition(Integer index);
  public V1beta2FlowSchemaCondition buildFirstCondition();
  public V1beta2FlowSchemaCondition buildLastCondition();
  public V1beta2FlowSchemaCondition buildMatchingCondition(Predicate<V1beta2FlowSchemaConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1beta2FlowSchemaConditionBuilder> predicate);
  public A withConditions(List<V1beta2FlowSchemaCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... conditions);
  public Boolean hasConditions();
  public V1beta2FlowSchemaStatusFluent.ConditionsNested<A> addNewCondition();
  public V1beta2FlowSchemaStatusFluent.ConditionsNested<A> addNewConditionLike(V1beta2FlowSchemaCondition item);
  public V1beta2FlowSchemaStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1beta2FlowSchemaCondition item);
  public V1beta2FlowSchemaStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1beta2FlowSchemaStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1beta2FlowSchemaStatusFluent.ConditionsNested<A> editLastCondition();
  public V1beta2FlowSchemaStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1beta2FlowSchemaConditionBuilder> predicate);
  public interface ConditionsNested<N> extends Nested<N>,V1beta2FlowSchemaConditionFluent<V1beta2FlowSchemaStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}