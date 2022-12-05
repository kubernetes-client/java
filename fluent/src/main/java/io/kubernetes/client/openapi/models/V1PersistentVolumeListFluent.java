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
public interface V1PersistentVolumeListFluent<A extends V1PersistentVolumeListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1PersistentVolume item);
  public A setToItems(Integer index,V1PersistentVolume item);
  public A addToItems(io.kubernetes.client.openapi.models.V1PersistentVolume... items);
  public A addAllToItems(Collection<V1PersistentVolume> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1PersistentVolume... items);
  public A removeAllFromItems(Collection<V1PersistentVolume> items);
  public A removeMatchingFromItems(Predicate<V1PersistentVolumeBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PersistentVolume> getItems();
  public List<V1PersistentVolume> buildItems();
  public V1PersistentVolume buildItem(Integer index);
  public V1PersistentVolume buildFirstItem();
  public V1PersistentVolume buildLastItem();
  public V1PersistentVolume buildMatchingItem(Predicate<V1PersistentVolumeBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1PersistentVolumeBuilder> predicate);
  public A withItems(List<V1PersistentVolume> items);
  public A withItems(io.kubernetes.client.openapi.models.V1PersistentVolume... items);
  public Boolean hasItems();
  public V1PersistentVolumeListFluent.ItemsNested<A> addNewItem();
  public V1PersistentVolumeListFluent.ItemsNested<A> addNewItemLike(V1PersistentVolume item);
  public V1PersistentVolumeListFluent.ItemsNested<A> setNewItemLike(Integer index,V1PersistentVolume item);
  public V1PersistentVolumeListFluent.ItemsNested<A> editItem(Integer index);
  public V1PersistentVolumeListFluent.ItemsNested<A> editFirstItem();
  public V1PersistentVolumeListFluent.ItemsNested<A> editLastItem();
  public V1PersistentVolumeListFluent.ItemsNested<A> editMatchingItem(Predicate<V1PersistentVolumeBuilder> predicate);
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
  public V1PersistentVolumeListFluent.MetadataNested<A> withNewMetadata();
  public V1PersistentVolumeListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1PersistentVolumeListFluent.MetadataNested<A> editMetadata();
  public V1PersistentVolumeListFluent.MetadataNested<A> editOrNewMetadata();
  public V1PersistentVolumeListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1PersistentVolumeFluent<V1PersistentVolumeListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1PersistentVolumeListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}