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
public interface V1MutatingWebhookConfigurationListFluent<A extends V1MutatingWebhookConfigurationListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1MutatingWebhookConfiguration item);
  public A setToItems(Integer index,V1MutatingWebhookConfiguration item);
  public A addToItems(io.kubernetes.client.openapi.models.V1MutatingWebhookConfiguration... items);
  public A addAllToItems(Collection<V1MutatingWebhookConfiguration> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1MutatingWebhookConfiguration... items);
  public A removeAllFromItems(Collection<V1MutatingWebhookConfiguration> items);
  public A removeMatchingFromItems(Predicate<V1MutatingWebhookConfigurationBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1MutatingWebhookConfiguration> getItems();
  public List<V1MutatingWebhookConfiguration> buildItems();
  public V1MutatingWebhookConfiguration buildItem(Integer index);
  public V1MutatingWebhookConfiguration buildFirstItem();
  public V1MutatingWebhookConfiguration buildLastItem();
  public V1MutatingWebhookConfiguration buildMatchingItem(Predicate<V1MutatingWebhookConfigurationBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1MutatingWebhookConfigurationBuilder> predicate);
  public A withItems(List<V1MutatingWebhookConfiguration> items);
  public A withItems(io.kubernetes.client.openapi.models.V1MutatingWebhookConfiguration... items);
  public Boolean hasItems();
  public V1MutatingWebhookConfigurationListFluent.ItemsNested<A> addNewItem();
  public V1MutatingWebhookConfigurationListFluent.ItemsNested<A> addNewItemLike(V1MutatingWebhookConfiguration item);
  public V1MutatingWebhookConfigurationListFluent.ItemsNested<A> setNewItemLike(Integer index,V1MutatingWebhookConfiguration item);
  public V1MutatingWebhookConfigurationListFluent.ItemsNested<A> editItem(Integer index);
  public V1MutatingWebhookConfigurationListFluent.ItemsNested<A> editFirstItem();
  public V1MutatingWebhookConfigurationListFluent.ItemsNested<A> editLastItem();
  public V1MutatingWebhookConfigurationListFluent.ItemsNested<A> editMatchingItem(Predicate<V1MutatingWebhookConfigurationBuilder> predicate);
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
  public V1MutatingWebhookConfigurationListFluent.MetadataNested<A> withNewMetadata();
  public V1MutatingWebhookConfigurationListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1MutatingWebhookConfigurationListFluent.MetadataNested<A> editMetadata();
  public V1MutatingWebhookConfigurationListFluent.MetadataNested<A> editOrNewMetadata();
  public V1MutatingWebhookConfigurationListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1MutatingWebhookConfigurationFluent<V1MutatingWebhookConfigurationListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1MutatingWebhookConfigurationListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}