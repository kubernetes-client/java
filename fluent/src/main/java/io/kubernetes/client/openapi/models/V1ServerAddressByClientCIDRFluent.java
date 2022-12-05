package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServerAddressByClientCIDRFluent<A extends V1ServerAddressByClientCIDRFluent<A>> extends Fluent<A>{
  public String getClientCIDR();
  public A withClientCIDR(String clientCIDR);
  public Boolean hasClientCIDR();
  public String getServerAddress();
  public A withServerAddress(String serverAddress);
  public Boolean hasServerAddress();
  
}