package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeAddressFluent<A extends V1NodeAddressFluent<A>> extends Fluent<A>{
  public String getAddress();
  public A withAddress(String address);
  public Boolean hasAddress();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}