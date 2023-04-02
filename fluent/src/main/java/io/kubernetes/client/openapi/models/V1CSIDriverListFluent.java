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
public interface V1CSIDriverListFluent<A extends V1CSIDriverListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1CSIDriver item);
  public A setToItems(Integer index,V1CSIDriver item);
  public A addToItems(io.kubernetes.client.openapi.models.V1CSIDriver... items);
  public A addAllToItems(Collection<V1CSIDriver> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1CSIDriver... items);
  public A removeAllFromItems(Collection<V1CSIDriver> items);
  public A removeMatchingFromItems(Predicate<V1CSIDriverBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CSIDriver> getItems();
  public List<V1CSIDriver> buildItems();
  public V1CSIDriver buildItem(Integer index);
  public V1CSIDriver buildFirstItem();
  public V1CSIDriver buildLastItem();
  public V1CSIDriver buildMatchingItem(Predicate<V1CSIDriverBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1CSIDriverBuilder> predicate);
  public A withItems(List<V1CSIDriver> items);
  public A withItems(io.kubernetes.client.openapi.models.V1CSIDriver... items);
  public Boolean hasItems();
  public V1CSIDriverListFluent.ItemsNested<A> addNewItem();
  public V1CSIDriverListFluent.ItemsNested<A> addNewItemLike(V1CSIDriver item);
  public V1CSIDriverListFluent.ItemsNested<A> setNewItemLike(Integer index,V1CSIDriver item);
  public V1CSIDriverListFluent.ItemsNested<A> editItem(Integer index);
  public V1CSIDriverListFluent.ItemsNested<A> editFirstItem();
  public V1CSIDriverListFluent.ItemsNested<A> editLastItem();
  public V1CSIDriverListFluent.ItemsNested<A> editMatchingItem(Predicate<V1CSIDriverBuilder> predicate);
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
  public V1CSIDriverListFluent.MetadataNested<A> withNewMetadata();
  public V1CSIDriverListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1CSIDriverListFluent.MetadataNested<A> editMetadata();
  public V1CSIDriverListFluent.MetadataNested<A> editOrNewMetadata();
  public V1CSIDriverListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1CSIDriverFluent<V1CSIDriverListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1CSIDriverListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}