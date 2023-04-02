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
public interface V1JobListFluent<A extends V1JobListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1Job item);
  public A setToItems(Integer index,V1Job item);
  public A addToItems(io.kubernetes.client.openapi.models.V1Job... items);
  public A addAllToItems(Collection<V1Job> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Job... items);
  public A removeAllFromItems(Collection<V1Job> items);
  public A removeMatchingFromItems(Predicate<V1JobBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Job> getItems();
  public List<V1Job> buildItems();
  public V1Job buildItem(Integer index);
  public V1Job buildFirstItem();
  public V1Job buildLastItem();
  public V1Job buildMatchingItem(Predicate<V1JobBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1JobBuilder> predicate);
  public A withItems(List<V1Job> items);
  public A withItems(io.kubernetes.client.openapi.models.V1Job... items);
  public Boolean hasItems();
  public V1JobListFluent.ItemsNested<A> addNewItem();
  public V1JobListFluent.ItemsNested<A> addNewItemLike(V1Job item);
  public V1JobListFluent.ItemsNested<A> setNewItemLike(Integer index,V1Job item);
  public V1JobListFluent.ItemsNested<A> editItem(Integer index);
  public V1JobListFluent.ItemsNested<A> editFirstItem();
  public V1JobListFluent.ItemsNested<A> editLastItem();
  public V1JobListFluent.ItemsNested<A> editMatchingItem(Predicate<V1JobBuilder> predicate);
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
  public V1JobListFluent.MetadataNested<A> withNewMetadata();
  public V1JobListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1JobListFluent.MetadataNested<A> editMetadata();
  public V1JobListFluent.MetadataNested<A> editOrNewMetadata();
  public V1JobListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1JobFluent<V1JobListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1JobListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}