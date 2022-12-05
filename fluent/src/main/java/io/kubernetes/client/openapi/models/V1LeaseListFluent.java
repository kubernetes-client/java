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
public interface V1LeaseListFluent<A extends V1LeaseListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1Lease item);
  public A setToItems(Integer index,V1Lease item);
  public A addToItems(io.kubernetes.client.openapi.models.V1Lease... items);
  public A addAllToItems(Collection<V1Lease> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Lease... items);
  public A removeAllFromItems(Collection<V1Lease> items);
  public A removeMatchingFromItems(Predicate<V1LeaseBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Lease> getItems();
  public List<V1Lease> buildItems();
  public V1Lease buildItem(Integer index);
  public V1Lease buildFirstItem();
  public V1Lease buildLastItem();
  public V1Lease buildMatchingItem(Predicate<V1LeaseBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1LeaseBuilder> predicate);
  public A withItems(List<V1Lease> items);
  public A withItems(io.kubernetes.client.openapi.models.V1Lease... items);
  public Boolean hasItems();
  public V1LeaseListFluent.ItemsNested<A> addNewItem();
  public V1LeaseListFluent.ItemsNested<A> addNewItemLike(V1Lease item);
  public V1LeaseListFluent.ItemsNested<A> setNewItemLike(Integer index,V1Lease item);
  public V1LeaseListFluent.ItemsNested<A> editItem(Integer index);
  public V1LeaseListFluent.ItemsNested<A> editFirstItem();
  public V1LeaseListFluent.ItemsNested<A> editLastItem();
  public V1LeaseListFluent.ItemsNested<A> editMatchingItem(Predicate<V1LeaseBuilder> predicate);
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
  public V1LeaseListFluent.MetadataNested<A> withNewMetadata();
  public V1LeaseListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1LeaseListFluent.MetadataNested<A> editMetadata();
  public V1LeaseListFluent.MetadataNested<A> editOrNewMetadata();
  public V1LeaseListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1LeaseFluent<V1LeaseListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1LeaseListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}