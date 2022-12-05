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
public interface V1RoleBindingListFluent<A extends V1RoleBindingListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1RoleBinding item);
  public A setToItems(Integer index,V1RoleBinding item);
  public A addToItems(io.kubernetes.client.openapi.models.V1RoleBinding... items);
  public A addAllToItems(Collection<V1RoleBinding> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1RoleBinding... items);
  public A removeAllFromItems(Collection<V1RoleBinding> items);
  public A removeMatchingFromItems(Predicate<V1RoleBindingBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1RoleBinding> getItems();
  public List<V1RoleBinding> buildItems();
  public V1RoleBinding buildItem(Integer index);
  public V1RoleBinding buildFirstItem();
  public V1RoleBinding buildLastItem();
  public V1RoleBinding buildMatchingItem(Predicate<V1RoleBindingBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1RoleBindingBuilder> predicate);
  public A withItems(List<V1RoleBinding> items);
  public A withItems(io.kubernetes.client.openapi.models.V1RoleBinding... items);
  public Boolean hasItems();
  public V1RoleBindingListFluent.ItemsNested<A> addNewItem();
  public V1RoleBindingListFluent.ItemsNested<A> addNewItemLike(V1RoleBinding item);
  public V1RoleBindingListFluent.ItemsNested<A> setNewItemLike(Integer index,V1RoleBinding item);
  public V1RoleBindingListFluent.ItemsNested<A> editItem(Integer index);
  public V1RoleBindingListFluent.ItemsNested<A> editFirstItem();
  public V1RoleBindingListFluent.ItemsNested<A> editLastItem();
  public V1RoleBindingListFluent.ItemsNested<A> editMatchingItem(Predicate<V1RoleBindingBuilder> predicate);
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
  public V1RoleBindingListFluent.MetadataNested<A> withNewMetadata();
  public V1RoleBindingListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1RoleBindingListFluent.MetadataNested<A> editMetadata();
  public V1RoleBindingListFluent.MetadataNested<A> editOrNewMetadata();
  public V1RoleBindingListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1RoleBindingFluent<V1RoleBindingListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1RoleBindingListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}