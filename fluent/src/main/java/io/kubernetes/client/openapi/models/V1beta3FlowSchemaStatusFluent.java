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
public interface V1beta3FlowSchemaStatusFluent<A extends V1beta3FlowSchemaStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(int index,V1beta3FlowSchemaCondition item);
  public A setToConditions(int index,V1beta3FlowSchemaCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1beta3FlowSchemaCondition... items);
  public A addAllToConditions(Collection<V1beta3FlowSchemaCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta3FlowSchemaCondition... items);
  public A removeAllFromConditions(Collection<V1beta3FlowSchemaCondition> items);
  public A removeMatchingFromConditions(Predicate<V1beta3FlowSchemaConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta3FlowSchemaCondition> getConditions();
  public List<V1beta3FlowSchemaCondition> buildConditions();
  public V1beta3FlowSchemaCondition buildCondition(int index);
  public V1beta3FlowSchemaCondition buildFirstCondition();
  public V1beta3FlowSchemaCondition buildLastCondition();
  public V1beta3FlowSchemaCondition buildMatchingCondition(Predicate<V1beta3FlowSchemaConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1beta3FlowSchemaConditionBuilder> predicate);
  public A withConditions(List<V1beta3FlowSchemaCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1beta3FlowSchemaCondition... conditions);
  public Boolean hasConditions();
  public V1beta3FlowSchemaStatusFluent.ConditionsNested<A> addNewCondition();
  public V1beta3FlowSchemaStatusFluent.ConditionsNested<A> addNewConditionLike(V1beta3FlowSchemaCondition item);
  public V1beta3FlowSchemaStatusFluent.ConditionsNested<A> setNewConditionLike(int index,V1beta3FlowSchemaCondition item);
  public V1beta3FlowSchemaStatusFluent.ConditionsNested<A> editCondition(int index);
  public V1beta3FlowSchemaStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1beta3FlowSchemaStatusFluent.ConditionsNested<A> editLastCondition();
  public V1beta3FlowSchemaStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1beta3FlowSchemaConditionBuilder> predicate);
  public interface ConditionsNested<N> extends Nested<N>,V1beta3FlowSchemaConditionFluent<V1beta3FlowSchemaStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}