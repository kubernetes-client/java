package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
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
public interface V1ComponentStatusFluent<A extends V1ComponentStatusFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToConditions(Integer index,V1ComponentCondition item);
  public A setToConditions(Integer index,V1ComponentCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items);
  public A addAllToConditions(Collection<V1ComponentCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items);
  public A removeAllFromConditions(Collection<V1ComponentCondition> items);
  public A removeMatchingFromConditions(Predicate<V1ComponentConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ComponentCondition> getConditions();
  public List<V1ComponentCondition> buildConditions();
  public V1ComponentCondition buildCondition(Integer index);
  public V1ComponentCondition buildFirstCondition();
  public V1ComponentCondition buildLastCondition();
  public V1ComponentCondition buildMatchingCondition(Predicate<V1ComponentConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1ComponentConditionBuilder> predicate);
  public A withConditions(List<V1ComponentCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... conditions);
  public Boolean hasConditions();
  public V1ComponentStatusFluent.ConditionsNested<A> addNewCondition();
  public V1ComponentStatusFluent.ConditionsNested<A> addNewConditionLike(V1ComponentCondition item);
  public V1ComponentStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1ComponentCondition item);
  public V1ComponentStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1ComponentStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1ComponentStatusFluent.ConditionsNested<A> editLastCondition();
  public V1ComponentStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1ComponentConditionBuilder> predicate);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1ComponentStatusFluent.MetadataNested<A> withNewMetadata();
  public V1ComponentStatusFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1ComponentStatusFluent.MetadataNested<A> editMetadata();
  public V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadata();
  public V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public interface ConditionsNested<N> extends Nested<N>,V1ComponentConditionFluent<V1ComponentStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1ComponentStatusFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}