package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SecretKeySelectorFluent<A extends V1SecretKeySelectorFluent<A>> extends Fluent<A>{
  public String getKey();
  public A withKey(String key);
  public Boolean hasKey();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Boolean getOptional();
  public A withOptional(Boolean optional);
  public Boolean hasOptional();
  public A withOptional();
  
}