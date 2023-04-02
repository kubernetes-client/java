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
public interface V1ServiceAccountListFluent<A extends V1ServiceAccountListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1ServiceAccount item);
  public A setToItems(Integer index,V1ServiceAccount item);
  public A addToItems(io.kubernetes.client.openapi.models.V1ServiceAccount... items);
  public A addAllToItems(Collection<V1ServiceAccount> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1ServiceAccount... items);
  public A removeAllFromItems(Collection<V1ServiceAccount> items);
  public A removeMatchingFromItems(Predicate<V1ServiceAccountBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ServiceAccount> getItems();
  public List<V1ServiceAccount> buildItems();
  public V1ServiceAccount buildItem(Integer index);
  public V1ServiceAccount buildFirstItem();
  public V1ServiceAccount buildLastItem();
  public V1ServiceAccount buildMatchingItem(Predicate<V1ServiceAccountBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1ServiceAccountBuilder> predicate);
  public A withItems(List<V1ServiceAccount> items);
  public A withItems(io.kubernetes.client.openapi.models.V1ServiceAccount... items);
  public Boolean hasItems();
  public V1ServiceAccountListFluent.ItemsNested<A> addNewItem();
  public V1ServiceAccountListFluent.ItemsNested<A> addNewItemLike(V1ServiceAccount item);
  public V1ServiceAccountListFluent.ItemsNested<A> setNewItemLike(Integer index,V1ServiceAccount item);
  public V1ServiceAccountListFluent.ItemsNested<A> editItem(Integer index);
  public V1ServiceAccountListFluent.ItemsNested<A> editFirstItem();
  public V1ServiceAccountListFluent.ItemsNested<A> editLastItem();
  public V1ServiceAccountListFluent.ItemsNested<A> editMatchingItem(Predicate<V1ServiceAccountBuilder> predicate);
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
  public V1ServiceAccountListFluent.MetadataNested<A> withNewMetadata();
  public V1ServiceAccountListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1ServiceAccountListFluent.MetadataNested<A> editMetadata();
  public V1ServiceAccountListFluent.MetadataNested<A> editOrNewMetadata();
  public V1ServiceAccountListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1ServiceAccountFluent<V1ServiceAccountListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1ServiceAccountListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}