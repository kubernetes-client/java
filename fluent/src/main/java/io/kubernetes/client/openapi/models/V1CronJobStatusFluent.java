package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CronJobStatusFluent<A extends V1CronJobStatusFluent<A>> extends Fluent<A>{
  public A addToActive(Integer index,V1ObjectReference item);
  public A setToActive(Integer index,V1ObjectReference item);
  public A addToActive(io.kubernetes.client.openapi.models.V1ObjectReference... items);
  public A addAllToActive(Collection<V1ObjectReference> items);
  public A removeFromActive(io.kubernetes.client.openapi.models.V1ObjectReference... items);
  public A removeAllFromActive(Collection<V1ObjectReference> items);
  public A removeMatchingFromActive(Predicate<V1ObjectReferenceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildActive instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ObjectReference> getActive();
  public List<V1ObjectReference> buildActive();
  public V1ObjectReference buildActive(Integer index);
  public V1ObjectReference buildFirstActive();
  public V1ObjectReference buildLastActive();
  public V1ObjectReference buildMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate);
  public Boolean hasMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate);
  public A withActive(List<V1ObjectReference> active);
  public A withActive(io.kubernetes.client.openapi.models.V1ObjectReference... active);
  public Boolean hasActive();
  public V1CronJobStatusFluent.ActiveNested<A> addNewActive();
  public V1CronJobStatusFluent.ActiveNested<A> addNewActiveLike(V1ObjectReference item);
  public V1CronJobStatusFluent.ActiveNested<A> setNewActiveLike(Integer index,V1ObjectReference item);
  public V1CronJobStatusFluent.ActiveNested<A> editActive(Integer index);
  public V1CronJobStatusFluent.ActiveNested<A> editFirstActive();
  public V1CronJobStatusFluent.ActiveNested<A> editLastActive();
  public V1CronJobStatusFluent.ActiveNested<A> editMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate);
  public OffsetDateTime getLastScheduleTime();
  public A withLastScheduleTime(OffsetDateTime lastScheduleTime);
  public Boolean hasLastScheduleTime();
  public OffsetDateTime getLastSuccessfulTime();
  public A withLastSuccessfulTime(OffsetDateTime lastSuccessfulTime);
  public Boolean hasLastSuccessfulTime();
  public interface ActiveNested<N> extends Nested<N>,V1ObjectReferenceFluent<V1CronJobStatusFluent.ActiveNested<N>>{
    public N and();
    public N endActive();
    
  }
  
}