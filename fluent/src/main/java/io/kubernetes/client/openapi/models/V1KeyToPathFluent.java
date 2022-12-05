package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1KeyToPathFluent<A extends V1KeyToPathFluent<A>> extends Fluent<A>{
  public String getKey();
  public A withKey(String key);
  public Boolean hasKey();
  public Integer getMode();
  public A withMode(Integer mode);
  public Boolean hasMode();
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  
}