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
public interface V1IngressListFluent<A extends V1IngressListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1Ingress item);
  public A setToItems(Integer index,V1Ingress item);
  public A addToItems(io.kubernetes.client.openapi.models.V1Ingress... items);
  public A addAllToItems(Collection<V1Ingress> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Ingress... items);
  public A removeAllFromItems(Collection<V1Ingress> items);
  public A removeMatchingFromItems(Predicate<V1IngressBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Ingress> getItems();
  public List<V1Ingress> buildItems();
  public V1Ingress buildItem(Integer index);
  public V1Ingress buildFirstItem();
  public V1Ingress buildLastItem();
  public V1Ingress buildMatchingItem(Predicate<V1IngressBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1IngressBuilder> predicate);
  public A withItems(List<V1Ingress> items);
  public A withItems(io.kubernetes.client.openapi.models.V1Ingress... items);
  public Boolean hasItems();
  public V1IngressListFluent.ItemsNested<A> addNewItem();
  public V1IngressListFluent.ItemsNested<A> addNewItemLike(V1Ingress item);
  public V1IngressListFluent.ItemsNested<A> setNewItemLike(Integer index,V1Ingress item);
  public V1IngressListFluent.ItemsNested<A> editItem(Integer index);
  public V1IngressListFluent.ItemsNested<A> editFirstItem();
  public V1IngressListFluent.ItemsNested<A> editLastItem();
  public V1IngressListFluent.ItemsNested<A> editMatchingItem(Predicate<V1IngressBuilder> predicate);
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
  public V1IngressListFluent.MetadataNested<A> withNewMetadata();
  public V1IngressListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1IngressListFluent.MetadataNested<A> editMetadata();
  public V1IngressListFluent.MetadataNested<A> editOrNewMetadata();
  public V1IngressListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1IngressFluent<V1IngressListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1IngressListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}