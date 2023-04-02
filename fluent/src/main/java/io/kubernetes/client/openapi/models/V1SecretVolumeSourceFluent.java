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
public interface V1SecretVolumeSourceFluent<A extends V1SecretVolumeSourceFluent<A>> extends Fluent<A>{
  public Integer getDefaultMode();
  public A withDefaultMode(Integer defaultMode);
  public Boolean hasDefaultMode();
  public A addToItems(Integer index,V1KeyToPath item);
  public A setToItems(Integer index,V1KeyToPath item);
  public A addToItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);
  public A addAllToItems(Collection<V1KeyToPath> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);
  public A removeAllFromItems(Collection<V1KeyToPath> items);
  public A removeMatchingFromItems(Predicate<V1KeyToPathBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1KeyToPath> getItems();
  public List<V1KeyToPath> buildItems();
  public V1KeyToPath buildItem(Integer index);
  public V1KeyToPath buildFirstItem();
  public V1KeyToPath buildLastItem();
  public V1KeyToPath buildMatchingItem(Predicate<V1KeyToPathBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1KeyToPathBuilder> predicate);
  public A withItems(List<V1KeyToPath> items);
  public A withItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);
  public Boolean hasItems();
  public V1SecretVolumeSourceFluent.ItemsNested<A> addNewItem();
  public V1SecretVolumeSourceFluent.ItemsNested<A> addNewItemLike(V1KeyToPath item);
  public V1SecretVolumeSourceFluent.ItemsNested<A> setNewItemLike(Integer index,V1KeyToPath item);
  public V1SecretVolumeSourceFluent.ItemsNested<A> editItem(Integer index);
  public V1SecretVolumeSourceFluent.ItemsNested<A> editFirstItem();
  public V1SecretVolumeSourceFluent.ItemsNested<A> editLastItem();
  public V1SecretVolumeSourceFluent.ItemsNested<A> editMatchingItem(Predicate<V1KeyToPathBuilder> predicate);
  public Boolean getOptional();
  public A withOptional(Boolean optional);
  public Boolean hasOptional();
  public String getSecretName();
  public A withSecretName(String secretName);
  public Boolean hasSecretName();
  public A withOptional();
  public interface ItemsNested<N> extends Nested<N>,V1KeyToPathFluent<V1SecretVolumeSourceFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  
}