package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2PodSchedulingContextListFluent<A extends V1alpha2PodSchedulingContextListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(int index,V1alpha2PodSchedulingContext item);
  public A setToItems(int index,V1alpha2PodSchedulingContext item);
  public A addToItems(io.kubernetes.client.openapi.models.V1alpha2PodSchedulingContext... items);
  public A addAllToItems(Collection<V1alpha2PodSchedulingContext> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1alpha2PodSchedulingContext... items);
  public A removeAllFromItems(Collection<V1alpha2PodSchedulingContext> items);
  public A removeMatchingFromItems(Predicate<V1alpha2PodSchedulingContextBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha2PodSchedulingContext> getItems();
  public List<V1alpha2PodSchedulingContext> buildItems();
  public V1alpha2PodSchedulingContext buildItem(int index);
  public V1alpha2PodSchedulingContext buildFirstItem();
  public V1alpha2PodSchedulingContext buildLastItem();
  public V1alpha2PodSchedulingContext buildMatchingItem(Predicate<V1alpha2PodSchedulingContextBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1alpha2PodSchedulingContextBuilder> predicate);
  public A withItems(List<V1alpha2PodSchedulingContext> items);
  public A withItems(io.kubernetes.client.openapi.models.V1alpha2PodSchedulingContext... items);
  public Boolean hasItems();
  public V1alpha2PodSchedulingContextListFluent.ItemsNested<A> addNewItem();
  public V1alpha2PodSchedulingContextListFluent.ItemsNested<A> addNewItemLike(V1alpha2PodSchedulingContext item);
  public V1alpha2PodSchedulingContextListFluent.ItemsNested<A> setNewItemLike(int index,V1alpha2PodSchedulingContext item);
  public V1alpha2PodSchedulingContextListFluent.ItemsNested<A> editItem(int index);
  public V1alpha2PodSchedulingContextListFluent.ItemsNested<A> editFirstItem();
  public V1alpha2PodSchedulingContextListFluent.ItemsNested<A> editLastItem();
  public V1alpha2PodSchedulingContextListFluent.ItemsNested<A> editMatchingItem(Predicate<V1alpha2PodSchedulingContextBuilder> predicate);
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
  public V1alpha2PodSchedulingContextListFluent.MetadataNested<A> withNewMetadata();
  public V1alpha2PodSchedulingContextListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1alpha2PodSchedulingContextListFluent.MetadataNested<A> editMetadata();
  public V1alpha2PodSchedulingContextListFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha2PodSchedulingContextListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1alpha2PodSchedulingContextFluent<V1alpha2PodSchedulingContextListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1alpha2PodSchedulingContextListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}