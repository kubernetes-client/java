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
public interface V1PodDisruptionBudgetListFluent<A extends V1PodDisruptionBudgetListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1PodDisruptionBudget item);
  public A setToItems(Integer index,V1PodDisruptionBudget item);
  public A addToItems(io.kubernetes.client.openapi.models.V1PodDisruptionBudget... items);
  public A addAllToItems(Collection<V1PodDisruptionBudget> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1PodDisruptionBudget... items);
  public A removeAllFromItems(Collection<V1PodDisruptionBudget> items);
  public A removeMatchingFromItems(Predicate<V1PodDisruptionBudgetBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodDisruptionBudget> getItems();
  public List<V1PodDisruptionBudget> buildItems();
  public V1PodDisruptionBudget buildItem(Integer index);
  public V1PodDisruptionBudget buildFirstItem();
  public V1PodDisruptionBudget buildLastItem();
  public V1PodDisruptionBudget buildMatchingItem(Predicate<V1PodDisruptionBudgetBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1PodDisruptionBudgetBuilder> predicate);
  public A withItems(List<V1PodDisruptionBudget> items);
  public A withItems(io.kubernetes.client.openapi.models.V1PodDisruptionBudget... items);
  public Boolean hasItems();
  public V1PodDisruptionBudgetListFluent.ItemsNested<A> addNewItem();
  public V1PodDisruptionBudgetListFluent.ItemsNested<A> addNewItemLike(V1PodDisruptionBudget item);
  public V1PodDisruptionBudgetListFluent.ItemsNested<A> setNewItemLike(Integer index,V1PodDisruptionBudget item);
  public V1PodDisruptionBudgetListFluent.ItemsNested<A> editItem(Integer index);
  public V1PodDisruptionBudgetListFluent.ItemsNested<A> editFirstItem();
  public V1PodDisruptionBudgetListFluent.ItemsNested<A> editLastItem();
  public V1PodDisruptionBudgetListFluent.ItemsNested<A> editMatchingItem(Predicate<V1PodDisruptionBudgetBuilder> predicate);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata();
  public V1ListMeta buildMetadata();
  public A withMetadata(V1ListMeta metadata);
  public Boolean hasMetadata();
  public V1PodDisruptionBudgetListFluent.MetadataNested<A> withNewMetadata();
  public V1PodDisruptionBudgetListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1PodDisruptionBudgetListFluent.MetadataNested<A> editMetadata();
  public V1PodDisruptionBudgetListFluent.MetadataNested<A> editOrNewMetadata();
  public V1PodDisruptionBudgetListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1PodDisruptionBudgetFluent<V1PodDisruptionBudgetListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1PodDisruptionBudgetListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}