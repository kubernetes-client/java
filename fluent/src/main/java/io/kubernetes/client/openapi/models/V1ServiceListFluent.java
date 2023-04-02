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
public interface V1ServiceListFluent<A extends V1ServiceListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1Service item);
  public A setToItems(Integer index,V1Service item);
  public A addToItems(io.kubernetes.client.openapi.models.V1Service... items);
  public A addAllToItems(Collection<V1Service> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Service... items);
  public A removeAllFromItems(Collection<V1Service> items);
  public A removeMatchingFromItems(Predicate<V1ServiceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Service> getItems();
  public List<V1Service> buildItems();
  public V1Service buildItem(Integer index);
  public V1Service buildFirstItem();
  public V1Service buildLastItem();
  public V1Service buildMatchingItem(Predicate<V1ServiceBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1ServiceBuilder> predicate);
  public A withItems(List<V1Service> items);
  public A withItems(io.kubernetes.client.openapi.models.V1Service... items);
  public Boolean hasItems();
  public V1ServiceListFluent.ItemsNested<A> addNewItem();
  public V1ServiceListFluent.ItemsNested<A> addNewItemLike(V1Service item);
  public V1ServiceListFluent.ItemsNested<A> setNewItemLike(Integer index,V1Service item);
  public V1ServiceListFluent.ItemsNested<A> editItem(Integer index);
  public V1ServiceListFluent.ItemsNested<A> editFirstItem();
  public V1ServiceListFluent.ItemsNested<A> editLastItem();
  public V1ServiceListFluent.ItemsNested<A> editMatchingItem(Predicate<V1ServiceBuilder> predicate);
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
  public V1ServiceListFluent.MetadataNested<A> withNewMetadata();
  public V1ServiceListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1ServiceListFluent.MetadataNested<A> editMetadata();
  public V1ServiceListFluent.MetadataNested<A> editOrNewMetadata();
  public V1ServiceListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1ServiceFluent<V1ServiceListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1ServiceListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}