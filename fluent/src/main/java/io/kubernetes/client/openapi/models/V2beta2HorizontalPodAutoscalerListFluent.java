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
public interface V2beta2HorizontalPodAutoscalerListFluent<A extends V2beta2HorizontalPodAutoscalerListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V2beta2HorizontalPodAutoscaler item);
  public A setToItems(Integer index,V2beta2HorizontalPodAutoscaler item);
  public A addToItems(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler... items);
  public A addAllToItems(Collection<V2beta2HorizontalPodAutoscaler> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler... items);
  public A removeAllFromItems(Collection<V2beta2HorizontalPodAutoscaler> items);
  public A removeMatchingFromItems(Predicate<V2beta2HorizontalPodAutoscalerBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2beta2HorizontalPodAutoscaler> getItems();
  public List<V2beta2HorizontalPodAutoscaler> buildItems();
  public V2beta2HorizontalPodAutoscaler buildItem(Integer index);
  public V2beta2HorizontalPodAutoscaler buildFirstItem();
  public V2beta2HorizontalPodAutoscaler buildLastItem();
  public V2beta2HorizontalPodAutoscaler buildMatchingItem(Predicate<V2beta2HorizontalPodAutoscalerBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V2beta2HorizontalPodAutoscalerBuilder> predicate);
  public A withItems(List<V2beta2HorizontalPodAutoscaler> items);
  public A withItems(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscaler... items);
  public Boolean hasItems();
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> addNewItem();
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> addNewItemLike(V2beta2HorizontalPodAutoscaler item);
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> setNewItemLike(Integer index,V2beta2HorizontalPodAutoscaler item);
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> editItem(Integer index);
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> editFirstItem();
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> editLastItem();
  public V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<A> editMatchingItem(Predicate<V2beta2HorizontalPodAutoscalerBuilder> predicate);
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
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> withNewMetadata();
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> editMetadata();
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> editOrNewMetadata();
  public V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V2beta2HorizontalPodAutoscalerFluent<V2beta2HorizontalPodAutoscalerListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V2beta2HorizontalPodAutoscalerListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}