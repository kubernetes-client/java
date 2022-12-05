package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerStateTerminatedFluent<A extends V1ContainerStateTerminatedFluent<A>> extends Fluent<A>{
  public String getContainerID();
  public A withContainerID(String containerID);
  public Boolean hasContainerID();
  public Integer getExitCode();
  public A withExitCode(Integer exitCode);
  public Boolean hasExitCode();
  public OffsetDateTime getFinishedAt();
  public A withFinishedAt(OffsetDateTime finishedAt);
  public Boolean hasFinishedAt();
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  public Integer getSignal();
  public A withSignal(Integer signal);
  public Boolean hasSignal();
  public OffsetDateTime getStartedAt();
  public A withStartedAt(OffsetDateTime startedAt);
  public Boolean hasStartedAt();
  
}