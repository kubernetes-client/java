package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EventSourceFluent<A extends V1EventSourceFluent<A>> extends Fluent<A>{
  public String getComponent();
  public A withComponent(String component);
  public Boolean hasComponent();
  public String getHost();
  public A withHost(String host);
  public Boolean hasHost();
  
}