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
public interface V1alpha1StorageVersionListFluent<A extends V1alpha1StorageVersionListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1alpha1StorageVersion item);
  public A setToItems(Integer index,V1alpha1StorageVersion item);
  public A addToItems(io.kubernetes.client.openapi.models.V1alpha1StorageVersion... items);
  public A addAllToItems(Collection<V1alpha1StorageVersion> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1alpha1StorageVersion... items);
  public A removeAllFromItems(Collection<V1alpha1StorageVersion> items);
  public A removeMatchingFromItems(Predicate<V1alpha1StorageVersionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1StorageVersion> getItems();
  public List<V1alpha1StorageVersion> buildItems();
  public V1alpha1StorageVersion buildItem(Integer index);
  public V1alpha1StorageVersion buildFirstItem();
  public V1alpha1StorageVersion buildLastItem();
  public V1alpha1StorageVersion buildMatchingItem(Predicate<V1alpha1StorageVersionBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1alpha1StorageVersionBuilder> predicate);
  public A withItems(List<V1alpha1StorageVersion> items);
  public A withItems(io.kubernetes.client.openapi.models.V1alpha1StorageVersion... items);
  public Boolean hasItems();
  public V1alpha1StorageVersionListFluent.ItemsNested<A> addNewItem();
  public V1alpha1StorageVersionListFluent.ItemsNested<A> addNewItemLike(V1alpha1StorageVersion item);
  public V1alpha1StorageVersionListFluent.ItemsNested<A> setNewItemLike(Integer index,V1alpha1StorageVersion item);
  public V1alpha1StorageVersionListFluent.ItemsNested<A> editItem(Integer index);
  public V1alpha1StorageVersionListFluent.ItemsNested<A> editFirstItem();
  public V1alpha1StorageVersionListFluent.ItemsNested<A> editLastItem();
  public V1alpha1StorageVersionListFluent.ItemsNested<A> editMatchingItem(Predicate<V1alpha1StorageVersionBuilder> predicate);
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
  public V1alpha1StorageVersionListFluent.MetadataNested<A> withNewMetadata();
  public V1alpha1StorageVersionListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1alpha1StorageVersionListFluent.MetadataNested<A> editMetadata();
  public V1alpha1StorageVersionListFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha1StorageVersionListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1alpha1StorageVersionFluent<V1alpha1StorageVersionListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1alpha1StorageVersionListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}