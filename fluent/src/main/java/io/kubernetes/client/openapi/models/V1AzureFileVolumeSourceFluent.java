package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1AzureFileVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public java.lang.String getSecretName();
  public A withSecretName(java.lang.String secretName);
  public java.lang.Boolean hasSecretName();
  
  /**
   * Method is deprecated. use withSecretName instead.
   */
  @java.lang.Deprecated
  public A withNewSecretName(java.lang.String original);
  public java.lang.String getShareName();
  public A withShareName(java.lang.String shareName);
  public java.lang.Boolean hasShareName();
  
  /**
   * Method is deprecated. use withShareName instead.
   */
  @java.lang.Deprecated
  public A withNewShareName(java.lang.String original);
  
}