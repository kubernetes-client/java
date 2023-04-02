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
public interface V1ReplicaSetListFluent<A extends V1ReplicaSetListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1ReplicaSet item);
  public A setToItems(Integer index,V1ReplicaSet item);
  public A addToItems(io.kubernetes.client.openapi.models.V1ReplicaSet... items);
  public A addAllToItems(Collection<V1ReplicaSet> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1ReplicaSet... items);
  public A removeAllFromItems(Collection<V1ReplicaSet> items);
  public A removeMatchingFromItems(Predicate<V1ReplicaSetBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ReplicaSet> getItems();
  public List<V1ReplicaSet> buildItems();
  public V1ReplicaSet buildItem(Integer index);
  public V1ReplicaSet buildFirstItem();
  public V1ReplicaSet buildLastItem();
  public V1ReplicaSet buildMatchingItem(Predicate<V1ReplicaSetBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1ReplicaSetBuilder> predicate);
  public A withItems(List<V1ReplicaSet> items);
  public A withItems(io.kubernetes.client.openapi.models.V1ReplicaSet... items);
  public Boolean hasItems();
  public V1ReplicaSetListFluent.ItemsNested<A> addNewItem();
  public V1ReplicaSetListFluent.ItemsNested<A> addNewItemLike(V1ReplicaSet item);
  public V1ReplicaSetListFluent.ItemsNested<A> setNewItemLike(Integer index,V1ReplicaSet item);
  public V1ReplicaSetListFluent.ItemsNested<A> editItem(Integer index);
  public V1ReplicaSetListFluent.ItemsNested<A> editFirstItem();
  public V1ReplicaSetListFluent.ItemsNested<A> editLastItem();
  public V1ReplicaSetListFluent.ItemsNested<A> editMatchingItem(Predicate<V1ReplicaSetBuilder> predicate);
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
  public V1ReplicaSetListFluent.MetadataNested<A> withNewMetadata();
  public V1ReplicaSetListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1ReplicaSetListFluent.MetadataNested<A> editMetadata();
  public V1ReplicaSetListFluent.MetadataNested<A> editOrNewMetadata();
  public V1ReplicaSetListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1ReplicaSetFluent<V1ReplicaSetListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1ReplicaSetListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}