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
public interface V1CustomResourceDefinitionStatusFluent<A extends V1CustomResourceDefinitionStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildAcceptedNames instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceDefinitionNames getAcceptedNames();
  public V1CustomResourceDefinitionNames buildAcceptedNames();
  public A withAcceptedNames(V1CustomResourceDefinitionNames acceptedNames);
  public Boolean hasAcceptedNames();
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNames();
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNamesLike(V1CustomResourceDefinitionNames item);
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editAcceptedNames();
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNames();
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNamesLike(V1CustomResourceDefinitionNames item);
  public A addToConditions(Integer index,V1CustomResourceDefinitionCondition item);
  public A setToConditions(Integer index,V1CustomResourceDefinitionCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... items);
  public A addAllToConditions(Collection<V1CustomResourceDefinitionCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... items);
  public A removeAllFromConditions(Collection<V1CustomResourceDefinitionCondition> items);
  public A removeMatchingFromConditions(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CustomResourceDefinitionCondition> getConditions();
  public List<V1CustomResourceDefinitionCondition> buildConditions();
  public V1CustomResourceDefinitionCondition buildCondition(Integer index);
  public V1CustomResourceDefinitionCondition buildFirstCondition();
  public V1CustomResourceDefinitionCondition buildLastCondition();
  public V1CustomResourceDefinitionCondition buildMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate);
  public A withConditions(List<V1CustomResourceDefinitionCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... conditions);
  public Boolean hasConditions();
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewCondition();
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewConditionLike(V1CustomResourceDefinitionCondition item);
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1CustomResourceDefinitionCondition item);
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editLastCondition();
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate);
  public A addToStoredVersions(Integer index,String item);
  public A setToStoredVersions(Integer index,String item);
  public A addToStoredVersions(java.lang.String... items);
  public A addAllToStoredVersions(Collection<String> items);
  public A removeFromStoredVersions(java.lang.String... items);
  public A removeAllFromStoredVersions(Collection<String> items);
  public List<String> getStoredVersions();
  public String getStoredVersion(Integer index);
  public String getFirstStoredVersion();
  public String getLastStoredVersion();
  public String getMatchingStoredVersion(Predicate<String> predicate);
  public Boolean hasMatchingStoredVersion(Predicate<String> predicate);
  public A withStoredVersions(List<String> storedVersions);
  public A withStoredVersions(java.lang.String... storedVersions);
  public Boolean hasStoredVersions();
  public interface AcceptedNamesNested<N> extends Nested<N>,V1CustomResourceDefinitionNamesFluent<V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>>{
    public N and();
    public N endAcceptedNames();
    
  }
  public interface ConditionsNested<N> extends Nested<N>,V1CustomResourceDefinitionConditionFluent<V1CustomResourceDefinitionStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}