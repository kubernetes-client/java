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
public interface EventsV1EventListFluent<A extends EventsV1EventListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(Integer index,EventsV1Event item);
  public A setToItems(Integer index,EventsV1Event item);
  public A addToItems(io.kubernetes.client.openapi.models.EventsV1Event... items);
  public A addAllToItems(Collection<EventsV1Event> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.EventsV1Event... items);
  public A removeAllFromItems(Collection<EventsV1Event> items);
  public A removeMatchingFromItems(Predicate<EventsV1EventBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<EventsV1Event> getItems();
  public List<EventsV1Event> buildItems();
  public EventsV1Event buildItem(Integer index);
  public EventsV1Event buildFirstItem();
  public EventsV1Event buildLastItem();
  public EventsV1Event buildMatchingItem(Predicate<EventsV1EventBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<EventsV1EventBuilder> predicate);
  public A withItems(List<EventsV1Event> items);
  public A withItems(io.kubernetes.client.openapi.models.EventsV1Event... items);
  public Boolean hasItems();
  public EventsV1EventListFluent.ItemsNested<A> addNewItem();
  public EventsV1EventListFluent.ItemsNested<A> addNewItemLike(EventsV1Event item);
  public EventsV1EventListFluent.ItemsNested<A> setNewItemLike(Integer index,EventsV1Event item);
  public EventsV1EventListFluent.ItemsNested<A> editItem(Integer index);
  public EventsV1EventListFluent.ItemsNested<A> editFirstItem();
  public EventsV1EventListFluent.ItemsNested<A> editLastItem();
  public EventsV1EventListFluent.ItemsNested<A> editMatchingItem(Predicate<EventsV1EventBuilder> predicate);
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
  public EventsV1EventListFluent.MetadataNested<A> withNewMetadata();
  public EventsV1EventListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public EventsV1EventListFluent.MetadataNested<A> editMetadata();
  public EventsV1EventListFluent.MetadataNested<A> editOrNewMetadata();
  public EventsV1EventListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,EventsV1EventFluent<EventsV1EventListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<EventsV1EventListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}