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
public interface V1PriorityClassListFluent<A extends V1PriorityClassListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1PriorityClass item);
  public A setToItems(Integer index,V1PriorityClass item);
  public A addToItems(io.kubernetes.client.openapi.models.V1PriorityClass... items);
  public A addAllToItems(Collection<V1PriorityClass> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1PriorityClass... items);
  public A removeAllFromItems(Collection<V1PriorityClass> items);
  public A removeMatchingFromItems(Predicate<V1PriorityClassBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PriorityClass> getItems();
  public List<V1PriorityClass> buildItems();
  public V1PriorityClass buildItem(Integer index);
  public V1PriorityClass buildFirstItem();
  public V1PriorityClass buildLastItem();
  public V1PriorityClass buildMatchingItem(Predicate<V1PriorityClassBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1PriorityClassBuilder> predicate);
  public A withItems(List<V1PriorityClass> items);
  public A withItems(io.kubernetes.client.openapi.models.V1PriorityClass... items);
  public Boolean hasItems();
  public V1PriorityClassListFluent.ItemsNested<A> addNewItem();
  public V1PriorityClassListFluent.ItemsNested<A> addNewItemLike(V1PriorityClass item);
  public V1PriorityClassListFluent.ItemsNested<A> setNewItemLike(Integer index,V1PriorityClass item);
  public V1PriorityClassListFluent.ItemsNested<A> editItem(Integer index);
  public V1PriorityClassListFluent.ItemsNested<A> editFirstItem();
  public V1PriorityClassListFluent.ItemsNested<A> editLastItem();
  public V1PriorityClassListFluent.ItemsNested<A> editMatchingItem(Predicate<V1PriorityClassBuilder> predicate);
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
  public V1PriorityClassListFluent.MetadataNested<A> withNewMetadata();
  public V1PriorityClassListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1PriorityClassListFluent.MetadataNested<A> editMetadata();
  public V1PriorityClassListFluent.MetadataNested<A> editOrNewMetadata();
  public V1PriorityClassListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1PriorityClassFluent<V1PriorityClassListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1PriorityClassListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}