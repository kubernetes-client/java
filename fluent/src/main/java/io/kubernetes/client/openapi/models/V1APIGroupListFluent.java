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
public interface V1APIGroupListFluent<A extends V1APIGroupListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToGroups(Integer index,V1APIGroup item);
  public A setToGroups(Integer index,V1APIGroup item);
  public A addToGroups(io.kubernetes.client.openapi.models.V1APIGroup... items);
  public A addAllToGroups(Collection<V1APIGroup> items);
  public A removeFromGroups(io.kubernetes.client.openapi.models.V1APIGroup... items);
  public A removeAllFromGroups(Collection<V1APIGroup> items);
  public A removeMatchingFromGroups(Predicate<V1APIGroupBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildGroups instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1APIGroup> getGroups();
  public List<V1APIGroup> buildGroups();
  public V1APIGroup buildGroup(Integer index);
  public V1APIGroup buildFirstGroup();
  public V1APIGroup buildLastGroup();
  public V1APIGroup buildMatchingGroup(Predicate<V1APIGroupBuilder> predicate);
  public Boolean hasMatchingGroup(Predicate<V1APIGroupBuilder> predicate);
  public A withGroups(List<V1APIGroup> groups);
  public A withGroups(io.kubernetes.client.openapi.models.V1APIGroup... groups);
  public Boolean hasGroups();
  public V1APIGroupListFluent.GroupsNested<A> addNewGroup();
  public V1APIGroupListFluent.GroupsNested<A> addNewGroupLike(V1APIGroup item);
  public V1APIGroupListFluent.GroupsNested<A> setNewGroupLike(Integer index,V1APIGroup item);
  public V1APIGroupListFluent.GroupsNested<A> editGroup(Integer index);
  public V1APIGroupListFluent.GroupsNested<A> editFirstGroup();
  public V1APIGroupListFluent.GroupsNested<A> editLastGroup();
  public V1APIGroupListFluent.GroupsNested<A> editMatchingGroup(Predicate<V1APIGroupBuilder> predicate);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public interface GroupsNested<N> extends Nested<N>,V1APIGroupFluent<V1APIGroupListFluent.GroupsNested<N>>{
    public N and();
    public N endGroup();
    
  }
  
}