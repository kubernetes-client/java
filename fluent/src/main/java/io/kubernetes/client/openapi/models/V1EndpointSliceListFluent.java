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
public interface V1EndpointSliceListFluent<A extends V1EndpointSliceListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1EndpointSlice item);
  public A setToItems(Integer index,V1EndpointSlice item);
  public A addToItems(io.kubernetes.client.openapi.models.V1EndpointSlice... items);
  public A addAllToItems(Collection<V1EndpointSlice> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1EndpointSlice... items);
  public A removeAllFromItems(Collection<V1EndpointSlice> items);
  public A removeMatchingFromItems(Predicate<V1EndpointSliceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EndpointSlice> getItems();
  public List<V1EndpointSlice> buildItems();
  public V1EndpointSlice buildItem(Integer index);
  public V1EndpointSlice buildFirstItem();
  public V1EndpointSlice buildLastItem();
  public V1EndpointSlice buildMatchingItem(Predicate<V1EndpointSliceBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1EndpointSliceBuilder> predicate);
  public A withItems(List<V1EndpointSlice> items);
  public A withItems(io.kubernetes.client.openapi.models.V1EndpointSlice... items);
  public Boolean hasItems();
  public V1EndpointSliceListFluent.ItemsNested<A> addNewItem();
  public V1EndpointSliceListFluent.ItemsNested<A> addNewItemLike(V1EndpointSlice item);
  public V1EndpointSliceListFluent.ItemsNested<A> setNewItemLike(Integer index,V1EndpointSlice item);
  public V1EndpointSliceListFluent.ItemsNested<A> editItem(Integer index);
  public V1EndpointSliceListFluent.ItemsNested<A> editFirstItem();
  public V1EndpointSliceListFluent.ItemsNested<A> editLastItem();
  public V1EndpointSliceListFluent.ItemsNested<A> editMatchingItem(Predicate<V1EndpointSliceBuilder> predicate);
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
  public V1EndpointSliceListFluent.MetadataNested<A> withNewMetadata();
  public V1EndpointSliceListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1EndpointSliceListFluent.MetadataNested<A> editMetadata();
  public V1EndpointSliceListFluent.MetadataNested<A> editOrNewMetadata();
  public V1EndpointSliceListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1EndpointSliceFluent<V1EndpointSliceListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1EndpointSliceListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}