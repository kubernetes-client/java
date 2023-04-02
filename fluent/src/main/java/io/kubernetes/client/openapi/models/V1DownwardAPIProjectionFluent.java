package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1DownwardAPIProjectionFluent<A extends V1DownwardAPIProjectionFluent<A>> extends Fluent<A>{
  public A addToItems(Integer index,V1DownwardAPIVolumeFile item);
  public A setToItems(Integer index,V1DownwardAPIVolumeFile item);
  public A addToItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
  public A addAllToItems(Collection<V1DownwardAPIVolumeFile> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
  public A removeAllFromItems(Collection<V1DownwardAPIVolumeFile> items);
  public A removeMatchingFromItems(Predicate<V1DownwardAPIVolumeFileBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1DownwardAPIVolumeFile> getItems();
  public List<V1DownwardAPIVolumeFile> buildItems();
  public V1DownwardAPIVolumeFile buildItem(Integer index);
  public V1DownwardAPIVolumeFile buildFirstItem();
  public V1DownwardAPIVolumeFile buildLastItem();
  public V1DownwardAPIVolumeFile buildMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate);
  public A withItems(List<V1DownwardAPIVolumeFile> items);
  public A withItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
  public Boolean hasItems();
  public V1DownwardAPIProjectionFluent.ItemsNested<A> addNewItem();
  public V1DownwardAPIProjectionFluent.ItemsNested<A> addNewItemLike(V1DownwardAPIVolumeFile item);
  public V1DownwardAPIProjectionFluent.ItemsNested<A> setNewItemLike(Integer index,V1DownwardAPIVolumeFile item);
  public V1DownwardAPIProjectionFluent.ItemsNested<A> editItem(Integer index);
  public V1DownwardAPIProjectionFluent.ItemsNested<A> editFirstItem();
  public V1DownwardAPIProjectionFluent.ItemsNested<A> editLastItem();
  public V1DownwardAPIProjectionFluent.ItemsNested<A> editMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate);
  public interface ItemsNested<N> extends Nested<N>,V1DownwardAPIVolumeFileFluent<V1DownwardAPIProjectionFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  
}