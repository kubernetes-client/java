package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2HorizontalPodAutoscalerConditionFluent<A extends V2HorizontalPodAutoscalerConditionFluent<A>> extends Fluent<A>{
  public OffsetDateTime getLastTransitionTime();
  public A withLastTransitionTime(OffsetDateTime lastTransitionTime);
  public Boolean hasLastTransitionTime();
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  public String getStatus();
  public A withStatus(String status);
  public Boolean hasStatus();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}