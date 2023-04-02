package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServiceAccountTokenProjectionFluent<A extends V1ServiceAccountTokenProjectionFluent<A>> extends Fluent<A>{
  public String getAudience();
  public A withAudience(String audience);
  public Boolean hasAudience();
  public Long getExpirationSeconds();
  public A withExpirationSeconds(Long expirationSeconds);
  public Boolean hasExpirationSeconds();
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  
}