package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SeccompProfileFluent<A extends V1SeccompProfileFluent<A>> extends Fluent<A>{
  public String getLocalhostProfile();
  public A withLocalhostProfile(String localhostProfile);
  public Boolean hasLocalhostProfile();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}