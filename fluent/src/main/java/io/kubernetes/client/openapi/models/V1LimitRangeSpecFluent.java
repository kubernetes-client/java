package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1LimitRangeSpecFluent<A extends V1LimitRangeSpecFluent<A>> extends Fluent<A>{
  public A addToLimits(Integer index,V1LimitRangeItem item);
  public A setToLimits(Integer index,V1LimitRangeItem item);
  public A addToLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items);
  public A addAllToLimits(Collection<V1LimitRangeItem> items);
  public A removeFromLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items);
  public A removeAllFromLimits(Collection<V1LimitRangeItem> items);
  public A removeMatchingFromLimits(Predicate<V1LimitRangeItemBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildLimits instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LimitRangeItem> getLimits();
  public List<V1LimitRangeItem> buildLimits();
  public V1LimitRangeItem buildLimit(Integer index);
  public V1LimitRangeItem buildFirstLimit();
  public V1LimitRangeItem buildLastLimit();
  public V1LimitRangeItem buildMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate);
  public Boolean hasMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate);
  public A withLimits(List<V1LimitRangeItem> limits);
  public A withLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... limits);
  public Boolean hasLimits();
  public V1LimitRangeSpecFluent.LimitsNested<A> addNewLimit();
  public V1LimitRangeSpecFluent.LimitsNested<A> addNewLimitLike(V1LimitRangeItem item);
  public V1LimitRangeSpecFluent.LimitsNested<A> setNewLimitLike(Integer index,V1LimitRangeItem item);
  public V1LimitRangeSpecFluent.LimitsNested<A> editLimit(Integer index);
  public V1LimitRangeSpecFluent.LimitsNested<A> editFirstLimit();
  public V1LimitRangeSpecFluent.LimitsNested<A> editLastLimit();
  public V1LimitRangeSpecFluent.LimitsNested<A> editMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate);
  public interface LimitsNested<N> extends Nested<N>,V1LimitRangeItemFluent<V1LimitRangeSpecFluent.LimitsNested<N>>{
    public N and();
    public N endLimit();
    
  }
  
}