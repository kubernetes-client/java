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
public interface V1beta1PriorityLevelConfigurationListFluent<A extends V1beta1PriorityLevelConfigurationListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1beta1PriorityLevelConfiguration item);
  public A setToItems(Integer index,V1beta1PriorityLevelConfiguration item);
  public A addToItems(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfiguration... items);
  public A addAllToItems(Collection<V1beta1PriorityLevelConfiguration> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfiguration... items);
  public A removeAllFromItems(Collection<V1beta1PriorityLevelConfiguration> items);
  public A removeMatchingFromItems(Predicate<V1beta1PriorityLevelConfigurationBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1PriorityLevelConfiguration> getItems();
  public List<V1beta1PriorityLevelConfiguration> buildItems();
  public V1beta1PriorityLevelConfiguration buildItem(Integer index);
  public V1beta1PriorityLevelConfiguration buildFirstItem();
  public V1beta1PriorityLevelConfiguration buildLastItem();
  public V1beta1PriorityLevelConfiguration buildMatchingItem(Predicate<V1beta1PriorityLevelConfigurationBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1beta1PriorityLevelConfigurationBuilder> predicate);
  public A withItems(List<V1beta1PriorityLevelConfiguration> items);
  public A withItems(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfiguration... items);
  public Boolean hasItems();
  public V1beta1PriorityLevelConfigurationListFluent.ItemsNested<A> addNewItem();
  public V1beta1PriorityLevelConfigurationListFluent.ItemsNested<A> addNewItemLike(V1beta1PriorityLevelConfiguration item);
  public V1beta1PriorityLevelConfigurationListFluent.ItemsNested<A> setNewItemLike(Integer index,V1beta1PriorityLevelConfiguration item);
  public V1beta1PriorityLevelConfigurationListFluent.ItemsNested<A> editItem(Integer index);
  public V1beta1PriorityLevelConfigurationListFluent.ItemsNested<A> editFirstItem();
  public V1beta1PriorityLevelConfigurationListFluent.ItemsNested<A> editLastItem();
  public V1beta1PriorityLevelConfigurationListFluent.ItemsNested<A> editMatchingItem(Predicate<V1beta1PriorityLevelConfigurationBuilder> predicate);
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
  public V1beta1PriorityLevelConfigurationListFluent.MetadataNested<A> withNewMetadata();
  public V1beta1PriorityLevelConfigurationListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1beta1PriorityLevelConfigurationListFluent.MetadataNested<A> editMetadata();
  public V1beta1PriorityLevelConfigurationListFluent.MetadataNested<A> editOrNewMetadata();
  public V1beta1PriorityLevelConfigurationListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1beta1PriorityLevelConfigurationFluent<V1beta1PriorityLevelConfigurationListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1beta1PriorityLevelConfigurationListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}