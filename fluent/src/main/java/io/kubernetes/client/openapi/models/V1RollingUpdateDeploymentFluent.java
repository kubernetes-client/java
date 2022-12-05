package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1RollingUpdateDeploymentFluent<A extends V1RollingUpdateDeploymentFluent<A>> extends Fluent<A>{
  public IntOrString getMaxSurge();
  public A withMaxSurge(IntOrString maxSurge);
  public Boolean hasMaxSurge();
  public A withNewMaxSurge(int value);
  public A withNewMaxSurge(String value);
  public IntOrString getMaxUnavailable();
  public A withMaxUnavailable(IntOrString maxUnavailable);
  public Boolean hasMaxUnavailable();
  public A withNewMaxUnavailable(int value);
  public A withNewMaxUnavailable(String value);
  
}