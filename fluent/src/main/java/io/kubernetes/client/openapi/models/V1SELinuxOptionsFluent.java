package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SELinuxOptionsFluent<A extends V1SELinuxOptionsFluent<A>> extends Fluent<A>{
  public String getLevel();
  public A withLevel(String level);
  public Boolean hasLevel();
  public String getRole();
  public A withRole(String role);
  public Boolean hasRole();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public String getUser();
  public A withUser(String user);
  public Boolean hasUser();
  
}