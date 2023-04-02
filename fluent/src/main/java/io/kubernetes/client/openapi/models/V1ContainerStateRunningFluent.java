package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerStateRunningFluent<A extends V1ContainerStateRunningFluent<A>> extends Fluent<A>{
  public OffsetDateTime getStartedAt();
  public A withStartedAt(OffsetDateTime startedAt);
  public Boolean hasStartedAt();
  
}