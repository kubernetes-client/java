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
public interface V1CSINodeListFluent<A extends V1CSINodeListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1CSINode item);
  public A setToItems(Integer index,V1CSINode item);
  public A addToItems(io.kubernetes.client.openapi.models.V1CSINode... items);
  public A addAllToItems(Collection<V1CSINode> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1CSINode... items);
  public A removeAllFromItems(Collection<V1CSINode> items);
  public A removeMatchingFromItems(Predicate<V1CSINodeBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CSINode> getItems();
  public List<V1CSINode> buildItems();
  public V1CSINode buildItem(Integer index);
  public V1CSINode buildFirstItem();
  public V1CSINode buildLastItem();
  public V1CSINode buildMatchingItem(Predicate<V1CSINodeBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1CSINodeBuilder> predicate);
  public A withItems(List<V1CSINode> items);
  public A withItems(io.kubernetes.client.openapi.models.V1CSINode... items);
  public Boolean hasItems();
  public V1CSINodeListFluent.ItemsNested<A> addNewItem();
  public V1CSINodeListFluent.ItemsNested<A> addNewItemLike(V1CSINode item);
  public V1CSINodeListFluent.ItemsNested<A> setNewItemLike(Integer index,V1CSINode item);
  public V1CSINodeListFluent.ItemsNested<A> editItem(Integer index);
  public V1CSINodeListFluent.ItemsNested<A> editFirstItem();
  public V1CSINodeListFluent.ItemsNested<A> editLastItem();
  public V1CSINodeListFluent.ItemsNested<A> editMatchingItem(Predicate<V1CSINodeBuilder> predicate);
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
  public V1CSINodeListFluent.MetadataNested<A> withNewMetadata();
  public V1CSINodeListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1CSINodeListFluent.MetadataNested<A> editMetadata();
  public V1CSINodeListFluent.MetadataNested<A> editOrNewMetadata();
  public V1CSINodeListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1CSINodeFluent<V1CSINodeListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1CSINodeListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}