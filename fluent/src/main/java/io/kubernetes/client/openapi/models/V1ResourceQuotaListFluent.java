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
public interface V1ResourceQuotaListFluent<A extends V1ResourceQuotaListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1ResourceQuota item);
  public A setToItems(Integer index,V1ResourceQuota item);
  public A addToItems(io.kubernetes.client.openapi.models.V1ResourceQuota... items);
  public A addAllToItems(Collection<V1ResourceQuota> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1ResourceQuota... items);
  public A removeAllFromItems(Collection<V1ResourceQuota> items);
  public A removeMatchingFromItems(Predicate<V1ResourceQuotaBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ResourceQuota> getItems();
  public List<V1ResourceQuota> buildItems();
  public V1ResourceQuota buildItem(Integer index);
  public V1ResourceQuota buildFirstItem();
  public V1ResourceQuota buildLastItem();
  public V1ResourceQuota buildMatchingItem(Predicate<V1ResourceQuotaBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1ResourceQuotaBuilder> predicate);
  public A withItems(List<V1ResourceQuota> items);
  public A withItems(io.kubernetes.client.openapi.models.V1ResourceQuota... items);
  public Boolean hasItems();
  public V1ResourceQuotaListFluent.ItemsNested<A> addNewItem();
  public V1ResourceQuotaListFluent.ItemsNested<A> addNewItemLike(V1ResourceQuota item);
  public V1ResourceQuotaListFluent.ItemsNested<A> setNewItemLike(Integer index,V1ResourceQuota item);
  public V1ResourceQuotaListFluent.ItemsNested<A> editItem(Integer index);
  public V1ResourceQuotaListFluent.ItemsNested<A> editFirstItem();
  public V1ResourceQuotaListFluent.ItemsNested<A> editLastItem();
  public V1ResourceQuotaListFluent.ItemsNested<A> editMatchingItem(Predicate<V1ResourceQuotaBuilder> predicate);
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
  public V1ResourceQuotaListFluent.MetadataNested<A> withNewMetadata();
  public V1ResourceQuotaListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1ResourceQuotaListFluent.MetadataNested<A> editMetadata();
  public V1ResourceQuotaListFluent.MetadataNested<A> editOrNewMetadata();
  public V1ResourceQuotaListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1ResourceQuotaFluent<V1ResourceQuotaListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1ResourceQuotaListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}