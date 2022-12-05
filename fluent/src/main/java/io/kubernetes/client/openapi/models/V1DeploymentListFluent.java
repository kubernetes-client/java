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
public interface V1DeploymentListFluent<A extends V1DeploymentListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1Deployment item);
  public A setToItems(Integer index,V1Deployment item);
  public A addToItems(io.kubernetes.client.openapi.models.V1Deployment... items);
  public A addAllToItems(Collection<V1Deployment> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1Deployment... items);
  public A removeAllFromItems(Collection<V1Deployment> items);
  public A removeMatchingFromItems(Predicate<V1DeploymentBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Deployment> getItems();
  public List<V1Deployment> buildItems();
  public V1Deployment buildItem(Integer index);
  public V1Deployment buildFirstItem();
  public V1Deployment buildLastItem();
  public V1Deployment buildMatchingItem(Predicate<V1DeploymentBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1DeploymentBuilder> predicate);
  public A withItems(List<V1Deployment> items);
  public A withItems(io.kubernetes.client.openapi.models.V1Deployment... items);
  public Boolean hasItems();
  public V1DeploymentListFluent.ItemsNested<A> addNewItem();
  public V1DeploymentListFluent.ItemsNested<A> addNewItemLike(V1Deployment item);
  public V1DeploymentListFluent.ItemsNested<A> setNewItemLike(Integer index,V1Deployment item);
  public V1DeploymentListFluent.ItemsNested<A> editItem(Integer index);
  public V1DeploymentListFluent.ItemsNested<A> editFirstItem();
  public V1DeploymentListFluent.ItemsNested<A> editLastItem();
  public V1DeploymentListFluent.ItemsNested<A> editMatchingItem(Predicate<V1DeploymentBuilder> predicate);
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
  public V1DeploymentListFluent.MetadataNested<A> withNewMetadata();
  public V1DeploymentListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1DeploymentListFluent.MetadataNested<A> editMetadata();
  public V1DeploymentListFluent.MetadataNested<A> editOrNewMetadata();
  public V1DeploymentListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1DeploymentFluent<V1DeploymentListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1DeploymentListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}