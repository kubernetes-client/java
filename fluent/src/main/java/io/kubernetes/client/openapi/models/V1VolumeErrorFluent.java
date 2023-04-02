package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeErrorFluent<A extends V1VolumeErrorFluent<A>> extends Fluent<A>{
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public OffsetDateTime getTime();
  public A withTime(OffsetDateTime time);
  public Boolean hasTime();
  
}