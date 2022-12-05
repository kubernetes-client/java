package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SysctlFluent<A extends V1SysctlFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getValue();
  public A withValue(String value);
  public Boolean hasValue();
  
}