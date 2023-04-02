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
public interface V1VolumeAttachmentListFluent<A extends V1VolumeAttachmentListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,V1VolumeAttachment item);
  public A setToItems(Integer index,V1VolumeAttachment item);
  public A addToItems(io.kubernetes.client.openapi.models.V1VolumeAttachment... items);
  public A addAllToItems(Collection<V1VolumeAttachment> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1VolumeAttachment... items);
  public A removeAllFromItems(Collection<V1VolumeAttachment> items);
  public A removeMatchingFromItems(Predicate<V1VolumeAttachmentBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1VolumeAttachment> getItems();
  public List<V1VolumeAttachment> buildItems();
  public V1VolumeAttachment buildItem(Integer index);
  public V1VolumeAttachment buildFirstItem();
  public V1VolumeAttachment buildLastItem();
  public V1VolumeAttachment buildMatchingItem(Predicate<V1VolumeAttachmentBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1VolumeAttachmentBuilder> predicate);
  public A withItems(List<V1VolumeAttachment> items);
  public A withItems(io.kubernetes.client.openapi.models.V1VolumeAttachment... items);
  public Boolean hasItems();
  public V1VolumeAttachmentListFluent.ItemsNested<A> addNewItem();
  public V1VolumeAttachmentListFluent.ItemsNested<A> addNewItemLike(V1VolumeAttachment item);
  public V1VolumeAttachmentListFluent.ItemsNested<A> setNewItemLike(Integer index,V1VolumeAttachment item);
  public V1VolumeAttachmentListFluent.ItemsNested<A> editItem(Integer index);
  public V1VolumeAttachmentListFluent.ItemsNested<A> editFirstItem();
  public V1VolumeAttachmentListFluent.ItemsNested<A> editLastItem();
  public V1VolumeAttachmentListFluent.ItemsNested<A> editMatchingItem(Predicate<V1VolumeAttachmentBuilder> predicate);
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
  public V1VolumeAttachmentListFluent.MetadataNested<A> withNewMetadata();
  public V1VolumeAttachmentListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1VolumeAttachmentListFluent.MetadataNested<A> editMetadata();
  public V1VolumeAttachmentListFluent.MetadataNested<A> editOrNewMetadata();
  public V1VolumeAttachmentListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1VolumeAttachmentFluent<V1VolumeAttachmentListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1VolumeAttachmentListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}