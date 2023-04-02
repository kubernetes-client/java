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
public interface V1PersistentVolumeClaimListFluent<A extends V1PersistentVolumeClaimListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1PersistentVolumeClaim item);
  public A setToItems(Integer index,V1PersistentVolumeClaim item);
  public A addToItems(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items);
  public A addAllToItems(Collection<V1PersistentVolumeClaim> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items);
  public A removeAllFromItems(Collection<V1PersistentVolumeClaim> items);
  public A removeMatchingFromItems(Predicate<V1PersistentVolumeClaimBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PersistentVolumeClaim> getItems();
  public List<V1PersistentVolumeClaim> buildItems();
  public V1PersistentVolumeClaim buildItem(Integer index);
  public V1PersistentVolumeClaim buildFirstItem();
  public V1PersistentVolumeClaim buildLastItem();
  public V1PersistentVolumeClaim buildMatchingItem(Predicate<V1PersistentVolumeClaimBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1PersistentVolumeClaimBuilder> predicate);
  public A withItems(List<V1PersistentVolumeClaim> items);
  public A withItems(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items);
  public Boolean hasItems();
  public V1PersistentVolumeClaimListFluent.ItemsNested<A> addNewItem();
  public V1PersistentVolumeClaimListFluent.ItemsNested<A> addNewItemLike(V1PersistentVolumeClaim item);
  public V1PersistentVolumeClaimListFluent.ItemsNested<A> setNewItemLike(Integer index,V1PersistentVolumeClaim item);
  public V1PersistentVolumeClaimListFluent.ItemsNested<A> editItem(Integer index);
  public V1PersistentVolumeClaimListFluent.ItemsNested<A> editFirstItem();
  public V1PersistentVolumeClaimListFluent.ItemsNested<A> editLastItem();
  public V1PersistentVolumeClaimListFluent.ItemsNested<A> editMatchingItem(Predicate<V1PersistentVolumeClaimBuilder> predicate);
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
  public V1PersistentVolumeClaimListFluent.MetadataNested<A> withNewMetadata();
  public V1PersistentVolumeClaimListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1PersistentVolumeClaimListFluent.MetadataNested<A> editMetadata();
  public V1PersistentVolumeClaimListFluent.MetadataNested<A> editOrNewMetadata();
  public V1PersistentVolumeClaimListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1PersistentVolumeClaimFluent<V1PersistentVolumeClaimListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1PersistentVolumeClaimListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}