package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SeccompProfileFluent<A extends io.kubernetes.client.openapi.models.V1SeccompProfileFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getLocalhostProfile();
  public A withLocalhostProfile(java.lang.String localhostProfile);
  public java.lang.Boolean hasLocalhostProfile();
  
  /**
   * Method is deprecated. use withLocalhostProfile instead.
   */
  @java.lang.Deprecated
  public A withNewLocalhostProfile(java.lang.String original);
  public io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum getType();
  public A withType(io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum type);
  public java.lang.Boolean hasType();
  
}