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
public interface V1StorageClassListFluent<A extends V1StorageClassListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1StorageClass item);
  public A setToItems(Integer index,V1StorageClass item);
  public A addToItems(io.kubernetes.client.openapi.models.V1StorageClass... items);
  public A addAllToItems(Collection<V1StorageClass> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1StorageClass... items);
  public A removeAllFromItems(Collection<V1StorageClass> items);
  public A removeMatchingFromItems(Predicate<V1StorageClassBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1StorageClass> getItems();
  public List<V1StorageClass> buildItems();
  public V1StorageClass buildItem(Integer index);
  public V1StorageClass buildFirstItem();
  public V1StorageClass buildLastItem();
  public V1StorageClass buildMatchingItem(Predicate<V1StorageClassBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1StorageClassBuilder> predicate);
  public A withItems(List<V1StorageClass> items);
  public A withItems(io.kubernetes.client.openapi.models.V1StorageClass... items);
  public Boolean hasItems();
  public V1StorageClassListFluent.ItemsNested<A> addNewItem();
  public V1StorageClassListFluent.ItemsNested<A> addNewItemLike(V1StorageClass item);
  public V1StorageClassListFluent.ItemsNested<A> setNewItemLike(Integer index,V1StorageClass item);
  public V1StorageClassListFluent.ItemsNested<A> editItem(Integer index);
  public V1StorageClassListFluent.ItemsNested<A> editFirstItem();
  public V1StorageClassListFluent.ItemsNested<A> editLastItem();
  public V1StorageClassListFluent.ItemsNested<A> editMatchingItem(Predicate<V1StorageClassBuilder> predicate);
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
  public V1StorageClassListFluent.MetadataNested<A> withNewMetadata();
  public V1StorageClassListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1StorageClassListFluent.MetadataNested<A> editMetadata();
  public V1StorageClassListFluent.MetadataNested<A> editOrNewMetadata();
  public V1StorageClassListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1StorageClassFluent<V1StorageClassListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1StorageClassListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}