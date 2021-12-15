package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeAddressFluent<A extends io.kubernetes.client.openapi.models.V1NodeAddressFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getAddress();
  public A withAddress(java.lang.String address);
  public java.lang.Boolean hasAddress();
  
  /**
   * Method is deprecated. use withAddress instead.
   */
  @java.lang.Deprecated
  public A withNewAddress(java.lang.String original);
  public io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum type);
  public java.lang.Boolean hasType();
  
}