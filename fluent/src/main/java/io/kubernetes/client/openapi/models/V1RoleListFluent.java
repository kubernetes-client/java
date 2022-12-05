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
public interface V1RoleListFluent<A extends V1RoleListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1Role item);
  public A setToItems(Integer index,V1Role item);
  public A addToItems(io.kubernetes.client.openapi.models.V1Role... items);
  public A addAllToItems(Collection<V1Role> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Role... items);
  public A removeAllFromItems(Collection<V1Role> items);
  public A removeMatchingFromItems(Predicate<V1RoleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Role> getItems();
  public List<V1Role> buildItems();
  public V1Role buildItem(Integer index);
  public V1Role buildFirstItem();
  public V1Role buildLastItem();
  public V1Role buildMatchingItem(Predicate<V1RoleBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1RoleBuilder> predicate);
  public A withItems(List<V1Role> items);
  public A withItems(io.kubernetes.client.openapi.models.V1Role... items);
  public Boolean hasItems();
  public V1RoleListFluent.ItemsNested<A> addNewItem();
  public V1RoleListFluent.ItemsNested<A> addNewItemLike(V1Role item);
  public V1RoleListFluent.ItemsNested<A> setNewItemLike(Integer index,V1Role item);
  public V1RoleListFluent.ItemsNested<A> editItem(Integer index);
  public V1RoleListFluent.ItemsNested<A> editFirstItem();
  public V1RoleListFluent.ItemsNested<A> editLastItem();
  public V1RoleListFluent.ItemsNested<A> editMatchingItem(Predicate<V1RoleBuilder> predicate);
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
  public V1RoleListFluent.MetadataNested<A> withNewMetadata();
  public V1RoleListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1RoleListFluent.MetadataNested<A> editMetadata();
  public V1RoleListFluent.MetadataNested<A> editOrNewMetadata();
  public V1RoleListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1RoleFluent<V1RoleListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1RoleListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}