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
public interface V1NamespaceListFluent<A extends V1NamespaceListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1Namespace item);
  public A setToItems(Integer index,V1Namespace item);
  public A addToItems(io.kubernetes.client.openapi.models.V1Namespace... items);
  public A addAllToItems(Collection<V1Namespace> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Namespace... items);
  public A removeAllFromItems(Collection<V1Namespace> items);
  public A removeMatchingFromItems(Predicate<V1NamespaceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Namespace> getItems();
  public List<V1Namespace> buildItems();
  public V1Namespace buildItem(Integer index);
  public V1Namespace buildFirstItem();
  public V1Namespace buildLastItem();
  public V1Namespace buildMatchingItem(Predicate<V1NamespaceBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1NamespaceBuilder> predicate);
  public A withItems(List<V1Namespace> items);
  public A withItems(io.kubernetes.client.openapi.models.V1Namespace... items);
  public Boolean hasItems();
  public V1NamespaceListFluent.ItemsNested<A> addNewItem();
  public V1NamespaceListFluent.ItemsNested<A> addNewItemLike(V1Namespace item);
  public V1NamespaceListFluent.ItemsNested<A> setNewItemLike(Integer index,V1Namespace item);
  public V1NamespaceListFluent.ItemsNested<A> editItem(Integer index);
  public V1NamespaceListFluent.ItemsNested<A> editFirstItem();
  public V1NamespaceListFluent.ItemsNested<A> editLastItem();
  public V1NamespaceListFluent.ItemsNested<A> editMatchingItem(Predicate<V1NamespaceBuilder> predicate);
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
  public V1NamespaceListFluent.MetadataNested<A> withNewMetadata();
  public V1NamespaceListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1NamespaceListFluent.MetadataNested<A> editMetadata();
  public V1NamespaceListFluent.MetadataNested<A> editOrNewMetadata();
  public V1NamespaceListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1NamespaceFluent<V1NamespaceListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1NamespaceListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}