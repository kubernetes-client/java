package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GroupVersionForDiscoveryFluent<A extends V1GroupVersionForDiscoveryFluent<A>> extends Fluent<A>{
  public String getGroupVersion();
  public A withGroupVersion(String groupVersion);
  public Boolean hasGroupVersion();
  public String getVersion();
  public A withVersion(String version);
  public Boolean hasVersion();
  
}