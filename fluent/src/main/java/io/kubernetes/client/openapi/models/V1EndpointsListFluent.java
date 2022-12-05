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
public interface V1EndpointsListFluent<A extends V1EndpointsListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1Endpoints item);
  public A setToItems(Integer index,V1Endpoints item);
  public A addToItems(io.kubernetes.client.openapi.models.V1Endpoints... items);
  public A addAllToItems(Collection<V1Endpoints> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Endpoints... items);
  public A removeAllFromItems(Collection<V1Endpoints> items);
  public A removeMatchingFromItems(Predicate<V1EndpointsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Endpoints> getItems();
  public List<V1Endpoints> buildItems();
  public V1Endpoints buildItem(Integer index);
  public V1Endpoints buildFirstItem();
  public V1Endpoints buildLastItem();
  public V1Endpoints buildMatchingItem(Predicate<V1EndpointsBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1EndpointsBuilder> predicate);
  public A withItems(List<V1Endpoints> items);
  public A withItems(io.kubernetes.client.openapi.models.V1Endpoints... items);
  public Boolean hasItems();
  public V1EndpointsListFluent.ItemsNested<A> addNewItem();
  public V1EndpointsListFluent.ItemsNested<A> addNewItemLike(V1Endpoints item);
  public V1EndpointsListFluent.ItemsNested<A> setNewItemLike(Integer index,V1Endpoints item);
  public V1EndpointsListFluent.ItemsNested<A> editItem(Integer index);
  public V1EndpointsListFluent.ItemsNested<A> editFirstItem();
  public V1EndpointsListFluent.ItemsNested<A> editLastItem();
  public V1EndpointsListFluent.ItemsNested<A> editMatchingItem(Predicate<V1EndpointsBuilder> predicate);
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
  public V1EndpointsListFluent.MetadataNested<A> withNewMetadata();
  public V1EndpointsListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1EndpointsListFluent.MetadataNested<A> editMetadata();
  public V1EndpointsListFluent.MetadataNested<A> editOrNewMetadata();
  public V1EndpointsListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1EndpointsFluent<V1EndpointsListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1EndpointsListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}