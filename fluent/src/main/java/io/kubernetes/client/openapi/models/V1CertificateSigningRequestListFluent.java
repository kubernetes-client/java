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
public interface V1CertificateSigningRequestListFluent<A extends V1CertificateSigningRequestListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1CertificateSigningRequest item);
  public A setToItems(Integer index,V1CertificateSigningRequest item);
  public A addToItems(io.kubernetes.client.openapi.models.V1CertificateSigningRequest... items);
  public A addAllToItems(Collection<V1CertificateSigningRequest> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1CertificateSigningRequest... items);
  public A removeAllFromItems(Collection<V1CertificateSigningRequest> items);
  public A removeMatchingFromItems(Predicate<V1CertificateSigningRequestBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CertificateSigningRequest> getItems();
  public List<V1CertificateSigningRequest> buildItems();
  public V1CertificateSigningRequest buildItem(Integer index);
  public V1CertificateSigningRequest buildFirstItem();
  public V1CertificateSigningRequest buildLastItem();
  public V1CertificateSigningRequest buildMatchingItem(Predicate<V1CertificateSigningRequestBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1CertificateSigningRequestBuilder> predicate);
  public A withItems(List<V1CertificateSigningRequest> items);
  public A withItems(io.kubernetes.client.openapi.models.V1CertificateSigningRequest... items);
  public Boolean hasItems();
  public V1CertificateSigningRequestListFluent.ItemsNested<A> addNewItem();
  public V1CertificateSigningRequestListFluent.ItemsNested<A> addNewItemLike(V1CertificateSigningRequest item);
  public V1CertificateSigningRequestListFluent.ItemsNested<A> setNewItemLike(Integer index,V1CertificateSigningRequest item);
  public V1CertificateSigningRequestListFluent.ItemsNested<A> editItem(Integer index);
  public V1CertificateSigningRequestListFluent.ItemsNested<A> editFirstItem();
  public V1CertificateSigningRequestListFluent.ItemsNested<A> editLastItem();
  public V1CertificateSigningRequestListFluent.ItemsNested<A> editMatchingItem(Predicate<V1CertificateSigningRequestBuilder> predicate);
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
  public V1CertificateSigningRequestListFluent.MetadataNested<A> withNewMetadata();
  public V1CertificateSigningRequestListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1CertificateSigningRequestListFluent.MetadataNested<A> editMetadata();
  public V1CertificateSigningRequestListFluent.MetadataNested<A> editOrNewMetadata();
  public V1CertificateSigningRequestListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1CertificateSigningRequestFluent<V1CertificateSigningRequestListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1CertificateSigningRequestListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}