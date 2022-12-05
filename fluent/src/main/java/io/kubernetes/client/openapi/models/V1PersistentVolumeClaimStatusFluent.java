package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1PersistentVolumeClaimStatusFluent<A extends V1PersistentVolumeClaimStatusFluent<A>> extends Fluent<A>{
  public A addToAccessModes(Integer index,String item);
  public A setToAccessModes(Integer index,String item);
  public A addToAccessModes(java.lang.String... items);
  public A addAllToAccessModes(Collection<String> items);
  public A removeFromAccessModes(java.lang.String... items);
  public A removeAllFromAccessModes(Collection<String> items);
  public List<String> getAccessModes();
  public String getAccessMode(Integer index);
  public String getFirstAccessMode();
  public String getLastAccessMode();
  public String getMatchingAccessMode(Predicate<String> predicate);
  public Boolean hasMatchingAccessMode(Predicate<String> predicate);
  public A withAccessModes(List<String> accessModes);
  public A withAccessModes(java.lang.String... accessModes);
  public Boolean hasAccessModes();
  public A addToAllocatedResources(String key,Quantity value);
  public A addToAllocatedResources(Map<String,Quantity> map);
  public A removeFromAllocatedResources(String key);
  public A removeFromAllocatedResources(Map<String,Quantity> map);
  public Map<String,Quantity> getAllocatedResources();
  public <K,V>A withAllocatedResources(Map<String,Quantity> allocatedResources);
  public Boolean hasAllocatedResources();
  public A addToCapacity(String key,Quantity value);
  public A addToCapacity(Map<String,Quantity> map);
  public A removeFromCapacity(String key);
  public A removeFromCapacity(Map<String,Quantity> map);
  public Map<String,Quantity> getCapacity();
  public <K,V>A withCapacity(Map<String,Quantity> capacity);
  public Boolean hasCapacity();
  public A addToConditions(Integer index,V1PersistentVolumeClaimCondition item);
  public A setToConditions(Integer index,V1PersistentVolumeClaimCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items);
  public A addAllToConditions(Collection<V1PersistentVolumeClaimCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items);
  public A removeAllFromConditions(Collection<V1PersistentVolumeClaimCondition> items);
  public A removeMatchingFromConditions(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PersistentVolumeClaimCondition> getConditions();
  public List<V1PersistentVolumeClaimCondition> buildConditions();
  public V1PersistentVolumeClaimCondition buildCondition(Integer index);
  public V1PersistentVolumeClaimCondition buildFirstCondition();
  public V1PersistentVolumeClaimCondition buildLastCondition();
  public V1PersistentVolumeClaimCondition buildMatchingCondition(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate);
  public A withConditions(List<V1PersistentVolumeClaimCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... conditions);
  public Boolean hasConditions();
  public V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewCondition();
  public V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewConditionLike(V1PersistentVolumeClaimCondition item);
  public V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1PersistentVolumeClaimCondition item);
  public V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editLastCondition();
  public V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate);
  public String getPhase();
  public A withPhase(String phase);
  public Boolean hasPhase();
  public String getResizeStatus();
  public A withResizeStatus(String resizeStatus);
  public Boolean hasResizeStatus();
  public interface ConditionsNested<N> extends Nested<N>,V1PersistentVolumeClaimConditionFluent<V1PersistentVolumeClaimStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}