package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ConfigMapEnvSourceFluent<A extends V1ConfigMapEnvSourceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Boolean getOptional();
  public A withOptional(Boolean optional);
  public Boolean hasOptional();
  public A withOptional();
  
}