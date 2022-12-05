package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeStatusFluent<A extends V1PersistentVolumeStatusFluent<A>> extends Fluent<A>{
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public String getPhase();
  public A withPhase(String phase);
  public Boolean hasPhase();
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  
}