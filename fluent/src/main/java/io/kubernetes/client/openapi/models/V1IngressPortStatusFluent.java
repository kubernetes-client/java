package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressPortStatusFluent<A extends V1IngressPortStatusFluent<A>> extends Fluent<A>{
  public String getError();
  public A withError(String error);
  public Boolean hasError();
  public Integer getPort();
  public A withPort(Integer port);
  public Boolean hasPort();
  public String getProtocol();
  public A withProtocol(String protocol);
  public Boolean hasProtocol();
  
}