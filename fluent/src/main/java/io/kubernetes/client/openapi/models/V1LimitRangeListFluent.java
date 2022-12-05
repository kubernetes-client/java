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
public interface V1LimitRangeListFluent<A extends V1LimitRangeListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1LimitRange item);
  public A setToItems(Integer index,V1LimitRange item);
  public A addToItems(io.kubernetes.client.openapi.models.V1LimitRange... items);
  public A addAllToItems(Collection<V1LimitRange> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1LimitRange... items);
  public A removeAllFromItems(Collection<V1LimitRange> items);
  public A removeMatchingFromItems(Predicate<V1LimitRangeBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LimitRange> getItems();
  public List<V1LimitRange> buildItems();
  public V1LimitRange buildItem(Integer index);
  public V1LimitRange buildFirstItem();
  public V1LimitRange buildLastItem();
  public V1LimitRange buildMatchingItem(Predicate<V1LimitRangeBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1LimitRangeBuilder> predicate);
  public A withItems(List<V1LimitRange> items);
  public A withItems(io.kubernetes.client.openapi.models.V1LimitRange... items);
  public Boolean hasItems();
  public V1LimitRangeListFluent.ItemsNested<A> addNewItem();
  public V1LimitRangeListFluent.ItemsNested<A> addNewItemLike(V1LimitRange item);
  public V1LimitRangeListFluent.ItemsNested<A> setNewItemLike(Integer index,V1LimitRange item);
  public V1LimitRangeListFluent.ItemsNested<A> editItem(Integer index);
  public V1LimitRangeListFluent.ItemsNested<A> editFirstItem();
  public V1LimitRangeListFluent.ItemsNested<A> editLastItem();
  public V1LimitRangeListFluent.ItemsNested<A> editMatchingItem(Predicate<V1LimitRangeBuilder> predicate);
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
  public V1LimitRangeListFluent.MetadataNested<A> withNewMetadata();
  public V1LimitRangeListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1LimitRangeListFluent.MetadataNested<A> editMetadata();
  public V1LimitRangeListFluent.MetadataNested<A> editOrNewMetadata();
  public V1LimitRangeListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1LimitRangeFluent<V1LimitRangeListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1LimitRangeListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}