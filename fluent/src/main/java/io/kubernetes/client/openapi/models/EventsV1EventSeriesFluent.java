package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface EventsV1EventSeriesFluent<A extends EventsV1EventSeriesFluent<A>> extends Fluent<A>{
  public Integer getCount();
  public A withCount(Integer count);
  public Boolean hasCount();
  public OffsetDateTime getLastObservedTime();
  public A withLastObservedTime(OffsetDateTime lastObservedTime);
  public Boolean hasLastObservedTime();
  
}